/**
 */
package org.xtext.DOE.experimentOntology;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mech Hypothesis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.DOE.experimentOntology.MechHypothesis#getMName <em>MName</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.MechHypothesis#getAssoMech <em>Asso Mech</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.MechHypothesis#getMechanisticHypothesis <em>Mechanistic Hypothesis</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getMechHypothesis()
 * @model
 * @generated
 */
public interface MechHypothesis extends EObject
{
  /**
   * Returns the value of the '<em><b>MName</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>MName</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>MName</em>' attribute.
   * @see #setMName(String)
   * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getMechHypothesis_MName()
   * @model
   * @generated
   */
  String getMName();

  /**
   * Sets the value of the '{@link org.xtext.DOE.experimentOntology.MechHypothesis#getMName <em>MName</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>MName</em>' attribute.
   * @see #getMName()
   * @generated
   */
  void setMName(String value);

  /**
   * Returns the value of the '<em><b>Asso Mech</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.DOE.experimentOntology.TemporalPattern}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Asso Mech</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Asso Mech</em>' containment reference list.
   * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getMechHypothesis_AssoMech()
   * @model containment="true"
   * @generated
   */
  EList<TemporalPattern> getAssoMech();

  /**
   * Returns the value of the '<em><b>Mechanistic Hypothesis</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mechanistic Hypothesis</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mechanistic Hypothesis</em>' attribute.
   * @see #setMechanisticHypothesis(String)
   * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getMechHypothesis_MechanisticHypothesis()
   * @model
   * @generated
   */
  String getMechanisticHypothesis();

  /**
   * Sets the value of the '{@link org.xtext.DOE.experimentOntology.MechHypothesis#getMechanisticHypothesis <em>Mechanistic Hypothesis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mechanistic Hypothesis</em>' attribute.
   * @see #getMechanisticHypothesis()
   * @generated
   */
  void setMechanisticHypothesis(String value);

} // MechHypothesis
