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
package org.gemoc.xdsmlframework.ui.utils.dialogs;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;


public class SelectAnyConcreteEClassDialog extends SelectAnyEObjectDialog  {

	public SelectAnyConcreteEClassDialog(ResourceSet resourceSet, ILabelProvider renderer) {
		this(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), resourceSet, renderer);
	}	

	public SelectAnyConcreteEClassDialog(Shell parent, ResourceSet resourceSet,
			ILabelProvider renderer) {
		super(parent, resourceSet, renderer);
	}

	protected boolean select(EObject obj){
		if(obj instanceof EClass){
			return !((EClass)obj).isAbstract();
		}
		return false;
	}
	

	


}

