package fr.inria.diverse.trace.gemoc.generator

import fr.inria.diverse.trace.commons.EMFUtil
import fr.inria.diverse.trace.plaink3.tracematerialextractor.K3ExecutionExtensionGenerator
import fr.inria.diverse.trace.plaink3.tracematerialextractor.K3StepExtractor
import java.io.File
import java.io.IOException
import java.util.HashSet
import java.util.Set
import org.eclipse.core.resources.IContainer
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.resources.WorkspaceJob
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.Status
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.jdt.core.IJavaProject
import org.eclipse.jdt.core.JavaCore
import org.gemoc.executionengine.java.sequential_xdsml.SequentialLanguageDefinition
import org.gemoc.xdsmlframework.ide.ui.xdsml.wizards.XDSMLProjectHelper

/**
 * Plenty of ways to call the generator in an eclipse context
 */
class GenericEngineTraceAddonGeneratorHelper {

	private def static Set<EPackage> findAllEPackagesIn(Set<IContainer> containers) {

		val Set<EPackage> inputMetamodel = new HashSet<EPackage>();
		val rs = new ResourceSetImpl

		for (container : containers) {
			container.accept(
				[ r |
				if (r instanceof IFile) {
					if (r.getName().toLowerCase().endsWith(".ecore")) {
						val URI uri = URI.createPlatformResourceURI(r.getFullPath().toString(), true);
						val Resource model = EMFUtil.loadModelURI(uri, rs);

						val Set<EPackage> result = new HashSet<EPackage>();
						for (EObject c : model.getContents()) {
							if (c instanceof EPackage)
								result.add(c as EPackage);
						}
						inputMetamodel.addAll(result);
					}
				}
				return true
			])
		}
		return inputMetamodel
	}

	public def static void generateAddon(String mmName, String pluginName, IJavaProject project, File path,
		boolean replace, IProgressMonitor monitor) throws CoreException {

		val Set<IContainer> folders = ResourcesPlugin.getWorkspace().getRoot().
			findContainersForLocationURI(path.toURI()).toSet;

		// Either we did find that the chosen folder matches folders of our
		// workspace
		val Set<EPackage> inputMetamodel = if (folders != null && folders.length > 0) {
				findAllEPackagesIn(folders)
			} // Or they are located somewhere else on the file system
			else {
				val rs = new ResourceSetImpl
				val URI uri = URI.createFileURI(path.getAbsolutePath().toString());
				val Resource model = EMFUtil.loadModelURI(uri, rs);

				val Set<EPackage> result = new HashSet<EPackage>();
				for (EObject c : model.getContents()) {
					if (c instanceof EPackage)
						result.add(c as EPackage);
				}
				result;
			}

		generateAddon(mmName, pluginName, project, inputMetamodel, replace, monitor)
	}

	/**
	 * Central operation of the class, that calls business operations
	 */
	public def static void generateAddon(String mmName, String pluginName, IJavaProject project,
		Set<EPackage> inputMetamodel, boolean replace, IProgressMonitor monitor) throws CoreException {

		// We look for an existing project with this name
		val IProject existingProject = ResourcesPlugin.getWorkspace().getRoot().getProject(pluginName);
		if (existingProject.exists()) {

			// If we replace, we delete most of its content 
			//(we keep the original project in order to be able to replace the project even if it was imported in the workspace)
			if (replace) {
				//existingProject.delete(true, monitor);
				val WorkspaceJob job = new WorkspaceJob("deleting project "+existingProject.name+" content") {
       				override public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
           				for ( IResource iRes : existingProject.members){
							if(!(iRes.name.equals(".project")  || iRes.name.equals(".classpath"))){
								iRes.delete(true, monitor);
							}
						}	
           				return Status.OK_STATUS;
        			}
     			};
     			job.setRule(existingProject);
     			job.schedule();
			} // Else, error
			else {
				throw new CoreException(
					new Status(Status.ERROR, "fr.inria.diverse.trace.gemoc.ui",
						"Impossible to create a trace addon: a project already exists with this name."));
			}
		}

		try {

			// Then we call all our business operations
			// TODO handle languages defined with multiple ecores
			val EPackage extendedMetamodel = inputMetamodel.iterator().next();

			val K3ExecutionExtensionGenerator extgen = new K3ExecutionExtensionGenerator(extendedMetamodel);
			extgen.generate();

			val mmextension = extgen.mmextensionResult

			if (project != null) {
				val K3StepExtractor eventsgen = new K3StepExtractor(project, mmName, extendedMetamodel, mmextension);
				eventsgen.generate();
			}

			val GenericEngineTraceAddonGenerator traceaddgen = new GenericEngineTraceAddonGenerator(extendedMetamodel,
				mmextension, pluginName);
			traceaddgen.generateCompleteAddon(monitor);
		} catch (IOException e) {

			// TODO Do real error handling
			e.printStackTrace();
		}
	}

	def static void generateAddon(IFile languageDefinitionFile, IProgressMonitor monitor) {

		// Loading languagedef model
		val ResourceSet rs = new ResourceSetImpl();
		val URI uri = URI.createPlatformResourceURI(languageDefinitionFile.getFullPath().toString(), true);
		val Resource model = EMFUtil.loadModelURI(uri, rs);
		val EObject languageDefinition = model.contents.get(0)

		// Follow-up in other operation...
		if (languageDefinition instanceof SequentialLanguageDefinition) {
			generateAddon(languageDefinition, languageDefinitionFile.project, monitor, rs)
		}

	}

	def static void generateAddon(SequentialLanguageDefinition languageDefinition, IProject xDSMLProject,
		IProgressMonitor monitor, ResourceSet rs) {

		// Getting DSA project
		val String dsaProjectName = languageDefinition?.getDsaProject()?.getProjectName();
		val IProject k3DSAIProject = if (dsaProjectName != null && dsaProjectName != "")
				ResourcesPlugin.getWorkspace()?.getRoot()?.getProject(dsaProjectName)
			else
				null
		val IJavaProject k3DSAIJavaProject = if(k3DSAIProject != null) JavaCore.create(k3DSAIProject) else null;

		// Getting languagename
		val String languageName = languageDefinition.name

		// Getting input ecore
		val IProject emfProject = ResourcesPlugin.getWorkspace().getRoot().getProject(
			languageDefinition.domainModelProject.projectName)
		val Set<EPackage> inputMetamodel = findAllEPackagesIn(#{emfProject as IContainer})

		// Computing output plugin name
		val pluginName = XDSMLProjectHelper.baseProjectName(xDSMLProject) + ".trace"

		// Calling operation that calls business stuff
		generateAddon(languageName, pluginName, k3DSAIJavaProject, inputMetamodel, true, monitor)

	}
}