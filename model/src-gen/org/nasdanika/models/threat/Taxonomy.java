/**
 */
package org.nasdanika.models.threat;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.nxcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Taxonomy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---- Taxonomies (instance data, not enums) ----
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.threat.Taxonomy#getAuthority <em>Authority</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.Taxonomy#getVersion <em>Version</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.Taxonomy#getWebsite <em>Website</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.Taxonomy#getCategories <em>Categories</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.threat.ThreatPackage#getTaxonomy()
 * @model
 * @generated
 */
public interface Taxonomy extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Authority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Issuing authority, e.g. Microsoft, MITRE, OWASP, internal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authority</em>' attribute.
	 * @see #setAuthority(String)
	 * @see org.nasdanika.models.threat.ThreatPackage#getTaxonomy_Authority()
	 * @model unique="false"
	 * @generated
	 */
	String getAuthority();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.threat.Taxonomy#getAuthority <em>Authority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authority</em>' attribute.
	 * @see #getAuthority()
	 * @generated
	 */
	void setAuthority(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.nasdanika.models.threat.ThreatPackage#getTaxonomy_Version()
	 * @model unique="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.threat.Taxonomy#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Website</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Website</em>' attribute.
	 * @see #setWebsite(String)
	 * @see org.nasdanika.models.threat.ThreatPackage#getTaxonomy_Website()
	 * @model unique="false"
	 * @generated
	 */
	String getWebsite();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.threat.Taxonomy#getWebsite <em>Website</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Website</em>' attribute.
	 * @see #getWebsite()
	 * @generated
	 */
	void setWebsite(String value);

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.threat.ThreatCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference list.
	 * @see org.nasdanika.models.threat.ThreatPackage#getTaxonomy_Categories()
	 * @model containment="true"
	 * @generated
	 */
	EList<ThreatCategory> getCategories();

} // Taxonomy
