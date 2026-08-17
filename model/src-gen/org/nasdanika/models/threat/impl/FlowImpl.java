/**
 */
package org.nasdanika.models.threat.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.threat.Asset;
import org.nasdanika.models.threat.Flow;
import org.nasdanika.models.threat.ThreatPackage;
import org.nasdanika.models.threat.TrustBoundary;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.threat.impl.FlowImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.impl.FlowImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.impl.FlowImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.nasdanika.models.threat.impl.FlowImpl#getCrosses <em>Crosses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowImpl extends AssetImpl implements Flow {
	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThreatPackage.Literals.FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Asset getSource() {
		return (Asset)eDynamicGet(ThreatPackage.FLOW__SOURCE, ThreatPackage.Literals.FLOW__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset basicGetSource() {
		return (Asset)eDynamicGet(ThreatPackage.FLOW__SOURCE, ThreatPackage.Literals.FLOW__SOURCE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(Asset newSource) {
		eDynamicSet(ThreatPackage.FLOW__SOURCE, ThreatPackage.Literals.FLOW__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Asset getDestination() {
		return (Asset)eDynamicGet(ThreatPackage.FLOW__DESTINATION, ThreatPackage.Literals.FLOW__DESTINATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset basicGetDestination() {
		return (Asset)eDynamicGet(ThreatPackage.FLOW__DESTINATION, ThreatPackage.Literals.FLOW__DESTINATION, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestination(Asset newDestination) {
		eDynamicSet(ThreatPackage.FLOW__DESTINATION, ThreatPackage.Literals.FLOW__DESTINATION, newDestination);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProtocol() {
		return (String)eDynamicGet(ThreatPackage.FLOW__PROTOCOL, ThreatPackage.Literals.FLOW__PROTOCOL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocol(String newProtocol) {
		eDynamicSet(ThreatPackage.FLOW__PROTOCOL, ThreatPackage.Literals.FLOW__PROTOCOL, newProtocol);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<TrustBoundary> getCrosses() {
		return (EList<TrustBoundary>)eDynamicGet(ThreatPackage.FLOW__CROSSES, ThreatPackage.Literals.FLOW__CROSSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ThreatPackage.FLOW__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case ThreatPackage.FLOW__DESTINATION:
				if (resolve) return getDestination();
				return basicGetDestination();
			case ThreatPackage.FLOW__PROTOCOL:
				return getProtocol();
			case ThreatPackage.FLOW__CROSSES:
				return getCrosses();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ThreatPackage.FLOW__SOURCE:
				setSource((Asset)newValue);
				return;
			case ThreatPackage.FLOW__DESTINATION:
				setDestination((Asset)newValue);
				return;
			case ThreatPackage.FLOW__PROTOCOL:
				setProtocol((String)newValue);
				return;
			case ThreatPackage.FLOW__CROSSES:
				getCrosses().clear();
				getCrosses().addAll((Collection<? extends TrustBoundary>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ThreatPackage.FLOW__SOURCE:
				setSource((Asset)null);
				return;
			case ThreatPackage.FLOW__DESTINATION:
				setDestination((Asset)null);
				return;
			case ThreatPackage.FLOW__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case ThreatPackage.FLOW__CROSSES:
				getCrosses().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ThreatPackage.FLOW__SOURCE:
				return basicGetSource() != null;
			case ThreatPackage.FLOW__DESTINATION:
				return basicGetDestination() != null;
			case ThreatPackage.FLOW__PROTOCOL:
				return PROTOCOL_EDEFAULT == null ? getProtocol() != null : !PROTOCOL_EDEFAULT.equals(getProtocol());
			case ThreatPackage.FLOW__CROSSES:
				return !getCrosses().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FlowImpl
