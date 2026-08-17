/**
 */
package org.nasdanika.models.threat.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.threat.Asset;
import org.nasdanika.models.threat.ThreatPackage;
import org.nasdanika.models.threat.TrustBoundary;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trust Boundary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.threat.impl.TrustBoundaryImpl#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrustBoundaryImpl extends AssetImpl implements TrustBoundary {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrustBoundaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThreatPackage.Literals.TRUST_BOUNDARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Asset> getMembers() {
		return (EList<Asset>)eDynamicGet(ThreatPackage.TRUST_BOUNDARY__MEMBERS, ThreatPackage.Literals.TRUST_BOUNDARY__MEMBERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ThreatPackage.TRUST_BOUNDARY__MEMBERS:
				return getMembers();
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
			case ThreatPackage.TRUST_BOUNDARY__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends Asset>)newValue);
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
			case ThreatPackage.TRUST_BOUNDARY__MEMBERS:
				getMembers().clear();
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
			case ThreatPackage.TRUST_BOUNDARY__MEMBERS:
				return !getMembers().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TrustBoundaryImpl
