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

import org.nasdanika.models.threat.Taxonomy;
import org.nasdanika.models.threat.ThreatCategory;
import org.nasdanika.models.threat.ThreatPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Taxonomy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.threat.impl.TaxonomyImpl#getAuthority <em>Authority</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.impl.TaxonomyImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.impl.TaxonomyImpl#getWebsite <em>Website</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.impl.TaxonomyImpl#getCategories <em>Categories</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaxonomyImpl extends ModelElementImpl implements Taxonomy {
	/**
	 * The default value of the '{@link #getAuthority() <em>Authority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthority()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHORITY_EDEFAULT = null;

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
	 * The default value of the '{@link #getWebsite() <em>Website</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsite()
	 * @generated
	 * @ordered
	 */
	protected static final String WEBSITE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaxonomyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThreatPackage.Literals.TAXONOMY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthority() {
		return (String)eDynamicGet(ThreatPackage.TAXONOMY__AUTHORITY, ThreatPackage.Literals.TAXONOMY__AUTHORITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthority(String newAuthority) {
		eDynamicSet(ThreatPackage.TAXONOMY__AUTHORITY, ThreatPackage.Literals.TAXONOMY__AUTHORITY, newAuthority);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return (String)eDynamicGet(ThreatPackage.TAXONOMY__VERSION, ThreatPackage.Literals.TAXONOMY__VERSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		eDynamicSet(ThreatPackage.TAXONOMY__VERSION, ThreatPackage.Literals.TAXONOMY__VERSION, newVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebsite() {
		return (String)eDynamicGet(ThreatPackage.TAXONOMY__WEBSITE, ThreatPackage.Literals.TAXONOMY__WEBSITE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebsite(String newWebsite) {
		eDynamicSet(ThreatPackage.TAXONOMY__WEBSITE, ThreatPackage.Literals.TAXONOMY__WEBSITE, newWebsite);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ThreatCategory> getCategories() {
		return (EList<ThreatCategory>)eDynamicGet(ThreatPackage.TAXONOMY__CATEGORIES, ThreatPackage.Literals.TAXONOMY__CATEGORIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ThreatPackage.TAXONOMY__CATEGORIES:
				return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
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
			case ThreatPackage.TAXONOMY__AUTHORITY:
				return getAuthority();
			case ThreatPackage.TAXONOMY__VERSION:
				return getVersion();
			case ThreatPackage.TAXONOMY__WEBSITE:
				return getWebsite();
			case ThreatPackage.TAXONOMY__CATEGORIES:
				return getCategories();
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
			case ThreatPackage.TAXONOMY__AUTHORITY:
				setAuthority((String)newValue);
				return;
			case ThreatPackage.TAXONOMY__VERSION:
				setVersion((String)newValue);
				return;
			case ThreatPackage.TAXONOMY__WEBSITE:
				setWebsite((String)newValue);
				return;
			case ThreatPackage.TAXONOMY__CATEGORIES:
				getCategories().clear();
				getCategories().addAll((Collection<? extends ThreatCategory>)newValue);
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
			case ThreatPackage.TAXONOMY__AUTHORITY:
				setAuthority(AUTHORITY_EDEFAULT);
				return;
			case ThreatPackage.TAXONOMY__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ThreatPackage.TAXONOMY__WEBSITE:
				setWebsite(WEBSITE_EDEFAULT);
				return;
			case ThreatPackage.TAXONOMY__CATEGORIES:
				getCategories().clear();
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
			case ThreatPackage.TAXONOMY__AUTHORITY:
				return AUTHORITY_EDEFAULT == null ? getAuthority() != null : !AUTHORITY_EDEFAULT.equals(getAuthority());
			case ThreatPackage.TAXONOMY__VERSION:
				return VERSION_EDEFAULT == null ? getVersion() != null : !VERSION_EDEFAULT.equals(getVersion());
			case ThreatPackage.TAXONOMY__WEBSITE:
				return WEBSITE_EDEFAULT == null ? getWebsite() != null : !WEBSITE_EDEFAULT.equals(getWebsite());
			case ThreatPackage.TAXONOMY__CATEGORIES:
				return !getCategories().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TaxonomyImpl
