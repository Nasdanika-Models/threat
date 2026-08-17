/**
 */
package org.nasdanika.models.threat;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.governance.Control;
import org.nasdanika.models.governance.Level;
import org.nasdanika.models.governance.Risk;

import org.nasdanika.models.nxcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Threat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Something that can go wrong: the unit of threat modeling. Contained in
 * the asset it targets; categorized in any number of taxonomies
 * (crosswalk); mitigated by governance controls; elevated into the
 * governance risk register when it survives analysis. Contains child
 * threats: an attack tree, with the root as goal and leaves as steps.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.threat.Threat#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.Threat#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.Threat#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.Threat#getActors <em>Actors</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.Threat#getExploits <em>Exploits</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.Threat#getLikelihood <em>Likelihood</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.Threat#getImpact <em>Impact</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.Threat#getMitigations <em>Mitigations</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.Threat#getRisks <em>Risks</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.Threat#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.Threat#getOrigin <em>Origin</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.threat.ThreatPackage#getThreat()
 * @model
 * @generated
 */
public interface Threat extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.threat.Asset#getThreats <em>Threats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' container reference.
	 * @see #setTarget(Asset)
	 * @see org.nasdanika.models.threat.ThreatPackage#getThreat_Target()
	 * @see org.nasdanika.models.threat.Asset#getThreats
	 * @model opposite="threats" transient="false"
	 * @generated
	 */
	Asset getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.threat.Threat#getTarget <em>Target</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' container reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Asset value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.threat.ThreatStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.nasdanika.models.threat.ThreatStatus
	 * @see #setStatus(ThreatStatus)
	 * @see org.nasdanika.models.threat.ThreatPackage#getThreat_Status()
	 * @model unique="false"
	 * @generated
	 */
	ThreatStatus getStatus();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.threat.Threat#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.nasdanika.models.threat.ThreatStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ThreatStatus value);

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.threat.ThreatCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' reference list.
	 * @see org.nasdanika.models.threat.ThreatPackage#getThreat_Categories()
	 * @model
	 * @generated
	 */
	EList<ThreatCategory> getCategories();

	/**
	 * Returns the value of the '<em><b>Actors</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.threat.ThreatActor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actors</em>' reference list.
	 * @see org.nasdanika.models.threat.ThreatPackage#getThreat_Actors()
	 * @model
	 * @generated
	 */
	EList<ThreatActor> getActors();

	/**
	 * Returns the value of the '<em><b>Exploits</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.threat.Weakness}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exploits</em>' reference list.
	 * @see org.nasdanika.models.threat.ThreatPackage#getThreat_Exploits()
	 * @model
	 * @generated
	 */
	EList<Weakness> getExploits();

	/**
	 * Returns the value of the '<em><b>Likelihood</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.governance.Level}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Likelihood</em>' attribute.
	 * @see org.nasdanika.models.governance.Level
	 * @see #setLikelihood(Level)
	 * @see org.nasdanika.models.threat.ThreatPackage#getThreat_Likelihood()
	 * @model unique="false"
	 * @generated
	 */
	Level getLikelihood();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.threat.Threat#getLikelihood <em>Likelihood</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Likelihood</em>' attribute.
	 * @see org.nasdanika.models.governance.Level
	 * @see #getLikelihood()
	 * @generated
	 */
	void setLikelihood(Level value);

	/**
	 * Returns the value of the '<em><b>Impact</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.governance.Level}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impact</em>' attribute.
	 * @see org.nasdanika.models.governance.Level
	 * @see #setImpact(Level)
	 * @see org.nasdanika.models.threat.ThreatPackage#getThreat_Impact()
	 * @model unique="false"
	 * @generated
	 */
	Level getImpact();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.threat.Threat#getImpact <em>Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impact</em>' attribute.
	 * @see org.nasdanika.models.governance.Level
	 * @see #getImpact()
	 * @generated
	 */
	void setImpact(Level value);

	/**
	 * Returns the value of the '<em><b>Mitigations</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.governance.Control}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  What we are going to do: reused from governance, threat modeling is demand for the control catalog.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mitigations</em>' reference list.
	 * @see org.nasdanika.models.threat.ThreatPackage#getThreat_Mitigations()
	 * @model
	 * @generated
	 */
	EList<Control> getMitigations();

	/**
	 * Returns the value of the '<em><b>Risks</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.governance.Risk}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The risk register entry this threat was elevated to; analysis feeds governance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Risks</em>' reference list.
	 * @see org.nasdanika.models.threat.ThreatPackage#getThreat_Risks()
	 * @model
	 * @generated
	 */
	EList<Risk> getRisks();

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.threat.Threat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.models.threat.ThreatPackage#getThreat_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Threat> getChildren();

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  URI of the authoring source: STRIDE GPT style generation, workshop note, diagram annotation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Origin</em>' attribute.
	 * @see #setOrigin(String)
	 * @see org.nasdanika.models.threat.ThreatPackage#getThreat_Origin()
	 * @model unique="false"
	 * @generated
	 */
	String getOrigin();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.threat.Threat#getOrigin <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' attribute.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(String value);

} // Threat
