/**
 */
package org.xtext.DOE.experimentOntology;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dispersed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.DOE.experimentOntology.Dispersed#getDisp <em>Disp</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getDispersed()
 * @model
 * @generated
 */
public interface Dispersed extends Event
{
  /**
   * Returns the value of the '<em><b>Disp</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Disp</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Disp</em>' attribute list.
   * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getDispersed_Disp()
   * @model unique="false"
   * @generated
   */
  EList<String> getDisp();

} // Dispersed
