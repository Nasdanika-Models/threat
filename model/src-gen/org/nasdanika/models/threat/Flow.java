/**
 */
package org.nasdanika.models.threat;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data or control flow between assets. A flow is itself an asset
 * (threats attach to flows; STRIDE-per-interaction), so Flow extends
 * Asset rather than being a second hierarchy. The element-reified
 * counterpart of an architecture Relationship: use a Flow where threats
 * must attach, a plain relationship elsewhere; a Flow may cite the
 * relationship it reifies via origin.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.threat.Flow#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.Flow#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.Flow#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.Flow#getCrosses <em>Crosses</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.threat.ThreatPackage#getFlow()
 * @model
 * @generated
 */
public interface Flow extends Asset {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Asset)
	 * @see org.nasdanika.models.threat.ThreatPackage#getFlow_Source()
	 * @model
	 * @generated
	 */
	Asset getSource();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.threat.Flow#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Asset value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(Asset)
	 * @see org.nasdanika.models.threat.ThreatPackage#getFlow_Destination()
	 * @model
	 * @generated
	 */
	Asset getDestination();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.threat.Flow#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Asset value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  e.g. HTTPS, JDBC, MCP, file drop.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see #setProtocol(String)
	 * @see org.nasdanika.models.threat.ThreatPackage#getFlow_Protocol()
	 * @model unique="false"
	 * @generated
	 */
	String getProtocol();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.threat.Flow#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(String value);

	/**
	 * Returns the value of the '<em><b>Crosses</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.threat.TrustBoundary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crosses</em>' reference list.
	 * @see org.nasdanika.models.threat.ThreatPackage#getFlow_Crosses()
	 * @model
	 * @generated
	 */
	EList<TrustBoundary> getCrosses();

} // Flow
