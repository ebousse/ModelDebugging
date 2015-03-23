/**
 */
package tfsmextended.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tfsmextended.FSMClock;
import tfsmextended.FSMEvent;
import tfsmextended.State;
import tfsmextended.TFSM;
import tfsmextended.TfsmextendedPackage;
import tfsmextended.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TFSM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tfsmextended.impl.TFSMImpl#getOwnedStates <em>Owned States</em>}</li>
 *   <li>{@link tfsmextended.impl.TFSMImpl#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link tfsmextended.impl.TFSMImpl#getLocalEvents <em>Local Events</em>}</li>
 *   <li>{@link tfsmextended.impl.TFSMImpl#getLocalClock <em>Local Clock</em>}</li>
 *   <li>{@link tfsmextended.impl.TFSMImpl#getOwnedTransitions <em>Owned Transitions</em>}</li>
 *   <li>{@link tfsmextended.impl.TFSMImpl#getCurrentState <em>Current State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TFSMImpl extends NamedElementImpl implements TFSM {
	/**
	 * The cached value of the '{@link #getOwnedStates() <em>Owned States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> ownedStates;

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
	 * The cached value of the '{@link #getLocalEvents() <em>Local Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<FSMEvent> localEvents;

	/**
	 * The cached value of the '{@link #getLocalClock() <em>Local Clock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalClock()
	 * @generated
	 * @ordered
	 */
	protected FSMClock localClock;

	/**
	 * The cached value of the '{@link #getOwnedTransitions() <em>Owned Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> ownedTransitions;

	/**
	 * The cached value of the '{@link #getCurrentState() <em>Current State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentState()
	 * @generated
	 * @ordered
	 */
	protected State currentState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TFSMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TfsmextendedPackage.Literals.TFSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getOwnedStates() {
		if (ownedStates == null) {
			ownedStates = new EObjectContainmentWithInverseEList<State>(State.class, this, TfsmextendedPackage.TFSM__OWNED_STATES, TfsmextendedPackage.STATE__OWNING_FSM);
		}
		return ownedStates;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TfsmextendedPackage.TFSM__INITIAL_STATE, oldInitialState, initialState));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TfsmextendedPackage.TFSM__INITIAL_STATE, oldInitialState, initialState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FSMEvent> getLocalEvents() {
		if (localEvents == null) {
			localEvents = new EObjectContainmentEList<FSMEvent>(FSMEvent.class, this, TfsmextendedPackage.TFSM__LOCAL_EVENTS);
		}
		return localEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSMClock getLocalClock() {
		return localClock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalClock(FSMClock newLocalClock, NotificationChain msgs) {
		FSMClock oldLocalClock = localClock;
		localClock = newLocalClock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TfsmextendedPackage.TFSM__LOCAL_CLOCK, oldLocalClock, newLocalClock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalClock(FSMClock newLocalClock) {
		if (newLocalClock != localClock) {
			NotificationChain msgs = null;
			if (localClock != null)
				msgs = ((InternalEObject)localClock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TfsmextendedPackage.TFSM__LOCAL_CLOCK, null, msgs);
			if (newLocalClock != null)
				msgs = ((InternalEObject)newLocalClock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TfsmextendedPackage.TFSM__LOCAL_CLOCK, null, msgs);
			msgs = basicSetLocalClock(newLocalClock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TfsmextendedPackage.TFSM__LOCAL_CLOCK, newLocalClock, newLocalClock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOwnedTransitions() {
		if (ownedTransitions == null) {
			ownedTransitions = new EObjectContainmentEList<Transition>(Transition.class, this, TfsmextendedPackage.TFSM__OWNED_TRANSITIONS);
		}
		return ownedTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getCurrentState() {
		if (currentState != null && currentState.eIsProxy()) {
			InternalEObject oldCurrentState = (InternalEObject)currentState;
			currentState = (State)eResolveProxy(oldCurrentState);
			if (currentState != oldCurrentState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TfsmextendedPackage.TFSM__CURRENT_STATE, oldCurrentState, currentState));
			}
		}
		return currentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetCurrentState() {
		return currentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentState(State newCurrentState) {
		State oldCurrentState = currentState;
		currentState = newCurrentState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TfsmextendedPackage.TFSM__CURRENT_STATE, oldCurrentState, currentState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Init() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeCurrentState(State newState) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TfsmextendedPackage.TFSM__OWNED_STATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedStates()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TfsmextendedPackage.TFSM__OWNED_STATES:
				return ((InternalEList<?>)getOwnedStates()).basicRemove(otherEnd, msgs);
			case TfsmextendedPackage.TFSM__LOCAL_EVENTS:
				return ((InternalEList<?>)getLocalEvents()).basicRemove(otherEnd, msgs);
			case TfsmextendedPackage.TFSM__LOCAL_CLOCK:
				return basicSetLocalClock(null, msgs);
			case TfsmextendedPackage.TFSM__OWNED_TRANSITIONS:
				return ((InternalEList<?>)getOwnedTransitions()).basicRemove(otherEnd, msgs);
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
			case TfsmextendedPackage.TFSM__OWNED_STATES:
				return getOwnedStates();
			case TfsmextendedPackage.TFSM__INITIAL_STATE:
				if (resolve) return getInitialState();
				return basicGetInitialState();
			case TfsmextendedPackage.TFSM__LOCAL_EVENTS:
				return getLocalEvents();
			case TfsmextendedPackage.TFSM__LOCAL_CLOCK:
				return getLocalClock();
			case TfsmextendedPackage.TFSM__OWNED_TRANSITIONS:
				return getOwnedTransitions();
			case TfsmextendedPackage.TFSM__CURRENT_STATE:
				if (resolve) return getCurrentState();
				return basicGetCurrentState();
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
			case TfsmextendedPackage.TFSM__OWNED_STATES:
				getOwnedStates().clear();
				getOwnedStates().addAll((Collection<? extends State>)newValue);
				return;
			case TfsmextendedPackage.TFSM__INITIAL_STATE:
				setInitialState((State)newValue);
				return;
			case TfsmextendedPackage.TFSM__LOCAL_EVENTS:
				getLocalEvents().clear();
				getLocalEvents().addAll((Collection<? extends FSMEvent>)newValue);
				return;
			case TfsmextendedPackage.TFSM__LOCAL_CLOCK:
				setLocalClock((FSMClock)newValue);
				return;
			case TfsmextendedPackage.TFSM__OWNED_TRANSITIONS:
				getOwnedTransitions().clear();
				getOwnedTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case TfsmextendedPackage.TFSM__CURRENT_STATE:
				setCurrentState((State)newValue);
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
			case TfsmextendedPackage.TFSM__OWNED_STATES:
				getOwnedStates().clear();
				return;
			case TfsmextendedPackage.TFSM__INITIAL_STATE:
				setInitialState((State)null);
				return;
			case TfsmextendedPackage.TFSM__LOCAL_EVENTS:
				getLocalEvents().clear();
				return;
			case TfsmextendedPackage.TFSM__LOCAL_CLOCK:
				setLocalClock((FSMClock)null);
				return;
			case TfsmextendedPackage.TFSM__OWNED_TRANSITIONS:
				getOwnedTransitions().clear();
				return;
			case TfsmextendedPackage.TFSM__CURRENT_STATE:
				setCurrentState((State)null);
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
			case TfsmextendedPackage.TFSM__OWNED_STATES:
				return ownedStates != null && !ownedStates.isEmpty();
			case TfsmextendedPackage.TFSM__INITIAL_STATE:
				return initialState != null;
			case TfsmextendedPackage.TFSM__LOCAL_EVENTS:
				return localEvents != null && !localEvents.isEmpty();
			case TfsmextendedPackage.TFSM__LOCAL_CLOCK:
				return localClock != null;
			case TfsmextendedPackage.TFSM__OWNED_TRANSITIONS:
				return ownedTransitions != null && !ownedTransitions.isEmpty();
			case TfsmextendedPackage.TFSM__CURRENT_STATE:
				return currentState != null;
		}
		return super.eIsSet(featureID);
	}

} //TFSMImpl
