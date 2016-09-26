/**
 */
package org.xtext.DOE.experimentOntology;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hypothesis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.DOE.experimentOntology.Hypothesis#getMechHypothesis <em>Mech Hypothesis</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.Hypothesis#getEvidences <em>Evidences</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.Hypothesis#getCoherenceLinks <em>Coherence Links</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.Hypothesis#getRelHypothesis <em>Rel Hypothesis</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getHypothesis()
 * @model
 * @generated
 */
public interface Hypothesis extends ExperimentOntology
{
  /**
   * Returns the value of the '<em><b>Mech Hypothesis</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.DOE.experimentOntology.MechHypothesis}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mech Hypothesis</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mech Hypothesis</em>' containment reference list.
   * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getHypothesis_MechHypothesis()
   * @model containment="true"
   * @generated
   */
  EList<MechHypothesis> getMechHypothesis();

  /**
   * Returns the value of the '<em><b>Evidences</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.DOE.experimentOntology.Evidence}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Evidences</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Evidences</em>' containment reference list.
   * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getHypothesis_Evidences()
   * @model containment="true"
   * @generated
   */
  EList<Evidence> getEvidences();

  /**
   * Returns the value of the '<em><b>Coherence Links</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.DOE.experimentOntology.CoherenceLink}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Coherence Links</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Coherence Links</em>' containment reference list.
   * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getHypothesis_CoherenceLinks()
   * @model containment="true"
   * @generated
   */
  EList<CoherenceLink> getCoherenceLinks();

  /**
   * Returns the value of the '<em><b>Rel Hypothesis</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.DOE.experimentOntology.RelationalQuery}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rel Hypothesis</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rel Hypothesis</em>' containment reference list.
   * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getHypothesis_RelHypothesis()
   * @model containment="true"
   * @generated
   */
  EList<RelationalQuery> getRelHypothesis();

} // Hypothesis
