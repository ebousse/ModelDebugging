/*******************************************************************************
 * Copyright (c) 2014 Université de Rennes 1.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Erwan Bousse - initial API and implementation
 ******************************************************************************/
package fr.inria.diverse.trace.gemoc.ui.launch;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

public class PlainK3TraceAddonGenerationLaunchTabGroup extends AbstractLaunchConfigurationTabGroup {

	private ILaunchConfigurationTab[] tabs;

	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		tabs = new ILaunchConfigurationTab[] {
		// new CommonTab(), // working, but not required
		new PlainK3TraceAddonGenerationLaunchTab() };
		setTabs(tabs);

	}

}
