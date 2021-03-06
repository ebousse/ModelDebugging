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
package fr.obeo.dsl.debug.ide.event.model;

/**
 * Request sent to validate a variable value.
 * 
 * @author <a href="mailto:yvan.lussaud@obeo.fr">Yvan Lussaud</a>
 */
public class ValidateVariableValueRequest extends AbstractVariableRequest {

	/**
	 * The variable value.
	 */
	private final String value;

	/**
	 * Constructor.
	 * 
	 * @param threadName
	 *            the {@link fr.obeo.dsl.debug.Thread#getName() thread name}
	 * @param stackName
	 *            the {@link fr.obeo.dsl.debug.StackFrame#getName() thread name}
	 * @param variableName
	 *            the {@link fr.obeo.dsl.debug.Variable#getName() variable name}
	 * @param value
	 *            the value to set
	 */
	public ValidateVariableValueRequest(String threadName, String stackName, String variableName, String value) {
		super(threadName, stackName, variableName);
		this.value = value;
	}

	/**
	 * Gets the variable value.
	 * 
	 * @return the variable value
	 */
	public String getValue() {
		return value;
	}

}
