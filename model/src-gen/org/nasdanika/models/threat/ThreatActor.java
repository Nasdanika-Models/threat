/**
 */
package org.nasdanika.models.threat;

import org.nasdanika.models.governance.Level;

import org.nasdanika.models.nxcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---- What can go wrong ----
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.threat.ThreatActor#getCapability <em>Capability</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.ThreatActor#getIntent <em>Intent</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.ThreatActor#getMotivation <em>Motivation</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.threat.ThreatPackage#getThreatActor()
 * @model
 * @generated
 */
public interface ThreatActor extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Capability</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.governance.Level}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability</em>' attribute.
	 * @see org.nasdanika.models.governance.Level
	 * @see #setCapability(Level)
	 * @see org.nasdanika.models.threat.ThreatPackage#getThreatActor_Capability()
	 * @model unique="false"
	 * @generated
	 */
	Level getCapability();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.threat.ThreatActor#getCapability <em>Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability</em>' attribute.
	 * @see org.nasdanika.models.governance.Level
	 * @see #getCapability()
	 * @generated
	 */
	void setCapability(Level value);

	/**
	 * Returns the value of the '<em><b>Intent</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.governance.Level}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intent</em>' attribute.
	 * @see org.nasdanika.models.governance.Level
	 * @see #setIntent(Level)
	 * @see org.nasdanika.models.threat.ThreatPackage#getThreatActor_Intent()
	 * @model unique="false"
	 * @generated
	 */
	Level getIntent();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.threat.ThreatActor#getIntent <em>Intent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intent</em>' attribute.
	 * @see org.nasdanika.models.governance.Level
	 * @see #getIntent()
	 * @generated
	 */
	void setIntent(Level value);

	/**
	 * Returns the value of the '<em><b>Motivation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  e.g. financial, espionage, disruption, accidental.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Motivation</em>' attribute.
	 * @see #setMotivation(String)
	 * @see org.nasdanika.models.threat.ThreatPackage#getThreatActor_Motivation()
	 * @model unique="false"
	 * @generated
	 */
	String getMotivation();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.threat.ThreatActor#getMotivation <em>Motivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Motivation</em>' attribute.
	 * @see #getMotivation()
	 * @generated
	 */
	void setMotivation(String value);

} // ThreatActor
