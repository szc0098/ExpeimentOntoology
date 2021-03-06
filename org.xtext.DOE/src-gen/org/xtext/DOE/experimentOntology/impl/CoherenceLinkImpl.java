/**
 */
package org.xtext.DOE.experimentOntology.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.DOE.experimentOntology.Coherence;
import org.xtext.DOE.experimentOntology.CoherenceLink;
import org.xtext.DOE.experimentOntology.ExperimentOntologyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coherence Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.CoherenceLinkImpl#getCoherence <em>Coherence</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.CoherenceLinkImpl#getHyp <em>Hyp</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.CoherenceLinkImpl#getEvi <em>Evi</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoherenceLinkImpl extends MinimalEObjectImpl.Container implements CoherenceLink
{
  /**
   * The default value of the '{@link #getCoherence() <em>Coherence</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCoherence()
   * @generated
   * @ordered
   */
  protected static final Coherence COHERENCE_EDEFAULT = Coherence.EXPLAIN;

  /**
   * The cached value of the '{@link #getCoherence() <em>Coherence</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCoherence()
   * @generated
   * @ordered
   */
  protected Coherence coherence = COHERENCE_EDEFAULT;

  /**
   * The cached value of the '{@link #getHyp() <em>Hyp</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHyp()
   * @generated
   * @ordered
   */
  protected EList<String> hyp;

  /**
   * The cached value of the '{@link #getEvi() <em>Evi</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvi()
   * @generated
   * @ordered
   */
  protected EList<String> evi;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CoherenceLinkImpl()
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
    return ExperimentOntologyPackage.Literals.COHERENCE_LINK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Coherence getCoherence()
  {
    return coherence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCoherence(Coherence newCoherence)
  {
    Coherence oldCoherence = coherence;
    coherence = newCoherence == null ? COHERENCE_EDEFAULT : newCoherence;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.COHERENCE_LINK__COHERENCE, oldCoherence, coherence));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getHyp()
  {
    if (hyp == null)
    {
      hyp = new EDataTypeEList<String>(String.class, this, ExperimentOntologyPackage.COHERENCE_LINK__HYP);
    }
    return hyp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getEvi()
  {
    if (evi == null)
    {
      evi = new EDataTypeEList<String>(String.class, this, ExperimentOntologyPackage.COHERENCE_LINK__EVI);
    }
    return evi;
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
      case ExperimentOntologyPackage.COHERENCE_LINK__COHERENCE:
        return getCoherence();
      case ExperimentOntologyPackage.COHERENCE_LINK__HYP:
        return getHyp();
      case ExperimentOntologyPackage.COHERENCE_LINK__EVI:
        return getEvi();
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
      case ExperimentOntologyPackage.COHERENCE_LINK__COHERENCE:
        setCoherence((Coherence)newValue);
        return;
      case ExperimentOntologyPackage.COHERENCE_LINK__HYP:
        getHyp().clear();
        getHyp().addAll((Collection<? extends String>)newValue);
        return;
      case ExperimentOntologyPackage.COHERENCE_LINK__EVI:
        getEvi().clear();
        getEvi().addAll((Collection<? extends String>)newValue);
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
      case ExperimentOntologyPackage.COHERENCE_LINK__COHERENCE:
        setCoherence(COHERENCE_EDEFAULT);
        return;
      case ExperimentOntologyPackage.COHERENCE_LINK__HYP:
        getHyp().clear();
        return;
      case ExperimentOntologyPackage.COHERENCE_LINK__EVI:
        getEvi().clear();
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
      case ExperimentOntologyPackage.COHERENCE_LINK__COHERENCE:
        return coherence != COHERENCE_EDEFAULT;
      case ExperimentOntologyPackage.COHERENCE_LINK__HYP:
        return hyp != null && !hyp.isEmpty();
      case ExperimentOntologyPackage.COHERENCE_LINK__EVI:
        return evi != null && !evi.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (coherence: ");
    result.append(coherence);
    result.append(", hyp: ");
    result.append(hyp);
    result.append(", evi: ");
    result.append(evi);
    result.append(')');
    return result.toString();
  }

} //CoherenceLinkImpl
