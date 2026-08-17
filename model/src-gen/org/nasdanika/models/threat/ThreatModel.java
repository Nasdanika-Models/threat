/**
 */
package org.nasdanika.models.threat;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.governance.Governed;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---- The exercise ----
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.threat.ThreatModel#getTaxonomies <em>Taxonomies</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.ThreatModel#getKinds <em>Kinds</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.ThreatModel#getActors <em>Actors</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.ThreatModel#getAssets <em>Assets</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.ThreatModel#getScope <em>Scope</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.ThreatModel#getAssumptions <em>Assumptions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.threat.ThreatPackage#getThreatModel()
 * @model
 * @generated
 */
public interface ThreatModel extends Governed {
	/**
	 * Returns the value of the '<em><b>Taxonomies</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.threat.Taxonomy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taxonomies</em>' containment reference list.
	 * @see org.nasdanika.models.threat.ThreatPackage#getThreatModel_Taxonomies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Taxonomy> getTaxonomies();

	/**
	 * Returns the value of the '<em><b>Kinds</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.threat.AssetKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kinds</em>' containment reference list.
	 * @see org.nasdanika.models.threat.ThreatPackage#getThreatModel_Kinds()
	 * @model containment="true"
	 * @generated
	 */
	EList<AssetKind> getKinds();

	/**
	 * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.threat.ThreatActor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actors</em>' containment reference list.
	 * @see org.nasdanika.models.threat.ThreatPackage#getThreatModel_Actors()
	 * @model containment="true"
	 * @generated
	 */
	EList<ThreatActor> getActors();

	/**
	 * Returns the value of the '<em><b>Assets</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.threat.Asset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Standalone scope: assets modeled here.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assets</em>' containment reference list.
	 * @see org.nasdanika.models.threat.ThreatPackage#getThreatModel_Assets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Asset> getAssets();

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.threat.Asset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Aspect scope: assets defined in extending architecture/domain models.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scope</em>' reference list.
	 * @see org.nasdanika.models.threat.ThreatPackage#getThreatModel_Scope()
	 * @model
	 * @generated
	 */
	EList<Asset> getScope();

	/**
	 * Returns the value of the '<em><b>Assumptions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.threat.Assumption}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assumptions</em>' containment reference list.
	 * @see org.nasdanika.models.threat.ThreatPackage#getThreatModel_Assumptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Assumption> getAssumptions();

} // ThreatModel
