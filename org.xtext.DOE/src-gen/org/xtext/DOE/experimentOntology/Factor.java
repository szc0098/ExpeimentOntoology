/**
 */
package org.xtext.DOE.experimentOntology;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.DOE.experimentOntology.Factor#getFactorName <em>Factor Name</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.Factor#getFactorType <em>Factor Type</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.Factor#getFactorType1 <em>Factor Type1</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.Factor#getFactorValue <em>Factor Value</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.Factor#getFactorProperties <em>Factor Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getFactor()
 * @model
 * @generated
 */
public interface Factor extends EObject
{
  /**
   * Returns the value of the '<em><b>Factor Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Factor Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Factor Name</em>' attribute.
   * @see #setFactorName(String)
   * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getFactor_FactorName()
   * @model
   * @generated
   */
  String getFactorName();

  /**
   * Sets the value of the '{@link org.xtext.DOE.experimentOntology.Factor#getFactorName <em>Factor Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Factor Name</em>' attribute.
   * @see #getFactorName()
   * @generated
   */
  void setFactorName(String value);

  /**
   * Returns the value of the '<em><b>Factor Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.DOE.experimentOntology.VariableType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Factor Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Factor Type</em>' attribute.
   * @see org.xtext.DOE.experimentOntology.VariableType
   * @see #setFactorType(VariableType)
   * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getFactor_FactorType()
   * @model
   * @generated
   */
  VariableType getFactorType();

  /**
   * Sets the value of the '{@link org.xtext.DOE.experimentOntology.Factor#getFactorType <em>Factor Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Factor Type</em>' attribute.
   * @see org.xtext.DOE.experimentOntology.VariableType
   * @see #getFactorType()
   * @generated
   */
  void setFactorType(VariableType value);

  /**
   * Returns the value of the '<em><b>Factor Type1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Factor Type1</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Factor Type1</em>' attribute.
   * @see #setFactorType1(String)
   * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getFactor_FactorType1()
   * @model
   * @generated
   */
  String getFactorType1();

  /**
   * Sets the value of the '{@link org.xtext.DOE.experimentOntology.Factor#getFactorType1 <em>Factor Type1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Factor Type1</em>' attribute.
   * @see #getFactorType1()
   * @generated
   */
  void setFactorType1(String value);

  /**
   * Returns the value of the '<em><b>Factor Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Factor Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Factor Value</em>' containment reference.
   * @see #setFactorValue(Values)
   * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getFactor_FactorValue()
   * @model containment="true"
   * @generated
   */
  Values getFactorValue();

  /**
   * Sets the value of the '{@link org.xtext.DOE.experimentOntology.Factor#getFactorValue <em>Factor Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Factor Value</em>' containment reference.
   * @see #getFactorValue()
   * @generated
   */
  void setFactorValue(Values value);

  /**
   * Returns the value of the '<em><b>Factor Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.DOE.experimentOntology.properties}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Factor Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Factor Properties</em>' containment reference list.
   * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getFactor_FactorProperties()
   * @model containment="true"
   * @generated
   */
  EList<properties> getFactorProperties();

} // Factor
