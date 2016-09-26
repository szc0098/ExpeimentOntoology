/**
 */
package org.xtext.DOE.experimentOntology;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iteration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.DOE.experimentOntology.Iteration#getIterations <em>Iterations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getIteration()
 * @model
 * @generated
 */
public interface Iteration extends EObject
{
  /**
   * Returns the value of the '<em><b>Iterations</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Iterations</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Iterations</em>' attribute.
   * @see #setIterations(int)
   * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getIteration_Iterations()
   * @model
   * @generated
   */
  int getIterations();

  /**
   * Sets the value of the '{@link org.xtext.DOE.experimentOntology.Iteration#getIterations <em>Iterations</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Iterations</em>' attribute.
   * @see #getIterations()
   * @generated
   */
  void setIterations(int value);

} // Iteration
