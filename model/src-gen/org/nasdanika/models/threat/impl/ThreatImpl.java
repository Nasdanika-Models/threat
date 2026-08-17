/**
 */
package org.nasdanika.models.threat.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.governance.Control;
import org.nasdanika.models.governance.Level;
import org.nasdanika.models.governance.Risk;

import org.nasdanika.models.nxcore.impl.ModelElementImpl;

import org.nasdanika.models.threat.Asset;
import org.nasdanika.models.threat.Threat;
import org.nasdanika.models.threat.ThreatActor;
import org.nasdanika.models.threat.ThreatCategory;
import org.nasdanika.models.threat.ThreatPackage;
import org.nasdanika.models.threat.ThreatStatus;
import org.nasdanika.models.threat.Weakness;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Threat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.threat.impl.ThreatImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.impl.ThreatImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.impl.ThreatImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.impl.ThreatImpl#getActors <em>Actors</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.impl.ThreatImpl#getExploits <em>Exploits</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.impl.ThreatImpl#getLikelihood <em>Likelihood</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.impl.ThreatImpl#getImpact <em>Impact</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.impl.ThreatImpl#getMitigations <em>Mitigations</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.impl.ThreatImpl#getRisks <em>Risks</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.impl.ThreatImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.impl.ThreatImpl#getOrigin <em>Origin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThreatImpl extends ModelElementImpl implements Threat {
	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ThreatStatus STATUS_EDEFAULT = ThreatStatus.IDENTIFIED;

	/**
	 * The default value of the '{@link #getLikelihood() <em>Likelihood</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLikelihood()
	 * @generated
	 * @ordered
	 */
	protected static final Level LIKELIHOOD_EDEFAULT = Level.VERY_LOW;

	/**
	 * The default value of the '{@link #getImpact() <em>Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpact()
	 * @generated
	 * @ordered
	 */
	protected static final Level IMPACT_EDEFAULT = Level.VERY_LOW;

	/**
	 * The default value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGIN_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThreatPackage.Literals.THREAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Asset getTarget() {
		return (Asset)eDynamicGet(ThreatPackage.THREAT__TARGET, ThreatPackage.Literals.THREAT__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset basicGetTarget() {
		return (Asset)eDynamicGet(ThreatPackage.THREAT__TARGET, ThreatPackage.Literals.THREAT__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Asset newTarget, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTarget, ThreatPackage.THREAT__TARGET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(Asset newTarget) {
		eDynamicSet(ThreatPackage.THREAT__TARGET, ThreatPackage.Literals.THREAT__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThreatStatus getStatus() {
		return (ThreatStatus)eDynamicGet(ThreatPackage.THREAT__STATUS, ThreatPackage.Literals.THREAT__STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(ThreatStatus newStatus) {
		eDynamicSet(ThreatPackage.THREAT__STATUS, ThreatPackage.Literals.THREAT__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ThreatCategory> getCategories() {
		return (EList<ThreatCategory>)eDynamicGet(ThreatPackage.THREAT__CATEGORIES, ThreatPackage.Literals.THREAT__CATEGORIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ThreatActor> getActors() {
		return (EList<ThreatActor>)eDynamicGet(ThreatPackage.THREAT__ACTORS, ThreatPackage.Literals.THREAT__ACTORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Weakness> getExploits() {
		return (EList<Weakness>)eDynamicGet(ThreatPackage.THREAT__EXPLOITS, ThreatPackage.Literals.THREAT__EXPLOITS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Level getLikelihood() {
		return (Level)eDynamicGet(ThreatPackage.THREAT__LIKELIHOOD, ThreatPackage.Literals.THREAT__LIKELIHOOD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLikelihood(Level newLikelihood) {
		eDynamicSet(ThreatPackage.THREAT__LIKELIHOOD, ThreatPackage.Literals.THREAT__LIKELIHOOD, newLikelihood);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Level getImpact() {
		return (Level)eDynamicGet(ThreatPackage.THREAT__IMPACT, ThreatPackage.Literals.THREAT__IMPACT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImpact(Level newImpact) {
		eDynamicSet(ThreatPackage.THREAT__IMPACT, ThreatPackage.Literals.THREAT__IMPACT, newImpact);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Control> getMitigations() {
		return (EList<Control>)eDynamicGet(ThreatPackage.THREAT__MITIGATIONS, ThreatPackage.Literals.THREAT__MITIGATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Risk> getRisks() {
		return (EList<Risk>)eDynamicGet(ThreatPackage.THREAT__RISKS, ThreatPackage.Literals.THREAT__RISKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Threat> getChildren() {
		return (EList<Threat>)eDynamicGet(ThreatPackage.THREAT__CHILDREN, ThreatPackage.Literals.THREAT__CHILDREN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrigin() {
		return (String)eDynamicGet(ThreatPackage.THREAT__ORIGIN, ThreatPackage.Literals.THREAT__ORIGIN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrigin(String newOrigin) {
		eDynamicSet(ThreatPackage.THREAT__ORIGIN, ThreatPackage.Literals.THREAT__ORIGIN, newOrigin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ThreatPackage.THREAT__TARGET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTarget((Asset)otherEnd, msgs);
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
			case ThreatPackage.THREAT__TARGET:
				return basicSetTarget(null, msgs);
			case ThreatPackage.THREAT__CHILDREN:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ThreatPackage.THREAT__TARGET:
				return eInternalContainer().eInverseRemove(this, ThreatPackage.ASSET__THREATS, Asset.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ThreatPackage.THREAT__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case ThreatPackage.THREAT__STATUS:
				return getStatus();
			case ThreatPackage.THREAT__CATEGORIES:
				return getCategories();
			case ThreatPackage.THREAT__ACTORS:
				return getActors();
			case ThreatPackage.THREAT__EXPLOITS:
				return getExploits();
			case ThreatPackage.THREAT__LIKELIHOOD:
				return getLikelihood();
			case ThreatPackage.THREAT__IMPACT:
				return getImpact();
			case ThreatPackage.THREAT__MITIGATIONS:
				return getMitigations();
			case ThreatPackage.THREAT__RISKS:
				return getRisks();
			case ThreatPackage.THREAT__CHILDREN:
				return getChildren();
			case ThreatPackage.THREAT__ORIGIN:
				return getOrigin();
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
			case ThreatPackage.THREAT__TARGET:
				setTarget((Asset)newValue);
				return;
			case ThreatPackage.THREAT__STATUS:
				setStatus((ThreatStatus)newValue);
				return;
			case ThreatPackage.THREAT__CATEGORIES:
				getCategories().clear();
				getCategories().addAll((Collection<? extends ThreatCategory>)newValue);
				return;
			case ThreatPackage.THREAT__ACTORS:
				getActors().clear();
				getActors().addAll((Collection<? extends ThreatActor>)newValue);
				return;
			case ThreatPackage.THREAT__EXPLOITS:
				getExploits().clear();
				getExploits().addAll((Collection<? extends Weakness>)newValue);
				return;
			case ThreatPackage.THREAT__LIKELIHOOD:
				setLikelihood((Level)newValue);
				return;
			case ThreatPackage.THREAT__IMPACT:
				setImpact((Level)newValue);
				return;
			case ThreatPackage.THREAT__MITIGATIONS:
				getMitigations().clear();
				getMitigations().addAll((Collection<? extends Control>)newValue);
				return;
			case ThreatPackage.THREAT__RISKS:
				getRisks().clear();
				getRisks().addAll((Collection<? extends Risk>)newValue);
				return;
			case ThreatPackage.THREAT__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Threat>)newValue);
				return;
			case ThreatPackage.THREAT__ORIGIN:
				setOrigin((String)newValue);
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
			case ThreatPackage.THREAT__TARGET:
				setTarget((Asset)null);
				return;
			case ThreatPackage.THREAT__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case ThreatPackage.THREAT__CATEGORIES:
				getCategories().clear();
				return;
			case ThreatPackage.THREAT__ACTORS:
				getActors().clear();
				return;
			case ThreatPackage.THREAT__EXPLOITS:
				getExploits().clear();
				return;
			case ThreatPackage.THREAT__LIKELIHOOD:
				setLikelihood(LIKELIHOOD_EDEFAULT);
				return;
			case ThreatPackage.THREAT__IMPACT:
				setImpact(IMPACT_EDEFAULT);
				return;
			case ThreatPackage.THREAT__MITIGATIONS:
				getMitigations().clear();
				return;
			case ThreatPackage.THREAT__RISKS:
				getRisks().clear();
				return;
			case ThreatPackage.THREAT__CHILDREN:
				getChildren().clear();
				return;
			case ThreatPackage.THREAT__ORIGIN:
				setOrigin(ORIGIN_EDEFAULT);
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
			case ThreatPackage.THREAT__TARGET:
				return basicGetTarget() != null;
			case ThreatPackage.THREAT__STATUS:
				return getStatus() != STATUS_EDEFAULT;
			case ThreatPackage.THREAT__CATEGORIES:
				return !getCategories().isEmpty();
			case ThreatPackage.THREAT__ACTORS:
				return !getActors().isEmpty();
			case ThreatPackage.THREAT__EXPLOITS:
				return !getExploits().isEmpty();
			case ThreatPackage.THREAT__LIKELIHOOD:
				return getLikelihood() != LIKELIHOOD_EDEFAULT;
			case ThreatPackage.THREAT__IMPACT:
				return getImpact() != IMPACT_EDEFAULT;
			case ThreatPackage.THREAT__MITIGATIONS:
				return !getMitigations().isEmpty();
			case ThreatPackage.THREAT__RISKS:
				return !getRisks().isEmpty();
			case ThreatPackage.THREAT__CHILDREN:
				return !getChildren().isEmpty();
			case ThreatPackage.THREAT__ORIGIN:
				return ORIGIN_EDEFAULT == null ? getOrigin() != null : !ORIGIN_EDEFAULT.equals(getOrigin());
		}
		return super.eIsSet(featureID);
	}

} //ThreatImpl
