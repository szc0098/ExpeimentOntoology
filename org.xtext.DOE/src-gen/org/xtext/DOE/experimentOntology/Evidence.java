/**
 */
package org.xtext.DOE.experimentOntology;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evidence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.DOE.experimentOntology.Evidence#getEName <em>EName</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.Evidence#getQuery <em>Query</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.Evidence#getObjOfStudy <em>Obj Of Study</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getEvidence()
 * @model
 * @generated
 */
public interface Evidence extends EObject
{
  /**
   * Returns the value of the '<em><b>EName</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EName</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>EName</em>' attribute.
   * @see #setEName(String)
   * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getEvidence_EName()
   * @model
   * @generated
   */
  String getEName();

  /**
   * Sets the value of the '{@link org.xtext.DOE.experimentOntology.Evidence#getEName <em>EName</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>EName</em>' attribute.
   * @see #getEName()
   * @generated
   */
  void setEName(String value);

  /**
   * Returns the value of the '<em><b>Query</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.DOE.experimentOntology.TemporalPattern}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query</em>' containment reference list.
   * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getEvidence_Query()
   * @model containment="true"
   * @generated
   */
  EList<TemporalPattern> getQuery();

  /**
   * Returns the value of the '<em><b>Obj Of Study</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Obj Of Study</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Obj Of Study</em>' attribute.
   * @see #setObjOfStudy(String)
   * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getEvidence_ObjOfStudy()
   * @model
   * @generated
   */
  String getObjOfStudy();

  /**
   * Sets the value of the '{@link org.xtext.DOE.experimentOntology.Evidence#getObjOfStudy <em>Obj Of Study</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Obj Of Study</em>' attribute.
   * @see #getObjOfStudy()
   * @generated
   */
  void setObjOfStudy(String value);

} // Evidence
