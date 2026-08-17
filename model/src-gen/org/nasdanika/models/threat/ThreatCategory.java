/**
 */
package org.nasdanika.models.threat;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.nxcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A category within a taxonomy, hierarchical to mirror taxonomy structure
 * (tactic > technique > sub-technique).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.threat.ThreatCategory#getReference <em>Reference</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.ThreatCategory#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.threat.ThreatPackage#getThreatCategory()
 * @model
 * @generated
 */
public interface ThreatCategory extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Reference identifier within the taxonomy, e.g. "S" (spoofing), "T1566", "AML.T0051", "LLM01".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' attribute.
	 * @see #setReference(String)
	 * @see org.nasdanika.models.threat.ThreatPackage#getThreatCategory_Reference()
	 * @model unique="false"
	 * @generated
	 */
	String getReference();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.threat.ThreatCategory#getReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' attribute.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(String value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.threat.ThreatCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.models.threat.ThreatPackage#getThreatCategory_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<ThreatCategory> getChildren();

} // ThreatCategory
