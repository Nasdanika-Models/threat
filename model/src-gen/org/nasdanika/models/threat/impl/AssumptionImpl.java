/**
 */
package org.nasdanika.models.threat.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.nxcore.impl.ModelElementImpl;

import org.nasdanika.models.threat.Assumption;
import org.nasdanika.models.threat.ThreatPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assumption</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.threat.impl.AssumptionImpl#isValidated <em>Validated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssumptionImpl extends ModelElementImpl implements Assumption {
	/**
	 * The default value of the '{@link #isValidated() <em>Validated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValidated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALIDATED_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssumptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThreatPackage.Literals.ASSUMPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isValidated() {
		return (Boolean)eDynamicGet(ThreatPackage.ASSUMPTION__VALIDATED, ThreatPackage.Literals.ASSUMPTION__VALIDATED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidated(boolean newValidated) {
		eDynamicSet(ThreatPackage.ASSUMPTION__VALIDATED, ThreatPackage.Literals.ASSUMPTION__VALIDATED, newValidated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ThreatPackage.ASSUMPTION__VALIDATED:
				return isValidated();
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
			case ThreatPackage.ASSUMPTION__VALIDATED:
				setValidated((Boolean)newValue);
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
			case ThreatPackage.ASSUMPTION__VALIDATED:
				setValidated(VALIDATED_EDEFAULT);
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
			case ThreatPackage.ASSUMPTION__VALIDATED:
				return isValidated() != VALIDATED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //AssumptionImpl
