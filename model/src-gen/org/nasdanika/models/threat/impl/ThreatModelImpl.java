/**
 */
package org.nasdanika.models.threat.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.threat.Asset;
import org.nasdanika.models.threat.AssetKind;
import org.nasdanika.models.threat.Assumption;
import org.nasdanika.models.threat.Taxonomy;
import org.nasdanika.models.threat.ThreatActor;
import org.nasdanika.models.threat.ThreatModel;
import org.nasdanika.models.threat.ThreatPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.threat.impl.ThreatModelImpl#getTaxonomies <em>Taxonomies</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.impl.ThreatModelImpl#getKinds <em>Kinds</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.impl.ThreatModelImpl#getActors <em>Actors</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.impl.ThreatModelImpl#getAssets <em>Assets</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.impl.ThreatModelImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.impl.ThreatModelImpl#getAssumptions <em>Assumptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThreatModelImpl extends EObjectImpl implements ThreatModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreatModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThreatPackage.Literals.THREAT_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Taxonomy> getTaxonomies() {
		return (EList<Taxonomy>)eDynamicGet(ThreatPackage.THREAT_MODEL__TAXONOMIES, ThreatPackage.Literals.THREAT_MODEL__TAXONOMIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AssetKind> getKinds() {
		return (EList<AssetKind>)eDynamicGet(ThreatPackage.THREAT_MODEL__KINDS, ThreatPackage.Literals.THREAT_MODEL__KINDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ThreatActor> getActors() {
		return (EList<ThreatActor>)eDynamicGet(ThreatPackage.THREAT_MODEL__ACTORS, ThreatPackage.Literals.THREAT_MODEL__ACTORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Asset> getAssets() {
		return (EList<Asset>)eDynamicGet(ThreatPackage.THREAT_MODEL__ASSETS, ThreatPackage.Literals.THREAT_MODEL__ASSETS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Asset> getScope() {
		return (EList<Asset>)eDynamicGet(ThreatPackage.THREAT_MODEL__SCOPE, ThreatPackage.Literals.THREAT_MODEL__SCOPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Assumption> getAssumptions() {
		return (EList<Assumption>)eDynamicGet(ThreatPackage.THREAT_MODEL__ASSUMPTIONS, ThreatPackage.Literals.THREAT_MODEL__ASSUMPTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ThreatPackage.THREAT_MODEL__TAXONOMIES:
				return ((InternalEList<?>)getTaxonomies()).basicRemove(otherEnd, msgs);
			case ThreatPackage.THREAT_MODEL__KINDS:
				return ((InternalEList<?>)getKinds()).basicRemove(otherEnd, msgs);
			case ThreatPackage.THREAT_MODEL__ACTORS:
				return ((InternalEList<?>)getActors()).basicRemove(otherEnd, msgs);
			case ThreatPackage.THREAT_MODEL__ASSETS:
				return ((InternalEList<?>)getAssets()).basicRemove(otherEnd, msgs);
			case ThreatPackage.THREAT_MODEL__ASSUMPTIONS:
				return ((InternalEList<?>)getAssumptions()).basicRemove(otherEnd, msgs);
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
			case ThreatPackage.THREAT_MODEL__TAXONOMIES:
				return getTaxonomies();
			case ThreatPackage.THREAT_MODEL__KINDS:
				return getKinds();
			case ThreatPackage.THREAT_MODEL__ACTORS:
				return getActors();
			case ThreatPackage.THREAT_MODEL__ASSETS:
				return getAssets();
			case ThreatPackage.THREAT_MODEL__SCOPE:
				return getScope();
			case ThreatPackage.THREAT_MODEL__ASSUMPTIONS:
				return getAssumptions();
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
			case ThreatPackage.THREAT_MODEL__TAXONOMIES:
				getTaxonomies().clear();
				getTaxonomies().addAll((Collection<? extends Taxonomy>)newValue);
				return;
			case ThreatPackage.THREAT_MODEL__KINDS:
				getKinds().clear();
				getKinds().addAll((Collection<? extends AssetKind>)newValue);
				return;
			case ThreatPackage.THREAT_MODEL__ACTORS:
				getActors().clear();
				getActors().addAll((Collection<? extends ThreatActor>)newValue);
				return;
			case ThreatPackage.THREAT_MODEL__ASSETS:
				getAssets().clear();
				getAssets().addAll((Collection<? extends Asset>)newValue);
				return;
			case ThreatPackage.THREAT_MODEL__SCOPE:
				getScope().clear();
				getScope().addAll((Collection<? extends Asset>)newValue);
				return;
			case ThreatPackage.THREAT_MODEL__ASSUMPTIONS:
				getAssumptions().clear();
				getAssumptions().addAll((Collection<? extends Assumption>)newValue);
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
			case ThreatPackage.THREAT_MODEL__TAXONOMIES:
				getTaxonomies().clear();
				return;
			case ThreatPackage.THREAT_MODEL__KINDS:
				getKinds().clear();
				return;
			case ThreatPackage.THREAT_MODEL__ACTORS:
				getActors().clear();
				return;
			case ThreatPackage.THREAT_MODEL__ASSETS:
				getAssets().clear();
				return;
			case ThreatPackage.THREAT_MODEL__SCOPE:
				getScope().clear();
				return;
			case ThreatPackage.THREAT_MODEL__ASSUMPTIONS:
				getAssumptions().clear();
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
			case ThreatPackage.THREAT_MODEL__TAXONOMIES:
				return !getTaxonomies().isEmpty();
			case ThreatPackage.THREAT_MODEL__KINDS:
				return !getKinds().isEmpty();
			case ThreatPackage.THREAT_MODEL__ACTORS:
				return !getActors().isEmpty();
			case ThreatPackage.THREAT_MODEL__ASSETS:
				return !getAssets().isEmpty();
			case ThreatPackage.THREAT_MODEL__SCOPE:
				return !getScope().isEmpty();
			case ThreatPackage.THREAT_MODEL__ASSUMPTIONS:
				return !getAssumptions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ThreatModelImpl
