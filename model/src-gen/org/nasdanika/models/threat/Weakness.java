/**
 */
package org.nasdanika.models.threat;

import org.nasdanika.models.nxcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weakness</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A weakness the threat exploits: a missing check, a design flaw, a CWE
 * entry. Distinct from the threat (the attack) and the risk (the
 * consequence).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.threat.Weakness#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.threat.ThreatPackage#getWeakness()
 * @model
 * @generated
 */
public interface Weakness extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  External reference, e.g. "CWE-79".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' attribute.
	 * @see #setReference(String)
	 * @see org.nasdanika.models.threat.ThreatPackage#getWeakness_Reference()
	 * @model unique="false"
	 * @generated
	 */
	String getReference();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.threat.Weakness#getReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' attribute.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(String value);

} // Weakness
