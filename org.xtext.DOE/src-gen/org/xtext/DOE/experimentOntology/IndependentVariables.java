/**
 */
package org.xtext.DOE.experimentOntology;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Independent Variables</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.DOE.experimentOntology.IndependentVariables#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getIndependentVariables()
 * @model
 * @generated
 */
public interface IndependentVariables extends EObject
{
  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.DOE.experimentOntology.FactorLevels}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference list.
   * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getIndependentVariables_Variables()
   * @model containment="true"
   * @generated
   */
  EList<FactorLevels> getVariables();

} // IndependentVariables
