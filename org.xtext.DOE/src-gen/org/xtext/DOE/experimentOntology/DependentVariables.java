/**
 */
package org.xtext.DOE.experimentOntology;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependent Variables</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.DOE.experimentOntology.DependentVariables#getResponseName <em>Response Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getDependentVariables()
 * @model
 * @generated
 */
public interface DependentVariables extends EObject
{
  /**
   * Returns the value of the '<em><b>Response Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Response Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Response Name</em>' containment reference.
   * @see #setResponseName(Response)
   * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getDependentVariables_ResponseName()
   * @model containment="true"
   * @generated
   */
  Response getResponseName();

  /**
   * Sets the value of the '{@link org.xtext.DOE.experimentOntology.DependentVariables#getResponseName <em>Response Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Response Name</em>' containment reference.
   * @see #getResponseName()
   * @generated
   */
  void setResponseName(Response value);

} // DependentVariables
