/**
 */
package org.xtext.DOE.experimentOntology;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.DOE.experimentOntology.ModelSection#getModName <em>Mod Name</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.ModelSection#getMechanisms <em>Mechanisms</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.ModelSection#getEvents <em>Events</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.ModelSection#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getModelSection()
 * @model
 * @generated
 */
public interface ModelSection extends ExperimentOntology
{
  /**
   * Returns the value of the '<em><b>Mod Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mod Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mod Name</em>' attribute.
   * @see #setModName(String)
   * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getModelSection_ModName()
   * @model
   * @generated
   */
  String getModName();

  /**
   * Sets the value of the '{@link org.xtext.DOE.experimentOntology.ModelSection#getModName <em>Mod Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mod Name</em>' attribute.
   * @see #getModName()
   * @generated
   */
  void setModName(String value);

  /**
   * Returns the value of the '<em><b>Mechanisms</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.DOE.experimentOntology.Mechanism}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mechanisms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mechanisms</em>' containment reference list.
   * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getModelSection_Mechanisms()
   * @model containment="true"
   * @generated
   */
  EList<Mechanism> getMechanisms();

  /**
   * Returns the value of the '<em><b>Events</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.DOE.experimentOntology.EventDescriptor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Events</em>' containment reference list.
   * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getModelSection_Events()
   * @model containment="true"
   * @generated
   */
  EList<EventDescriptor> getEvents();

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.DOE.experimentOntology.Factor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getModelSection_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<Factor> getParameters();

} // ModelSection
