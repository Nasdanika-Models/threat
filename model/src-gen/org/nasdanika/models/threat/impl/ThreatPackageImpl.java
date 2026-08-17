/**
 */
package org.nasdanika.models.threat.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.architecture.ArchitecturePackage;

import org.nasdanika.models.governance.GovernancePackage;

import org.nasdanika.models.iam.IamPackage;

import org.nasdanika.models.lifecycle.LifecyclePackage;

import org.nasdanika.models.nxcore.NxcorePackage;

import org.nasdanika.models.role.RolePackage;

import org.nasdanika.models.seal.SealPackage;

import org.nasdanika.models.threat.Asset;
import org.nasdanika.models.threat.AssetKind;
import org.nasdanika.models.threat.Assumption;
import org.nasdanika.models.threat.Flow;
import org.nasdanika.models.threat.Taxonomy;
import org.nasdanika.models.threat.Threat;
import org.nasdanika.models.threat.ThreatActor;
import org.nasdanika.models.threat.ThreatCategory;
import org.nasdanika.models.threat.ThreatFactory;
import org.nasdanika.models.threat.ThreatModel;
import org.nasdanika.models.threat.ThreatPackage;
import org.nasdanika.models.threat.ThreatStatus;
import org.nasdanika.models.threat.TrustBoundary;
import org.nasdanika.models.threat.Weakness;

