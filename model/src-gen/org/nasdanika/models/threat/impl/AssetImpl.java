/**
 */
package org.nasdanika.models.threat.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.architecture.impl.ElementImpl;

import org.nasdanika.models.governance.Level;

import org.nasdanika.models.threat.Asset;
import org.nasdanika.models.threat.Threat;
import org.nasdanika.models.threat.ThreatPackage;
import org.nasdanika.models.threat.Weakness;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.threat.impl.AssetImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.impl.AssetImpl#getThreats <em>Threats</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.impl.AssetImpl#getWeaknesses <em>Weaknesses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetImpl extends ElementImpl implements Asset {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final Level VALUE_EDEFAULT = Level.VERY_LOW;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThreatPackage.Literals.ASSET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Level getValue() {
		return (Level)eDynamicGet(ThreatPackage.ASSET__VALUE, ThreatPackage.Literals.ASSET__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(Level newValue) {
		eDynamicSet(ThreatPackage.ASSET__VALUE, ThreatPackage.Literals.ASSET__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Threat> getThreats() {
		return (EList<Threat>)eDynamicGet(ThreatPackage.ASSET__THREATS, ThreatPackage.Literals.ASSET__THREATS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Weakness> getWeaknesses() {
		return (EList<Weakness>)eDynamicGet(ThreatPackage.ASSET__WEAKNESSES, ThreatPackage.Literals.ASSET__WEAKNESSES, true, true);
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
			case ThreatPackage.ASSET__THREATS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getThreats()).basicAdd(otherEnd, msgs);
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
			case ThreatPackage.ASSET__THREATS:
				return ((InternalEList<?>)getThreats()).basicRemove(otherEnd, msgs);
			case ThreatPackage.ASSET__WEAKNESSES:
				return ((InternalEList<?>)getWeaknesses()).basicRemove(otherEnd, msgs);
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
			case ThreatPackage.ASSET__VALUE:
				return getValue();
			case ThreatPackage.ASSET__THREATS:
				return getThreats();
			case ThreatPackage.ASSET__WEAKNESSES:
				return getWeaknesses();
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
			case ThreatPackage.ASSET__VALUE:
				setValue((Level)newValue);
				return;
			case ThreatPackage.ASSET__THREATS:
				getThreats().clear();
				getThreats().addAll((Collection<? extends Threat>)newValue);
				return;
			case ThreatPackage.ASSET__WEAKNESSES:
				getWeaknesses().clear();
				getWeaknesses().addAll((Collection<? extends Weakness>)newValue);
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
			case ThreatPackage.ASSET__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ThreatPackage.ASSET__THREATS:
				getThreats().clear();
				return;
			case ThreatPackage.ASSET__WEAKNESSES:
				getWeaknesses().clear();
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
			case ThreatPackage.ASSET__VALUE:
				return getValue() != VALUE_EDEFAULT;
			case ThreatPackage.ASSET__THREATS:
				return !getThreats().isEmpty();
			case ThreatPackage.ASSET__WEAKNESSES:
				return !getWeaknesses().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AssetImpl
