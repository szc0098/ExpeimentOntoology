/**
 */
package org.xtext.DOE.experimentOntology.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.DOE.experimentOntology.ExperimentOntologyPackage;
import org.xtext.DOE.experimentOntology.GuardCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guard Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.GuardConditionImpl#getGd <em>Gd</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.GuardConditionImpl#getCondition1 <em>Condition1</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.GuardConditionImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.GuardConditionImpl#getCondition2 <em>Condition2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GuardConditionImpl extends MinimalEObjectImpl.Container implements GuardCondition
{
  /**
   * The default value of the '{@link #getGd() <em>Gd</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGd()
   * @generated
   * @ordered
   */
  protected static final String GD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGd() <em>Gd</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGd()
   * @generated
   * @ordered
   */
  protected String gd = GD_EDEFAULT;

  /**
   * The default value of the '{@link #getCondition1() <em>Condition1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition1()
   * @generated
   * @ordered
   */
  protected static final String CONDITION1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCondition1() <em>Condition1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition1()
   * @generated
   * @ordered
   */
  protected String condition1 = CONDITION1_EDEFAULT;

  /**
   * The default value of the '{@link #getLink() <em>Link</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLink()
   * @generated
   * @ordered
   */
  protected static final String LINK_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLink() <em>Link</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLink()
   * @generated
   * @ordered
   */
  protected String link = LINK_EDEFAULT;

  /**
   * The default value of the '{@link #getCondition2() <em>Condition2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition2()
   * @generated
   * @ordered
   */
  protected static final String CONDITION2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCondition2() <em>Condition2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition2()
   * @generated
   * @ordered
   */
  protected String condition2 = CONDITION2_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GuardConditionImpl()
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
    return ExperimentOntologyPackage.Literals.GUARD_CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGd()
  {
    return gd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGd(String newGd)
  {
    String oldGd = gd;
    gd = newGd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.GUARD_CONDITION__GD, oldGd, gd));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCondition1()
  {
    return condition1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition1(String newCondition1)
  {
    String oldCondition1 = condition1;
    condition1 = newCondition1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.GUARD_CONDITION__CONDITION1, oldCondition1, condition1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLink()
  {
    return link;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLink(String newLink)
  {
    String oldLink = link;
    link = newLink;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.GUARD_CONDITION__LINK, oldLink, link));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCondition2()
  {
    return condition2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition2(String newCondition2)
  {
    String oldCondition2 = condition2;
    condition2 = newCondition2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.GUARD_CONDITION__CONDITION2, oldCondition2, condition2));
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
      case ExperimentOntologyPackage.GUARD_CONDITION__GD:
        return getGd();
      case ExperimentOntologyPackage.GUARD_CONDITION__CONDITION1:
        return getCondition1();
      case ExperimentOntologyPackage.GUARD_CONDITION__LINK:
        return getLink();
      case ExperimentOntologyPackage.GUARD_CONDITION__CONDITION2:
        return getCondition2();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ExperimentOntologyPackage.GUARD_CONDITION__GD:
        setGd((String)newValue);
        return;
      case ExperimentOntologyPackage.GUARD_CONDITION__CONDITION1:
        setCondition1((String)newValue);
        return;
      case ExperimentOntologyPackage.GUARD_CONDITION__LINK:
        setLink((String)newValue);
        return;
      case ExperimentOntologyPackage.GUARD_CONDITION__CONDITION2:
        setCondition2((String)newValue);
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
      case ExperimentOntologyPackage.GUARD_CONDITION__GD:
        setGd(GD_EDEFAULT);
        return;
      case ExperimentOntologyPackage.GUARD_CONDITION__CONDITION1:
        setCondition1(CONDITION1_EDEFAULT);
        return;
      case ExperimentOntologyPackage.GUARD_CONDITION__LINK:
        setLink(LINK_EDEFAULT);
        return;
      case ExperimentOntologyPackage.GUARD_CONDITION__CONDITION2:
        setCondition2(CONDITION2_EDEFAULT);
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
      case ExperimentOntologyPackage.GUARD_CONDITION__GD:
        return GD_EDEFAULT == null ? gd != null : !GD_EDEFAULT.equals(gd);
      case ExperimentOntologyPackage.GUARD_CONDITION__CONDITION1:
        return CONDITION1_EDEFAULT == null ? condition1 != null : !CONDITION1_EDEFAULT.equals(condition1);
      case ExperimentOntologyPackage.GUARD_CONDITION__LINK:
        return LINK_EDEFAULT == null ? link != null : !LINK_EDEFAULT.equals(link);
      case ExperimentOntologyPackage.GUARD_CONDITION__CONDITION2:
        return CONDITION2_EDEFAULT == null ? condition2 != null : !CONDITION2_EDEFAULT.equals(condition2);
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
    result.append(" (gd: ");
    result.append(gd);
    result.append(", condition1: ");
    result.append(condition1);
    result.append(", link: ");
    result.append(link);
    result.append(", condition2: ");
    result.append(condition2);
    result.append(')');
    return result.toString();
  }

} //GuardConditionImpl
