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
package org.gemoc.xdsmlframework.api.core;

import fr.inria.diverse.trace.commons.model.trace.Step;

public class  EngineStatus {
	long nbLogicalStepRun = 0;
	
	Step chosenLogicalStep;


	public enum RunStatus { Initializing, Running, WaitingLogicalStepSelection, Stopped}

	
	public long getNbLogicalStepRun() {
		return nbLogicalStepRun;
	}

	public void setNbLogicalStepRun(long nbLogicalStepRun) {
		this.nbLogicalStepRun = nbLogicalStepRun;
	}
	public void incrementNbLogicalStepRun() {
		this.nbLogicalStepRun +=1;
	}
		
	
}
