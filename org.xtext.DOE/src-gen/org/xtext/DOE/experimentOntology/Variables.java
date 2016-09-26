/**
 */
package org.xtext.DOE.experimentOntology;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variables</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.DOE.experimentOntology.Variables#getIndependentVariables <em>Independent Variables</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.Variables#getControlVariables <em>Control Variables</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.Variables#getDependentVariables <em>Dependent Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getVariables()
 * @model
 * @generated
 */
public interface Variables extends EObject
{
  /**
   * Returns the value of the '<em><b>Independent Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Independent Variables</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Independent Variables</em>' containment reference.
   * @see #setIndependentVariables(IndependentVariables)
   * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getVariables_IndependentVariables()
   * @model containment="true"
   * @generated
   */
  IndependentVariables getIndependentVariables();

  /**
   * Sets the value of the '{@link org.xtext.DOE.experimentOntology.Variables#getIndependentVariables <em>Independent Variables</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Independent Variables</em>' containment reference.
   * @see #getIndependentVariables()
   * @generated
   */
  void setIndependentVariables(IndependentVariables value);

  /**
   * Returns the value of the '<em><b>Control Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Control Variables</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Control Variables</em>' containment reference.
   * @see #setControlVariables(ControlVariables)
   * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getVariables_ControlVariables()
   * @model containment="true"
   * @generated
   */
  ControlVariables getControlVariables();

  /**
   * Sets the value of the '{@link org.xtext.DOE.experimentOntology.Variables#getControlVariables <em>Control Variables</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Control Variables</em>' containment reference.
   * @see #getControlVariables()
   * @generated
   */
  void setControlVariables(ControlVariables value);

  /**
   * Returns the value of the '<em><b>Dependent Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependent Variables</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dependent Variables</em>' containment reference.
   * @see #setDependentVariables(DependentVariables)
   * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getVariables_DependentVariables()
   * @model containment="true"
   * @generated
   */
  DependentVariables getDependentVariables();

  /**
   * Sets the value of the '{@link org.xtext.DOE.experimentOntology.Variables#getDependentVariables <em>Dependent Variables</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dependent Variables</em>' containment reference.
   * @see #getDependentVariables()
   * @generated
   */
  void setDependentVariables(DependentVariables value);

} // Variables
