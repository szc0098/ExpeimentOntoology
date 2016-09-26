/**
 */
package org.xtext.DOE.experimentOntology.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.DOE.experimentOntology.CoherenceLink;
import org.xtext.DOE.experimentOntology.Evidence;
import org.xtext.DOE.experimentOntology.ExperimentOntologyPackage;
import org.xtext.DOE.experimentOntology.Hypothesis;
import org.xtext.DOE.experimentOntology.MechHypothesis;
import org.xtext.DOE.experimentOntology.RelationalQuery;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hypothesis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.HypothesisImpl#getMechHypothesis <em>Mech Hypothesis</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.HypothesisImpl#getEvidences <em>Evidences</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.HypothesisImpl#getCoherenceLinks <em>Coherence Links</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.HypothesisImpl#getRelHypothesis <em>Rel Hypothesis</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HypothesisImpl extends ExperimentOntologyImpl implements Hypothesis
{
  /**
   * The cached value of the '{@link #getMechHypothesis() <em>Mech Hypothesis</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMechHypothesis()
   * @generated
   * @ordered
   */
  protected EList<MechHypothesis> mechHypothesis;

  /**
   * The cached value of the '{@link #getEvidences() <em>Evidences</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvidences()
   * @generated
   * @ordered
   */
  protected EList<Evidence> evidences;

  /**
   * The cached value of the '{@link #getCoherenceLinks() <em>Coherence Links</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCoherenceLinks()
   * @generated
   * @ordered
   */
  protected EList<CoherenceLink> coherenceLinks;

  /**
   * The cached value of the '{@link #getRelHypothesis() <em>Rel Hypothesis</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelHypothesis()
   * @generated
   * @ordered
   */
  protected EList<RelationalQuery> relHypothesis;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HypothesisImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ExperimentOntologyPackage.Literals.HYPOTHESIS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MechHypothesis> getMechHypothesis()
  {
    if (mechHypothesis == null)
    {
      mechHypothesis = new EObjectContainmentEList<MechHypothesis>(MechHypothesis.class, this, ExperimentOntologyPackage.HYPOTHESIS__MECH_HYPOTHESIS);
    }
    return mechHypothesis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Evidence> getEvidences()
  {
    if (evidences == null)
    {
      evidences = new EObjectContainmentEList<Evidence>(Evidence.class, this, ExperimentOntologyPackage.HYPOTHESIS__EVIDENCES);
    }
    return evidences;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CoherenceLink> getCoherenceLinks()
  {
    if (coherenceLinks == null)
    {
      coherenceLinks = new EObjectContainmentEList<CoherenceLink>(CoherenceLink.class, this, ExperimentOntologyPackage.HYPOTHESIS__COHERENCE_LINKS);
    }
    return coherenceLinks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RelationalQuery> getRelHypothesis()
  {
    if (relHypothesis == null)
    {
      relHypothesis = new EObjectContainmentEList<RelationalQuery>(RelationalQuery.class, this, ExperimentOntologyPackage.HYPOTHESIS__REL_HYPOTHESIS);
    }
    return relHypothesis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ExperimentOntologyPackage.HYPOTHESIS__MECH_HYPOTHESIS:
        return ((InternalEList<?>)getMechHypothesis()).basicRemove(otherEnd, msgs);
      case ExperimentOntologyPackage.HYPOTHESIS__EVIDENCES:
        return ((InternalEList<?>)getEvidences()).basicRemove(otherEnd, msgs);
      case ExperimentOntologyPackage.HYPOTHESIS__COHERENCE_LINKS:
        return ((InternalEList<?>)getCoherenceLinks()).basicRemove(otherEnd, msgs);
      case ExperimentOntologyPackage.HYPOTHESIS__REL_HYPOTHESIS:
        return ((InternalEList<?>)getRelHypothesis()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ExperimentOntologyPackage.HYPOTHESIS__MECH_HYPOTHESIS:
        return getMechHypothesis();
      case ExperimentOntologyPackage.HYPOTHESIS__EVIDENCES:
        return getEvidences();
      case ExperimentOntologyPackage.HYPOTHESIS__COHERENCE_LINKS:
        return getCoherenceLinks();
      case ExperimentOntologyPackage.HYPOTHESIS__REL_HYPOTHESIS:
        return getRelHypothesis();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ExperimentOntologyPackage.HYPOTHESIS__MECH_HYPOTHESIS:
        getMechHypothesis().clear();
        getMechHypothesis().addAll((Collection<? extends MechHypothesis>)newValue);
        return;
      case ExperimentOntologyPackage.HYPOTHESIS__EVIDENCES:
        getEvidences().clear();
        getEvidences().addAll((Collection<? extends Evidence>)newValue);
        return;
      case ExperimentOntologyPackage.HYPOTHESIS__COHERENCE_LINKS:
        getCoherenceLinks().clear();
        getCoherenceLinks().addAll((Collection<? extends CoherenceLink>)newValue);
        return;
      case ExperimentOntologyPackage.HYPOTHESIS__REL_HYPOTHESIS:
        getRelHypothesis().clear();
        getRelHypothesis().addAll((Collection<? extends RelationalQuery>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ExperimentOntologyPackage.HYPOTHESIS__MECH_HYPOTHESIS:
        getMechHypothesis().clear();
        return;
      case ExperimentOntologyPackage.HYPOTHESIS__EVIDENCES:
        getEvidences().clear();
        return;
      case ExperimentOntologyPackage.HYPOTHESIS__COHERENCE_LINKS:
        getCoherenceLinks().clear();
        return;
      case ExperimentOntologyPackage.HYPOTHESIS__REL_HYPOTHESIS:
        getRelHypothesis().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ExperimentOntologyPackage.HYPOTHESIS__MECH_HYPOTHESIS:
        return mechHypothesis != null && !mechHypothesis.isEmpty();
      case ExperimentOntologyPackage.HYPOTHESIS__EVIDENCES:
        return evidences != null && !evidences.isEmpty();
      case ExperimentOntologyPackage.HYPOTHESIS__COHERENCE_LINKS:
        return coherenceLinks != null && !coherenceLinks.isEmpty();
      case ExperimentOntologyPackage.HYPOTHESIS__REL_HYPOTHESIS:
        return relHypothesis != null && !relHypothesis.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //HypothesisImpl
