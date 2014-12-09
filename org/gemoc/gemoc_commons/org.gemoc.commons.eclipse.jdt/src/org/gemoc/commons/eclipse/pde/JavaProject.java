package org.gemoc.commons.eclipse.pde;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.JavaCore;
import org.gemoc.commons.eclipse.core.resources.Project;

public class JavaProject 
{

	static public void create(IProject project) throws CoreException, IOException
	{
		if(!project.hasNature(JavaCore.NATURE_ID)){
			JavaCore.create(project);
			Project.addNature(project, JavaCore.NATURE_ID);
			Project.createFolder(project, "src/main/java", new NullProgressMonitor());
			Project.createFolder(project, "src/main/xdsml-java-gen", new NullProgressMonitor());
			addJavaResources(project);
		}		
	}
	
	public static final String CLASSPATH_TEMPLATE= "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"+
"<classpath>\n"+
"	<classpathentry kind=\"src\" path=\"src/main/java\"/>\n"+
"	<classpathentry kind=\"src\" path=\"src/main/xdsml-java-gen\"/>\n"+
"	<classpathentry kind=\"con\" path=\"org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-1.6\"/>\n"+
"	<classpathentry kind=\"output\" path=\"bin\"/>\n"+
"</classpath>";
	
	private static void addJavaResources(IProject project) throws CoreException, IOException 
	{
		final IFile file = project.getFile(new Path(".classpath")); 
		InputStream stream = null;
		try 
			{
				stream = new ByteArrayInputStream(CLASSPATH_TEMPLATE.getBytes());
				if (file.exists()) 
				{
					file.setContents(stream, true, true, null);
				} 
				else 
				{
					file.create(stream, true, null);
				}
			} 
			finally
			{
				if (stream != null)
					stream.close();				
			}
	}

}
