/*******************************************************************************
 * Copyright (c) 2016 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package org.gemoc.executionframework.engine.ui.launcher;

import java.util.Collections;
import java.util.Map;

import org.gemoc.commons.eclipse.ui.ViewHelper;
import org.gemoc.xdsmlframework.api.core.IRunConfiguration;
import org.gemoc.xdsmlframework.api.extensions.engine_addon.EngineAddonSpecificationExtension;

import fr.inria.diverse.trace.commons.model.trace.LaunchConfiguration;


abstract public class AbstractGemocLauncher extends fr.obeo.dsl.debug.ide.sirius.ui.launch.AbstractDSLLaunchConfigurationDelegateUI {

	// warning this MODEL_ID must be the same as the one in the ModelLoader in order to enable correctly the breakpoints
	public final static String MODEL_ID = org.gemoc.executionframework.engine.ui.Activator.PLUGIN_ID+".debugModel";
	
	public Map<String, Object> parseLaunchConfiguration(LaunchConfiguration launchConfiguration) {
		return Collections.emptyMap();
	}
	
	protected void openViewsRecommandedByAddons(IRunConfiguration runConfiguration){
		for (EngineAddonSpecificationExtension extension : runConfiguration.getEngineAddonExtensions())
		{
			for(String viewId : extension.getOpenViewIds()){
				ViewHelper.showView(viewId);
			}
			
		}
	}
}
