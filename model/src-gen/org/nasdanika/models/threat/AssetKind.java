/**
 */
package org.nasdanika.models.threat;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset Kind</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A kind of asset: process, data store, external entity, service, model,
 * dataset, credential. Extends the architecture model's ElementKind, so
 * asset kinds live in the same catalogs and Draw.io shape mappings as
 * element kinds, adding default threats per kind (threat generation
 * rules as data).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.threat.AssetKind#getDefaultThreats <em>Default Threats</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.threat.ThreatPackage#getAssetKind()
 * @model superTypes="org.eclipse.emf.ecore.EJavaObject"
 * @generated
 */
public interface AssetKind extends EObject {
	/**
	 * Returns the value of the '<em><b>Default Threats</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.threat.Threat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Threats every asset of this kind starts with; the prototype mechanism for "a data store crossing a boundary gets tampering and information disclosure".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Threats</em>' containment reference list.
	 * @see org.nasdanika.models.threat.ThreatPackage#getAssetKind_DefaultThreats()
	 * @model containment="true"
	 * @generated
	 */
	EList<Threat> getDefaultThreats();

} // AssetKind
