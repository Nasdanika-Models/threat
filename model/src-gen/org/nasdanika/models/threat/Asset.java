/**
 */
package org.nasdanika.models.threat;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.nasdanika.models.governance.Level;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---- What we are working on ----
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.threat.Asset#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.Asset#getThreats <em>Threats</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.Asset#getWeaknesses <em>Weaknesses</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.threat.ThreatPackage#getAsset()
 * @model superTypes="org.eclipse.emf.ecore.EJavaObject"
 * @generated
 */
public interface Asset extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.governance.Level}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Sensitivity/value of the asset, driving impact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.nasdanika.models.governance.Level
	 * @see #setValue(Level)
	 * @see org.nasdanika.models.threat.ThreatPackage#getAsset_Value()
	 * @model unique="false"
	 * @generated
	 */
	Level getValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.threat.Asset#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.nasdanika.models.governance.Level
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Level value);

	/**
	 * Returns the value of the '<em><b>Threats</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.threat.Threat}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.threat.Threat#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threats</em>' containment reference list.
	 * @see org.nasdanika.models.threat.ThreatPackage#getAsset_Threats()
	 * @see org.nasdanika.models.threat.Threat#getTarget
	 * @model opposite="target" containment="true"
	 * @generated
	 */
	EList<Threat> getThreats();

	/**
	 * Returns the value of the '<em><b>Weaknesses</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.threat.Weakness}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weaknesses</em>' containment reference list.
	 * @see org.nasdanika.models.threat.ThreatPackage#getAsset_Weaknesses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Weakness> getWeaknesses();

} // Asset
