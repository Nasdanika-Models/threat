/**
 */
package org.nasdanika.models.threat.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.governance.Level;

import org.nasdanika.models.nxcore.impl.ModelElementImpl;

import org.nasdanika.models.threat.ThreatActor;
import org.nasdanika.models.threat.ThreatPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.threat.impl.ThreatActorImpl#getCapability <em>Capability</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.impl.ThreatActorImpl#getIntent <em>Intent</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.impl.ThreatActorImpl#getMotivation <em>Motivation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThreatActorImpl extends ModelElementImpl implements ThreatActor {
	/**
	 * The default value of the '{@link #getCapability() <em>Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapability()
	 * @generated
	 * @ordered
	 */
	protected static final Level CAPABILITY_EDEFAULT = Level.VERY_LOW;

	/**
	 * The default value of the '{@link #getIntent() <em>Intent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntent()
	 * @generated
	 * @ordered
	 */
	protected static final Level INTENT_EDEFAULT = Level.VERY_LOW;

	/**
	 * The default value of the '{@link #getMotivation() <em>Motivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotivation()
	 * @generated
	 * @ordered
	 */
	protected static final String MOTIVATION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreatActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThreatPackage.Literals.THREAT_ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Level getCapability() {
		return (Level)eDynamicGet(ThreatPackage.THREAT_ACTOR__CAPABILITY, ThreatPackage.Literals.THREAT_ACTOR__CAPABILITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCapability(Level newCapability) {
		eDynamicSet(ThreatPackage.THREAT_ACTOR__CAPABILITY, ThreatPackage.Literals.THREAT_ACTOR__CAPABILITY, newCapability);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Level getIntent() {
		return (Level)eDynamicGet(ThreatPackage.THREAT_ACTOR__INTENT, ThreatPackage.Literals.THREAT_ACTOR__INTENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntent(Level newIntent) {
		eDynamicSet(ThreatPackage.THREAT_ACTOR__INTENT, ThreatPackage.Literals.THREAT_ACTOR__INTENT, newIntent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMotivation() {
		return (String)eDynamicGet(ThreatPackage.THREAT_ACTOR__MOTIVATION, ThreatPackage.Literals.THREAT_ACTOR__MOTIVATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMotivation(String newMotivation) {
		eDynamicSet(ThreatPackage.THREAT_ACTOR__MOTIVATION, ThreatPackage.Literals.THREAT_ACTOR__MOTIVATION, newMotivation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ThreatPackage.THREAT_ACTOR__CAPABILITY:
				return getCapability();
			case ThreatPackage.THREAT_ACTOR__INTENT:
				return getIntent();
			case ThreatPackage.THREAT_ACTOR__MOTIVATION:
				return getMotivation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ThreatPackage.THREAT_ACTOR__CAPABILITY:
				setCapability((Level)newValue);
				return;
			case ThreatPackage.THREAT_ACTOR__INTENT:
				setIntent((Level)newValue);
				return;
			case ThreatPackage.THREAT_ACTOR__MOTIVATION:
				setMotivation((String)newValue);
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
			case ThreatPackage.THREAT_ACTOR__CAPABILITY:
				setCapability(CAPABILITY_EDEFAULT);
				return;
			case ThreatPackage.THREAT_ACTOR__INTENT:
				setIntent(INTENT_EDEFAULT);
				return;
			case ThreatPackage.THREAT_ACTOR__MOTIVATION:
				setMotivation(MOTIVATION_EDEFAULT);
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
			case ThreatPackage.THREAT_ACTOR__CAPABILITY:
				return getCapability() != CAPABILITY_EDEFAULT;
			case ThreatPackage.THREAT_ACTOR__INTENT:
				return getIntent() != INTENT_EDEFAULT;
			case ThreatPackage.THREAT_ACTOR__MOTIVATION:
				return MOTIVATION_EDEFAULT == null ? getMotivation() != null : !MOTIVATION_EDEFAULT.equals(getMotivation());
		}
		return super.eIsSet(featureID);
	}

} //ThreatActorImpl
