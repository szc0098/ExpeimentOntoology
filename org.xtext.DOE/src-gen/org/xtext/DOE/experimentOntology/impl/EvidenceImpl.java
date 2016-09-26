/**
 */
package org.xtext.DOE.experimentOntology.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.DOE.experimentOntology.Evidence;
import org.xtext.DOE.experimentOntology.ExperimentOntologyPackage;
import org.xtext.DOE.experimentOntology.TemporalPattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evidence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.EvidenceImpl#getEName <em>EName</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.EvidenceImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.EvidenceImpl#getObjOfStudy <em>Obj Of Study</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EvidenceImpl extends MinimalEObjectImpl.Container implements Evidence
{
  /**
   * The default value of the '{@link #getEName() <em>EName</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEName()
   * @generated
   * @ordered
   */
  protected static final String ENAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEName() <em>EName</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEName()
   * @generated
   * @ordered
   */
  protected String eName = ENAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getQuery() <em>Query</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuery()
   * @generated
   * @ordered
   */
  protected EList<TemporalPattern> query;

  /**
   * The default value of the '{@link #getObjOfStudy() <em>Obj Of Study</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjOfStudy()
   * @generated
   * @ordered
   */
  protected static final String OBJ_OF_STUDY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getObjOfStudy() <em>Obj Of Study</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjOfStudy()
   * @generated
   * @ordered
   */
  protected String objOfStudy = OBJ_OF_STUDY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EvidenceImpl()
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
    return ExperimentOntologyPackage.Literals.EVIDENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEName()
  {
    return eName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEName(String newEName)
  {
    String oldEName = eName;
    eName = newEName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.EVIDENCE__ENAME, oldEName, eName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TemporalPattern> getQuery()
  {
    if (query == null)
    {
      query = new EObjectContainmentEList<TemporalPattern>(TemporalPattern.class, this, ExperimentOntologyPackage.EVIDENCE__QUERY);
    }
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getObjOfStudy()
  {
    return objOfStudy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjOfStudy(String newObjOfStudy)
  {
    String oldObjOfStudy = objOfStudy;
    objOfStudy = newObjOfStudy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.EVIDENCE__OBJ_OF_STUDY, oldObjOfStudy, objOfStudy));
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
      case ExperimentOntologyPackage.EVIDENCE__QUERY:
        return ((InternalEList<?>)getQuery()).basicRemove(otherEnd, msgs);
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
      case ExperimentOntologyPackage.EVIDENCE__ENAME:
        return getEName();
      case ExperimentOntologyPackage.EVIDENCE__QUERY:
        return getQuery();
      case ExperimentOntologyPackage.EVIDENCE__OBJ_OF_STUDY:
        return getObjOfStudy();
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
      case ExperimentOntologyPackage.EVIDENCE__ENAME:
        setEName((String)newValue);
        return;
      case ExperimentOntologyPackage.EVIDENCE__QUERY:
        getQuery().clear();
        getQuery().addAll((Collection<? extends TemporalPattern>)newValue);
        return;
      case ExperimentOntologyPackage.EVIDENCE__OBJ_OF_STUDY:
        setObjOfStudy((String)newValue);
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
      case ExperimentOntologyPackage.EVIDENCE__ENAME:
        setEName(ENAME_EDEFAULT);
        return;
      case ExperimentOntologyPackage.EVIDENCE__QUERY:
        getQuery().clear();
        return;
      case ExperimentOntologyPackage.EVIDENCE__OBJ_OF_STUDY:
        setObjOfStudy(OBJ_OF_STUDY_EDEFAULT);
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
      case ExperimentOntologyPackage.EVIDENCE__ENAME:
        return ENAME_EDEFAULT == null ? eName != null : !ENAME_EDEFAULT.equals(eName);
      case ExperimentOntologyPackage.EVIDENCE__QUERY:
        return query != null && !query.isEmpty();
      case ExperimentOntologyPackage.EVIDENCE__OBJ_OF_STUDY:
        return OBJ_OF_STUDY_EDEFAULT == null ? objOfStudy != null : !OBJ_OF_STUDY_EDEFAULT.equals(objOfStudy);
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
    result.append(" (eName: ");
    result.append(eName);
    result.append(", objOfStudy: ");
    result.append(objOfStudy);
    result.append(')');
    return result.toString();
  }

} //EvidenceImpl
