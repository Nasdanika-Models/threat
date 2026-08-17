/**
 */
package org.nasdanika.models.threat;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.nasdanika.models.architecture.ArchitecturePackage;

import org.nasdanika.models.governance.GovernancePackage;

import org.nasdanika.models.nxcore.NxcorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.threat.ThreatFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel featureDelegation='Dynamic' complianceLevel='21.0' suppressGenModelAnnotations='false' copyrightFields='false' operationReflection='true' importOrganizing='true' basePackage='org.nasdanika.models'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Ecore='http://www.eclipse.org/emf/2002/Ecore' GenModel='http://www.eclipse.org/emf/2002/GenModel' Nasdanika='urn:org.nasdanika'"
 * @generated
 */
public interface ThreatPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "threat";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://threat.models.nasdanika.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.threat";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ThreatPackage eINSTANCE = org.nasdanika.models.threat.impl.ThreatPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.threat.impl.TaxonomyImpl <em>Taxonomy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.threat.impl.TaxonomyImpl
	 * @see org.nasdanika.models.threat.impl.ThreatPackageImpl#getTaxonomy()
	 * @generated
	 */
	int TAXONOMY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__ID = NxcorePackage.MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__DOCUMENTATION = NxcorePackage.MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__DOC_REF = NxcorePackage.MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__DOC_FORMAT = NxcorePackage.MODEL_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__DOC_CONTENTS = NxcorePackage.MODEL_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__DOC_SECTIONS = NxcorePackage.MODEL_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__MARKERS = NxcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__ICON = NxcorePackage.MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__URIS = NxcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Authority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__AUTHORITY = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__VERSION = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Website</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__WEBSITE = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__CATEGORIES = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Taxonomy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY_FEATURE_COUNT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY___GET_REFERRERS__EREFERENCE = NxcorePackage.MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Taxonomy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY_OPERATION_COUNT = NxcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.threat.impl.ThreatCategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.threat.impl.ThreatCategoryImpl
	 * @see org.nasdanika.models.threat.impl.ThreatPackageImpl#getThreatCategory()
	 * @generated
	 */
	int THREAT_CATEGORY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_CATEGORY__ID = NxcorePackage.MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_CATEGORY__DOCUMENTATION = NxcorePackage.MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_CATEGORY__DOC_REF = NxcorePackage.MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_CATEGORY__DOC_FORMAT = NxcorePackage.MODEL_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_CATEGORY__DOC_CONTENTS = NxcorePackage.MODEL_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_CATEGORY__DOC_SECTIONS = NxcorePackage.MODEL_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_CATEGORY__MARKERS = NxcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_CATEGORY__ICON = NxcorePackage.MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_CATEGORY__URIS = NxcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_CATEGORY__REFERENCE = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_CATEGORY__CHILDREN = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_CATEGORY_FEATURE_COUNT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_CATEGORY___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_CATEGORY___GET_REFERRERS__EREFERENCE = NxcorePackage.MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_CATEGORY_OPERATION_COUNT = NxcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.threat.impl.AssetKindImpl <em>Asset Kind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.threat.impl.AssetKindImpl
	 * @see org.nasdanika.models.threat.impl.ThreatPackageImpl#getAssetKind()
	 * @generated
	 */
	int ASSET_KIND = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_KIND__ID = ArchitecturePackage.ELEMENT_KIND__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_KIND__DOCUMENTATION = ArchitecturePackage.ELEMENT_KIND__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_KIND__DOC_REF = ArchitecturePackage.ELEMENT_KIND__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_KIND__DOC_FORMAT = ArchitecturePackage.ELEMENT_KIND__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_KIND__DOC_CONTENTS = ArchitecturePackage.ELEMENT_KIND__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_KIND__DOC_SECTIONS = ArchitecturePackage.ELEMENT_KIND__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_KIND__MARKERS = ArchitecturePackage.ELEMENT_KIND__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_KIND__ICON = ArchitecturePackage.ELEMENT_KIND__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_KIND__URIS = ArchitecturePackage.ELEMENT_KIND__URIS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_KIND__SUPER_TYPE = ArchitecturePackage.ELEMENT_KIND__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Default Threats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_KIND__DEFAULT_THREATS = ArchitecturePackage.ELEMENT_KIND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Asset Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_KIND_FEATURE_COUNT = ArchitecturePackage.ELEMENT_KIND_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_KIND___COLLECT__OBJECT_EREFERENCE_ELIST = ArchitecturePackage.ELEMENT_KIND___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_KIND___GET_REFERRERS__EREFERENCE = ArchitecturePackage.ELEMENT_KIND___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Asset Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_KIND_OPERATION_COUNT = ArchitecturePackage.ELEMENT_KIND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.threat.impl.AssetImpl <em>Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.threat.impl.AssetImpl
	 * @see org.nasdanika.models.threat.impl.ThreatPackageImpl#getAsset()
	 * @generated
	 */
	int ASSET = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ID = ArchitecturePackage.ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__DOCUMENTATION = ArchitecturePackage.ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__DOC_REF = ArchitecturePackage.ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__DOC_FORMAT = ArchitecturePackage.ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__DOC_CONTENTS = ArchitecturePackage.ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__DOC_SECTIONS = ArchitecturePackage.ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__MARKERS = ArchitecturePackage.ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ICON = ArchitecturePackage.ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__URIS = ArchitecturePackage.ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Control Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__CONTROL_APPLICATIONS = ArchitecturePackage.ELEMENT__CONTROL_APPLICATIONS;

	/**
	 * The feature id for the '<em><b>Risks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__RISKS = ArchitecturePackage.ELEMENT__RISKS;

	/**
	 * The feature id for the '<em><b>Waivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__WAIVERS = ArchitecturePackage.ELEMENT__WAIVERS;

	/**
	 * The feature id for the '<em><b>Work</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__WORK = ArchitecturePackage.ELEMENT__WORK;

	/**
	 * The feature id for the '<em><b>Outgoing Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__OUTGOING_RELATIONSHIPS = ArchitecturePackage.ELEMENT__OUTGOING_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__KIND = ArchitecturePackage.ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ELEMENTS = ArchitecturePackage.ELEMENT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__VALUE = ArchitecturePackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Threats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__THREATS = ArchitecturePackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Weaknesses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__WEAKNESSES = ArchitecturePackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FEATURE_COUNT = ArchitecturePackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET___COLLECT__OBJECT_EREFERENCE_ELIST = ArchitecturePackage.ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET___GET_REFERRERS__EREFERENCE = ArchitecturePackage.ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_OPERATION_COUNT = ArchitecturePackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.threat.impl.FlowImpl <em>Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.threat.impl.FlowImpl
	 * @see org.nasdanika.models.threat.impl.ThreatPackageImpl#getFlow()
	 * @generated
	 */
	int FLOW = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__ID = ASSET__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__DOCUMENTATION = ASSET__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__DOC_REF = ASSET__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__DOC_FORMAT = ASSET__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__DOC_CONTENTS = ASSET__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__DOC_SECTIONS = ASSET__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__MARKERS = ASSET__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__ICON = ASSET__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__URIS = ASSET__URIS;

	/**
	 * The feature id for the '<em><b>Control Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__CONTROL_APPLICATIONS = ASSET__CONTROL_APPLICATIONS;

	/**
	 * The feature id for the '<em><b>Risks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__RISKS = ASSET__RISKS;

	/**
	 * The feature id for the '<em><b>Waivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__WAIVERS = ASSET__WAIVERS;

	/**
	 * The feature id for the '<em><b>Work</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__WORK = ASSET__WORK;

	/**
	 * The feature id for the '<em><b>Outgoing Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__OUTGOING_RELATIONSHIPS = ASSET__OUTGOING_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__KIND = ASSET__KIND;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__ELEMENTS = ASSET__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__VALUE = ASSET__VALUE;

	/**
	 * The feature id for the '<em><b>Threats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__THREATS = ASSET__THREATS;

	/**
	 * The feature id for the '<em><b>Weaknesses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__WEAKNESSES = ASSET__WEAKNESSES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__SOURCE = ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__DESTINATION = ASSET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__PROTOCOL = ASSET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Crosses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__CROSSES = ASSET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FEATURE_COUNT = ASSET_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW___COLLECT__OBJECT_EREFERENCE_ELIST = ASSET___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW___GET_REFERRERS__EREFERENCE = ASSET___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.threat.impl.TrustBoundaryImpl <em>Trust Boundary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.threat.impl.TrustBoundaryImpl
	 * @see org.nasdanika.models.threat.impl.ThreatPackageImpl#getTrustBoundary()
	 * @generated
	 */
	int TRUST_BOUNDARY = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUST_BOUNDARY__ID = ASSET__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUST_BOUNDARY__DOCUMENTATION = ASSET__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUST_BOUNDARY__DOC_REF = ASSET__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUST_BOUNDARY__DOC_FORMAT = ASSET__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUST_BOUNDARY__DOC_CONTENTS = ASSET__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUST_BOUNDARY__DOC_SECTIONS = ASSET__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUST_BOUNDARY__MARKERS = ASSET__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUST_BOUNDARY__ICON = ASSET__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUST_BOUNDARY__URIS = ASSET__URIS;

	/**
	 * The feature id for the '<em><b>Control Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUST_BOUNDARY__CONTROL_APPLICATIONS = ASSET__CONTROL_APPLICATIONS;

	/**
	 * The feature id for the '<em><b>Risks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUST_BOUNDARY__RISKS = ASSET__RISKS;

	/**
	 * The feature id for the '<em><b>Waivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUST_BOUNDARY__WAIVERS = ASSET__WAIVERS;

	/**
	 * The feature id for the '<em><b>Work</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUST_BOUNDARY__WORK = ASSET__WORK;

	/**
	 * The feature id for the '<em><b>Outgoing Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUST_BOUNDARY__OUTGOING_RELATIONSHIPS = ASSET__OUTGOING_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUST_BOUNDARY__KIND = ASSET__KIND;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUST_BOUNDARY__ELEMENTS = ASSET__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUST_BOUNDARY__VALUE = ASSET__VALUE;

	/**
	 * The feature id for the '<em><b>Threats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUST_BOUNDARY__THREATS = ASSET__THREATS;

	/**
	 * The feature id for the '<em><b>Weaknesses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUST_BOUNDARY__WEAKNESSES = ASSET__WEAKNESSES;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUST_BOUNDARY__MEMBERS = ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trust Boundary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUST_BOUNDARY_FEATURE_COUNT = ASSET_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUST_BOUNDARY___COLLECT__OBJECT_EREFERENCE_ELIST = ASSET___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUST_BOUNDARY___GET_REFERRERS__EREFERENCE = ASSET___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Trust Boundary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUST_BOUNDARY_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.threat.impl.ThreatActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.threat.impl.ThreatActorImpl
	 * @see org.nasdanika.models.threat.impl.ThreatPackageImpl#getThreatActor()
	 * @generated
	 */
	int THREAT_ACTOR = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ACTOR__ID = NxcorePackage.MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ACTOR__DOCUMENTATION = NxcorePackage.MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ACTOR__DOC_REF = NxcorePackage.MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ACTOR__DOC_FORMAT = NxcorePackage.MODEL_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ACTOR__DOC_CONTENTS = NxcorePackage.MODEL_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ACTOR__DOC_SECTIONS = NxcorePackage.MODEL_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ACTOR__MARKERS = NxcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ACTOR__ICON = NxcorePackage.MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ACTOR__URIS = NxcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ACTOR__CAPABILITY = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Intent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ACTOR__INTENT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Motivation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ACTOR__MOTIVATION = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ACTOR_FEATURE_COUNT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ACTOR___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ACTOR___GET_REFERRERS__EREFERENCE = NxcorePackage.MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ACTOR_OPERATION_COUNT = NxcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.threat.impl.WeaknessImpl <em>Weakness</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.threat.impl.WeaknessImpl
	 * @see org.nasdanika.models.threat.impl.ThreatPackageImpl#getWeakness()
	 * @generated
	 */
	int WEAKNESS = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKNESS__ID = NxcorePackage.MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKNESS__DOCUMENTATION = NxcorePackage.MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKNESS__DOC_REF = NxcorePackage.MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKNESS__DOC_FORMAT = NxcorePackage.MODEL_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKNESS__DOC_CONTENTS = NxcorePackage.MODEL_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKNESS__DOC_SECTIONS = NxcorePackage.MODEL_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKNESS__MARKERS = NxcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKNESS__ICON = NxcorePackage.MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKNESS__URIS = NxcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKNESS__REFERENCE = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Weakness</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKNESS_FEATURE_COUNT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKNESS___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKNESS___GET_REFERRERS__EREFERENCE = NxcorePackage.MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Weakness</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKNESS_OPERATION_COUNT = NxcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.threat.impl.ThreatImpl <em>Threat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.threat.impl.ThreatImpl
	 * @see org.nasdanika.models.threat.impl.ThreatPackageImpl#getThreat()
	 * @generated
	 */
	int THREAT = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__ID = NxcorePackage.MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__DOCUMENTATION = NxcorePackage.MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__DOC_REF = NxcorePackage.MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__DOC_FORMAT = NxcorePackage.MODEL_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__DOC_CONTENTS = NxcorePackage.MODEL_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__DOC_SECTIONS = NxcorePackage.MODEL_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__MARKERS = NxcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__ICON = NxcorePackage.MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__URIS = NxcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__TARGET = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__STATUS = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__CATEGORIES = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__ACTORS = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Exploits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__EXPLOITS = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__LIKELIHOOD = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__IMPACT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Mitigations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__MITIGATIONS = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Risks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__RISKS = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__CHILDREN = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__ORIGIN = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Threat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_FEATURE_COUNT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT___GET_REFERRERS__EREFERENCE = NxcorePackage.MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Threat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_OPERATION_COUNT = NxcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.threat.impl.ThreatModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.threat.impl.ThreatModelImpl
	 * @see org.nasdanika.models.threat.impl.ThreatPackageImpl#getThreatModel()
	 * @generated
	 */
	int THREAT_MODEL = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_MODEL__ID = GovernancePackage.GOVERNED__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_MODEL__DOCUMENTATION = GovernancePackage.GOVERNED__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_MODEL__DOC_REF = GovernancePackage.GOVERNED__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_MODEL__DOC_FORMAT = GovernancePackage.GOVERNED__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_MODEL__DOC_CONTENTS = GovernancePackage.GOVERNED__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_MODEL__DOC_SECTIONS = GovernancePackage.GOVERNED__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_MODEL__MARKERS = GovernancePackage.GOVERNED__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_MODEL__ICON = GovernancePackage.GOVERNED__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_MODEL__URIS = GovernancePackage.GOVERNED__URIS;

	/**
	 * The feature id for the '<em><b>Control Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_MODEL__CONTROL_APPLICATIONS = GovernancePackage.GOVERNED__CONTROL_APPLICATIONS;

	/**
	 * The feature id for the '<em><b>Risks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_MODEL__RISKS = GovernancePackage.GOVERNED__RISKS;

	/**
	 * The feature id for the '<em><b>Waivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_MODEL__WAIVERS = GovernancePackage.GOVERNED__WAIVERS;

	/**
	 * The feature id for the '<em><b>Taxonomies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_MODEL__TAXONOMIES = GovernancePackage.GOVERNED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kinds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_MODEL__KINDS = GovernancePackage.GOVERNED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_MODEL__ACTORS = GovernancePackage.GOVERNED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_MODEL__ASSETS = GovernancePackage.GOVERNED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_MODEL__SCOPE = GovernancePackage.GOVERNED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Assumptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_MODEL__ASSUMPTIONS = GovernancePackage.GOVERNED_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_MODEL_FEATURE_COUNT = GovernancePackage.GOVERNED_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_MODEL___COLLECT__OBJECT_EREFERENCE_ELIST = GovernancePackage.GOVERNED___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_MODEL___GET_REFERRERS__EREFERENCE = GovernancePackage.GOVERNED___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_MODEL_OPERATION_COUNT = GovernancePackage.GOVERNED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.threat.impl.AssumptionImpl <em>Assumption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.threat.impl.AssumptionImpl
	 * @see org.nasdanika.models.threat.impl.ThreatPackageImpl#getAssumption()
	 * @generated
	 */
	int ASSUMPTION = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__ID = NxcorePackage.MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__DOCUMENTATION = NxcorePackage.MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__DOC_REF = NxcorePackage.MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__DOC_FORMAT = NxcorePackage.MODEL_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__DOC_CONTENTS = NxcorePackage.MODEL_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__DOC_SECTIONS = NxcorePackage.MODEL_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__MARKERS = NxcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__ICON = NxcorePackage.MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__URIS = NxcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Validated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__VALIDATED = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION_FEATURE_COUNT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION___GET_REFERRERS__EREFERENCE = NxcorePackage.MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Assumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION_OPERATION_COUNT = NxcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.threat.ThreatStatus <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.threat.ThreatStatus
	 * @see org.nasdanika.models.threat.impl.ThreatPackageImpl#getThreatStatus()
	 * @generated
	 */
	int THREAT_STATUS = 11;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.threat.Taxonomy <em>Taxonomy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Taxonomy</em>'.
	 * @see org.nasdanika.models.threat.Taxonomy
	 * @generated
	 */
	EClass getTaxonomy();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.threat.Taxonomy#getAuthority <em>Authority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authority</em>'.
	 * @see org.nasdanika.models.threat.Taxonomy#getAuthority()
	 * @see #getTaxonomy()
	 * @generated
	 */
	EAttribute getTaxonomy_Authority();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.threat.Taxonomy#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.nasdanika.models.threat.Taxonomy#getVersion()
	 * @see #getTaxonomy()
	 * @generated
	 */
	EAttribute getTaxonomy_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.threat.Taxonomy#getWebsite <em>Website</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Website</em>'.
	 * @see org.nasdanika.models.threat.Taxonomy#getWebsite()
	 * @see #getTaxonomy()
	 * @generated
	 */
	EAttribute getTaxonomy_Website();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.threat.Taxonomy#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see org.nasdanika.models.threat.Taxonomy#getCategories()
	 * @see #getTaxonomy()
	 * @generated
	 */
	EReference getTaxonomy_Categories();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.threat.ThreatCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see org.nasdanika.models.threat.ThreatCategory
	 * @generated
	 */
	EClass getThreatCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.threat.ThreatCategory#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see org.nasdanika.models.threat.ThreatCategory#getReference()
	 * @see #getThreatCategory()
	 * @generated
	 */
	EAttribute getThreatCategory_Reference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.threat.ThreatCategory#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.nasdanika.models.threat.ThreatCategory#getChildren()
	 * @see #getThreatCategory()
	 * @generated
	 */
	EReference getThreatCategory_Children();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.threat.AssetKind <em>Asset Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset Kind</em>'.
	 * @see org.nasdanika.models.threat.AssetKind
	 * @generated
	 */
	EClass getAssetKind();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.threat.AssetKind#getDefaultThreats <em>Default Threats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Default Threats</em>'.
	 * @see org.nasdanika.models.threat.AssetKind#getDefaultThreats()
	 * @see #getAssetKind()
	 * @generated
	 */
	EReference getAssetKind_DefaultThreats();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.threat.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset</em>'.
	 * @see org.nasdanika.models.threat.Asset
	 * @generated
	 */
	EClass getAsset();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.threat.Asset#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.models.threat.Asset#getValue()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.threat.Asset#getThreats <em>Threats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Threats</em>'.
	 * @see org.nasdanika.models.threat.Asset#getThreats()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_Threats();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.threat.Asset#getWeaknesses <em>Weaknesses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Weaknesses</em>'.
	 * @see org.nasdanika.models.threat.Asset#getWeaknesses()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_Weaknesses();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.threat.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow</em>'.
	 * @see org.nasdanika.models.threat.Flow
	 * @generated
	 */
	EClass getFlow();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.threat.Flow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.nasdanika.models.threat.Flow#getSource()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Source();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.threat.Flow#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see org.nasdanika.models.threat.Flow#getDestination()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Destination();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.threat.Flow#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see org.nasdanika.models.threat.Flow#getProtocol()
	 * @see #getFlow()
	 * @generated
	 */
	EAttribute getFlow_Protocol();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.threat.Flow#getCrosses <em>Crosses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crosses</em>'.
	 * @see org.nasdanika.models.threat.Flow#getCrosses()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Crosses();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.threat.TrustBoundary <em>Trust Boundary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trust Boundary</em>'.
	 * @see org.nasdanika.models.threat.TrustBoundary
	 * @generated
	 */
	EClass getTrustBoundary();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.threat.TrustBoundary#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Members</em>'.
	 * @see org.nasdanika.models.threat.TrustBoundary#getMembers()
	 * @see #getTrustBoundary()
	 * @generated
	 */
	EReference getTrustBoundary_Members();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.threat.ThreatActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see org.nasdanika.models.threat.ThreatActor
	 * @generated
	 */
	EClass getThreatActor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.threat.ThreatActor#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capability</em>'.
	 * @see org.nasdanika.models.threat.ThreatActor#getCapability()
	 * @see #getThreatActor()
	 * @generated
	 */
	EAttribute getThreatActor_Capability();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.threat.ThreatActor#getIntent <em>Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intent</em>'.
	 * @see org.nasdanika.models.threat.ThreatActor#getIntent()
	 * @see #getThreatActor()
	 * @generated
	 */
	EAttribute getThreatActor_Intent();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.threat.ThreatActor#getMotivation <em>Motivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Motivation</em>'.
	 * @see org.nasdanika.models.threat.ThreatActor#getMotivation()
	 * @see #getThreatActor()
	 * @generated
	 */
	EAttribute getThreatActor_Motivation();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.threat.Weakness <em>Weakness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weakness</em>'.
	 * @see org.nasdanika.models.threat.Weakness
	 * @generated
	 */
	EClass getWeakness();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.threat.Weakness#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see org.nasdanika.models.threat.Weakness#getReference()
	 * @see #getWeakness()
	 * @generated
	 */
	EAttribute getWeakness_Reference();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.threat.Threat <em>Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Threat</em>'.
	 * @see org.nasdanika.models.threat.Threat
	 * @generated
	 */
	EClass getThreat();

	/**
	 * Returns the meta object for the container reference '{@link org.nasdanika.models.threat.Threat#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Target</em>'.
	 * @see org.nasdanika.models.threat.Threat#getTarget()
	 * @see #getThreat()
	 * @generated
	 */
	EReference getThreat_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.threat.Threat#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.nasdanika.models.threat.Threat#getStatus()
	 * @see #getThreat()
	 * @generated
	 */
	EAttribute getThreat_Status();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.threat.Threat#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Categories</em>'.
	 * @see org.nasdanika.models.threat.Threat#getCategories()
	 * @see #getThreat()
	 * @generated
	 */
	EReference getThreat_Categories();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.threat.Threat#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actors</em>'.
	 * @see org.nasdanika.models.threat.Threat#getActors()
	 * @see #getThreat()
	 * @generated
	 */
	EReference getThreat_Actors();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.threat.Threat#getExploits <em>Exploits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exploits</em>'.
	 * @see org.nasdanika.models.threat.Threat#getExploits()
	 * @see #getThreat()
	 * @generated
	 */
	EReference getThreat_Exploits();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.threat.Threat#getLikelihood <em>Likelihood</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Likelihood</em>'.
	 * @see org.nasdanika.models.threat.Threat#getLikelihood()
	 * @see #getThreat()
	 * @generated
	 */
	EAttribute getThreat_Likelihood();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.threat.Threat#getImpact <em>Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Impact</em>'.
	 * @see org.nasdanika.models.threat.Threat#getImpact()
	 * @see #getThreat()
	 * @generated
	 */
	EAttribute getThreat_Impact();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.threat.Threat#getMitigations <em>Mitigations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mitigations</em>'.
	 * @see org.nasdanika.models.threat.Threat#getMitigations()
	 * @see #getThreat()
	 * @generated
	 */
	EReference getThreat_Mitigations();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.threat.Threat#getRisks <em>Risks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Risks</em>'.
	 * @see org.nasdanika.models.threat.Threat#getRisks()
	 * @see #getThreat()
	 * @generated
	 */
	EReference getThreat_Risks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.threat.Threat#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.nasdanika.models.threat.Threat#getChildren()
	 * @see #getThreat()
	 * @generated
	 */
	EReference getThreat_Children();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.threat.Threat#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin</em>'.
	 * @see org.nasdanika.models.threat.Threat#getOrigin()
	 * @see #getThreat()
	 * @generated
	 */
	EAttribute getThreat_Origin();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.threat.ThreatModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.nasdanika.models.threat.ThreatModel
	 * @generated
	 */
	EClass getThreatModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.threat.ThreatModel#getTaxonomies <em>Taxonomies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Taxonomies</em>'.
	 * @see org.nasdanika.models.threat.ThreatModel#getTaxonomies()
	 * @see #getThreatModel()
	 * @generated
	 */
	EReference getThreatModel_Taxonomies();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.threat.ThreatModel#getKinds <em>Kinds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kinds</em>'.
	 * @see org.nasdanika.models.threat.ThreatModel#getKinds()
	 * @see #getThreatModel()
	 * @generated
	 */
	EReference getThreatModel_Kinds();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.threat.ThreatModel#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actors</em>'.
	 * @see org.nasdanika.models.threat.ThreatModel#getActors()
	 * @see #getThreatModel()
	 * @generated
	 */
	EReference getThreatModel_Actors();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.threat.ThreatModel#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assets</em>'.
	 * @see org.nasdanika.models.threat.ThreatModel#getAssets()
	 * @see #getThreatModel()
	 * @generated
	 */
	EReference getThreatModel_Assets();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.threat.ThreatModel#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scope</em>'.
	 * @see org.nasdanika.models.threat.ThreatModel#getScope()
	 * @see #getThreatModel()
	 * @generated
	 */
	EReference getThreatModel_Scope();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.threat.ThreatModel#getAssumptions <em>Assumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assumptions</em>'.
	 * @see org.nasdanika.models.threat.ThreatModel#getAssumptions()
	 * @see #getThreatModel()
	 * @generated
	 */
	EReference getThreatModel_Assumptions();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.threat.Assumption <em>Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assumption</em>'.
	 * @see org.nasdanika.models.threat.Assumption
	 * @generated
	 */
	EClass getAssumption();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.threat.Assumption#isValidated <em>Validated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validated</em>'.
	 * @see org.nasdanika.models.threat.Assumption#isValidated()
	 * @see #getAssumption()
	 * @generated
	 */
	EAttribute getAssumption_Validated();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.threat.ThreatStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status</em>'.
	 * @see org.nasdanika.models.threat.ThreatStatus
	 * @generated
	 */
	EEnum getThreatStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ThreatFactory getThreatFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.threat.impl.TaxonomyImpl <em>Taxonomy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.threat.impl.TaxonomyImpl
		 * @see org.nasdanika.models.threat.impl.ThreatPackageImpl#getTaxonomy()
		 * @generated
		 */
		EClass TAXONOMY = eINSTANCE.getTaxonomy();

		/**
		 * The meta object literal for the '<em><b>Authority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAXONOMY__AUTHORITY = eINSTANCE.getTaxonomy_Authority();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAXONOMY__VERSION = eINSTANCE.getTaxonomy_Version();

		/**
		 * The meta object literal for the '<em><b>Website</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAXONOMY__WEBSITE = eINSTANCE.getTaxonomy_Website();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAXONOMY__CATEGORIES = eINSTANCE.getTaxonomy_Categories();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.threat.impl.ThreatCategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.threat.impl.ThreatCategoryImpl
		 * @see org.nasdanika.models.threat.impl.ThreatPackageImpl#getThreatCategory()
		 * @generated
		 */
		EClass THREAT_CATEGORY = eINSTANCE.getThreatCategory();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT_CATEGORY__REFERENCE = eINSTANCE.getThreatCategory_Reference();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT_CATEGORY__CHILDREN = eINSTANCE.getThreatCategory_Children();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.threat.impl.AssetKindImpl <em>Asset Kind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.threat.impl.AssetKindImpl
		 * @see org.nasdanika.models.threat.impl.ThreatPackageImpl#getAssetKind()
		 * @generated
		 */
		EClass ASSET_KIND = eINSTANCE.getAssetKind();

		/**
		 * The meta object literal for the '<em><b>Default Threats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_KIND__DEFAULT_THREATS = eINSTANCE.getAssetKind_DefaultThreats();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.threat.impl.AssetImpl <em>Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.threat.impl.AssetImpl
		 * @see org.nasdanika.models.threat.impl.ThreatPackageImpl#getAsset()
		 * @generated
		 */
		EClass ASSET = eINSTANCE.getAsset();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__VALUE = eINSTANCE.getAsset_Value();

		/**
		 * The meta object literal for the '<em><b>Threats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__THREATS = eINSTANCE.getAsset_Threats();

		/**
		 * The meta object literal for the '<em><b>Weaknesses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__WEAKNESSES = eINSTANCE.getAsset_Weaknesses();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.threat.impl.FlowImpl <em>Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.threat.impl.FlowImpl
		 * @see org.nasdanika.models.threat.impl.ThreatPackageImpl#getFlow()
		 * @generated
		 */
		EClass FLOW = eINSTANCE.getFlow();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__SOURCE = eINSTANCE.getFlow_Source();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__DESTINATION = eINSTANCE.getFlow_Destination();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW__PROTOCOL = eINSTANCE.getFlow_Protocol();

		/**
		 * The meta object literal for the '<em><b>Crosses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__CROSSES = eINSTANCE.getFlow_Crosses();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.threat.impl.TrustBoundaryImpl <em>Trust Boundary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.threat.impl.TrustBoundaryImpl
		 * @see org.nasdanika.models.threat.impl.ThreatPackageImpl#getTrustBoundary()
		 * @generated
		 */
		EClass TRUST_BOUNDARY = eINSTANCE.getTrustBoundary();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRUST_BOUNDARY__MEMBERS = eINSTANCE.getTrustBoundary_Members();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.threat.impl.ThreatActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.threat.impl.ThreatActorImpl
		 * @see org.nasdanika.models.threat.impl.ThreatPackageImpl#getThreatActor()
		 * @generated
		 */
		EClass THREAT_ACTOR = eINSTANCE.getThreatActor();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT_ACTOR__CAPABILITY = eINSTANCE.getThreatActor_Capability();

		/**
		 * The meta object literal for the '<em><b>Intent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT_ACTOR__INTENT = eINSTANCE.getThreatActor_Intent();

		/**
		 * The meta object literal for the '<em><b>Motivation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT_ACTOR__MOTIVATION = eINSTANCE.getThreatActor_Motivation();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.threat.impl.WeaknessImpl <em>Weakness</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.threat.impl.WeaknessImpl
		 * @see org.nasdanika.models.threat.impl.ThreatPackageImpl#getWeakness()
		 * @generated
		 */
		EClass WEAKNESS = eINSTANCE.getWeakness();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEAKNESS__REFERENCE = eINSTANCE.getWeakness_Reference();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.threat.impl.ThreatImpl <em>Threat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.threat.impl.ThreatImpl
		 * @see org.nasdanika.models.threat.impl.ThreatPackageImpl#getThreat()
		 * @generated
		 */
		EClass THREAT = eINSTANCE.getThreat();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT__TARGET = eINSTANCE.getThreat_Target();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT__STATUS = eINSTANCE.getThreat_Status();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT__CATEGORIES = eINSTANCE.getThreat_Categories();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT__ACTORS = eINSTANCE.getThreat_Actors();

		/**
		 * The meta object literal for the '<em><b>Exploits</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT__EXPLOITS = eINSTANCE.getThreat_Exploits();

		/**
		 * The meta object literal for the '<em><b>Likelihood</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT__LIKELIHOOD = eINSTANCE.getThreat_Likelihood();

		/**
		 * The meta object literal for the '<em><b>Impact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT__IMPACT = eINSTANCE.getThreat_Impact();

		/**
		 * The meta object literal for the '<em><b>Mitigations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT__MITIGATIONS = eINSTANCE.getThreat_Mitigations();

		/**
		 * The meta object literal for the '<em><b>Risks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT__RISKS = eINSTANCE.getThreat_Risks();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT__CHILDREN = eINSTANCE.getThreat_Children();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT__ORIGIN = eINSTANCE.getThreat_Origin();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.threat.impl.ThreatModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.threat.impl.ThreatModelImpl
		 * @see org.nasdanika.models.threat.impl.ThreatPackageImpl#getThreatModel()
		 * @generated
		 */
		EClass THREAT_MODEL = eINSTANCE.getThreatModel();

		/**
		 * The meta object literal for the '<em><b>Taxonomies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT_MODEL__TAXONOMIES = eINSTANCE.getThreatModel_Taxonomies();

		/**
		 * The meta object literal for the '<em><b>Kinds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT_MODEL__KINDS = eINSTANCE.getThreatModel_Kinds();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT_MODEL__ACTORS = eINSTANCE.getThreatModel_Actors();

		/**
		 * The meta object literal for the '<em><b>Assets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT_MODEL__ASSETS = eINSTANCE.getThreatModel_Assets();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT_MODEL__SCOPE = eINSTANCE.getThreatModel_Scope();

		/**
		 * The meta object literal for the '<em><b>Assumptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT_MODEL__ASSUMPTIONS = eINSTANCE.getThreatModel_Assumptions();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.threat.impl.AssumptionImpl <em>Assumption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.threat.impl.AssumptionImpl
		 * @see org.nasdanika.models.threat.impl.ThreatPackageImpl#getAssumption()
		 * @generated
		 */
		EClass ASSUMPTION = eINSTANCE.getAssumption();

		/**
		 * The meta object literal for the '<em><b>Validated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSUMPTION__VALIDATED = eINSTANCE.getAssumption_Validated();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.threat.ThreatStatus <em>Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.threat.ThreatStatus
		 * @see org.nasdanika.models.threat.impl.ThreatPackageImpl#getThreatStatus()
		 * @generated
		 */
		EEnum THREAT_STATUS = eINSTANCE.getThreatStatus();

	}

} //ThreatPackage
