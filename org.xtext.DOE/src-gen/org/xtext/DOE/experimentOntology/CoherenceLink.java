/**
 */
package org.xtext.DOE.experimentOntology;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coherence Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.DOE.experimentOntology.CoherenceLink#getCoherence <em>Coherence</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.CoherenceLink#getHyp <em>Hyp</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.CoherenceLink#getEvi <em>Evi</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getCoherenceLink()
 * @model
 * @generated
 */
public interface CoherenceLink extends EObject
{
  /**
   * Returns the value of the '<em><b>Coherence</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.DOE.experimentOntology.Coherence}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Coherence</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Coherence</em>' attribute.
   * @see org.xtext.DOE.experimentOntology.Coherence
   * @see #setCoherence(Coherence)
   * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getCoherenceLink_Coherence()
   * @model
   * @generated
   */
  Coherence getCoherence();

  /**
   * Sets the value of the '{@link org.xtext.DOE.experimentOntology.CoherenceLink#getCoherence <em>Coherence</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Coherence</em>' attribute.
   * @see org.xtext.DOE.experimentOntology.Coherence
   * @see #getCoherence()
   * @generated
   */
  void setCoherence(Coherence value);

  /**
   * Returns the value of the '<em><b>Hyp</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hyp</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hyp</em>' attribute list.
   * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getCoherenceLink_Hyp()
   * @model unique="false"
   * @generated
   */
  EList<String> getHyp();

  /**
   * Returns the value of the '<em><b>Evi</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Evi</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Evi</em>' attribute list.
   * @see org.xtext.DOE.experimentOntology.ExperimentOntologyPackage#getCoherenceLink_Evi()
   * @model unique="false"
   * @generated
   */
  EList<String> getEvi();

} // CoherenceLink
