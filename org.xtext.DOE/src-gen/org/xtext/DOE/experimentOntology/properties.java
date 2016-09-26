/**
 */
package org.xtext.DOE.experimentOntology;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.DOE.experimentOntology.properties#getPName <em>PName</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.properties#getPVal <em>PVal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getproperties()
 * @model
 * @generated
 */
public interface properties extends EObject
{
  /**
   * Returns the value of the '<em><b>PName</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>PName</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>PName</em>' attribute.
   * @see #setPName(String)
   * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getproperties_PName()
   * @model
   * @generated
   */
  String getPName();

  /**
   * Sets the value of the '{@link org.xtext.DOE.experimentOntology.properties#getPName <em>PName</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>PName</em>' attribute.
   * @see #getPName()
   * @generated
   */
  void setPName(String value);

  /**
   * Returns the value of the '<em><b>PVal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>PVal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>PVal</em>' containment reference.
   * @see #setPVal(Values)
   * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getproperties_PVal()
   * @model containment="true"
   * @generated
   */
  Values getPVal();

  /**
   * Sets the value of the '{@link org.xtext.DOE.experimentOntology.properties#getPVal <em>PVal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>PVal</em>' containment reference.
   * @see #getPVal()
   * @generated
   */
  void setPVal(Values value);

} // properties
