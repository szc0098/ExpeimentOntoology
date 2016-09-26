/**
 */
package org.xtext.DOE.experimentOntology;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Performance Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.DOE.experimentOntology.PerformanceMeasure#getExpectedResponse <em>Expected Response</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.PerformanceMeasure#getEr <em>Er</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.PerformanceMeasure#getStd <em>Std</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getPerformanceMeasure()
 * @model
 * @generated
 */
public interface PerformanceMeasure extends EObject
{
  /**
   * Returns the value of the '<em><b>Expected Response</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expected Response</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expected Response</em>' attribute.
   * @see #setExpectedResponse(String)
   * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getPerformanceMeasure_ExpectedResponse()
   * @model
   * @generated
   */
  String getExpectedResponse();

  /**
   * Sets the value of the '{@link org.xtext.DOE.experimentOntology.PerformanceMeasure#getExpectedResponse <em>Expected Response</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expected Response</em>' attribute.
   * @see #getExpectedResponse()
   * @generated
   */
  void setExpectedResponse(String value);

  /**
   * Returns the value of the '<em><b>Er</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Er</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Er</em>' attribute.
   * @see #setEr(String)
   * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getPerformanceMeasure_Er()
   * @model
   * @generated
   */
  String getEr();

  /**
   * Sets the value of the '{@link org.xtext.DOE.experimentOntology.PerformanceMeasure#getEr <em>Er</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Er</em>' attribute.
   * @see #getEr()
   * @generated
   */
  void setEr(String value);

  /**
   * Returns the value of the '<em><b>Std</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Std</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Std</em>' attribute.
   * @see #setStd(String)
   * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getPerformanceMeasure_Std()
   * @model
   * @generated
   */
  String getStd();

  /**
   * Sets the value of the '{@link org.xtext.DOE.experimentOntology.PerformanceMeasure#getStd <em>Std</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Std</em>' attribute.
   * @see #getStd()
   * @generated
   */
  void setStd(String value);

} // PerformanceMeasure