import org.nasdanika.models.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ThreatPackageImpl extends EPackageImpl implements ThreatPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taxonomyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threatCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetKindEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trustBoundaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threatActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weaknessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threatModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assumptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum threatStatusEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.threat.ThreatPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ThreatPackageImpl() {
		super(eNS_URI, ThreatFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ThreatPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ThreatPackage init() {
		if (isInited) return (ThreatPackage)EPackage.Registry.INSTANCE.getEPackage(ThreatPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredThreatPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ThreatPackageImpl theThreatPackage = registeredThreatPackage instanceof ThreatPackageImpl ? (ThreatPackageImpl)registeredThreatPackage : new ThreatPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		NxcorePackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		ArchitecturePackage.eINSTANCE.eClass();
		GovernancePackage.eINSTANCE.eClass();
		WorkPackage.eINSTANCE.eClass();
		RolePackage.eINSTANCE.eClass();
		LifecyclePackage.eINSTANCE.eClass();
		IamPackage.eINSTANCE.eClass();
		SealPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theThreatPackage.createPackageContents();

		// Initialize created meta-data
		theThreatPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theThreatPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ThreatPackage.eNS_URI, theThreatPackage);
		return theThreatPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaxonomy() {
		return taxonomyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaxonomy_Authority() {
		return (EAttribute)taxonomyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaxonomy_Version() {
		return (EAttribute)taxonomyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaxonomy_Website() {
		return (EAttribute)taxonomyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaxonomy_Categories() {
		return (EReference)taxonomyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThreatCategory() {
		return threatCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThreatCategory_Reference() {
		return (EAttribute)threatCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreatCategory_Children() {
		return (EReference)threatCategoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssetKind() {
		return assetKindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssetKind_DefaultThreats() {
		return (EReference)assetKindEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAsset() {
		return assetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAsset_Value() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAsset_Threats() {
		return (EReference)assetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAsset_Weaknesses() {
		return (EReference)assetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlow() {
		return flowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_Source() {
		return (EReference)flowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_Destination() {
		return (EReference)flowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlow_Protocol() {
		return (EAttribute)flowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_Crosses() {
		return (EReference)flowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrustBoundary() {
		return trustBoundaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrustBoundary_Members() {
		return (EReference)trustBoundaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThreatActor() {
		return threatActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThreatActor_Capability() {
		return (EAttribute)threatActorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThreatActor_Intent() {
		return (EAttribute)threatActorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThreatActor_Motivation() {
		return (EAttribute)threatActorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWeakness() {
		return weaknessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeakness_Reference() {
		return (EAttribute)weaknessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThreat() {
		return threatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreat_Target() {
		return (EReference)threatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThreat_Status() {
		return (EAttribute)threatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreat_Categories() {
		return (EReference)threatEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreat_Actors() {
		return (EReference)threatEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreat_Exploits() {
		return (EReference)threatEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThreat_Likelihood() {
		return (EAttribute)threatEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThreat_Impact() {
		return (EAttribute)threatEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreat_Mitigations() {
		return (EReference)threatEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreat_Risks() {
		return (EReference)threatEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreat_Children() {
		return (EReference)threatEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThreat_Origin() {
		return (EAttribute)threatEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThreatModel() {
		return threatModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreatModel_Taxonomies() {
		return (EReference)threatModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreatModel_Kinds() {
		return (EReference)threatModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreatModel_Actors() {
		return (EReference)threatModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreatModel_Assets() {
		return (EReference)threatModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreatModel_Scope() {
		return (EReference)threatModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreatModel_Assumptions() {
		return (EReference)threatModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssumption() {
		return assumptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssumption_Validated() {
		return (EAttribute)assumptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getThreatStatus() {
		return threatStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThreatFactory getThreatFactory() {
		return (ThreatFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		taxonomyEClass = createEClass(TAXONOMY);
		createEAttribute(taxonomyEClass, TAXONOMY__AUTHORITY);
		createEAttribute(taxonomyEClass, TAXONOMY__VERSION);
		createEAttribute(taxonomyEClass, TAXONOMY__WEBSITE);
		createEReference(taxonomyEClass, TAXONOMY__CATEGORIES);

		threatCategoryEClass = createEClass(THREAT_CATEGORY);
		createEAttribute(threatCategoryEClass, THREAT_CATEGORY__REFERENCE);
		createEReference(threatCategoryEClass, THREAT_CATEGORY__CHILDREN);

		assetKindEClass = createEClass(ASSET_KIND);
		createEReference(assetKindEClass, ASSET_KIND__DEFAULT_THREATS);

		assetEClass = createEClass(ASSET);
		createEAttribute(assetEClass, ASSET__VALUE);
		createEReference(assetEClass, ASSET__THREATS);
		createEReference(assetEClass, ASSET__WEAKNESSES);

		flowEClass = createEClass(FLOW);
		createEReference(flowEClass, FLOW__SOURCE);
		createEReference(flowEClass, FLOW__DESTINATION);
		createEAttribute(flowEClass, FLOW__PROTOCOL);
		createEReference(flowEClass, FLOW__CROSSES);

		trustBoundaryEClass = createEClass(TRUST_BOUNDARY);
		createEReference(trustBoundaryEClass, TRUST_BOUNDARY__MEMBERS);

		threatActorEClass = createEClass(THREAT_ACTOR);
		createEAttribute(threatActorEClass, THREAT_ACTOR__CAPABILITY);
		createEAttribute(threatActorEClass, THREAT_ACTOR__INTENT);
		createEAttribute(threatActorEClass, THREAT_ACTOR__MOTIVATION);

		weaknessEClass = createEClass(WEAKNESS);
		createEAttribute(weaknessEClass, WEAKNESS__REFERENCE);

		threatEClass = createEClass(THREAT);
		createEReference(threatEClass, THREAT__TARGET);
		createEAttribute(threatEClass, THREAT__STATUS);
		createEReference(threatEClass, THREAT__CATEGORIES);
		createEReference(threatEClass, THREAT__ACTORS);
		createEReference(threatEClass, THREAT__EXPLOITS);
		createEAttribute(threatEClass, THREAT__LIKELIHOOD);
		createEAttribute(threatEClass, THREAT__IMPACT);
		createEReference(threatEClass, THREAT__MITIGATIONS);
		createEReference(threatEClass, THREAT__RISKS);
		createEReference(threatEClass, THREAT__CHILDREN);
		createEAttribute(threatEClass, THREAT__ORIGIN);

		threatModelEClass = createEClass(THREAT_MODEL);
		createEReference(threatModelEClass, THREAT_MODEL__TAXONOMIES);
		createEReference(threatModelEClass, THREAT_MODEL__KINDS);
		createEReference(threatModelEClass, THREAT_MODEL__ACTORS);
		createEReference(threatModelEClass, THREAT_MODEL__ASSETS);
		createEReference(threatModelEClass, THREAT_MODEL__SCOPE);
		createEReference(threatModelEClass, THREAT_MODEL__ASSUMPTIONS);

		assumptionEClass = createEClass(ASSUMPTION);
		createEAttribute(assumptionEClass, ASSUMPTION__VALIDATED);

		// Create enums
		threatStatusEEnum = createEEnum(THREAT_STATUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		NxcorePackage theNxcorePackage = (NxcorePackage)EPackage.Registry.INSTANCE.getEPackage(NxcorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ArchitecturePackage theArchitecturePackage = (ArchitecturePackage)EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI);
		GovernancePackage theGovernancePackage = (GovernancePackage)EPackage.Registry.INSTANCE.getEPackage(GovernancePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		taxonomyEClass.getESuperTypes().add(theNxcorePackage.getModelElement());
		threatCategoryEClass.getESuperTypes().add(theNxcorePackage.getModelElement());
		assetKindEClass.getESuperTypes().add(theArchitecturePackage.getElementKind());
		assetEClass.getESuperTypes().add(theArchitecturePackage.getElement());
		flowEClass.getESuperTypes().add(this.getAsset());
		trustBoundaryEClass.getESuperTypes().add(this.getAsset());
		threatActorEClass.getESuperTypes().add(theNxcorePackage.getModelElement());
		weaknessEClass.getESuperTypes().add(theNxcorePackage.getModelElement());
		threatEClass.getESuperTypes().add(theNxcorePackage.getModelElement());
		threatModelEClass.getESuperTypes().add(theGovernancePackage.getGoverned());
		assumptionEClass.getESuperTypes().add(theNxcorePackage.getModelElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(taxonomyEClass, Taxonomy.class, "Taxonomy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaxonomy_Authority(), theEcorePackage.getEString(), "authority", null, 0, 1, Taxonomy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaxonomy_Version(), theEcorePackage.getEString(), "version", null, 0, 1, Taxonomy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaxonomy_Website(), theEcorePackage.getEString(), "website", null, 0, 1, Taxonomy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaxonomy_Categories(), this.getThreatCategory(), null, "categories", null, 0, -1, Taxonomy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(threatCategoryEClass, ThreatCategory.class, "ThreatCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThreatCategory_Reference(), theEcorePackage.getEString(), "reference", null, 0, 1, ThreatCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThreatCategory_Children(), this.getThreatCategory(), null, "children", null, 0, -1, ThreatCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assetKindEClass, AssetKind.class, "AssetKind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssetKind_DefaultThreats(), this.getThreat(), null, "defaultThreats", null, 0, -1, AssetKind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assetEClass, Asset.class, "Asset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsset_Value(), theGovernancePackage.getLevel(), "value", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAsset_Threats(), this.getThreat(), this.getThreat_Target(), "threats", null, 0, -1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAsset_Weaknesses(), this.getWeakness(), null, "weaknesses", null, 0, -1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowEClass, Flow.class, "Flow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlow_Source(), this.getAsset(), null, "source", null, 0, 1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Destination(), this.getAsset(), null, "destination", null, 0, 1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlow_Protocol(), theEcorePackage.getEString(), "protocol", null, 0, 1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Crosses(), this.getTrustBoundary(), null, "crosses", null, 0, -1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trustBoundaryEClass, TrustBoundary.class, "TrustBoundary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrustBoundary_Members(), this.getAsset(), null, "members", null, 0, -1, TrustBoundary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(threatActorEClass, ThreatActor.class, "ThreatActor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThreatActor_Capability(), theGovernancePackage.getLevel(), "capability", null, 0, 1, ThreatActor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreatActor_Intent(), theGovernancePackage.getLevel(), "intent", null, 0, 1, ThreatActor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreatActor_Motivation(), theEcorePackage.getEString(), "motivation", null, 0, 1, ThreatActor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(weaknessEClass, Weakness.class, "Weakness", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWeakness_Reference(), theEcorePackage.getEString(), "reference", null, 0, 1, Weakness.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(threatEClass, Threat.class, "Threat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThreat_Target(), this.getAsset(), this.getAsset_Threats(), "target", null, 0, 1, Threat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreat_Status(), this.getThreatStatus(), "status", null, 0, 1, Threat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThreat_Categories(), this.getThreatCategory(), null, "categories", null, 0, -1, Threat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThreat_Actors(), this.getThreatActor(), null, "actors", null, 0, -1, Threat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThreat_Exploits(), this.getWeakness(), null, "exploits", null, 0, -1, Threat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreat_Likelihood(), theGovernancePackage.getLevel(), "likelihood", null, 0, 1, Threat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreat_Impact(), theGovernancePackage.getLevel(), "impact", null, 0, 1, Threat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThreat_Mitigations(), theGovernancePackage.getControl(), null, "mitigations", null, 0, -1, Threat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThreat_Risks(), theGovernancePackage.getRisk(), null, "risks", null, 0, -1, Threat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThreat_Children(), this.getThreat(), null, "children", null, 0, -1, Threat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreat_Origin(), theEcorePackage.getEString(), "origin", null, 0, 1, Threat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(threatModelEClass, ThreatModel.class, "ThreatModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThreatModel_Taxonomies(), this.getTaxonomy(), null, "taxonomies", null, 0, -1, ThreatModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThreatModel_Kinds(), this.getAssetKind(), null, "kinds", null, 0, -1, ThreatModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThreatModel_Actors(), this.getThreatActor(), null, "actors", null, 0, -1, ThreatModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThreatModel_Assets(), this.getAsset(), null, "assets", null, 0, -1, ThreatModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThreatModel_Scope(), this.getAsset(), null, "scope", null, 0, -1, ThreatModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThreatModel_Assumptions(), this.getAssumption(), null, "assumptions", null, 0, -1, ThreatModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assumptionEClass, Assumption.class, "Assumption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssumption_Validated(), theEcorePackage.getEBoolean(), "validated", null, 0, 1, Assumption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(threatStatusEEnum, ThreatStatus.class, "ThreatStatus");
		addEEnumLiteral(threatStatusEEnum, ThreatStatus.IDENTIFIED);
		addEEnumLiteral(threatStatusEEnum, ThreatStatus.MITIGATED);
		addEEnumLiteral(threatStatusEEnum, ThreatStatus.ACCEPTED);
		addEEnumLiteral(threatStatusEEnum, ThreatStatus.NOT_APPLICABLE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "featureDelegation", "Dynamic",
			   "complianceLevel", "21.0",
			   "suppressGenModelAnnotations", "false",
			   "copyrightFields", "false",
			   "operationReflection", "true",
			   "importOrganizing", "true",
			   "basePackage", "org.nasdanika.models"
		   });
		addAnnotation
		  (taxonomyEClass,
		   source,
		   new String[] {
			   "documentation", " ---- Taxonomies (instance data, not enums) ----"
		   });
		addAnnotation
		  (getTaxonomy_Authority(),
		   source,
		   new String[] {
			   "documentation", " Issuing authority, e.g. Microsoft, MITRE, OWASP, internal."
		   });
		addAnnotation
		  (threatCategoryEClass,
		   source,
		   new String[] {
			   "documentation", "A category within a taxonomy, hierarchical to mirror taxonomy structure\n(tactic > technique > sub-technique)."
		   });
		addAnnotation
		  (getThreatCategory_Reference(),
		   source,
		   new String[] {
			   "documentation", " Reference identifier within the taxonomy, e.g. \"S\" (spoofing), \"T1566\", \"AML.T0051\", \"LLM01\"."
		   });
		addAnnotation
		  (assetKindEClass,
		   source,
		   new String[] {
			   "documentation", "A kind of asset: process, data store, external entity, service, model,\ndataset, credential. Extends the architecture model\'s ElementKind, so\nasset kinds live in the same catalogs and Draw.io shape mappings as\nelement kinds, adding default threats per kind (threat generation\nrules as data)."
		   });
		addAnnotation
		  (getAssetKind_DefaultThreats(),
		   source,
		   new String[] {
			   "documentation", " Threats every asset of this kind starts with; the prototype mechanism for \"a data store crossing a boundary gets tampering and information disclosure\"."
		   });
		addAnnotation
		  (assetEClass,
		   source,
		   new String[] {
			   "documentation", " ---- What we are working on ----"
		   });
		addAnnotation
		  (getAsset_Value(),
		   source,
		   new String[] {
			   "documentation", " Sensitivity/value of the asset, driving impact."
		   });
		addAnnotation
		  (flowEClass,
		   source,
		   new String[] {
			   "documentation", "A data or control flow between assets. A flow is itself an asset\n(threats attach to flows; STRIDE-per-interaction), so Flow extends\nAsset rather than being a second hierarchy. The element-reified\ncounterpart of an architecture Relationship: use a Flow where threats\nmust attach, a plain relationship elsewhere; a Flow may cite the\nrelationship it reifies via origin."
		   });
		addAnnotation
		  (getFlow_Protocol(),
		   source,
		   new String[] {
			   "documentation", " e.g. HTTPS, JDBC, MCP, file drop."
		   });
		addAnnotation
		  (trustBoundaryEClass,
		   source,
		   new String[] {
			   "documentation", "A trust boundary: the line whose crossing generates threats (network\nperimeter, process boundary, tenant boundary, human/AI boundary).\nAn overlay over the asset containment hierarchy, hence refers, not\ncontains. A boundary is an asset too: it can be attacked."
		   });
		addAnnotation
		  (threatActorEClass,
		   source,
		   new String[] {
			   "documentation", " ---- What can go wrong ----"
		   });
		addAnnotation
		  (getThreatActor_Motivation(),
		   source,
		   new String[] {
			   "documentation", " e.g. financial, espionage, disruption, accidental."
		   });
		addAnnotation
		  (threatStatusEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", " Analyzed and being addressed via controls."
		   });
		addAnnotation
		  (threatStatusEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", " Risk-accepted; should trace to a governance waiver or decision."
		   });
		addAnnotation
		  (threatStatusEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", " Analyzed and found not to apply; keeping it recorded keeps the model honest."
		   });
		addAnnotation
		  (weaknessEClass,
		   source,
		   new String[] {
			   "documentation", "A weakness the threat exploits: a missing check, a design flaw, a CWE\nentry. Distinct from the threat (the attack) and the risk (the\nconsequence)."
		   });
		addAnnotation
		  (getWeakness_Reference(),
		   source,
		   new String[] {
			   "documentation", " External reference, e.g. \"CWE-79\"."
		   });
		addAnnotation
		  (threatEClass,
		   source,
		   new String[] {
			   "documentation", "Something that can go wrong: the unit of threat modeling. Contained in\nthe asset it targets; categorized in any number of taxonomies\n(crosswalk); mitigated by governance controls; elevated into the\ngovernance risk register when it survives analysis. Contains child\nthreats: an attack tree, with the root as goal and leaves as steps."
		   });
		addAnnotation
		  (getThreat_Mitigations(),
		   source,
		   new String[] {
			   "documentation", " What we are going to do: reused from governance, threat modeling is demand for the control catalog."
		   });
		addAnnotation
		  (getThreat_Risks(),
		   source,
		   new String[] {
			   "documentation", " The risk register entry this threat was elevated to; analysis feeds governance."
		   });
		addAnnotation
		  (getThreat_Origin(),
		   source,
		   new String[] {
			   "documentation", " URI of the authoring source: STRIDE GPT style generation, workshop note, diagram annotation."
		   });
		addAnnotation
		  (threatModelEClass,
		   source,
		   new String[] {
			   "documentation", " ---- The exercise ----"
		   });
		addAnnotation
		  (getThreatModel_Assets(),
		   source,
		   new String[] {
			   "documentation", " Standalone scope: assets modeled here."
		   });
		addAnnotation
		  (getThreatModel_Scope(),
		   source,
		   new String[] {
			   "documentation", " Aspect scope: assets defined in extending architecture/domain models."
		   });
		addAnnotation
		  (assumptionEClass,
		   source,
		   new String[] {
			   "documentation", "An assumption the analysis rests on (\"the network is hostile\", \"the\nmodel registry is trusted\"). First-class because invalidated\nassumptions are how threat models rot; a validated=false assumption is\na finding waiting to happen."
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2011/Xcore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore",
			   "GenModel", "http://www.eclipse.org/emf/2002/GenModel",
			   "Nasdanika", "urn:org.nasdanika"
		   });
	}

} //ThreatPackageImpl
