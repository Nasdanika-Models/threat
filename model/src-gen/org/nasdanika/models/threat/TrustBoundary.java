/**
 */
package org.nasdanika.models.threat;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trust Boundary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A trust boundary: the line whose crossing generates threats (network
 * perimeter, process boundary, tenant boundary, human/AI boundary).
 * An overlay over the asset containment hierarchy, hence refers, not
 * contains. A boundary is an asset too: it can be attacked.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.threat.TrustBoundary#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.threat.ThreatPackage#getTrustBoundary()
 * @model
 * @generated
 */
public interface TrustBoundary extends Asset {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.threat.Asset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' reference list.
	 * @see org.nasdanika.models.threat.ThreatPackage#getTrustBoundary_Members()
	 * @model
	 * @generated
	 */
	EList<Asset> getMembers();

} // TrustBoundary
