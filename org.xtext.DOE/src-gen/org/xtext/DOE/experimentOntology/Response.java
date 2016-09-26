/**
 */
package org.xtext.DOE.experimentOntology;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.DOE.experimentOntology.Response#getResponseName <em>Response Name</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.Response#getResponseType <em>Response Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getResponse()
 * @model
 * @generated
 */
public interface Response extends EObject
{
  /**
   * Returns the value of the '<em><b>Response Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Response Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Response Name</em>' attribute.
   * @see #setResponseName(String)
   * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getResponse_ResponseName()
   * @model
   * @generated
   */
  String getResponseName();

  /**
   * Sets the value of the '{@link org.xtext.DOE.experimentOntology.Response#getResponseName <em>Response Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Response Name</em>' attribute.
   * @see #getResponseName()
   * @generated
   */
  void setResponseName(String value);

  /**
   * Returns the value of the '<em><b>Response Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.DOE.experimentOntology.ResponseType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Response Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Response Type</em>' attribute.
   * @see org.xtext.DOE.experimentOntology.ResponseType
   * @see #setResponseType(ResponseType)
   * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getResponse_ResponseType()
   * @model
   * @generated
   */
  ResponseType getResponseType();

  /**
   * Sets the value of the '{@link org.xtext.DOE.experimentOntology.Response#getResponseType <em>Response Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Response Type</em>' attribute.
   * @see org.xtext.DOE.experimentOntology.ResponseType
   * @see #getResponseType()
   * @generated
   */
  void setResponseType(ResponseType value);

} // Response
