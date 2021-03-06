/**
 */
package org.xtext.DOE.experimentOntology.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.DOE.experimentOntology.Changes;
import org.xtext.DOE.experimentOntology.Coherence;
import org.xtext.DOE.experimentOntology.CoherenceLink;
import org.xtext.DOE.experimentOntology.Condition;
import org.xtext.DOE.experimentOntology.ControlVariables;
import org.xtext.DOE.experimentOntology.DependentVariables;
import org.xtext.DOE.experimentOntology.Design;
import org.xtext.DOE.experimentOntology.DesignType;
import org.xtext.DOE.experimentOntology.Dispersed;
import org.xtext.DOE.experimentOntology.Event;
import org.xtext.DOE.experimentOntology.EventDescriptor;
import org.xtext.DOE.experimentOntology.Evidence;
import org.xtext.DOE.experimentOntology.Experiment;
import org.xtext.DOE.experimentOntology.ExperimentOntology;
import org.xtext.DOE.experimentOntology.ExperimentOntologyFactory;
import org.xtext.DOE.experimentOntology.ExperimentOntologyPackage;
import org.xtext.DOE.experimentOntology.Expression;
import org.xtext.DOE.experimentOntology.Factor;
import org.xtext.DOE.experimentOntology.FactorLevels;
import org.xtext.DOE.experimentOntology.Function;
import org.xtext.DOE.experimentOntology.Goals;
import org.xtext.DOE.experimentOntology.GuardCondition;
import org.xtext.DOE.experimentOntology.Hypothesis;
import org.xtext.DOE.experimentOntology.IndependentVariables;
import org.xtext.DOE.experimentOntology.Iteration;
import org.xtext.DOE.experimentOntology.Levels;
import org.xtext.DOE.experimentOntology.Links;
import org.xtext.DOE.experimentOntology.Logical;
import org.xtext.DOE.experimentOntology.MechHypothesis;
import org.xtext.DOE.experimentOntology.Mechanism;
import org.xtext.DOE.experimentOntology.Model;
import org.xtext.DOE.experimentOntology.ModelSection;
import org.xtext.DOE.experimentOntology.PerformanceMeasure;
import org.xtext.DOE.experimentOntology.Query1;
import org.xtext.DOE.experimentOntology.Query2;
import org.xtext.DOE.experimentOntology.Query3;
import org.xtext.DOE.experimentOntology.Reaction;
import org.xtext.DOE.experimentOntology.RelationalQuery;
import org.xtext.DOE.experimentOntology.Response;
import org.xtext.DOE.experimentOntology.ResponseType;
import org.xtext.DOE.experimentOntology.Simultaneous;
import org.xtext.DOE.experimentOntology.Temporal;
import org.xtext.DOE.experimentOntology.TemporalPattern;
import org.xtext.DOE.experimentOntology.Values;
import org.xtext.DOE.experimentOntology.VariableType;
import org.xtext.DOE.experimentOntology.Variables;
import org.xtext.DOE.experimentOntology.properties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExperimentOntologyPackageImpl extends EPackageImpl implements ExperimentOntologyPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass experimentOntologyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mechanismEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reactionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass guardConditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventDescriptorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass factorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valuesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass goalsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hypothesisEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass coherenceLinkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mechHypothesisEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass evidenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass temporalPatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simultaneousEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dispersedEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationalQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass query1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass query2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass query3EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass experimentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass designEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variablesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass independentVariablesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass controlVariablesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dependentVariablesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass factorLevelsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass responseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iterationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass performanceMeasureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum variableTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum expressionEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum linksEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum temporalEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum logicalEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum coherenceEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum functionEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum changesEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum levelsEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum designTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum responseTypeEEnum = null;

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
   * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ExperimentOntologyPackageImpl()
  {
    super(eNS_URI, ExperimentOntologyFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link ExperimentOntologyPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ExperimentOntologyPackage init()
  {
    if (isInited) return (ExperimentOntologyPackage)EPackage.Registry.INSTANCE.getEPackage(ExperimentOntologyPackage.eNS_URI);

    // Obtain or create and register package
    ExperimentOntologyPackageImpl theExperimentOntologyPackage = (ExperimentOntologyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExperimentOntologyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExperimentOntologyPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theExperimentOntologyPackage.createPackageContents();

    // Initialize created meta-data
    theExperimentOntologyPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theExperimentOntologyPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ExperimentOntologyPackage.eNS_URI, theExperimentOntologyPackage);
    return theExperimentOntologyPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Elements()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExperimentOntology()
  {
    return experimentOntologyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelSection()
  {
    return modelSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModelSection_ModName()
  {
    return (EAttribute)modelSectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelSection_Mechanisms()
  {
    return (EReference)modelSectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelSection_Events()
  {
    return (EReference)modelSectionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelSection_Parameters()
  {
    return (EReference)modelSectionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMechanism()
  {
    return mechanismEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMechanism_MechanismName()
  {
    return (EAttribute)mechanismEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMechanism_LHS()
  {
    return (EReference)mechanismEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMechanism_Condition()
  {
    return (EReference)mechanismEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMechanism_RHS()
  {
    return (EReference)mechanismEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReaction()
  {
    return reactionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReaction_Agent1()
  {
    return (EAttribute)reactionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReaction_Agent()
  {
    return (EAttribute)reactionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGuardCondition()
  {
    return guardConditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGuardCondition_Gd()
  {
    return (EAttribute)guardConditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGuardCondition_Condition1()
  {
    return (EAttribute)guardConditionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGuardCondition_Link()
  {
    return (EAttribute)guardConditionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGuardCondition_Condition2()
  {
    return (EAttribute)guardConditionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEventDescriptor()
  {
    return eventDescriptorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEventDescriptor_EventName()
  {
    return (EAttribute)eventDescriptorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEventDescriptor_Event()
  {
    return (EAttribute)eventDescriptorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFactor()
  {
    return factorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFactor_FactorName()
  {
    return (EAttribute)factorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFactor_FactorType()
  {
    return (EAttribute)factorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFactor_FactorType1()
  {
    return (EAttribute)factorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFactor_FactorValue()
  {
    return (EReference)factorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFactor_FactorProperties()
  {
    return (EReference)factorEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getproperties()
  {
    return propertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getproperties_PName()
  {
    return (EAttribute)propertiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getproperties_PVal()
  {
    return (EReference)propertiesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValues()
  {
    return valuesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValues_FVal()
  {
    return (EAttribute)valuesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValues_Function()
  {
    return (EAttribute)valuesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValues_Value()
  {
    return (EAttribute)valuesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValues_Fvalue()
  {
    return (EAttribute)valuesEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGoals()
  {
    return goalsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGoals_ObjOfStudy()
  {
    return (EAttribute)goalsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGoals_Purpose()
  {
    return (EAttribute)goalsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGoals_Focus()
  {
    return (EAttribute)goalsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGoals_ViewPoint()
  {
    return (EAttribute)goalsEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGoals_Context()
  {
    return (EAttribute)goalsEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHypothesis()
  {
    return hypothesisEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHypothesis_MechHypothesis()
  {
    return (EReference)hypothesisEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHypothesis_Evidences()
  {
    return (EReference)hypothesisEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHypothesis_CoherenceLinks()
  {
    return (EReference)hypothesisEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHypothesis_RelHypothesis()
  {
    return (EReference)hypothesisEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCoherenceLink()
  {
    return coherenceLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCoherenceLink_Coherence()
  {
    return (EAttribute)coherenceLinkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCoherenceLink_Hyp()
  {
    return (EAttribute)coherenceLinkEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCoherenceLink_Evi()
  {
    return (EAttribute)coherenceLinkEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMechHypothesis()
  {
    return mechHypothesisEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMechHypothesis_MName()
  {
    return (EAttribute)mechHypothesisEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMechHypothesis_AssoMech()
  {
    return (EReference)mechHypothesisEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMechHypothesis_MechanisticHypothesis()
  {
    return (EAttribute)mechHypothesisEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEvidence()
  {
    return evidenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEvidence_EName()
  {
    return (EAttribute)evidenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvidence_Query()
  {
    return (EReference)evidenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEvidence_ObjOfStudy()
  {
    return (EAttribute)evidenceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTemporalPattern()
  {
    return temporalPatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCondition()
  {
    return conditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCondition_L2()
  {
    return (EAttribute)conditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCondition_Exp()
  {
    return (EAttribute)conditionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCondition_Op1()
  {
    return (EAttribute)conditionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCondition_Op2()
  {
    return (EAttribute)conditionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCondition_L3()
  {
    return (EAttribute)conditionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCondition_Condition()
  {
    return (EReference)conditionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCondition_Lo()
  {
    return (EAttribute)conditionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCondition_E()
  {
    return (EReference)conditionEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCondition_Exp1()
  {
    return (EAttribute)conditionEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCondition_V()
  {
    return (EAttribute)conditionEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEvent()
  {
    return eventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimultaneous()
  {
    return simultaneousEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimultaneous_Sim1()
  {
    return (EAttribute)simultaneousEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimultaneous_Log()
  {
    return (EAttribute)simultaneousEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimultaneous_Sim2()
  {
    return (EAttribute)simultaneousEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDispersed()
  {
    return dispersedEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDispersed_Disp()
  {
    return (EAttribute)dispersedEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationalQuery()
  {
    return relationalQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuery1()
  {
    return query1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuery1_Factor()
  {
    return (EAttribute)query1EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuery1_Control()
  {
    return (EAttribute)query1EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuery1_X()
  {
    return (EAttribute)query1EClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuery1_Start1()
  {
    return (EAttribute)query1EClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuery1_End1()
  {
    return (EAttribute)query1EClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuery1_Response()
  {
    return (EAttribute)query1EClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuery1_Y()
  {
    return (EAttribute)query1EClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuery1_Start2()
  {
    return (EAttribute)query1EClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuery1_End2()
  {
    return (EAttribute)query1EClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuery2()
  {
    return query2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuery2_Function1()
  {
    return (EAttribute)query2EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuery2_Response1()
  {
    return (EAttribute)query2EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuery2_Factor1()
  {
    return (EAttribute)query2EClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuery2_Function2()
  {
    return (EAttribute)query2EClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuery2_Response2()
  {
    return (EAttribute)query2EClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuery2_Factor2()
  {
    return (EAttribute)query2EClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuery3()
  {
    return query3EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuery3_Factor1()
  {
    return (EAttribute)query3EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuery3_Control1()
  {
    return (EAttribute)query3EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuery3_Level2()
  {
    return (EAttribute)query3EClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuery3_X2()
  {
    return (EAttribute)query3EClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuery3_Response1()
  {
    return (EAttribute)query3EClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuery3_Level4()
  {
    return (EAttribute)query3EClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuery3_X4()
  {
    return (EAttribute)query3EClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuery3_Level()
  {
    return (EAttribute)query3EClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuery3_Factor()
  {
    return (EAttribute)query3EClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuery3_Control()
  {
    return (EAttribute)query3EClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuery3_Response()
  {
    return (EAttribute)query3EClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuery3_Start1()
  {
    return (EAttribute)query3EClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuery3_End1()
  {
    return (EAttribute)query3EClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExperiment()
  {
    return experimentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExperiment_ExpName()
  {
    return (EAttribute)experimentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExperiment_ExpDesign()
  {
    return (EReference)experimentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExperiment_PerfMeasure()
  {
    return (EReference)experimentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDesign()
  {
    return designEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDesign_DesignType()
  {
    return (EAttribute)designEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDesign_Constraint()
  {
    return (EAttribute)designEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDesign_Iteration()
  {
    return (EReference)designEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDesign_Variables()
  {
    return (EReference)designEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariables()
  {
    return variablesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariables_IndependentVariables()
  {
    return (EReference)variablesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariables_ControlVariables()
  {
    return (EReference)variablesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariables_DependentVariables()
  {
    return (EReference)variablesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIndependentVariables()
  {
    return independentVariablesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndependentVariables_Variables()
  {
    return (EReference)independentVariablesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getControlVariables()
  {
    return controlVariablesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getControlVariables_ControlName()
  {
    return (EAttribute)controlVariablesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getControlVariables_ControlType()
  {
    return (EAttribute)controlVariablesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getControlVariables_ControlValue()
  {
    return (EReference)controlVariablesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDependentVariables()
  {
    return dependentVariablesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDependentVariables_ResponseName()
  {
    return (EReference)dependentVariablesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFactorLevels()
  {
    return factorLevelsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFactorLevels_FacName()
  {
    return (EAttribute)factorLevelsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFactorLevels_L()
  {
    return (EAttribute)factorLevelsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFactorLevels_L1()
  {
    return (EAttribute)factorLevelsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFactorLevels_L2()
  {
    return (EAttribute)factorLevelsEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFactorLevels_Start1()
  {
    return (EAttribute)factorLevelsEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFactorLevels_End1()
  {
    return (EAttribute)factorLevelsEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResponse()
  {
    return responseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResponse_ResponseName()
  {
    return (EAttribute)responseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResponse_ResponseType()
  {
    return (EAttribute)responseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIteration()
  {
    return iterationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIteration_Iterations()
  {
    return (EAttribute)iterationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPerformanceMeasure()
  {
    return performanceMeasureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPerformanceMeasure_ExpectedResponse()
  {
    return (EAttribute)performanceMeasureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPerformanceMeasure_Er()
  {
    return (EAttribute)performanceMeasureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPerformanceMeasure_Std()
  {
    return (EAttribute)performanceMeasureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getVariableType()
  {
    return variableTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getExpression()
  {
    return expressionEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLinks()
  {
    return linksEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTemporal()
  {
    return temporalEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLogical()
  {
    return logicalEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getCoherence()
  {
    return coherenceEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getFunction()
  {
    return functionEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getChanges()
  {
    return changesEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLevels()
  {
    return levelsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDesignType()
  {
    return designTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getResponseType()
  {
    return responseTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExperimentOntologyFactory getExperimentOntologyFactory()
  {
    return (ExperimentOntologyFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__ELEMENTS);

    experimentOntologyEClass = createEClass(EXPERIMENT_ONTOLOGY);

    modelSectionEClass = createEClass(MODEL_SECTION);
    createEAttribute(modelSectionEClass, MODEL_SECTION__MOD_NAME);
    createEReference(modelSectionEClass, MODEL_SECTION__MECHANISMS);
    createEReference(modelSectionEClass, MODEL_SECTION__EVENTS);
    createEReference(modelSectionEClass, MODEL_SECTION__PARAMETERS);

    mechanismEClass = createEClass(MECHANISM);
    createEAttribute(mechanismEClass, MECHANISM__MECHANISM_NAME);
    createEReference(mechanismEClass, MECHANISM__LHS);
    createEReference(mechanismEClass, MECHANISM__CONDITION);
    createEReference(mechanismEClass, MECHANISM__RHS);

    reactionEClass = createEClass(REACTION);
    createEAttribute(reactionEClass, REACTION__AGENT1);
    createEAttribute(reactionEClass, REACTION__AGENT);

    guardConditionEClass = createEClass(GUARD_CONDITION);
    createEAttribute(guardConditionEClass, GUARD_CONDITION__GD);
    createEAttribute(guardConditionEClass, GUARD_CONDITION__CONDITION1);
    createEAttribute(guardConditionEClass, GUARD_CONDITION__LINK);
    createEAttribute(guardConditionEClass, GUARD_CONDITION__CONDITION2);

    eventDescriptorEClass = createEClass(EVENT_DESCRIPTOR);
    createEAttribute(eventDescriptorEClass, EVENT_DESCRIPTOR__EVENT_NAME);
    createEAttribute(eventDescriptorEClass, EVENT_DESCRIPTOR__EVENT);

    factorEClass = createEClass(FACTOR);
    createEAttribute(factorEClass, FACTOR__FACTOR_NAME);
    createEAttribute(factorEClass, FACTOR__FACTOR_TYPE);
    createEAttribute(factorEClass, FACTOR__FACTOR_TYPE1);
    createEReference(factorEClass, FACTOR__FACTOR_VALUE);
    createEReference(factorEClass, FACTOR__FACTOR_PROPERTIES);

    propertiesEClass = createEClass(PROPERTIES);
    createEAttribute(propertiesEClass, PROPERTIES__PNAME);
    createEReference(propertiesEClass, PROPERTIES__PVAL);

    valuesEClass = createEClass(VALUES);
    createEAttribute(valuesEClass, VALUES__FVAL);
    createEAttribute(valuesEClass, VALUES__FUNCTION);
    createEAttribute(valuesEClass, VALUES__VALUE);
    createEAttribute(valuesEClass, VALUES__FVALUE);

    goalsEClass = createEClass(GOALS);
    createEAttribute(goalsEClass, GOALS__OBJ_OF_STUDY);
    createEAttribute(goalsEClass, GOALS__PURPOSE);
    createEAttribute(goalsEClass, GOALS__FOCUS);
    createEAttribute(goalsEClass, GOALS__VIEW_POINT);
    createEAttribute(goalsEClass, GOALS__CONTEXT);

    hypothesisEClass = createEClass(HYPOTHESIS);
    createEReference(hypothesisEClass, HYPOTHESIS__MECH_HYPOTHESIS);
    createEReference(hypothesisEClass, HYPOTHESIS__EVIDENCES);
    createEReference(hypothesisEClass, HYPOTHESIS__COHERENCE_LINKS);
    createEReference(hypothesisEClass, HYPOTHESIS__REL_HYPOTHESIS);

    coherenceLinkEClass = createEClass(COHERENCE_LINK);
    createEAttribute(coherenceLinkEClass, COHERENCE_LINK__COHERENCE);
    createEAttribute(coherenceLinkEClass, COHERENCE_LINK__HYP);
    createEAttribute(coherenceLinkEClass, COHERENCE_LINK__EVI);

    mechHypothesisEClass = createEClass(MECH_HYPOTHESIS);
    createEAttribute(mechHypothesisEClass, MECH_HYPOTHESIS__MNAME);
    createEReference(mechHypothesisEClass, MECH_HYPOTHESIS__ASSO_MECH);
    createEAttribute(mechHypothesisEClass, MECH_HYPOTHESIS__MECHANISTIC_HYPOTHESIS);

    evidenceEClass = createEClass(EVIDENCE);
    createEAttribute(evidenceEClass, EVIDENCE__ENAME);
    createEReference(evidenceEClass, EVIDENCE__QUERY);
    createEAttribute(evidenceEClass, EVIDENCE__OBJ_OF_STUDY);

    temporalPatternEClass = createEClass(TEMPORAL_PATTERN);

    conditionEClass = createEClass(CONDITION);
    createEAttribute(conditionEClass, CONDITION__L2);
    createEAttribute(conditionEClass, CONDITION__EXP);
    createEAttribute(conditionEClass, CONDITION__OP1);
    createEAttribute(conditionEClass, CONDITION__OP2);
    createEAttribute(conditionEClass, CONDITION__L3);
    createEReference(conditionEClass, CONDITION__CONDITION);
    createEAttribute(conditionEClass, CONDITION__LO);
    createEReference(conditionEClass, CONDITION__E);
    createEAttribute(conditionEClass, CONDITION__EXP1);
    createEAttribute(conditionEClass, CONDITION__V);

    eventEClass = createEClass(EVENT);

    simultaneousEClass = createEClass(SIMULTANEOUS);
    createEAttribute(simultaneousEClass, SIMULTANEOUS__SIM1);
    createEAttribute(simultaneousEClass, SIMULTANEOUS__LOG);
    createEAttribute(simultaneousEClass, SIMULTANEOUS__SIM2);

    dispersedEClass = createEClass(DISPERSED);
    createEAttribute(dispersedEClass, DISPERSED__DISP);

    relationalQueryEClass = createEClass(RELATIONAL_QUERY);

    query1EClass = createEClass(QUERY1);
    createEAttribute(query1EClass, QUERY1__FACTOR);
    createEAttribute(query1EClass, QUERY1__CONTROL);
    createEAttribute(query1EClass, QUERY1__X);
    createEAttribute(query1EClass, QUERY1__START1);
    createEAttribute(query1EClass, QUERY1__END1);
    createEAttribute(query1EClass, QUERY1__RESPONSE);
    createEAttribute(query1EClass, QUERY1__Y);
    createEAttribute(query1EClass, QUERY1__START2);
    createEAttribute(query1EClass, QUERY1__END2);

    query2EClass = createEClass(QUERY2);
    createEAttribute(query2EClass, QUERY2__FUNCTION1);
    createEAttribute(query2EClass, QUERY2__RESPONSE1);
    createEAttribute(query2EClass, QUERY2__FACTOR1);
    createEAttribute(query2EClass, QUERY2__FUNCTION2);
    createEAttribute(query2EClass, QUERY2__RESPONSE2);
    createEAttribute(query2EClass, QUERY2__FACTOR2);

    query3EClass = createEClass(QUERY3);
    createEAttribute(query3EClass, QUERY3__FACTOR1);
    createEAttribute(query3EClass, QUERY3__CONTROL1);
    createEAttribute(query3EClass, QUERY3__LEVEL2);
    createEAttribute(query3EClass, QUERY3__X2);
    createEAttribute(query3EClass, QUERY3__RESPONSE1);
    createEAttribute(query3EClass, QUERY3__LEVEL4);
    createEAttribute(query3EClass, QUERY3__X4);
    createEAttribute(query3EClass, QUERY3__LEVEL);
    createEAttribute(query3EClass, QUERY3__FACTOR);
    createEAttribute(query3EClass, QUERY3__CONTROL);
    createEAttribute(query3EClass, QUERY3__RESPONSE);
    createEAttribute(query3EClass, QUERY3__START1);
    createEAttribute(query3EClass, QUERY3__END1);

    experimentEClass = createEClass(EXPERIMENT);
    createEAttribute(experimentEClass, EXPERIMENT__EXP_NAME);
    createEReference(experimentEClass, EXPERIMENT__EXP_DESIGN);
    createEReference(experimentEClass, EXPERIMENT__PERF_MEASURE);

    designEClass = createEClass(DESIGN);
    createEAttribute(designEClass, DESIGN__DESIGN_TYPE);
    createEAttribute(designEClass, DESIGN__CONSTRAINT);
    createEReference(designEClass, DESIGN__ITERATION);
    createEReference(designEClass, DESIGN__VARIABLES);

    variablesEClass = createEClass(VARIABLES);
    createEReference(variablesEClass, VARIABLES__INDEPENDENT_VARIABLES);
    createEReference(variablesEClass, VARIABLES__CONTROL_VARIABLES);
    createEReference(variablesEClass, VARIABLES__DEPENDENT_VARIABLES);

    independentVariablesEClass = createEClass(INDEPENDENT_VARIABLES);
    createEReference(independentVariablesEClass, INDEPENDENT_VARIABLES__VARIABLES);

    controlVariablesEClass = createEClass(CONTROL_VARIABLES);
    createEAttribute(controlVariablesEClass, CONTROL_VARIABLES__CONTROL_NAME);
    createEAttribute(controlVariablesEClass, CONTROL_VARIABLES__CONTROL_TYPE);
    createEReference(controlVariablesEClass, CONTROL_VARIABLES__CONTROL_VALUE);

    dependentVariablesEClass = createEClass(DEPENDENT_VARIABLES);
    createEReference(dependentVariablesEClass, DEPENDENT_VARIABLES__RESPONSE_NAME);

    factorLevelsEClass = createEClass(FACTOR_LEVELS);
    createEAttribute(factorLevelsEClass, FACTOR_LEVELS__FAC_NAME);
    createEAttribute(factorLevelsEClass, FACTOR_LEVELS__L);
    createEAttribute(factorLevelsEClass, FACTOR_LEVELS__L1);
    createEAttribute(factorLevelsEClass, FACTOR_LEVELS__L2);
    createEAttribute(factorLevelsEClass, FACTOR_LEVELS__START1);
    createEAttribute(factorLevelsEClass, FACTOR_LEVELS__END1);

    responseEClass = createEClass(RESPONSE);
    createEAttribute(responseEClass, RESPONSE__RESPONSE_NAME);
    createEAttribute(responseEClass, RESPONSE__RESPONSE_TYPE);

    iterationEClass = createEClass(ITERATION);
    createEAttribute(iterationEClass, ITERATION__ITERATIONS);

    performanceMeasureEClass = createEClass(PERFORMANCE_MEASURE);
    createEAttribute(performanceMeasureEClass, PERFORMANCE_MEASURE__EXPECTED_RESPONSE);
    createEAttribute(performanceMeasureEClass, PERFORMANCE_MEASURE__ER);
    createEAttribute(performanceMeasureEClass, PERFORMANCE_MEASURE__STD);

    // Create enums
    variableTypeEEnum = createEEnum(VARIABLE_TYPE);
    expressionEEnum = createEEnum(EXPRESSION);
    linksEEnum = createEEnum(LINKS);
    temporalEEnum = createEEnum(TEMPORAL);
    logicalEEnum = createEEnum(LOGICAL);
    coherenceEEnum = createEEnum(COHERENCE);
    functionEEnum = createEEnum(FUNCTION);
    changesEEnum = createEEnum(CHANGES);
    levelsEEnum = createEEnum(LEVELS);
    designTypeEEnum = createEEnum(DESIGN_TYPE);
    responseTypeEEnum = createEEnum(RESPONSE_TYPE);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    modelSectionEClass.getESuperTypes().add(this.getExperimentOntology());
    goalsEClass.getESuperTypes().add(this.getExperimentOntology());
    hypothesisEClass.getESuperTypes().add(this.getExperimentOntology());
    conditionEClass.getESuperTypes().add(this.getTemporalPattern());
    simultaneousEClass.getESuperTypes().add(this.getEvent());
    dispersedEClass.getESuperTypes().add(this.getEvent());
    query1EClass.getESuperTypes().add(this.getRelationalQuery());
    query2EClass.getESuperTypes().add(this.getRelationalQuery());
    query3EClass.getESuperTypes().add(this.getRelationalQuery());
    experimentEClass.getESuperTypes().add(this.getExperimentOntology());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Elements(), this.getExperimentOntology(), null, "elements", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(experimentOntologyEClass, ExperimentOntology.class, "ExperimentOntology", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(modelSectionEClass, ModelSection.class, "ModelSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModelSection_ModName(), ecorePackage.getEString(), "modName", null, 0, 1, ModelSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelSection_Mechanisms(), this.getMechanism(), null, "mechanisms", null, 0, -1, ModelSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelSection_Events(), this.getEventDescriptor(), null, "events", null, 0, -1, ModelSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelSection_Parameters(), this.getFactor(), null, "parameters", null, 0, -1, ModelSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mechanismEClass, Mechanism.class, "Mechanism", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMechanism_MechanismName(), ecorePackage.getEString(), "mechanismName", null, 0, 1, Mechanism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMechanism_LHS(), this.getReaction(), null, "LHS", null, 0, 1, Mechanism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMechanism_Condition(), this.getGuardCondition(), null, "condition", null, 0, 1, Mechanism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMechanism_RHS(), this.getReaction(), null, "RHS", null, 0, 1, Mechanism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(reactionEClass, Reaction.class, "Reaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReaction_Agent1(), ecorePackage.getEString(), "agent1", null, 0, 1, Reaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReaction_Agent(), ecorePackage.getEString(), "agent", null, 0, 1, Reaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(guardConditionEClass, GuardCondition.class, "GuardCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGuardCondition_Gd(), ecorePackage.getEString(), "gd", null, 0, 1, GuardCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGuardCondition_Condition1(), ecorePackage.getEString(), "condition1", null, 0, 1, GuardCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGuardCondition_Link(), ecorePackage.getEString(), "link", null, 0, 1, GuardCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGuardCondition_Condition2(), ecorePackage.getEString(), "condition2", null, 0, 1, GuardCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eventDescriptorEClass, EventDescriptor.class, "EventDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEventDescriptor_EventName(), ecorePackage.getEString(), "eventName", null, 0, 1, EventDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEventDescriptor_Event(), ecorePackage.getEString(), "event", null, 0, 1, EventDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(factorEClass, Factor.class, "Factor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFactor_FactorName(), ecorePackage.getEString(), "factorName", null, 0, 1, Factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFactor_FactorType(), this.getVariableType(), "factorType", null, 0, 1, Factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFactor_FactorType1(), ecorePackage.getEString(), "factorType1", null, 0, 1, Factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFactor_FactorValue(), this.getValues(), null, "factorValue", null, 0, 1, Factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFactor_FactorProperties(), this.getproperties(), null, "factorProperties", null, 0, -1, Factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertiesEClass, properties.class, "properties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getproperties_PName(), ecorePackage.getEString(), "pName", null, 0, 1, properties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getproperties_PVal(), this.getValues(), null, "pVal", null, 0, 1, properties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valuesEClass, Values.class, "Values", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getValues_FVal(), ecorePackage.getEString(), "fVal", null, 0, 1, Values.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getValues_Function(), ecorePackage.getEString(), "function", null, 0, 1, Values.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getValues_Value(), ecorePackage.getEString(), "value", null, 0, 1, Values.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getValues_Fvalue(), ecorePackage.getEString(), "fvalue", null, 0, 1, Values.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(goalsEClass, Goals.class, "Goals", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGoals_ObjOfStudy(), ecorePackage.getEString(), "objOfStudy", null, 0, 1, Goals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGoals_Purpose(), ecorePackage.getEString(), "purpose", null, 0, 1, Goals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGoals_Focus(), ecorePackage.getEString(), "focus", null, 0, 1, Goals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGoals_ViewPoint(), ecorePackage.getEString(), "viewPoint", null, 0, 1, Goals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGoals_Context(), ecorePackage.getEString(), "context", null, 0, 1, Goals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hypothesisEClass, Hypothesis.class, "Hypothesis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHypothesis_MechHypothesis(), this.getMechHypothesis(), null, "mechHypothesis", null, 0, -1, Hypothesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHypothesis_Evidences(), this.getEvidence(), null, "evidences", null, 0, -1, Hypothesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHypothesis_CoherenceLinks(), this.getCoherenceLink(), null, "coherenceLinks", null, 0, -1, Hypothesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHypothesis_RelHypothesis(), this.getRelationalQuery(), null, "relHypothesis", null, 0, -1, Hypothesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(coherenceLinkEClass, CoherenceLink.class, "CoherenceLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCoherenceLink_Coherence(), this.getCoherence(), "coherence", null, 0, 1, CoherenceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCoherenceLink_Hyp(), ecorePackage.getEString(), "hyp", null, 0, -1, CoherenceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCoherenceLink_Evi(), ecorePackage.getEString(), "evi", null, 0, -1, CoherenceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mechHypothesisEClass, MechHypothesis.class, "MechHypothesis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMechHypothesis_MName(), ecorePackage.getEString(), "mName", null, 0, 1, MechHypothesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMechHypothesis_AssoMech(), this.getTemporalPattern(), null, "assoMech", null, 0, -1, MechHypothesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMechHypothesis_MechanisticHypothesis(), ecorePackage.getEString(), "mechanisticHypothesis", null, 0, 1, MechHypothesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(evidenceEClass, Evidence.class, "Evidence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEvidence_EName(), ecorePackage.getEString(), "eName", null, 0, 1, Evidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEvidence_Query(), this.getTemporalPattern(), null, "query", null, 0, -1, Evidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEvidence_ObjOfStudy(), ecorePackage.getEString(), "objOfStudy", null, 0, 1, Evidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(temporalPatternEClass, TemporalPattern.class, "TemporalPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCondition_L2(), this.getLinks(), "l2", null, 0, -1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCondition_Exp(), this.getExpression(), "exp", null, 0, -1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCondition_Op1(), this.getTemporal(), "op1", null, 0, -1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCondition_Op2(), this.getLogical(), "op2", null, 0, -1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCondition_L3(), this.getLinks(), "l3", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCondition_Condition(), this.getEvent(), null, "condition", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCondition_Lo(), ecorePackage.getEString(), "lo", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCondition_E(), this.getEvent(), null, "e", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCondition_Exp1(), this.getExpression(), "exp1", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCondition_V(), ecorePackage.getEString(), "v", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(simultaneousEClass, Simultaneous.class, "Simultaneous", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSimultaneous_Sim1(), ecorePackage.getEString(), "sim1", null, 0, 1, Simultaneous.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimultaneous_Log(), this.getLogical(), "log", null, 0, -1, Simultaneous.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimultaneous_Sim2(), ecorePackage.getEString(), "sim2", null, 0, -1, Simultaneous.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dispersedEClass, Dispersed.class, "Dispersed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDispersed_Disp(), ecorePackage.getEString(), "disp", null, 0, -1, Dispersed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relationalQueryEClass, RelationalQuery.class, "RelationalQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(query1EClass, Query1.class, "Query1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQuery1_Factor(), ecorePackage.getEString(), "factor", null, 0, 1, Query1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuery1_Control(), ecorePackage.getEString(), "control", null, 0, 1, Query1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuery1_X(), ecorePackage.getEString(), "x", null, 0, 1, Query1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuery1_Start1(), ecorePackage.getEString(), "start1", null, 0, 1, Query1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuery1_End1(), ecorePackage.getEString(), "end1", null, 0, 1, Query1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuery1_Response(), ecorePackage.getEString(), "response", null, 0, 1, Query1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuery1_Y(), ecorePackage.getEString(), "y", null, 0, 1, Query1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuery1_Start2(), ecorePackage.getEString(), "start2", null, 0, 1, Query1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuery1_End2(), ecorePackage.getEString(), "end2", null, 0, 1, Query1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(query2EClass, Query2.class, "Query2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQuery2_Function1(), this.getFunction(), "function1", null, 0, 1, Query2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuery2_Response1(), ecorePackage.getEString(), "response1", null, 0, 1, Query2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuery2_Factor1(), ecorePackage.getEString(), "factor1", null, 0, 1, Query2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuery2_Function2(), this.getFunction(), "function2", null, 0, 1, Query2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuery2_Response2(), ecorePackage.getEString(), "response2", null, 0, 1, Query2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuery2_Factor2(), ecorePackage.getEString(), "factor2", null, 0, 1, Query2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(query3EClass, Query3.class, "Query3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQuery3_Factor1(), ecorePackage.getEString(), "factor1", null, 0, 1, Query3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuery3_Control1(), ecorePackage.getEString(), "control1", null, 0, 1, Query3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuery3_Level2(), this.getLevels(), "Level2", null, 0, 1, Query3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuery3_X2(), ecorePackage.getEString(), "x2", null, 0, 1, Query3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuery3_Response1(), ecorePackage.getEString(), "response1", null, 0, 1, Query3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuery3_Level4(), this.getLevels(), "Level4", null, 0, 1, Query3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuery3_X4(), ecorePackage.getEString(), "x4", null, 0, 1, Query3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuery3_Level(), this.getLevels(), "level", null, 0, 1, Query3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuery3_Factor(), ecorePackage.getEString(), "factor", null, 0, 1, Query3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuery3_Control(), ecorePackage.getEString(), "control", null, 0, 1, Query3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuery3_Response(), ecorePackage.getEString(), "response", null, 0, 1, Query3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuery3_Start1(), ecorePackage.getEString(), "start1", null, 0, 1, Query3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuery3_End1(), ecorePackage.getEString(), "end1", null, 0, 1, Query3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(experimentEClass, Experiment.class, "Experiment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExperiment_ExpName(), ecorePackage.getEString(), "expName", null, 0, 1, Experiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExperiment_ExpDesign(), this.getDesign(), null, "expDesign", null, 0, 1, Experiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExperiment_PerfMeasure(), this.getPerformanceMeasure(), null, "perfMeasure", null, 0, 1, Experiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(designEClass, Design.class, "Design", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDesign_DesignType(), this.getDesignType(), "designType", null, 0, 1, Design.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDesign_Constraint(), ecorePackage.getEString(), "constraint", null, 0, 1, Design.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDesign_Iteration(), this.getIteration(), null, "iteration", null, 0, 1, Design.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDesign_Variables(), this.getVariables(), null, "variables", null, 0, 1, Design.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variablesEClass, Variables.class, "Variables", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariables_IndependentVariables(), this.getIndependentVariables(), null, "independentVariables", null, 0, 1, Variables.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariables_ControlVariables(), this.getControlVariables(), null, "controlVariables", null, 0, 1, Variables.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariables_DependentVariables(), this.getDependentVariables(), null, "dependentVariables", null, 0, 1, Variables.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(independentVariablesEClass, IndependentVariables.class, "IndependentVariables", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIndependentVariables_Variables(), this.getFactorLevels(), null, "variables", null, 0, -1, IndependentVariables.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(controlVariablesEClass, ControlVariables.class, "ControlVariables", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getControlVariables_ControlName(), ecorePackage.getEString(), "controlName", null, 0, 1, ControlVariables.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getControlVariables_ControlType(), this.getVariableType(), "controlType", null, 0, 1, ControlVariables.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getControlVariables_ControlValue(), this.getValues(), null, "controlValue", null, 0, 1, ControlVariables.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dependentVariablesEClass, DependentVariables.class, "DependentVariables", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDependentVariables_ResponseName(), this.getResponse(), null, "responseName", null, 0, 1, DependentVariables.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(factorLevelsEClass, FactorLevels.class, "FactorLevels", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFactorLevels_FacName(), ecorePackage.getEString(), "facName", null, 0, 1, FactorLevels.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFactorLevels_L(), ecorePackage.getEString(), "l", null, 0, 1, FactorLevels.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFactorLevels_L1(), this.getLevels(), "l1", null, 0, 1, FactorLevels.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFactorLevels_L2(), this.getLevels(), "l2", null, 0, 1, FactorLevels.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFactorLevels_Start1(), ecorePackage.getEString(), "start1", null, 0, 1, FactorLevels.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFactorLevels_End1(), ecorePackage.getEString(), "end1", null, 0, 1, FactorLevels.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(responseEClass, Response.class, "Response", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getResponse_ResponseName(), ecorePackage.getEString(), "responseName", null, 0, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getResponse_ResponseType(), this.getResponseType(), "responseType", null, 0, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(iterationEClass, Iteration.class, "Iteration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIteration_Iterations(), ecorePackage.getEInt(), "iterations", null, 0, 1, Iteration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(performanceMeasureEClass, PerformanceMeasure.class, "PerformanceMeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPerformanceMeasure_ExpectedResponse(), ecorePackage.getEString(), "expectedResponse", null, 0, 1, PerformanceMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPerformanceMeasure_Er(), ecorePackage.getEString(), "er", null, 0, 1, PerformanceMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPerformanceMeasure_Std(), ecorePackage.getEString(), "std", null, 0, 1, PerformanceMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(variableTypeEEnum, VariableType.class, "VariableType");
    addEEnumLiteral(variableTypeEEnum, VariableType.QUALITATIVE);
    addEEnumLiteral(variableTypeEEnum, VariableType.QUANTITATIVE);
    addEEnumLiteral(variableTypeEEnum, VariableType.CONTINOUS);
    addEEnumLiteral(variableTypeEEnum, VariableType.DISCRETE);
    addEEnumLiteral(variableTypeEEnum, VariableType.BINARY);
    addEEnumLiteral(variableTypeEEnum, VariableType.NONBINARY);

    initEEnum(expressionEEnum, Expression.class, "Expression");
    addEEnumLiteral(expressionEEnum, Expression.TRUE);
    addEEnumLiteral(expressionEEnum, Expression.FALSE);

    initEEnum(linksEEnum, Links.class, "Links");
    addEEnumLiteral(linksEEnum, Links.IS);
    addEEnumLiteral(linksEEnum, Links.OCCURS);
    addEEnumLiteral(linksEEnum, Links.TO);
    addEEnumLiteral(linksEEnum, Links.IN);

    initEEnum(temporalEEnum, Temporal.class, "Temporal");
    addEEnumLiteral(temporalEEnum, Temporal.PRECEDES);
    addEEnumLiteral(temporalEEnum, Temporal.BETWEEN);
    addEEnumLiteral(temporalEEnum, Temporal.EVENTUALLY);
    addEEnumLiteral(temporalEEnum, Temporal.ALWAYS);
    addEEnumLiteral(temporalEEnum, Temporal.BEFORE);
    addEEnumLiteral(temporalEEnum, Temporal.AFTER);
    addEEnumLiteral(temporalEEnum, Temporal.UNTIL);
    addEEnumLiteral(temporalEEnum, Temporal.NEVER);
    addEEnumLiteral(temporalEEnum, Temporal.LEADS);
    addEEnumLiteral(temporalEEnum, Temporal.ABSENT);
    addEEnumLiteral(temporalEEnum, Temporal.EXISTS);

    initEEnum(logicalEEnum, Logical.class, "Logical");
    addEEnumLiteral(logicalEEnum, Logical.AND);
    addEEnumLiteral(logicalEEnum, Logical.OR);
    addEEnumLiteral(logicalEEnum, Logical.NOT);

    initEEnum(coherenceEEnum, Coherence.class, "Coherence");
    addEEnumLiteral(coherenceEEnum, Coherence.EXPLAIN);
    addEEnumLiteral(coherenceEEnum, Coherence.ANALOGOUS);
    addEEnumLiteral(coherenceEEnum, Coherence.DATA);
    addEEnumLiteral(coherenceEEnum, Coherence.CONTRADICT);

    initEEnum(functionEEnum, Function.class, "Function");
    addEEnumLiteral(functionEEnum, Function.MIN);
    addEEnumLiteral(functionEEnum, Function.MAX);
    addEEnumLiteral(functionEEnum, Function.EXP);
    addEEnumLiteral(functionEEnum, Function.INVERSE);
    addEEnumLiteral(functionEEnum, Function.SIN);
    addEEnumLiteral(functionEEnum, Function.COS);
    addEEnumLiteral(functionEEnum, Function.TAN);
    addEEnumLiteral(functionEEnum, Function.FACTORIAL);
    addEEnumLiteral(functionEEnum, Function.LOG);

    initEEnum(changesEEnum, Changes.class, "Changes");
    addEEnumLiteral(changesEEnum, Changes.CHANGED);
    addEEnumLiteral(changesEEnum, Changes.INCREASED);
    addEEnumLiteral(changesEEnum, Changes.DECREASED);
    addEEnumLiteral(changesEEnum, Changes.CONSTANT);

    initEEnum(levelsEEnum, Levels.class, "Levels");
    addEEnumLiteral(levelsEEnum, Levels.HIGH);
    addEEnumLiteral(levelsEEnum, Levels.MEDIUM);
    addEEnumLiteral(levelsEEnum, Levels.LOW);

    initEEnum(designTypeEEnum, DesignType.class, "DesignType");
    addEEnumLiteral(designTypeEEnum, DesignType.FULLFACTORIAL);
    addEEnumLiteral(designTypeEEnum, DesignType.FRACTIONALFACTORIAL);
    addEEnumLiteral(designTypeEEnum, DesignType.OTHERS);

    initEEnum(responseTypeEEnum, ResponseType.class, "ResponseType");
    addEEnumLiteral(responseTypeEEnum, ResponseType.SIMPLE);
    addEEnumLiteral(responseTypeEEnum, ResponseType.COMPOSITE);

    // Create resource
    createResource(eNS_URI);
  }

} //ExperimentOntologyPackageImpl
