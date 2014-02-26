/**
 * Copyright (c) 2012-2016 GEMOC consortium.
 * 
 * http://www.gemoc.org
 * 
 * Contributors:
 *   Stephen Creff - ENSTA Bretagne [stephen.creff@ensta-bretagne.fr]
 *   
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *   
 * $Id$
 */
package org.gemoc.mocc.ccslmoc.model.ccslmocc.impl;

import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.CCSLModel.ClockExpressionAndRelation.impl.ExternalRelationDefinitionImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gemoc.mocc.ccslmoc.model.ccslmocc.CcslmoccPackage;
import org.gemoc.mocc.ccslmoc.model.ccslmocc.StateMachineRelationDefinition;

import org.gemoc.mocc.cometafsm.model.cometafsm.CometaElement;
import org.gemoc.mocc.cometafsm.model.cometafsm.CometafsmPackage;
import org.gemoc.mocc.cometafsm.model.cometafsm.DeclarationBlock;
import org.gemoc.mocc.cometafsm.model.cometafsm.State;
import org.gemoc.mocc.cometafsm.model.cometafsm.StateMachineDefinition;
import org.gemoc.mocc.cometafsm.model.cometafsm.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine Relation Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.mocc.ccslmoc.model.ccslmocc.impl.StateMachineRelationDefinitionImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.gemoc.mocc.ccslmoc.model.ccslmocc.impl.StateMachineRelationDefinitionImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.gemoc.mocc.ccslmoc.model.ccslmocc.impl.StateMachineRelationDefinitionImpl#getDeclarationBlock <em>Declaration Block</em>}</li>
 *   <li>{@link org.gemoc.mocc.ccslmoc.model.ccslmocc.impl.StateMachineRelationDefinitionImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.gemoc.mocc.ccslmoc.model.ccslmocc.impl.StateMachineRelationDefinitionImpl#getStates <em>States</em>}</li>
 *   <li>{@link org.gemoc.mocc.ccslmoc.model.ccslmocc.impl.StateMachineRelationDefinitionImpl#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link org.gemoc.mocc.ccslmoc.model.ccslmocc.impl.StateMachineRelationDefinitionImpl#getFinalStates <em>Final States</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateMachineRelationDefinitionImpl extends ExternalRelationDefinitionImpl implements StateMachineRelationDefinition {
	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefinition() <em>Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFINITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected String definition = DEFINITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeclarationBlock() <em>Declaration Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarationBlock()
	 * @generated
	 * @ordered
	 */
	protected DeclarationBlock declarationBlock;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialState()
	 * @generated
	 * @ordered
	 */
	protected State initialState;

	/**
	 * The cached value of the '{@link #getFinalStates() <em>Final States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> finalStates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachineRelationDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CcslmoccPackage.Literals.STATE_MACHINE_RELATION_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(String newDefinition) {
		String oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__DEFINITION, oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclarationBlock getDeclarationBlock() {
		return declarationBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeclarationBlock(DeclarationBlock newDeclarationBlock, NotificationChain msgs) {
		DeclarationBlock oldDeclarationBlock = declarationBlock;
		declarationBlock = newDeclarationBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__DECLARATION_BLOCK, oldDeclarationBlock, newDeclarationBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclarationBlock(DeclarationBlock newDeclarationBlock) {
		if (newDeclarationBlock != declarationBlock) {
			NotificationChain msgs = null;
			if (declarationBlock != null)
				msgs = ((InternalEObject)declarationBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__DECLARATION_BLOCK, null, msgs);
			if (newDeclarationBlock != null)
				msgs = ((InternalEObject)newDeclarationBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__DECLARATION_BLOCK, null, msgs);
			msgs = basicSetDeclarationBlock(newDeclarationBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__DECLARATION_BLOCK, newDeclarationBlock, newDeclarationBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<Transition>(Transition.class, this, CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<State>(State.class, this, CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getInitialState() {
		if (initialState != null && initialState.eIsProxy()) {
			InternalEObject oldInitialState = (InternalEObject)initialState;
			initialState = (State)eResolveProxy(oldInitialState);
			if (initialState != oldInitialState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__INITIAL_STATE, oldInitialState, initialState));
			}
		}
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetInitialState() {
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialState(State newInitialState) {
		State oldInitialState = initialState;
		initialState = newInitialState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__INITIAL_STATE, oldInitialState, initialState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getFinalStates() {
		if (finalStates == null) {
			finalStates = new EObjectResolvingEList<State>(State.class, this, CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__FINAL_STATES);
		}
		return finalStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__DECLARATION_BLOCK:
				return basicSetDeclarationBlock(null, msgs);
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__VERSION:
				return getVersion();
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__DEFINITION:
				return getDefinition();
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__DECLARATION_BLOCK:
				return getDeclarationBlock();
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__TRANSITIONS:
				return getTransitions();
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__STATES:
				return getStates();
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__INITIAL_STATE:
				if (resolve) return getInitialState();
				return basicGetInitialState();
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__FINAL_STATES:
				return getFinalStates();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__VERSION:
				setVersion((String)newValue);
				return;
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__DEFINITION:
				setDefinition((String)newValue);
				return;
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__DECLARATION_BLOCK:
				setDeclarationBlock((DeclarationBlock)newValue);
				return;
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__INITIAL_STATE:
				setInitialState((State)newValue);
				return;
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__FINAL_STATES:
				getFinalStates().clear();
				getFinalStates().addAll((Collection<? extends State>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__DEFINITION:
				setDefinition(DEFINITION_EDEFAULT);
				return;
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__DECLARATION_BLOCK:
				setDeclarationBlock((DeclarationBlock)null);
				return;
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__TRANSITIONS:
				getTransitions().clear();
				return;
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__STATES:
				getStates().clear();
				return;
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__INITIAL_STATE:
				setInitialState((State)null);
				return;
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__FINAL_STATES:
				getFinalStates().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__DEFINITION:
				return DEFINITION_EDEFAULT == null ? definition != null : !DEFINITION_EDEFAULT.equals(definition);
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__DECLARATION_BLOCK:
				return declarationBlock != null;
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__STATES:
				return states != null && !states.isEmpty();
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__INITIAL_STATE:
				return initialState != null;
			case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__FINAL_STATES:
				return finalStates != null && !finalStates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == CometaElement.class) {
			switch (derivedFeatureID) {
				case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__VERSION: return CometafsmPackage.COMETA_ELEMENT__VERSION;
				case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__DEFINITION: return CometafsmPackage.COMETA_ELEMENT__DEFINITION;
				default: return -1;
			}
		}
		if (baseClass == StateMachineDefinition.class) {
			switch (derivedFeatureID) {
				case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__DECLARATION_BLOCK: return CometafsmPackage.STATE_MACHINE_DEFINITION__DECLARATION_BLOCK;
				case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__TRANSITIONS: return CometafsmPackage.STATE_MACHINE_DEFINITION__TRANSITIONS;
				case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__STATES: return CometafsmPackage.STATE_MACHINE_DEFINITION__STATES;
				case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__INITIAL_STATE: return CometafsmPackage.STATE_MACHINE_DEFINITION__INITIAL_STATE;
				case CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__FINAL_STATES: return CometafsmPackage.STATE_MACHINE_DEFINITION__FINAL_STATES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == CometaElement.class) {
			switch (baseFeatureID) {
				case CometafsmPackage.COMETA_ELEMENT__VERSION: return CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__VERSION;
				case CometafsmPackage.COMETA_ELEMENT__DEFINITION: return CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__DEFINITION;
				default: return -1;
			}
		}
		if (baseClass == StateMachineDefinition.class) {
			switch (baseFeatureID) {
				case CometafsmPackage.STATE_MACHINE_DEFINITION__DECLARATION_BLOCK: return CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__DECLARATION_BLOCK;
				case CometafsmPackage.STATE_MACHINE_DEFINITION__TRANSITIONS: return CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__TRANSITIONS;
				case CometafsmPackage.STATE_MACHINE_DEFINITION__STATES: return CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__STATES;
				case CometafsmPackage.STATE_MACHINE_DEFINITION__INITIAL_STATE: return CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__INITIAL_STATE;
				case CometafsmPackage.STATE_MACHINE_DEFINITION__FINAL_STATES: return CcslmoccPackage.STATE_MACHINE_RELATION_DEFINITION__FINAL_STATES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (version: ");
		result.append(version);
		result.append(", definition: ");
		result.append(definition);
		result.append(')');
		return result.toString();
	}

} //StateMachineRelationDefinitionImpl
