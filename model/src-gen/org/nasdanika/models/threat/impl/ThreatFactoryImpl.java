/**
 */
package org.nasdanika.models.threat.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.models.threat.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ThreatFactoryImpl extends EFactoryImpl implements ThreatFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ThreatFactory init() {
		try {
			ThreatFactory theThreatFactory = (ThreatFactory)EPackage.Registry.INSTANCE.getEFactory(ThreatPackage.eNS_URI);
			if (theThreatFactory != null) {
				return theThreatFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ThreatFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreatFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ThreatPackage.TAXONOMY: return createTaxonomy();
			case ThreatPackage.THREAT_CATEGORY: return createThreatCategory();
			case ThreatPackage.ASSET_KIND: return createAssetKind();
			case ThreatPackage.ASSET: return createAsset();
			case ThreatPackage.FLOW: return createFlow();
			case ThreatPackage.TRUST_BOUNDARY: return createTrustBoundary();
			case ThreatPackage.THREAT_ACTOR: return createThreatActor();
			case ThreatPackage.WEAKNESS: return createWeakness();
			case ThreatPackage.THREAT: return createThreat();
			case ThreatPackage.THREAT_MODEL: return createThreatModel();
			case ThreatPackage.ASSUMPTION: return createAssumption();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ThreatPackage.THREAT_STATUS:
				return createThreatStatusFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ThreatPackage.THREAT_STATUS:
				return convertThreatStatusToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Taxonomy createTaxonomy() {
		TaxonomyImpl taxonomy = new TaxonomyImpl();
		return taxonomy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThreatCategory createThreatCategory() {
		ThreatCategoryImpl threatCategory = new ThreatCategoryImpl();
		return threatCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssetKind createAssetKind() {
		AssetKindImpl assetKind = new AssetKindImpl();
		return assetKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Asset createAsset() {
		AssetImpl asset = new AssetImpl();
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Flow createFlow() {
		FlowImpl flow = new FlowImpl();
		return flow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrustBoundary createTrustBoundary() {
		TrustBoundaryImpl trustBoundary = new TrustBoundaryImpl();
		return trustBoundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThreatActor createThreatActor() {
		ThreatActorImpl threatActor = new ThreatActorImpl();
		return threatActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Weakness createWeakness() {
		WeaknessImpl weakness = new WeaknessImpl();
		return weakness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Threat createThreat() {
		ThreatImpl threat = new ThreatImpl();
		return threat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThreatModel createThreatModel() {
		ThreatModelImpl threatModel = new ThreatModelImpl();
		return threatModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Assumption createAssumption() {
		AssumptionImpl assumption = new AssumptionImpl();
		return assumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreatStatus createThreatStatusFromString(EDataType eDataType, String initialValue) {
		ThreatStatus result = ThreatStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertThreatStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThreatPackage getThreatPackage() {
		return (ThreatPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ThreatPackage getPackage() {
		return ThreatPackage.eINSTANCE;
	}

} //ThreatFactoryImpl
