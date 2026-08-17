/**
 */
package org.nasdanika.models.threat;

import org.nasdanika.models.nxcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assumption</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An assumption the analysis rests on ("the network is hostile", "the
 * model registry is trusted"). First-class because invalidated
 * assumptions are how threat models rot; a validated=false assumption is
 * a finding waiting to happen.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.threat.Assumption#isValidated <em>Validated</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.threat.ThreatPackage#getAssumption()
 * @model
 * @generated
 */
public interface Assumption extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Validated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validated</em>' attribute.
	 * @see #setValidated(boolean)
	 * @see org.nasdanika.models.threat.ThreatPackage#getAssumption_Validated()
	 * @model unique="false"
	 * @generated
	 */
	boolean isValidated();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.threat.Assumption#isValidated <em>Validated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validated</em>' attribute.
	 * @see #isValidated()
	 * @generated
	 */
	void setValidated(boolean value);

} // Assumption
