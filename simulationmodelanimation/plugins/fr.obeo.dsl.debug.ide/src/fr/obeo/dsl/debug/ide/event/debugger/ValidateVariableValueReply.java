/*******************************************************************************
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package fr.obeo.dsl.debug.ide.event.debugger;

/**
 * Reply sent when the thread has a new variable.
 * 
 * @author <a href="mailto:yvan.lussaud@obeo.fr">Yvan Lussaud</a>
 */
public class ValidateVariableValueReply extends AbstractVariableReply {

	/**
	 * Tells if the value is valid.
	 */
	boolean valid;

	/**
	 * Constructor for {@link fr.obeo.dsl.debug.Thread Thread}.
	 * 
	 * @param threadName
	 *            the {@link fr.obeo.dsl.debug.Thread#getName() thread name}
	 * @param stackName
	 *            the {@link fr.obeo.dsl.debug.StackFrame#getName() stack frame name}
	 * @param variableName
	 *            the {@link fr.obeo.dsl.debug.Variable#getName() variable name}
	 * @param valid
	 *            tells if the value is valid
	 */
	public ValidateVariableValueReply(String threadName, String stackName, String variableName, boolean valid) {
		super(threadName, stackName, variableName);
		this.valid = valid;
	}

	/**
	 * Tells if the value is valid.
	 * 
	 * @return <code>true</code> if the value is valid, <code>false</code> otherwise
	 */
	public boolean isValid() {
		return valid;
	}
}
