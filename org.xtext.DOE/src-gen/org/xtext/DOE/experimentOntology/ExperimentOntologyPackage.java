/**
 */
package org.xtext.DOE.experimentOntology;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.DOE.experimentOntology.ExperimentOntologyFactory
 * @model kind="package"
 * @generated
 */
public interface ExperimentOntologyPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "experimentOntology";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/DOE/ExperimentOntology";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "experimentOntology";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ExperimentOntologyPackage eINSTANCE = org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.impl.ModelImpl
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.impl.ExperimentOntologyImpl <em>Experiment Ontology</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyImpl
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getExperimentOntology()
   * @generated
   */
  int EXPERIMENT_ONTOLOGY = 1;

  /**
   * The number of structural features of the '<em>Experiment Ontology</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIMENT_ONTOLOGY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.impl.ModelSectionImpl <em>Model Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.impl.ModelSectionImpl
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getModelSection()
   * @generated
   */
  int MODEL_SECTION = 2;

  /**
   * The feature id for the '<em><b>Mod Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_SECTION__MOD_NAME = EXPERIMENT_ONTOLOGY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Mechanisms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_SECTION__MECHANISMS = EXPERIMENT_ONTOLOGY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_SECTION__EVENTS = EXPERIMENT_ONTOLOGY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_SECTION__PARAMETERS = EXPERIMENT_ONTOLOGY_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Model Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_SECTION_FEATURE_COUNT = EXPERIMENT_ONTOLOGY_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.impl.MechanismImpl <em>Mechanism</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.impl.MechanismImpl
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getMechanism()
   * @generated
   */
  int MECHANISM = 3;

  /**
   * The feature id for the '<em><b>Mechanism Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MECHANISM__MECHANISM_NAME = 0;

  /**
   * The feature id for the '<em><b>LHS</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MECHANISM__LHS = 1;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MECHANISM__CONDITION = 2;

  /**
   * The feature id for the '<em><b>RHS</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MECHANISM__RHS = 3;

  /**
   * The number of structural features of the '<em>Mechanism</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MECHANISM_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.impl.ReactionImpl <em>Reaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.impl.ReactionImpl
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getReaction()
   * @generated
   */
  int REACTION = 4;

  /**
   * The feature id for the '<em><b>Agent1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACTION__AGENT1 = 0;

  /**
   * The feature id for the '<em><b>Agent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACTION__AGENT = 1;

  /**
   * The number of structural features of the '<em>Reaction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.impl.GuardConditionImpl <em>Guard Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.impl.GuardConditionImpl
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getGuardCondition()
   * @generated
   */
  int GUARD_CONDITION = 5;

  /**
   * The feature id for the '<em><b>Gd</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD_CONDITION__GD = 0;

  /**
   * The feature id for the '<em><b>Condition1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD_CONDITION__CONDITION1 = 1;

  /**
   * The feature id for the '<em><b>Link</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD_CONDITION__LINK = 2;

  /**
   * The feature id for the '<em><b>Condition2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD_CONDITION__CONDITION2 = 3;

  /**
   * The number of structural features of the '<em>Guard Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD_CONDITION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.impl.EventDescriptorImpl <em>Event Descriptor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.impl.EventDescriptorImpl
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getEventDescriptor()
   * @generated
   */
  int EVENT_DESCRIPTOR = 6;

  /**
   * The feature id for the '<em><b>Event Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DESCRIPTOR__EVENT_NAME = 0;

  /**
   * The feature id for the '<em><b>Event</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DESCRIPTOR__EVENT = 1;

  /**
   * The number of structural features of the '<em>Event Descriptor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DESCRIPTOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.impl.FactorImpl <em>Factor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.impl.FactorImpl
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getFactor()
   * @generated
   */
  int FACTOR = 7;

  /**
   * The feature id for the '<em><b>Factor Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__FACTOR_NAME = 0;

  /**
   * The feature id for the '<em><b>Factor Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__FACTOR_TYPE = 1;

  /**
   * The feature id for the '<em><b>Factor Type1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__FACTOR_TYPE1 = 2;

  /**
   * The feature id for the '<em><b>Factor Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__FACTOR_VALUE = 3;

  /**
   * The feature id for the '<em><b>Factor Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__FACTOR_PROPERTIES = 4;

  /**
   * The number of structural features of the '<em>Factor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.impl.propertiesImpl <em>properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.impl.propertiesImpl
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getproperties()
   * @generated
   */
  int PROPERTIES = 8;

  /**
   * The feature id for the '<em><b>PName</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTIES__PNAME = 0;

  /**
   * The feature id for the '<em><b>PVal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTIES__PVAL = 1;

  /**
   * The number of structural features of the '<em>properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTIES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.impl.ValuesImpl <em>Values</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.impl.ValuesImpl
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getValues()
   * @generated
   */
  int VALUES = 9;

  /**
   * The feature id for the '<em><b>FVal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES__FVAL = 0;

  /**
   * The feature id for the '<em><b>Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES__FUNCTION = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES__VALUE = 2;

  /**
   * The feature id for the '<em><b>Fvalue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES__FVALUE = 3;

  /**
   * The number of structural features of the '<em>Values</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.impl.GoalsImpl <em>Goals</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.impl.GoalsImpl
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getGoals()
   * @generated
   */
  int GOALS = 10;

  /**
   * The feature id for the '<em><b>Obj Of Study</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOALS__OBJ_OF_STUDY = EXPERIMENT_ONTOLOGY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Purpose</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOALS__PURPOSE = EXPERIMENT_ONTOLOGY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Focus</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOALS__FOCUS = EXPERIMENT_ONTOLOGY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>View Point</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOALS__VIEW_POINT = EXPERIMENT_ONTOLOGY_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Context</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOALS__CONTEXT = EXPERIMENT_ONTOLOGY_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Goals</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOALS_FEATURE_COUNT = EXPERIMENT_ONTOLOGY_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.impl.HypothesisImpl <em>Hypothesis</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.impl.HypothesisImpl
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getHypothesis()
   * @generated
   */
  int HYPOTHESIS = 11;

  /**
   * The feature id for the '<em><b>Mech Hypothesis</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPOTHESIS__MECH_HYPOTHESIS = EXPERIMENT_ONTOLOGY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Evidences</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPOTHESIS__EVIDENCES = EXPERIMENT_ONTOLOGY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Coherence Links</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPOTHESIS__COHERENCE_LINKS = EXPERIMENT_ONTOLOGY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Rel Hypothesis</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPOTHESIS__REL_HYPOTHESIS = EXPERIMENT_ONTOLOGY_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Hypothesis</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPOTHESIS_FEATURE_COUNT = EXPERIMENT_ONTOLOGY_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.impl.CoherenceLinkImpl <em>Coherence Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.impl.CoherenceLinkImpl
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getCoherenceLink()
   * @generated
   */
  int COHERENCE_LINK = 12;

  /**
   * The feature id for the '<em><b>Coherence</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COHERENCE_LINK__COHERENCE = 0;

  /**
   * The feature id for the '<em><b>Hyp</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COHERENCE_LINK__HYP = 1;

  /**
   * The feature id for the '<em><b>Evi</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COHERENCE_LINK__EVI = 2;

  /**
   * The number of structural features of the '<em>Coherence Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COHERENCE_LINK_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.impl.MechHypothesisImpl <em>Mech Hypothesis</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.impl.MechHypothesisImpl
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getMechHypothesis()
   * @generated
   */
  int MECH_HYPOTHESIS = 13;

  /**
   * The feature id for the '<em><b>MName</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MECH_HYPOTHESIS__MNAME = 0;

  /**
   * The feature id for the '<em><b>Asso Mech</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MECH_HYPOTHESIS__ASSO_MECH = 1;

  /**
   * The feature id for the '<em><b>Mechanistic Hypothesis</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MECH_HYPOTHESIS__MECHANISTIC_HYPOTHESIS = 2;

  /**
   * The number of structural features of the '<em>Mech Hypothesis</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MECH_HYPOTHESIS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.impl.EvidenceImpl <em>Evidence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.impl.EvidenceImpl
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getEvidence()
   * @generated
   */
  int EVIDENCE = 14;

  /**
   * The feature id for the '<em><b>EName</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVIDENCE__ENAME = 0;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVIDENCE__QUERY = 1;

  /**
   * The feature id for the '<em><b>Obj Of Study</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVIDENCE__OBJ_OF_STUDY = 2;

  /**
   * The number of structural features of the '<em>Evidence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVIDENCE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.impl.TemporalPatternImpl <em>Temporal Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.impl.TemporalPatternImpl
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getTemporalPattern()
   * @generated
   */
  int TEMPORAL_PATTERN = 15;

  /**
   * The number of structural features of the '<em>Temporal Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPORAL_PATTERN_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.impl.ConditionImpl
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 16;

  /**
   * The feature id for the '<em><b>L2</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__L2 = TEMPORAL_PATTERN_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Exp</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__EXP = TEMPORAL_PATTERN_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Op1</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__OP1 = TEMPORAL_PATTERN_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Op2</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__OP2 = TEMPORAL_PATTERN_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>L3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__L3 = TEMPORAL_PATTERN_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__CONDITION = TEMPORAL_PATTERN_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Lo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__LO = TEMPORAL_PATTERN_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__E = TEMPORAL_PATTERN_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Exp1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__EXP1 = TEMPORAL_PATTERN_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>V</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__V = TEMPORAL_PATTERN_FEATURE_COUNT + 9;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = TEMPORAL_PATTERN_FEATURE_COUNT + 10;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.impl.EventImpl
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 17;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.impl.SimultaneousImpl <em>Simultaneous</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.impl.SimultaneousImpl
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getSimultaneous()
   * @generated
   */
  int SIMULTANEOUS = 18;

  /**
   * The feature id for the '<em><b>Sim1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMULTANEOUS__SIM1 = EVENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Log</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMULTANEOUS__LOG = EVENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Sim2</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMULTANEOUS__SIM2 = EVENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Simultaneous</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMULTANEOUS_FEATURE_COUNT = EVENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.impl.DispersedImpl <em>Dispersed</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.impl.DispersedImpl
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getDispersed()
   * @generated
   */
  int DISPERSED = 19;

  /**
   * The feature id for the '<em><b>Disp</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPERSED__DISP = EVENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Dispersed</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPERSED_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.impl.RelationalQueryImpl <em>Relational Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.impl.RelationalQueryImpl
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getRelationalQuery()
   * @generated
   */
  int RELATIONAL_QUERY = 20;

  /**
   * The number of structural features of the '<em>Relational Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_QUERY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.impl.Query1Impl <em>Query1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.impl.Query1Impl
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getQuery1()
   * @generated
   */
  int QUERY1 = 21;

  /**
   * The feature id for the '<em><b>Factor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY1__FACTOR = RELATIONAL_QUERY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Control</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY1__CONTROL = RELATIONAL_QUERY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY1__X = RELATIONAL_QUERY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Start1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY1__START1 = RELATIONAL_QUERY_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>End1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY1__END1 = RELATIONAL_QUERY_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Response</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY1__RESPONSE = RELATIONAL_QUERY_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY1__Y = RELATIONAL_QUERY_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Start2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY1__START2 = RELATIONAL_QUERY_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>End2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY1__END2 = RELATIONAL_QUERY_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>Query1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY1_FEATURE_COUNT = RELATIONAL_QUERY_FEATURE_COUNT + 9;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.impl.Query2Impl <em>Query2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.impl.Query2Impl
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getQuery2()
   * @generated
   */
  int QUERY2 = 22;

  /**
   * The feature id for the '<em><b>Function1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY2__FUNCTION1 = RELATIONAL_QUERY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Response1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY2__RESPONSE1 = RELATIONAL_QUERY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Factor1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY2__FACTOR1 = RELATIONAL_QUERY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Function2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY2__FUNCTION2 = RELATIONAL_QUERY_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Response2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY2__RESPONSE2 = RELATIONAL_QUERY_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Factor2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY2__FACTOR2 = RELATIONAL_QUERY_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Query2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY2_FEATURE_COUNT = RELATIONAL_QUERY_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.impl.Query3Impl <em>Query3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.impl.Query3Impl
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getQuery3()
   * @generated
   */
  int QUERY3 = 23;

  /**
   * The feature id for the '<em><b>Factor1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY3__FACTOR1 = RELATIONAL_QUERY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Control1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY3__CONTROL1 = RELATIONAL_QUERY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Level2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY3__LEVEL2 = RELATIONAL_QUERY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>X2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY3__X2 = RELATIONAL_QUERY_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Response1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY3__RESPONSE1 = RELATIONAL_QUERY_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Level4</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY3__LEVEL4 = RELATIONAL_QUERY_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>X4</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY3__X4 = RELATIONAL_QUERY_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY3__LEVEL = RELATIONAL_QUERY_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Factor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY3__FACTOR = RELATIONAL_QUERY_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Control</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY3__CONTROL = RELATIONAL_QUERY_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Response</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY3__RESPONSE = RELATIONAL_QUERY_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Start1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY3__START1 = RELATIONAL_QUERY_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>End1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY3__END1 = RELATIONAL_QUERY_FEATURE_COUNT + 12;

  /**
   * The number of structural features of the '<em>Query3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY3_FEATURE_COUNT = RELATIONAL_QUERY_FEATURE_COUNT + 13;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.impl.ExperimentImpl <em>Experiment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentImpl
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getExperiment()
   * @generated
   */
  int EXPERIMENT = 24;

  /**
   * The feature id for the '<em><b>Exp Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIMENT__EXP_NAME = EXPERIMENT_ONTOLOGY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Exp Design</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIMENT__EXP_DESIGN = EXPERIMENT_ONTOLOGY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Perf Measure</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIMENT__PERF_MEASURE = EXPERIMENT_ONTOLOGY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Experiment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIMENT_FEATURE_COUNT = EXPERIMENT_ONTOLOGY_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.impl.DesignImpl <em>Design</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.impl.DesignImpl
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getDesign()
   * @generated
   */
  int DESIGN = 25;

  /**
   * The feature id for the '<em><b>Design Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESIGN__DESIGN_TYPE = 0;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESIGN__CONSTRAINT = 1;

  /**
   * The feature id for the '<em><b>Iteration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESIGN__ITERATION = 2;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESIGN__VARIABLES = 3;

  /**
   * The number of structural features of the '<em>Design</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESIGN_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.impl.VariablesImpl <em>Variables</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.impl.VariablesImpl
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getVariables()
   * @generated
   */
  int VARIABLES = 26;

  /**
   * The feature id for the '<em><b>Independent Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES__INDEPENDENT_VARIABLES = 0;

  /**
   * The feature id for the '<em><b>Control Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES__CONTROL_VARIABLES = 1;

  /**
   * The feature id for the '<em><b>Dependent Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES__DEPENDENT_VARIABLES = 2;

  /**
   * The number of structural features of the '<em>Variables</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.impl.IndependentVariablesImpl <em>Independent Variables</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.impl.IndependentVariablesImpl
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getIndependentVariables()
   * @generated
   */
  int INDEPENDENT_VARIABLES = 27;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEPENDENT_VARIABLES__VARIABLES = 0;

  /**
   * The number of structural features of the '<em>Independent Variables</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEPENDENT_VARIABLES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.impl.ControlVariablesImpl <em>Control Variables</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.impl.ControlVariablesImpl
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getControlVariables()
   * @generated
   */
  int CONTROL_VARIABLES = 28;

  /**
   * The feature id for the '<em><b>Control Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_VARIABLES__CONTROL_NAME = 0;

  /**
   * The feature id for the '<em><b>Control Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_VARIABLES__CONTROL_TYPE = 1;

  /**
   * The feature id for the '<em><b>Control Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_VARIABLES__CONTROL_VALUE = 2;

  /**
   * The number of structural features of the '<em>Control Variables</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_VARIABLES_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.impl.DependentVariablesImpl <em>Dependent Variables</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.impl.DependentVariablesImpl
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getDependentVariables()
   * @generated
   */
  int DEPENDENT_VARIABLES = 29;

  /**
   * The feature id for the '<em><b>Response Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENT_VARIABLES__RESPONSE_NAME = 0;

  /**
   * The number of structural features of the '<em>Dependent Variables</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENT_VARIABLES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.impl.FactorLevelsImpl <em>Factor Levels</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.impl.FactorLevelsImpl
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getFactorLevels()
   * @generated
   */
  int FACTOR_LEVELS = 30;

  /**
   * The feature id for the '<em><b>Fac Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR_LEVELS__FAC_NAME = 0;

  /**
   * The feature id for the '<em><b>L</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR_LEVELS__L = 1;

  /**
   * The feature id for the '<em><b>L1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR_LEVELS__L1 = 2;

  /**
   * The feature id for the '<em><b>L2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR_LEVELS__L2 = 3;

  /**
   * The feature id for the '<em><b>Start1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR_LEVELS__START1 = 4;

  /**
   * The feature id for the '<em><b>End1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR_LEVELS__END1 = 5;

  /**
   * The number of structural features of the '<em>Factor Levels</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR_LEVELS_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.impl.ResponseImpl <em>Response</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.impl.ResponseImpl
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getResponse()
   * @generated
   */
  int RESPONSE = 31;

  /**
   * The feature id for the '<em><b>Response Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSE__RESPONSE_NAME = 0;

  /**
   * The feature id for the '<em><b>Response Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSE__RESPONSE_TYPE = 1;

  /**
   * The number of structural features of the '<em>Response</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.impl.IterationImpl <em>Iteration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.impl.IterationImpl
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getIteration()
   * @generated
   */
  int ITERATION = 32;

  /**
   * The feature id for the '<em><b>Iterations</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITERATION__ITERATIONS = 0;

  /**
   * The number of structural features of the '<em>Iteration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITERATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.impl.PerformanceMeasureImpl <em>Performance Measure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.impl.PerformanceMeasureImpl
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getPerformanceMeasure()
   * @generated
   */
  int PERFORMANCE_MEASURE = 33;

  /**
   * The feature id for the '<em><b>Expected Response</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORMANCE_MEASURE__EXPECTED_RESPONSE = 0;

  /**
   * The feature id for the '<em><b>Er</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORMANCE_MEASURE__ER = 1;

  /**
   * The feature id for the '<em><b>Std</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORMANCE_MEASURE__STD = 2;

  /**
   * The number of structural features of the '<em>Performance Measure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERFORMANCE_MEASURE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.VariableType <em>Variable Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.VariableType
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getVariableType()
   * @generated
   */
  int VARIABLE_TYPE = 34;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.Expression <em>Expression</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.Expression
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 35;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.Links <em>Links</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.Links
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getLinks()
   * @generated
   */
  int LINKS = 36;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.Temporal <em>Temporal</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.Temporal
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getTemporal()
   * @generated
   */
  int TEMPORAL = 37;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.Logical <em>Logical</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.Logical
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getLogical()
   * @generated
   */
  int LOGICAL = 38;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.Coherence <em>Coherence</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.Coherence
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getCoherence()
   * @generated
   */
  int COHERENCE = 39;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.Function <em>Function</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.Function
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 40;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.Changes <em>Changes</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.Changes
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getChanges()
   * @generated
   */
  int CHANGES = 41;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.Levels <em>Levels</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.Levels
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getLevels()
   * @generated
   */
  int LEVELS = 42;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.DesignType <em>Design Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.DesignType
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getDesignType()
   * @generated
   */
  int DESIGN_TYPE = 43;

  /**
   * The meta object id for the '{@link org.xtext.DOE.experimentOntology.ResponseType <em>Response Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.DOE.experimentOntology.ResponseType
   * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getResponseType()
   * @generated
   */
  int RESPONSE_TYPE = 44;


  /**
   * Returns the meta object for class '{@link org.xtext.DOE.experimentOntology.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.DOE.experimentOntology.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.DOE.experimentOntology.Model#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.xtext.DOE.experimentOntology.Model#getElements()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Elements();

  /**
   * Returns the meta object for class '{@link org.xtext.DOE.experimentOntology.ExperimentOntology <em>Experiment Ontology</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Experiment Ontology</em>'.
   * @see org.xtext.DOE.experimentOntology.ExperimentOntology
   * @generated
   */
  EClass getExperimentOntology();

  /**
   * Returns the meta object for class '{@link org.xtext.DOE.experimentOntology.ModelSection <em>Model Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Section</em>'.
   * @see org.xtext.DOE.experimentOntology.ModelSection
   * @generated
   */
  EClass getModelSection();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.ModelSection#getModName <em>Mod Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mod Name</em>'.
   * @see org.xtext.DOE.experimentOntology.ModelSection#getModName()
   * @see #getModelSection()
   * @generated
   */
  EAttribute getModelSection_ModName();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.DOE.experimentOntology.ModelSection#getMechanisms <em>Mechanisms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mechanisms</em>'.
   * @see org.xtext.DOE.experimentOntology.ModelSection#getMechanisms()
   * @see #getModelSection()
   * @generated
   */
  EReference getModelSection_Mechanisms();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.DOE.experimentOntology.ModelSection#getEvents <em>Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Events</em>'.
   * @see org.xtext.DOE.experimentOntology.ModelSection#getEvents()
   * @see #getModelSection()
   * @generated
   */
  EReference getModelSection_Events();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.DOE.experimentOntology.ModelSection#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.xtext.DOE.experimentOntology.ModelSection#getParameters()
   * @see #getModelSection()
   * @generated
   */
  EReference getModelSection_Parameters();

  /**
   * Returns the meta object for class '{@link org.xtext.DOE.experimentOntology.Mechanism <em>Mechanism</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mechanism</em>'.
   * @see org.xtext.DOE.experimentOntology.Mechanism
   * @generated
   */
  EClass getMechanism();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Mechanism#getMechanismName <em>Mechanism Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mechanism Name</em>'.
   * @see org.xtext.DOE.experimentOntology.Mechanism#getMechanismName()
   * @see #getMechanism()
   * @generated
   */
  EAttribute getMechanism_MechanismName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.DOE.experimentOntology.Mechanism#getLHS <em>LHS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>LHS</em>'.
   * @see org.xtext.DOE.experimentOntology.Mechanism#getLHS()
   * @see #getMechanism()
   * @generated
   */
  EReference getMechanism_LHS();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.DOE.experimentOntology.Mechanism#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.xtext.DOE.experimentOntology.Mechanism#getCondition()
   * @see #getMechanism()
   * @generated
   */
  EReference getMechanism_Condition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.DOE.experimentOntology.Mechanism#getRHS <em>RHS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>RHS</em>'.
   * @see org.xtext.DOE.experimentOntology.Mechanism#getRHS()
   * @see #getMechanism()
   * @generated
   */
  EReference getMechanism_RHS();

  /**
   * Returns the meta object for class '{@link org.xtext.DOE.experimentOntology.Reaction <em>Reaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reaction</em>'.
   * @see org.xtext.DOE.experimentOntology.Reaction
   * @generated
   */
  EClass getReaction();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Reaction#getAgent1 <em>Agent1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Agent1</em>'.
   * @see org.xtext.DOE.experimentOntology.Reaction#getAgent1()
   * @see #getReaction()
   * @generated
   */
  EAttribute getReaction_Agent1();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Reaction#getAgent <em>Agent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Agent</em>'.
   * @see org.xtext.DOE.experimentOntology.Reaction#getAgent()
   * @see #getReaction()
   * @generated
   */
  EAttribute getReaction_Agent();

  /**
   * Returns the meta object for class '{@link org.xtext.DOE.experimentOntology.GuardCondition <em>Guard Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Guard Condition</em>'.
   * @see org.xtext.DOE.experimentOntology.GuardCondition
   * @generated
   */
  EClass getGuardCondition();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.GuardCondition#getGd <em>Gd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Gd</em>'.
   * @see org.xtext.DOE.experimentOntology.GuardCondition#getGd()
   * @see #getGuardCondition()
   * @generated
   */
  EAttribute getGuardCondition_Gd();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.GuardCondition#getCondition1 <em>Condition1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Condition1</em>'.
   * @see org.xtext.DOE.experimentOntology.GuardCondition#getCondition1()
   * @see #getGuardCondition()
   * @generated
   */
  EAttribute getGuardCondition_Condition1();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.GuardCondition#getLink <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Link</em>'.
   * @see org.xtext.DOE.experimentOntology.GuardCondition#getLink()
   * @see #getGuardCondition()
   * @generated
   */
  EAttribute getGuardCondition_Link();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.GuardCondition#getCondition2 <em>Condition2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Condition2</em>'.
   * @see org.xtext.DOE.experimentOntology.GuardCondition#getCondition2()
   * @see #getGuardCondition()
   * @generated
   */
  EAttribute getGuardCondition_Condition2();

  /**
   * Returns the meta object for class '{@link org.xtext.DOE.experimentOntology.EventDescriptor <em>Event Descriptor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event Descriptor</em>'.
   * @see org.xtext.DOE.experimentOntology.EventDescriptor
   * @generated
   */
  EClass getEventDescriptor();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.EventDescriptor#getEventName <em>Event Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Event Name</em>'.
   * @see org.xtext.DOE.experimentOntology.EventDescriptor#getEventName()
   * @see #getEventDescriptor()
   * @generated
   */
  EAttribute getEventDescriptor_EventName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.EventDescriptor#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Event</em>'.
   * @see org.xtext.DOE.experimentOntology.EventDescriptor#getEvent()
   * @see #getEventDescriptor()
   * @generated
   */
  EAttribute getEventDescriptor_Event();

  /**
   * Returns the meta object for class '{@link org.xtext.DOE.experimentOntology.Factor <em>Factor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Factor</em>'.
   * @see org.xtext.DOE.experimentOntology.Factor
   * @generated
   */
  EClass getFactor();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Factor#getFactorName <em>Factor Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Factor Name</em>'.
   * @see org.xtext.DOE.experimentOntology.Factor#getFactorName()
   * @see #getFactor()
   * @generated
   */
  EAttribute getFactor_FactorName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Factor#getFactorType <em>Factor Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Factor Type</em>'.
   * @see org.xtext.DOE.experimentOntology.Factor#getFactorType()
   * @see #getFactor()
   * @generated
   */
  EAttribute getFactor_FactorType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Factor#getFactorType1 <em>Factor Type1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Factor Type1</em>'.
   * @see org.xtext.DOE.experimentOntology.Factor#getFactorType1()
   * @see #getFactor()
   * @generated
   */
  EAttribute getFactor_FactorType1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.DOE.experimentOntology.Factor#getFactorValue <em>Factor Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Factor Value</em>'.
   * @see org.xtext.DOE.experimentOntology.Factor#getFactorValue()
   * @see #getFactor()
   * @generated
   */
  EReference getFactor_FactorValue();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.DOE.experimentOntology.Factor#getFactorProperties <em>Factor Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Factor Properties</em>'.
   * @see org.xtext.DOE.experimentOntology.Factor#getFactorProperties()
   * @see #getFactor()
   * @generated
   */
  EReference getFactor_FactorProperties();

  /**
   * Returns the meta object for class '{@link org.xtext.DOE.experimentOntology.properties <em>properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>properties</em>'.
   * @see org.xtext.DOE.experimentOntology.properties
   * @generated
   */
  EClass getproperties();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.properties#getPName <em>PName</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>PName</em>'.
   * @see org.xtext.DOE.experimentOntology.properties#getPName()
   * @see #getproperties()
   * @generated
   */
  EAttribute getproperties_PName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.DOE.experimentOntology.properties#getPVal <em>PVal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>PVal</em>'.
   * @see org.xtext.DOE.experimentOntology.properties#getPVal()
   * @see #getproperties()
   * @generated
   */
  EReference getproperties_PVal();

  /**
   * Returns the meta object for class '{@link org.xtext.DOE.experimentOntology.Values <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Values</em>'.
   * @see org.xtext.DOE.experimentOntology.Values
   * @generated
   */
  EClass getValues();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Values#getFVal <em>FVal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>FVal</em>'.
   * @see org.xtext.DOE.experimentOntology.Values#getFVal()
   * @see #getValues()
   * @generated
   */
  EAttribute getValues_FVal();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Values#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Function</em>'.
   * @see org.xtext.DOE.experimentOntology.Values#getFunction()
   * @see #getValues()
   * @generated
   */
  EAttribute getValues_Function();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Values#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.DOE.experimentOntology.Values#getValue()
   * @see #getValues()
   * @generated
   */
  EAttribute getValues_Value();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Values#getFvalue <em>Fvalue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fvalue</em>'.
   * @see org.xtext.DOE.experimentOntology.Values#getFvalue()
   * @see #getValues()
   * @generated
   */
  EAttribute getValues_Fvalue();

  /**
   * Returns the meta object for class '{@link org.xtext.DOE.experimentOntology.Goals <em>Goals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goals</em>'.
   * @see org.xtext.DOE.experimentOntology.Goals
   * @generated
   */
  EClass getGoals();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Goals#getObjOfStudy <em>Obj Of Study</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Obj Of Study</em>'.
   * @see org.xtext.DOE.experimentOntology.Goals#getObjOfStudy()
   * @see #getGoals()
   * @generated
   */
  EAttribute getGoals_ObjOfStudy();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Goals#getPurpose <em>Purpose</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Purpose</em>'.
   * @see org.xtext.DOE.experimentOntology.Goals#getPurpose()
   * @see #getGoals()
   * @generated
   */
  EAttribute getGoals_Purpose();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Goals#getFocus <em>Focus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Focus</em>'.
   * @see org.xtext.DOE.experimentOntology.Goals#getFocus()
   * @see #getGoals()
   * @generated
   */
  EAttribute getGoals_Focus();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Goals#getViewPoint <em>View Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>View Point</em>'.
   * @see org.xtext.DOE.experimentOntology.Goals#getViewPoint()
   * @see #getGoals()
   * @generated
   */
  EAttribute getGoals_ViewPoint();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Goals#getContext <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Context</em>'.
   * @see org.xtext.DOE.experimentOntology.Goals#getContext()
   * @see #getGoals()
   * @generated
   */
  EAttribute getGoals_Context();

  /**
   * Returns the meta object for class '{@link org.xtext.DOE.experimentOntology.Hypothesis <em>Hypothesis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hypothesis</em>'.
   * @see org.xtext.DOE.experimentOntology.Hypothesis
   * @generated
   */
  EClass getHypothesis();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.DOE.experimentOntology.Hypothesis#getMechHypothesis <em>Mech Hypothesis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mech Hypothesis</em>'.
   * @see org.xtext.DOE.experimentOntology.Hypothesis#getMechHypothesis()
   * @see #getHypothesis()
   * @generated
   */
  EReference getHypothesis_MechHypothesis();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.DOE.experimentOntology.Hypothesis#getEvidences <em>Evidences</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Evidences</em>'.
   * @see org.xtext.DOE.experimentOntology.Hypothesis#getEvidences()
   * @see #getHypothesis()
   * @generated
   */
  EReference getHypothesis_Evidences();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.DOE.experimentOntology.Hypothesis#getCoherenceLinks <em>Coherence Links</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Coherence Links</em>'.
   * @see org.xtext.DOE.experimentOntology.Hypothesis#getCoherenceLinks()
   * @see #getHypothesis()
   * @generated
   */
  EReference getHypothesis_CoherenceLinks();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.DOE.experimentOntology.Hypothesis#getRelHypothesis <em>Rel Hypothesis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rel Hypothesis</em>'.
   * @see org.xtext.DOE.experimentOntology.Hypothesis#getRelHypothesis()
   * @see #getHypothesis()
   * @generated
   */
  EReference getHypothesis_RelHypothesis();

  /**
   * Returns the meta object for class '{@link org.xtext.DOE.experimentOntology.CoherenceLink <em>Coherence Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Coherence Link</em>'.
   * @see org.xtext.DOE.experimentOntology.CoherenceLink
   * @generated
   */
  EClass getCoherenceLink();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.CoherenceLink#getCoherence <em>Coherence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Coherence</em>'.
   * @see org.xtext.DOE.experimentOntology.CoherenceLink#getCoherence()
   * @see #getCoherenceLink()
   * @generated
   */
  EAttribute getCoherenceLink_Coherence();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.DOE.experimentOntology.CoherenceLink#getHyp <em>Hyp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Hyp</em>'.
   * @see org.xtext.DOE.experimentOntology.CoherenceLink#getHyp()
   * @see #getCoherenceLink()
   * @generated
   */
  EAttribute getCoherenceLink_Hyp();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.DOE.experimentOntology.CoherenceLink#getEvi <em>Evi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Evi</em>'.
   * @see org.xtext.DOE.experimentOntology.CoherenceLink#getEvi()
   * @see #getCoherenceLink()
   * @generated
   */
  EAttribute getCoherenceLink_Evi();

  /**
   * Returns the meta object for class '{@link org.xtext.DOE.experimentOntology.MechHypothesis <em>Mech Hypothesis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mech Hypothesis</em>'.
   * @see org.xtext.DOE.experimentOntology.MechHypothesis
   * @generated
   */
  EClass getMechHypothesis();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.MechHypothesis#getMName <em>MName</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>MName</em>'.
   * @see org.xtext.DOE.experimentOntology.MechHypothesis#getMName()
   * @see #getMechHypothesis()
   * @generated
   */
  EAttribute getMechHypothesis_MName();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.DOE.experimentOntology.MechHypothesis#getAssoMech <em>Asso Mech</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Asso Mech</em>'.
   * @see org.xtext.DOE.experimentOntology.MechHypothesis#getAssoMech()
   * @see #getMechHypothesis()
   * @generated
   */
  EReference getMechHypothesis_AssoMech();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.MechHypothesis#getMechanisticHypothesis <em>Mechanistic Hypothesis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mechanistic Hypothesis</em>'.
   * @see org.xtext.DOE.experimentOntology.MechHypothesis#getMechanisticHypothesis()
   * @see #getMechHypothesis()
   * @generated
   */
  EAttribute getMechHypothesis_MechanisticHypothesis();

  /**
   * Returns the meta object for class '{@link org.xtext.DOE.experimentOntology.Evidence <em>Evidence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Evidence</em>'.
   * @see org.xtext.DOE.experimentOntology.Evidence
   * @generated
   */
  EClass getEvidence();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Evidence#getEName <em>EName</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>EName</em>'.
   * @see org.xtext.DOE.experimentOntology.Evidence#getEName()
   * @see #getEvidence()
   * @generated
   */
  EAttribute getEvidence_EName();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.DOE.experimentOntology.Evidence#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Query</em>'.
   * @see org.xtext.DOE.experimentOntology.Evidence#getQuery()
   * @see #getEvidence()
   * @generated
   */
  EReference getEvidence_Query();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Evidence#getObjOfStudy <em>Obj Of Study</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Obj Of Study</em>'.
   * @see org.xtext.DOE.experimentOntology.Evidence#getObjOfStudy()
   * @see #getEvidence()
   * @generated
   */
  EAttribute getEvidence_ObjOfStudy();

  /**
   * Returns the meta object for class '{@link org.xtext.DOE.experimentOntology.TemporalPattern <em>Temporal Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Temporal Pattern</em>'.
   * @see org.xtext.DOE.experimentOntology.TemporalPattern
   * @generated
   */
  EClass getTemporalPattern();

  /**
   * Returns the meta object for class '{@link org.xtext.DOE.experimentOntology.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see org.xtext.DOE.experimentOntology.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.DOE.experimentOntology.Condition#getL2 <em>L2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>L2</em>'.
   * @see org.xtext.DOE.experimentOntology.Condition#getL2()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_L2();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.DOE.experimentOntology.Condition#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Exp</em>'.
   * @see org.xtext.DOE.experimentOntology.Condition#getExp()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_Exp();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.DOE.experimentOntology.Condition#getOp1 <em>Op1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Op1</em>'.
   * @see org.xtext.DOE.experimentOntology.Condition#getOp1()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_Op1();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.DOE.experimentOntology.Condition#getOp2 <em>Op2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Op2</em>'.
   * @see org.xtext.DOE.experimentOntology.Condition#getOp2()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_Op2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Condition#getL3 <em>L3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>L3</em>'.
   * @see org.xtext.DOE.experimentOntology.Condition#getL3()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_L3();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.DOE.experimentOntology.Condition#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.xtext.DOE.experimentOntology.Condition#getCondition()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_Condition();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Condition#getLo <em>Lo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lo</em>'.
   * @see org.xtext.DOE.experimentOntology.Condition#getLo()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_Lo();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.DOE.experimentOntology.Condition#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E</em>'.
   * @see org.xtext.DOE.experimentOntology.Condition#getE()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_E();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Condition#getExp1 <em>Exp1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exp1</em>'.
   * @see org.xtext.DOE.experimentOntology.Condition#getExp1()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_Exp1();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Condition#getV <em>V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>V</em>'.
   * @see org.xtext.DOE.experimentOntology.Condition#getV()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_V();

  /**
   * Returns the meta object for class '{@link org.xtext.DOE.experimentOntology.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see org.xtext.DOE.experimentOntology.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for class '{@link org.xtext.DOE.experimentOntology.Simultaneous <em>Simultaneous</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simultaneous</em>'.
   * @see org.xtext.DOE.experimentOntology.Simultaneous
   * @generated
   */
  EClass getSimultaneous();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Simultaneous#getSim1 <em>Sim1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sim1</em>'.
   * @see org.xtext.DOE.experimentOntology.Simultaneous#getSim1()
   * @see #getSimultaneous()
   * @generated
   */
  EAttribute getSimultaneous_Sim1();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.DOE.experimentOntology.Simultaneous#getLog <em>Log</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Log</em>'.
   * @see org.xtext.DOE.experimentOntology.Simultaneous#getLog()
   * @see #getSimultaneous()
   * @generated
   */
  EAttribute getSimultaneous_Log();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.DOE.experimentOntology.Simultaneous#getSim2 <em>Sim2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Sim2</em>'.
   * @see org.xtext.DOE.experimentOntology.Simultaneous#getSim2()
   * @see #getSimultaneous()
   * @generated
   */
  EAttribute getSimultaneous_Sim2();

  /**
   * Returns the meta object for class '{@link org.xtext.DOE.experimentOntology.Dispersed <em>Dispersed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dispersed</em>'.
   * @see org.xtext.DOE.experimentOntology.Dispersed
   * @generated
   */
  EClass getDispersed();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.DOE.experimentOntology.Dispersed#getDisp <em>Disp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Disp</em>'.
   * @see org.xtext.DOE.experimentOntology.Dispersed#getDisp()
   * @see #getDispersed()
   * @generated
   */
  EAttribute getDispersed_Disp();

  /**
   * Returns the meta object for class '{@link org.xtext.DOE.experimentOntology.RelationalQuery <em>Relational Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relational Query</em>'.
   * @see org.xtext.DOE.experimentOntology.RelationalQuery
   * @generated
   */
  EClass getRelationalQuery();

  /**
   * Returns the meta object for class '{@link org.xtext.DOE.experimentOntology.Query1 <em>Query1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query1</em>'.
   * @see org.xtext.DOE.experimentOntology.Query1
   * @generated
   */
  EClass getQuery1();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Query1#getFactor <em>Factor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Factor</em>'.
   * @see org.xtext.DOE.experimentOntology.Query1#getFactor()
   * @see #getQuery1()
   * @generated
   */
  EAttribute getQuery1_Factor();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Query1#getControl <em>Control</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Control</em>'.
   * @see org.xtext.DOE.experimentOntology.Query1#getControl()
   * @see #getQuery1()
   * @generated
   */
  EAttribute getQuery1_Control();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Query1#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.xtext.DOE.experimentOntology.Query1#getX()
   * @see #getQuery1()
   * @generated
   */
  EAttribute getQuery1_X();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Query1#getStart1 <em>Start1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start1</em>'.
   * @see org.xtext.DOE.experimentOntology.Query1#getStart1()
   * @see #getQuery1()
   * @generated
   */
  EAttribute getQuery1_Start1();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Query1#getEnd1 <em>End1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End1</em>'.
   * @see org.xtext.DOE.experimentOntology.Query1#getEnd1()
   * @see #getQuery1()
   * @generated
   */
  EAttribute getQuery1_End1();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Query1#getResponse <em>Response</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Response</em>'.
   * @see org.xtext.DOE.experimentOntology.Query1#getResponse()
   * @see #getQuery1()
   * @generated
   */
  EAttribute getQuery1_Response();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Query1#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see org.xtext.DOE.experimentOntology.Query1#getY()
   * @see #getQuery1()
   * @generated
   */
  EAttribute getQuery1_Y();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Query1#getStart2 <em>Start2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start2</em>'.
   * @see org.xtext.DOE.experimentOntology.Query1#getStart2()
   * @see #getQuery1()
   * @generated
   */
  EAttribute getQuery1_Start2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Query1#getEnd2 <em>End2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End2</em>'.
   * @see org.xtext.DOE.experimentOntology.Query1#getEnd2()
   * @see #getQuery1()
   * @generated
   */
  EAttribute getQuery1_End2();

  /**
   * Returns the meta object for class '{@link org.xtext.DOE.experimentOntology.Query2 <em>Query2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query2</em>'.
   * @see org.xtext.DOE.experimentOntology.Query2
   * @generated
   */
  EClass getQuery2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Query2#getFunction1 <em>Function1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Function1</em>'.
   * @see org.xtext.DOE.experimentOntology.Query2#getFunction1()
   * @see #getQuery2()
   * @generated
   */
  EAttribute getQuery2_Function1();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Query2#getResponse1 <em>Response1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Response1</em>'.
   * @see org.xtext.DOE.experimentOntology.Query2#getResponse1()
   * @see #getQuery2()
   * @generated
   */
  EAttribute getQuery2_Response1();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Query2#getFactor1 <em>Factor1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Factor1</em>'.
   * @see org.xtext.DOE.experimentOntology.Query2#getFactor1()
   * @see #getQuery2()
   * @generated
   */
  EAttribute getQuery2_Factor1();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Query2#getFunction2 <em>Function2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Function2</em>'.
   * @see org.xtext.DOE.experimentOntology.Query2#getFunction2()
   * @see #getQuery2()
   * @generated
   */
  EAttribute getQuery2_Function2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Query2#getResponse2 <em>Response2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Response2</em>'.
   * @see org.xtext.DOE.experimentOntology.Query2#getResponse2()
   * @see #getQuery2()
   * @generated
   */
  EAttribute getQuery2_Response2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Query2#getFactor2 <em>Factor2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Factor2</em>'.
   * @see org.xtext.DOE.experimentOntology.Query2#getFactor2()
   * @see #getQuery2()
   * @generated
   */
  EAttribute getQuery2_Factor2();

  /**
   * Returns the meta object for class '{@link org.xtext.DOE.experimentOntology.Query3 <em>Query3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query3</em>'.
   * @see org.xtext.DOE.experimentOntology.Query3
   * @generated
   */
  EClass getQuery3();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Query3#getFactor1 <em>Factor1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Factor1</em>'.
   * @see org.xtext.DOE.experimentOntology.Query3#getFactor1()
   * @see #getQuery3()
   * @generated
   */
  EAttribute getQuery3_Factor1();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Query3#getControl1 <em>Control1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Control1</em>'.
   * @see org.xtext.DOE.experimentOntology.Query3#getControl1()
   * @see #getQuery3()
   * @generated
   */
  EAttribute getQuery3_Control1();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Query3#getLevel2 <em>Level2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Level2</em>'.
   * @see org.xtext.DOE.experimentOntology.Query3#getLevel2()
   * @see #getQuery3()
   * @generated
   */
  EAttribute getQuery3_Level2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Query3#getX2 <em>X2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X2</em>'.
   * @see org.xtext.DOE.experimentOntology.Query3#getX2()
   * @see #getQuery3()
   * @generated
   */
  EAttribute getQuery3_X2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Query3#getResponse1 <em>Response1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Response1</em>'.
   * @see org.xtext.DOE.experimentOntology.Query3#getResponse1()
   * @see #getQuery3()
   * @generated
   */
  EAttribute getQuery3_Response1();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Query3#getLevel4 <em>Level4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Level4</em>'.
   * @see org.xtext.DOE.experimentOntology.Query3#getLevel4()
   * @see #getQuery3()
   * @generated
   */
  EAttribute getQuery3_Level4();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Query3#getX4 <em>X4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X4</em>'.
   * @see org.xtext.DOE.experimentOntology.Query3#getX4()
   * @see #getQuery3()
   * @generated
   */
  EAttribute getQuery3_X4();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Query3#getLevel <em>Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Level</em>'.
   * @see org.xtext.DOE.experimentOntology.Query3#getLevel()
   * @see #getQuery3()
   * @generated
   */
  EAttribute getQuery3_Level();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Query3#getFactor <em>Factor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Factor</em>'.
   * @see org.xtext.DOE.experimentOntology.Query3#getFactor()
   * @see #getQuery3()
   * @generated
   */
  EAttribute getQuery3_Factor();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Query3#getControl <em>Control</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Control</em>'.
   * @see org.xtext.DOE.experimentOntology.Query3#getControl()
   * @see #getQuery3()
   * @generated
   */
  EAttribute getQuery3_Control();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Query3#getResponse <em>Response</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Response</em>'.
   * @see org.xtext.DOE.experimentOntology.Query3#getResponse()
   * @see #getQuery3()
   * @generated
   */
  EAttribute getQuery3_Response();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Query3#getStart1 <em>Start1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start1</em>'.
   * @see org.xtext.DOE.experimentOntology.Query3#getStart1()
   * @see #getQuery3()
   * @generated
   */
  EAttribute getQuery3_Start1();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Query3#getEnd1 <em>End1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End1</em>'.
   * @see org.xtext.DOE.experimentOntology.Query3#getEnd1()
   * @see #getQuery3()
   * @generated
   */
  EAttribute getQuery3_End1();

  /**
   * Returns the meta object for class '{@link org.xtext.DOE.experimentOntology.Experiment <em>Experiment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Experiment</em>'.
   * @see org.xtext.DOE.experimentOntology.Experiment
   * @generated
   */
  EClass getExperiment();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Experiment#getExpName <em>Exp Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exp Name</em>'.
   * @see org.xtext.DOE.experimentOntology.Experiment#getExpName()
   * @see #getExperiment()
   * @generated
   */
  EAttribute getExperiment_ExpName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.DOE.experimentOntology.Experiment#getExpDesign <em>Exp Design</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp Design</em>'.
   * @see org.xtext.DOE.experimentOntology.Experiment#getExpDesign()
   * @see #getExperiment()
   * @generated
   */
  EReference getExperiment_ExpDesign();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.DOE.experimentOntology.Experiment#getPerfMeasure <em>Perf Measure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Perf Measure</em>'.
   * @see org.xtext.DOE.experimentOntology.Experiment#getPerfMeasure()
   * @see #getExperiment()
   * @generated
   */
  EReference getExperiment_PerfMeasure();

  /**
   * Returns the meta object for class '{@link org.xtext.DOE.experimentOntology.Design <em>Design</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Design</em>'.
   * @see org.xtext.DOE.experimentOntology.Design
   * @generated
   */
  EClass getDesign();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Design#getDesignType <em>Design Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Design Type</em>'.
   * @see org.xtext.DOE.experimentOntology.Design#getDesignType()
   * @see #getDesign()
   * @generated
   */
  EAttribute getDesign_DesignType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Design#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Constraint</em>'.
   * @see org.xtext.DOE.experimentOntology.Design#getConstraint()
   * @see #getDesign()
   * @generated
   */
  EAttribute getDesign_Constraint();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.DOE.experimentOntology.Design#getIteration <em>Iteration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Iteration</em>'.
   * @see org.xtext.DOE.experimentOntology.Design#getIteration()
   * @see #getDesign()
   * @generated
   */
  EReference getDesign_Iteration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.DOE.experimentOntology.Design#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variables</em>'.
   * @see org.xtext.DOE.experimentOntology.Design#getVariables()
   * @see #getDesign()
   * @generated
   */
  EReference getDesign_Variables();

  /**
   * Returns the meta object for class '{@link org.xtext.DOE.experimentOntology.Variables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variables</em>'.
   * @see org.xtext.DOE.experimentOntology.Variables
   * @generated
   */
  EClass getVariables();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.DOE.experimentOntology.Variables#getIndependentVariables <em>Independent Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Independent Variables</em>'.
   * @see org.xtext.DOE.experimentOntology.Variables#getIndependentVariables()
   * @see #getVariables()
   * @generated
   */
  EReference getVariables_IndependentVariables();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.DOE.experimentOntology.Variables#getControlVariables <em>Control Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Control Variables</em>'.
   * @see org.xtext.DOE.experimentOntology.Variables#getControlVariables()
   * @see #getVariables()
   * @generated
   */
  EReference getVariables_ControlVariables();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.DOE.experimentOntology.Variables#getDependentVariables <em>Dependent Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dependent Variables</em>'.
   * @see org.xtext.DOE.experimentOntology.Variables#getDependentVariables()
   * @see #getVariables()
   * @generated
   */
  EReference getVariables_DependentVariables();

  /**
   * Returns the meta object for class '{@link org.xtext.DOE.experimentOntology.IndependentVariables <em>Independent Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Independent Variables</em>'.
   * @see org.xtext.DOE.experimentOntology.IndependentVariables
   * @generated
   */
  EClass getIndependentVariables();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.DOE.experimentOntology.IndependentVariables#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see org.xtext.DOE.experimentOntology.IndependentVariables#getVariables()
   * @see #getIndependentVariables()
   * @generated
   */
  EReference getIndependentVariables_Variables();

  /**
   * Returns the meta object for class '{@link org.xtext.DOE.experimentOntology.ControlVariables <em>Control Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Control Variables</em>'.
   * @see org.xtext.DOE.experimentOntology.ControlVariables
   * @generated
   */
  EClass getControlVariables();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.ControlVariables#getControlName <em>Control Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Control Name</em>'.
   * @see org.xtext.DOE.experimentOntology.ControlVariables#getControlName()
   * @see #getControlVariables()
   * @generated
   */
  EAttribute getControlVariables_ControlName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.ControlVariables#getControlType <em>Control Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Control Type</em>'.
   * @see org.xtext.DOE.experimentOntology.ControlVariables#getControlType()
   * @see #getControlVariables()
   * @generated
   */
  EAttribute getControlVariables_ControlType();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.DOE.experimentOntology.ControlVariables#getControlValue <em>Control Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Control Value</em>'.
   * @see org.xtext.DOE.experimentOntology.ControlVariables#getControlValue()
   * @see #getControlVariables()
   * @generated
   */
  EReference getControlVariables_ControlValue();

  /**
   * Returns the meta object for class '{@link org.xtext.DOE.experimentOntology.DependentVariables <em>Dependent Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dependent Variables</em>'.
   * @see org.xtext.DOE.experimentOntology.DependentVariables
   * @generated
   */
  EClass getDependentVariables();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.DOE.experimentOntology.DependentVariables#getResponseName <em>Response Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Response Name</em>'.
   * @see org.xtext.DOE.experimentOntology.DependentVariables#getResponseName()
   * @see #getDependentVariables()
   * @generated
   */
  EReference getDependentVariables_ResponseName();

  /**
   * Returns the meta object for class '{@link org.xtext.DOE.experimentOntology.FactorLevels <em>Factor Levels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Factor Levels</em>'.
   * @see org.xtext.DOE.experimentOntology.FactorLevels
   * @generated
   */
  EClass getFactorLevels();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.FactorLevels#getFacName <em>Fac Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fac Name</em>'.
   * @see org.xtext.DOE.experimentOntology.FactorLevels#getFacName()
   * @see #getFactorLevels()
   * @generated
   */
  EAttribute getFactorLevels_FacName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.FactorLevels#getL <em>L</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>L</em>'.
   * @see org.xtext.DOE.experimentOntology.FactorLevels#getL()
   * @see #getFactorLevels()
   * @generated
   */
  EAttribute getFactorLevels_L();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.FactorLevels#getL1 <em>L1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>L1</em>'.
   * @see org.xtext.DOE.experimentOntology.FactorLevels#getL1()
   * @see #getFactorLevels()
   * @generated
   */
  EAttribute getFactorLevels_L1();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.FactorLevels#getL2 <em>L2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>L2</em>'.
   * @see org.xtext.DOE.experimentOntology.FactorLevels#getL2()
   * @see #getFactorLevels()
   * @generated
   */
  EAttribute getFactorLevels_L2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.FactorLevels#getStart1 <em>Start1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start1</em>'.
   * @see org.xtext.DOE.experimentOntology.FactorLevels#getStart1()
   * @see #getFactorLevels()
   * @generated
   */
  EAttribute getFactorLevels_Start1();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.FactorLevels#getEnd1 <em>End1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End1</em>'.
   * @see org.xtext.DOE.experimentOntology.FactorLevels#getEnd1()
   * @see #getFactorLevels()
   * @generated
   */
  EAttribute getFactorLevels_End1();

  /**
   * Returns the meta object for class '{@link org.xtext.DOE.experimentOntology.Response <em>Response</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Response</em>'.
   * @see org.xtext.DOE.experimentOntology.Response
   * @generated
   */
  EClass getResponse();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Response#getResponseName <em>Response Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Response Name</em>'.
   * @see org.xtext.DOE.experimentOntology.Response#getResponseName()
   * @see #getResponse()
   * @generated
   */
  EAttribute getResponse_ResponseName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Response#getResponseType <em>Response Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Response Type</em>'.
   * @see org.xtext.DOE.experimentOntology.Response#getResponseType()
   * @see #getResponse()
   * @generated
   */
  EAttribute getResponse_ResponseType();

  /**
   * Returns the meta object for class '{@link org.xtext.DOE.experimentOntology.Iteration <em>Iteration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Iteration</em>'.
   * @see org.xtext.DOE.experimentOntology.Iteration
   * @generated
   */
  EClass getIteration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.Iteration#getIterations <em>Iterations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Iterations</em>'.
   * @see org.xtext.DOE.experimentOntology.Iteration#getIterations()
   * @see #getIteration()
   * @generated
   */
  EAttribute getIteration_Iterations();

  /**
   * Returns the meta object for class '{@link org.xtext.DOE.experimentOntology.PerformanceMeasure <em>Performance Measure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Performance Measure</em>'.
   * @see org.xtext.DOE.experimentOntology.PerformanceMeasure
   * @generated
   */
  EClass getPerformanceMeasure();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.PerformanceMeasure#getExpectedResponse <em>Expected Response</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expected Response</em>'.
   * @see org.xtext.DOE.experimentOntology.PerformanceMeasure#getExpectedResponse()
   * @see #getPerformanceMeasure()
   * @generated
   */
  EAttribute getPerformanceMeasure_ExpectedResponse();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.PerformanceMeasure#getEr <em>Er</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Er</em>'.
   * @see org.xtext.DOE.experimentOntology.PerformanceMeasure#getEr()
   * @see #getPerformanceMeasure()
   * @generated
   */
  EAttribute getPerformanceMeasure_Er();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.DOE.experimentOntology.PerformanceMeasure#getStd <em>Std</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Std</em>'.
   * @see org.xtext.DOE.experimentOntology.PerformanceMeasure#getStd()
   * @see #getPerformanceMeasure()
   * @generated
   */
  EAttribute getPerformanceMeasure_Std();

  /**
   * Returns the meta object for enum '{@link org.xtext.DOE.experimentOntology.VariableType <em>Variable Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Variable Type</em>'.
   * @see org.xtext.DOE.experimentOntology.VariableType
   * @generated
   */
  EEnum getVariableType();

  /**
   * Returns the meta object for enum '{@link org.xtext.DOE.experimentOntology.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Expression</em>'.
   * @see org.xtext.DOE.experimentOntology.Expression
   * @generated
   */
  EEnum getExpression();

  /**
   * Returns the meta object for enum '{@link org.xtext.DOE.experimentOntology.Links <em>Links</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Links</em>'.
   * @see org.xtext.DOE.experimentOntology.Links
   * @generated
   */
  EEnum getLinks();

  /**
   * Returns the meta object for enum '{@link org.xtext.DOE.experimentOntology.Temporal <em>Temporal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Temporal</em>'.
   * @see org.xtext.DOE.experimentOntology.Temporal
   * @generated
   */
  EEnum getTemporal();

  /**
   * Returns the meta object for enum '{@link org.xtext.DOE.experimentOntology.Logical <em>Logical</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Logical</em>'.
   * @see org.xtext.DOE.experimentOntology.Logical
   * @generated
   */
  EEnum getLogical();

  /**
   * Returns the meta object for enum '{@link org.xtext.DOE.experimentOntology.Coherence <em>Coherence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Coherence</em>'.
   * @see org.xtext.DOE.experimentOntology.Coherence
   * @generated
   */
  EEnum getCoherence();

  /**
   * Returns the meta object for enum '{@link org.xtext.DOE.experimentOntology.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Function</em>'.
   * @see org.xtext.DOE.experimentOntology.Function
   * @generated
   */
  EEnum getFunction();

  /**
   * Returns the meta object for enum '{@link org.xtext.DOE.experimentOntology.Changes <em>Changes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Changes</em>'.
   * @see org.xtext.DOE.experimentOntology.Changes
   * @generated
   */
  EEnum getChanges();

  /**
   * Returns the meta object for enum '{@link org.xtext.DOE.experimentOntology.Levels <em>Levels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Levels</em>'.
   * @see org.xtext.DOE.experimentOntology.Levels
   * @generated
   */
  EEnum getLevels();

  /**
   * Returns the meta object for enum '{@link org.xtext.DOE.experimentOntology.DesignType <em>Design Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Design Type</em>'.
   * @see org.xtext.DOE.experimentOntology.DesignType
   * @generated
   */
  EEnum getDesignType();

  /**
   * Returns the meta object for enum '{@link org.xtext.DOE.experimentOntology.ResponseType <em>Response Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Response Type</em>'.
   * @see org.xtext.DOE.experimentOntology.ResponseType
   * @generated
   */
  EEnum getResponseType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ExperimentOntologyFactory getExperimentOntologyFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.impl.ModelImpl
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.impl.ExperimentOntologyImpl <em>Experiment Ontology</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyImpl
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getExperimentOntology()
     * @generated
     */
    EClass EXPERIMENT_ONTOLOGY = eINSTANCE.getExperimentOntology();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.impl.ModelSectionImpl <em>Model Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.impl.ModelSectionImpl
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getModelSection()
     * @generated
     */
    EClass MODEL_SECTION = eINSTANCE.getModelSection();

    /**
     * The meta object literal for the '<em><b>Mod Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL_SECTION__MOD_NAME = eINSTANCE.getModelSection_ModName();

    /**
     * The meta object literal for the '<em><b>Mechanisms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_SECTION__MECHANISMS = eINSTANCE.getModelSection_Mechanisms();

    /**
     * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_SECTION__EVENTS = eINSTANCE.getModelSection_Events();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_SECTION__PARAMETERS = eINSTANCE.getModelSection_Parameters();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.impl.MechanismImpl <em>Mechanism</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.impl.MechanismImpl
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getMechanism()
     * @generated
     */
    EClass MECHANISM = eINSTANCE.getMechanism();

    /**
     * The meta object literal for the '<em><b>Mechanism Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MECHANISM__MECHANISM_NAME = eINSTANCE.getMechanism_MechanismName();

    /**
     * The meta object literal for the '<em><b>LHS</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MECHANISM__LHS = eINSTANCE.getMechanism_LHS();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MECHANISM__CONDITION = eINSTANCE.getMechanism_Condition();

    /**
     * The meta object literal for the '<em><b>RHS</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MECHANISM__RHS = eINSTANCE.getMechanism_RHS();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.impl.ReactionImpl <em>Reaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.impl.ReactionImpl
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getReaction()
     * @generated
     */
    EClass REACTION = eINSTANCE.getReaction();

    /**
     * The meta object literal for the '<em><b>Agent1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REACTION__AGENT1 = eINSTANCE.getReaction_Agent1();

    /**
     * The meta object literal for the '<em><b>Agent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REACTION__AGENT = eINSTANCE.getReaction_Agent();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.impl.GuardConditionImpl <em>Guard Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.impl.GuardConditionImpl
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getGuardCondition()
     * @generated
     */
    EClass GUARD_CONDITION = eINSTANCE.getGuardCondition();

    /**
     * The meta object literal for the '<em><b>Gd</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GUARD_CONDITION__GD = eINSTANCE.getGuardCondition_Gd();

    /**
     * The meta object literal for the '<em><b>Condition1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GUARD_CONDITION__CONDITION1 = eINSTANCE.getGuardCondition_Condition1();

    /**
     * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GUARD_CONDITION__LINK = eINSTANCE.getGuardCondition_Link();

    /**
     * The meta object literal for the '<em><b>Condition2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GUARD_CONDITION__CONDITION2 = eINSTANCE.getGuardCondition_Condition2();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.impl.EventDescriptorImpl <em>Event Descriptor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.impl.EventDescriptorImpl
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getEventDescriptor()
     * @generated
     */
    EClass EVENT_DESCRIPTOR = eINSTANCE.getEventDescriptor();

    /**
     * The meta object literal for the '<em><b>Event Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT_DESCRIPTOR__EVENT_NAME = eINSTANCE.getEventDescriptor_EventName();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT_DESCRIPTOR__EVENT = eINSTANCE.getEventDescriptor_Event();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.impl.FactorImpl <em>Factor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.impl.FactorImpl
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getFactor()
     * @generated
     */
    EClass FACTOR = eINSTANCE.getFactor();

    /**
     * The meta object literal for the '<em><b>Factor Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FACTOR__FACTOR_NAME = eINSTANCE.getFactor_FactorName();

    /**
     * The meta object literal for the '<em><b>Factor Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FACTOR__FACTOR_TYPE = eINSTANCE.getFactor_FactorType();

    /**
     * The meta object literal for the '<em><b>Factor Type1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FACTOR__FACTOR_TYPE1 = eINSTANCE.getFactor_FactorType1();

    /**
     * The meta object literal for the '<em><b>Factor Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACTOR__FACTOR_VALUE = eINSTANCE.getFactor_FactorValue();

    /**
     * The meta object literal for the '<em><b>Factor Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACTOR__FACTOR_PROPERTIES = eINSTANCE.getFactor_FactorProperties();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.impl.propertiesImpl <em>properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.impl.propertiesImpl
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getproperties()
     * @generated
     */
    EClass PROPERTIES = eINSTANCE.getproperties();

    /**
     * The meta object literal for the '<em><b>PName</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTIES__PNAME = eINSTANCE.getproperties_PName();

    /**
     * The meta object literal for the '<em><b>PVal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTIES__PVAL = eINSTANCE.getproperties_PVal();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.impl.ValuesImpl <em>Values</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.impl.ValuesImpl
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getValues()
     * @generated
     */
    EClass VALUES = eINSTANCE.getValues();

    /**
     * The meta object literal for the '<em><b>FVal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUES__FVAL = eINSTANCE.getValues_FVal();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUES__FUNCTION = eINSTANCE.getValues_Function();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUES__VALUE = eINSTANCE.getValues_Value();

    /**
     * The meta object literal for the '<em><b>Fvalue</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUES__FVALUE = eINSTANCE.getValues_Fvalue();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.impl.GoalsImpl <em>Goals</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.impl.GoalsImpl
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getGoals()
     * @generated
     */
    EClass GOALS = eINSTANCE.getGoals();

    /**
     * The meta object literal for the '<em><b>Obj Of Study</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOALS__OBJ_OF_STUDY = eINSTANCE.getGoals_ObjOfStudy();

    /**
     * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOALS__PURPOSE = eINSTANCE.getGoals_Purpose();

    /**
     * The meta object literal for the '<em><b>Focus</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOALS__FOCUS = eINSTANCE.getGoals_Focus();

    /**
     * The meta object literal for the '<em><b>View Point</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOALS__VIEW_POINT = eINSTANCE.getGoals_ViewPoint();

    /**
     * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOALS__CONTEXT = eINSTANCE.getGoals_Context();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.impl.HypothesisImpl <em>Hypothesis</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.impl.HypothesisImpl
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getHypothesis()
     * @generated
     */
    EClass HYPOTHESIS = eINSTANCE.getHypothesis();

    /**
     * The meta object literal for the '<em><b>Mech Hypothesis</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HYPOTHESIS__MECH_HYPOTHESIS = eINSTANCE.getHypothesis_MechHypothesis();

    /**
     * The meta object literal for the '<em><b>Evidences</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HYPOTHESIS__EVIDENCES = eINSTANCE.getHypothesis_Evidences();

    /**
     * The meta object literal for the '<em><b>Coherence Links</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HYPOTHESIS__COHERENCE_LINKS = eINSTANCE.getHypothesis_CoherenceLinks();

    /**
     * The meta object literal for the '<em><b>Rel Hypothesis</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HYPOTHESIS__REL_HYPOTHESIS = eINSTANCE.getHypothesis_RelHypothesis();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.impl.CoherenceLinkImpl <em>Coherence Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.impl.CoherenceLinkImpl
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getCoherenceLink()
     * @generated
     */
    EClass COHERENCE_LINK = eINSTANCE.getCoherenceLink();

    /**
     * The meta object literal for the '<em><b>Coherence</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COHERENCE_LINK__COHERENCE = eINSTANCE.getCoherenceLink_Coherence();

    /**
     * The meta object literal for the '<em><b>Hyp</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COHERENCE_LINK__HYP = eINSTANCE.getCoherenceLink_Hyp();

    /**
     * The meta object literal for the '<em><b>Evi</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COHERENCE_LINK__EVI = eINSTANCE.getCoherenceLink_Evi();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.impl.MechHypothesisImpl <em>Mech Hypothesis</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.impl.MechHypothesisImpl
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getMechHypothesis()
     * @generated
     */
    EClass MECH_HYPOTHESIS = eINSTANCE.getMechHypothesis();

    /**
     * The meta object literal for the '<em><b>MName</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MECH_HYPOTHESIS__MNAME = eINSTANCE.getMechHypothesis_MName();

    /**
     * The meta object literal for the '<em><b>Asso Mech</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MECH_HYPOTHESIS__ASSO_MECH = eINSTANCE.getMechHypothesis_AssoMech();

    /**
     * The meta object literal for the '<em><b>Mechanistic Hypothesis</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MECH_HYPOTHESIS__MECHANISTIC_HYPOTHESIS = eINSTANCE.getMechHypothesis_MechanisticHypothesis();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.impl.EvidenceImpl <em>Evidence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.impl.EvidenceImpl
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getEvidence()
     * @generated
     */
    EClass EVIDENCE = eINSTANCE.getEvidence();

    /**
     * The meta object literal for the '<em><b>EName</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVIDENCE__ENAME = eINSTANCE.getEvidence_EName();

    /**
     * The meta object literal for the '<em><b>Query</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVIDENCE__QUERY = eINSTANCE.getEvidence_Query();

    /**
     * The meta object literal for the '<em><b>Obj Of Study</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVIDENCE__OBJ_OF_STUDY = eINSTANCE.getEvidence_ObjOfStudy();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.impl.TemporalPatternImpl <em>Temporal Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.impl.TemporalPatternImpl
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getTemporalPattern()
     * @generated
     */
    EClass TEMPORAL_PATTERN = eINSTANCE.getTemporalPattern();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.impl.ConditionImpl
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '<em><b>L2</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__L2 = eINSTANCE.getCondition_L2();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__EXP = eINSTANCE.getCondition_Exp();

    /**
     * The meta object literal for the '<em><b>Op1</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__OP1 = eINSTANCE.getCondition_Op1();

    /**
     * The meta object literal for the '<em><b>Op2</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__OP2 = eINSTANCE.getCondition_Op2();

    /**
     * The meta object literal for the '<em><b>L3</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__L3 = eINSTANCE.getCondition_L3();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__CONDITION = eINSTANCE.getCondition_Condition();

    /**
     * The meta object literal for the '<em><b>Lo</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__LO = eINSTANCE.getCondition_Lo();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__E = eINSTANCE.getCondition_E();

    /**
     * The meta object literal for the '<em><b>Exp1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__EXP1 = eINSTANCE.getCondition_Exp1();

    /**
     * The meta object literal for the '<em><b>V</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__V = eINSTANCE.getCondition_V();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.impl.EventImpl
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.impl.SimultaneousImpl <em>Simultaneous</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.impl.SimultaneousImpl
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getSimultaneous()
     * @generated
     */
    EClass SIMULTANEOUS = eINSTANCE.getSimultaneous();

    /**
     * The meta object literal for the '<em><b>Sim1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMULTANEOUS__SIM1 = eINSTANCE.getSimultaneous_Sim1();

    /**
     * The meta object literal for the '<em><b>Log</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMULTANEOUS__LOG = eINSTANCE.getSimultaneous_Log();

    /**
     * The meta object literal for the '<em><b>Sim2</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMULTANEOUS__SIM2 = eINSTANCE.getSimultaneous_Sim2();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.impl.DispersedImpl <em>Dispersed</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.impl.DispersedImpl
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getDispersed()
     * @generated
     */
    EClass DISPERSED = eINSTANCE.getDispersed();

    /**
     * The meta object literal for the '<em><b>Disp</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DISPERSED__DISP = eINSTANCE.getDispersed_Disp();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.impl.RelationalQueryImpl <em>Relational Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.impl.RelationalQueryImpl
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getRelationalQuery()
     * @generated
     */
    EClass RELATIONAL_QUERY = eINSTANCE.getRelationalQuery();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.impl.Query1Impl <em>Query1</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.impl.Query1Impl
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getQuery1()
     * @generated
     */
    EClass QUERY1 = eINSTANCE.getQuery1();

    /**
     * The meta object literal for the '<em><b>Factor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY1__FACTOR = eINSTANCE.getQuery1_Factor();

    /**
     * The meta object literal for the '<em><b>Control</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY1__CONTROL = eINSTANCE.getQuery1_Control();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY1__X = eINSTANCE.getQuery1_X();

    /**
     * The meta object literal for the '<em><b>Start1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY1__START1 = eINSTANCE.getQuery1_Start1();

    /**
     * The meta object literal for the '<em><b>End1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY1__END1 = eINSTANCE.getQuery1_End1();

    /**
     * The meta object literal for the '<em><b>Response</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY1__RESPONSE = eINSTANCE.getQuery1_Response();

    /**
     * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY1__Y = eINSTANCE.getQuery1_Y();

    /**
     * The meta object literal for the '<em><b>Start2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY1__START2 = eINSTANCE.getQuery1_Start2();

    /**
     * The meta object literal for the '<em><b>End2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY1__END2 = eINSTANCE.getQuery1_End2();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.impl.Query2Impl <em>Query2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.impl.Query2Impl
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getQuery2()
     * @generated
     */
    EClass QUERY2 = eINSTANCE.getQuery2();

    /**
     * The meta object literal for the '<em><b>Function1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY2__FUNCTION1 = eINSTANCE.getQuery2_Function1();

    /**
     * The meta object literal for the '<em><b>Response1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY2__RESPONSE1 = eINSTANCE.getQuery2_Response1();

    /**
     * The meta object literal for the '<em><b>Factor1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY2__FACTOR1 = eINSTANCE.getQuery2_Factor1();

    /**
     * The meta object literal for the '<em><b>Function2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY2__FUNCTION2 = eINSTANCE.getQuery2_Function2();

    /**
     * The meta object literal for the '<em><b>Response2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY2__RESPONSE2 = eINSTANCE.getQuery2_Response2();

    /**
     * The meta object literal for the '<em><b>Factor2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY2__FACTOR2 = eINSTANCE.getQuery2_Factor2();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.impl.Query3Impl <em>Query3</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.impl.Query3Impl
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getQuery3()
     * @generated
     */
    EClass QUERY3 = eINSTANCE.getQuery3();

    /**
     * The meta object literal for the '<em><b>Factor1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY3__FACTOR1 = eINSTANCE.getQuery3_Factor1();

    /**
     * The meta object literal for the '<em><b>Control1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY3__CONTROL1 = eINSTANCE.getQuery3_Control1();

    /**
     * The meta object literal for the '<em><b>Level2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY3__LEVEL2 = eINSTANCE.getQuery3_Level2();

    /**
     * The meta object literal for the '<em><b>X2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY3__X2 = eINSTANCE.getQuery3_X2();

    /**
     * The meta object literal for the '<em><b>Response1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY3__RESPONSE1 = eINSTANCE.getQuery3_Response1();

    /**
     * The meta object literal for the '<em><b>Level4</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY3__LEVEL4 = eINSTANCE.getQuery3_Level4();

    /**
     * The meta object literal for the '<em><b>X4</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY3__X4 = eINSTANCE.getQuery3_X4();

    /**
     * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY3__LEVEL = eINSTANCE.getQuery3_Level();

    /**
     * The meta object literal for the '<em><b>Factor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY3__FACTOR = eINSTANCE.getQuery3_Factor();

    /**
     * The meta object literal for the '<em><b>Control</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY3__CONTROL = eINSTANCE.getQuery3_Control();

    /**
     * The meta object literal for the '<em><b>Response</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY3__RESPONSE = eINSTANCE.getQuery3_Response();

    /**
     * The meta object literal for the '<em><b>Start1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY3__START1 = eINSTANCE.getQuery3_Start1();

    /**
     * The meta object literal for the '<em><b>End1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY3__END1 = eINSTANCE.getQuery3_End1();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.impl.ExperimentImpl <em>Experiment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentImpl
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getExperiment()
     * @generated
     */
    EClass EXPERIMENT = eINSTANCE.getExperiment();

    /**
     * The meta object literal for the '<em><b>Exp Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPERIMENT__EXP_NAME = eINSTANCE.getExperiment_ExpName();

    /**
     * The meta object literal for the '<em><b>Exp Design</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPERIMENT__EXP_DESIGN = eINSTANCE.getExperiment_ExpDesign();

    /**
     * The meta object literal for the '<em><b>Perf Measure</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPERIMENT__PERF_MEASURE = eINSTANCE.getExperiment_PerfMeasure();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.impl.DesignImpl <em>Design</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.impl.DesignImpl
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getDesign()
     * @generated
     */
    EClass DESIGN = eINSTANCE.getDesign();

    /**
     * The meta object literal for the '<em><b>Design Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESIGN__DESIGN_TYPE = eINSTANCE.getDesign_DesignType();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESIGN__CONSTRAINT = eINSTANCE.getDesign_Constraint();

    /**
     * The meta object literal for the '<em><b>Iteration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DESIGN__ITERATION = eINSTANCE.getDesign_Iteration();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DESIGN__VARIABLES = eINSTANCE.getDesign_Variables();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.impl.VariablesImpl <em>Variables</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.impl.VariablesImpl
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getVariables()
     * @generated
     */
    EClass VARIABLES = eINSTANCE.getVariables();

    /**
     * The meta object literal for the '<em><b>Independent Variables</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLES__INDEPENDENT_VARIABLES = eINSTANCE.getVariables_IndependentVariables();

    /**
     * The meta object literal for the '<em><b>Control Variables</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLES__CONTROL_VARIABLES = eINSTANCE.getVariables_ControlVariables();

    /**
     * The meta object literal for the '<em><b>Dependent Variables</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLES__DEPENDENT_VARIABLES = eINSTANCE.getVariables_DependentVariables();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.impl.IndependentVariablesImpl <em>Independent Variables</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.impl.IndependentVariablesImpl
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getIndependentVariables()
     * @generated
     */
    EClass INDEPENDENT_VARIABLES = eINSTANCE.getIndependentVariables();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INDEPENDENT_VARIABLES__VARIABLES = eINSTANCE.getIndependentVariables_Variables();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.impl.ControlVariablesImpl <em>Control Variables</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.impl.ControlVariablesImpl
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getControlVariables()
     * @generated
     */
    EClass CONTROL_VARIABLES = eINSTANCE.getControlVariables();

    /**
     * The meta object literal for the '<em><b>Control Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTROL_VARIABLES__CONTROL_NAME = eINSTANCE.getControlVariables_ControlName();

    /**
     * The meta object literal for the '<em><b>Control Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTROL_VARIABLES__CONTROL_TYPE = eINSTANCE.getControlVariables_ControlType();

    /**
     * The meta object literal for the '<em><b>Control Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTROL_VARIABLES__CONTROL_VALUE = eINSTANCE.getControlVariables_ControlValue();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.impl.DependentVariablesImpl <em>Dependent Variables</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.impl.DependentVariablesImpl
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getDependentVariables()
     * @generated
     */
    EClass DEPENDENT_VARIABLES = eINSTANCE.getDependentVariables();

    /**
     * The meta object literal for the '<em><b>Response Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPENDENT_VARIABLES__RESPONSE_NAME = eINSTANCE.getDependentVariables_ResponseName();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.impl.FactorLevelsImpl <em>Factor Levels</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.impl.FactorLevelsImpl
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getFactorLevels()
     * @generated
     */
    EClass FACTOR_LEVELS = eINSTANCE.getFactorLevels();

    /**
     * The meta object literal for the '<em><b>Fac Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FACTOR_LEVELS__FAC_NAME = eINSTANCE.getFactorLevels_FacName();

    /**
     * The meta object literal for the '<em><b>L</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FACTOR_LEVELS__L = eINSTANCE.getFactorLevels_L();

    /**
     * The meta object literal for the '<em><b>L1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FACTOR_LEVELS__L1 = eINSTANCE.getFactorLevels_L1();

    /**
     * The meta object literal for the '<em><b>L2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FACTOR_LEVELS__L2 = eINSTANCE.getFactorLevels_L2();

    /**
     * The meta object literal for the '<em><b>Start1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FACTOR_LEVELS__START1 = eINSTANCE.getFactorLevels_Start1();

    /**
     * The meta object literal for the '<em><b>End1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FACTOR_LEVELS__END1 = eINSTANCE.getFactorLevels_End1();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.impl.ResponseImpl <em>Response</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.impl.ResponseImpl
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getResponse()
     * @generated
     */
    EClass RESPONSE = eINSTANCE.getResponse();

    /**
     * The meta object literal for the '<em><b>Response Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESPONSE__RESPONSE_NAME = eINSTANCE.getResponse_ResponseName();

    /**
     * The meta object literal for the '<em><b>Response Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESPONSE__RESPONSE_TYPE = eINSTANCE.getResponse_ResponseType();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.impl.IterationImpl <em>Iteration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.impl.IterationImpl
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getIteration()
     * @generated
     */
    EClass ITERATION = eINSTANCE.getIteration();

    /**
     * The meta object literal for the '<em><b>Iterations</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITERATION__ITERATIONS = eINSTANCE.getIteration_Iterations();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.impl.PerformanceMeasureImpl <em>Performance Measure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.impl.PerformanceMeasureImpl
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getPerformanceMeasure()
     * @generated
     */
    EClass PERFORMANCE_MEASURE = eINSTANCE.getPerformanceMeasure();

    /**
     * The meta object literal for the '<em><b>Expected Response</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERFORMANCE_MEASURE__EXPECTED_RESPONSE = eINSTANCE.getPerformanceMeasure_ExpectedResponse();

    /**
     * The meta object literal for the '<em><b>Er</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERFORMANCE_MEASURE__ER = eINSTANCE.getPerformanceMeasure_Er();

    /**
     * The meta object literal for the '<em><b>Std</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERFORMANCE_MEASURE__STD = eINSTANCE.getPerformanceMeasure_Std();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.VariableType <em>Variable Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.VariableType
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getVariableType()
     * @generated
     */
    EEnum VARIABLE_TYPE = eINSTANCE.getVariableType();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.Expression <em>Expression</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.Expression
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getExpression()
     * @generated
     */
    EEnum EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.Links <em>Links</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.Links
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getLinks()
     * @generated
     */
    EEnum LINKS = eINSTANCE.getLinks();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.Temporal <em>Temporal</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.Temporal
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getTemporal()
     * @generated
     */
    EEnum TEMPORAL = eINSTANCE.getTemporal();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.Logical <em>Logical</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.Logical
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getLogical()
     * @generated
     */
    EEnum LOGICAL = eINSTANCE.getLogical();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.Coherence <em>Coherence</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.Coherence
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getCoherence()
     * @generated
     */
    EEnum COHERENCE = eINSTANCE.getCoherence();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.Function <em>Function</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.Function
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getFunction()
     * @generated
     */
    EEnum FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.Changes <em>Changes</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.Changes
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getChanges()
     * @generated
     */
    EEnum CHANGES = eINSTANCE.getChanges();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.Levels <em>Levels</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.Levels
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getLevels()
     * @generated
     */
    EEnum LEVELS = eINSTANCE.getLevels();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.DesignType <em>Design Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.DesignType
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getDesignType()
     * @generated
     */
    EEnum DESIGN_TYPE = eINSTANCE.getDesignType();

    /**
     * The meta object literal for the '{@link org.xtext.DOE.experimentOntology.ResponseType <em>Response Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.DOE.experimentOntology.ResponseType
     * @see org.xtext.DOE.experimentOntology.impl.ExperimentOntologyPackageImpl#getResponseType()
     * @generated
     */
    EEnum RESPONSE_TYPE = eINSTANCE.getResponseType();

  }

} //ExperimentOntologyPackage
