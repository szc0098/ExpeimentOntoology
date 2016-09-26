/**
 */
package org.xtext.DOE.experimentOntology;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simultaneous</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.DOE.experimentOntology.Simultaneous#getSim1 <em>Sim1</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.Simultaneous#getLog <em>Log</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.Simultaneous#getSim2 <em>Sim2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getSimultaneous()
 * @model
 * @generated
 */
public interface Simultaneous extends Event
{
  /**
   * Returns the value of the '<em><b>Sim1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sim1</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sim1</em>' attribute.
   * @see #setSim1(String)
   * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getSimultaneous_Sim1()
   * @model
   * @generated
   */
  String getSim1();

  /**
   * Sets the value of the '{@link org.xtext.DOE.experimentOntology.Simultaneous#getSim1 <em>Sim1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sim1</em>' attribute.
   * @see #getSim1()
   * @generated
   */
  void setSim1(String value);

  /**
   * Returns the value of the '<em><b>Log</b></em>' attribute list.
   * The list contents are of type {@link org.xtext.DOE.experimentOntology.Logical}.
   * The literals are from the enumeration {@link org.xtext.DOE.experimentOntology.Logical}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Log</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Log</em>' attribute list.
   * @see org.xtext.DOE.experimentOntology.Logical
   * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getSimultaneous_Log()
   * @model unique="false"
   * @generated
   */
  EList<Logical> getLog();

  /**
   * Returns the value of the '<em><b>Sim2</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sim2</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sim2</em>' attribute list.
   * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getSimultaneous_Sim2()
   * @model unique="false"
   * @generated
   */
  EList<String> getSim2();

} // Simultaneous
