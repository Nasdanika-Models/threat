/**
 */
package org.nasdanika.models.threat.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.nxcore.impl.ModelElementImpl;

import org.nasdanika.models.threat.ThreatCategory;
import org.nasdanika.models.threat.ThreatPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.threat.impl.ThreatCategoryImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.impl.ThreatCategoryImpl#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThreatCategoryImpl extends ModelElementImpl implements ThreatCategory {
	/**
	 * The default value of the '{@link #getReference() <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreatCategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThreatPackage.Literals.THREAT_CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReference() {
		return (String)eDynamicGet(ThreatPackage.THREAT_CATEGORY__REFERENCE, ThreatPackage.Literals.THREAT_CATEGORY__REFERENCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReference(String newReference) {
		eDynamicSet(ThreatPackage.THREAT_CATEGORY__REFERENCE, ThreatPackage.Literals.THREAT_CATEGORY__REFERENCE, newReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ThreatCategory> getChildren() {
		return (EList<ThreatCategory>)eDynamicGet(ThreatPackage.THREAT_CATEGORY__CHILDREN, ThreatPackage.Literals.THREAT_CATEGORY__CHILDREN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ThreatPackage.THREAT_CATEGORY__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
			case ThreatPackage.THREAT_CATEGORY__REFERENCE:
				return getReference();
			case ThreatPackage.THREAT_CATEGORY__CHILDREN:
				return getChildren();
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
			case ThreatPackage.THREAT_CATEGORY__REFERENCE:
				setReference((String)newValue);
				return;
			case ThreatPackage.THREAT_CATEGORY__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends ThreatCategory>)newValue);
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
			case ThreatPackage.THREAT_CATEGORY__REFERENCE:
				setReference(REFERENCE_EDEFAULT);
				return;
			case ThreatPackage.THREAT_CATEGORY__CHILDREN:
				getChildren().clear();
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
			case ThreatPackage.THREAT_CATEGORY__REFERENCE:
				return REFERENCE_EDEFAULT == null ? getReference() != null : !REFERENCE_EDEFAULT.equals(getReference());
			case ThreatPackage.THREAT_CATEGORY__CHILDREN:
				return !getChildren().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ThreatCategoryImpl
