/**
 */
package org.xtext.DOE.experimentOntology;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.DOE.experimentOntology.Reaction#getAgent1 <em>Agent1</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.Reaction#getAgent <em>Agent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getReaction()
 * @model
 * @generated
 */
public interface Reaction extends EObject
{
  /**
   * Returns the value of the '<em><b>Agent1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Agent1</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Agent1</em>' attribute.
   * @see #setAgent1(String)
   * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getReaction_Agent1()
   * @model
   * @generated
   */
  String getAgent1();

  /**
   * Sets the value of the '{@link org.xtext.DOE.experimentOntology.Reaction#getAgent1 <em>Agent1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Agent1</em>' attribute.
   * @see #getAgent1()
   * @generated
   */
  void setAgent1(String value);

  /**
   * Returns the value of the '<em><b>Agent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Agent</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Agent</em>' attribute.
   * @see #setAgent(String)
   * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getReaction_Agent()
   * @model
   * @generated
   */
  String getAgent();

  /**
   * Sets the value of the '{@link org.xtext.DOE.experimentOntology.Reaction#getAgent <em>Agent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Agent</em>' attribute.
   * @see #getAgent()
   * @generated
   */
  void setAgent(String value);

} // Reaction
