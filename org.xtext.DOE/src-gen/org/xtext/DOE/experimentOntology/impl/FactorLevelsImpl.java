/**
 */
package org.xtext.DOE.experimentOntology.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.DOE.experimentOntology.ExperimentOntologyPackage;
import org.xtext.DOE.experimentOntology.FactorLevels;
import org.xtext.DOE.experimentOntology.Levels;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Factor Levels</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.FactorLevelsImpl#getFacName <em>Fac Name</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.FactorLevelsImpl#getL <em>L</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.FactorLevelsImpl#getL1 <em>L1</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.FactorLevelsImpl#getL2 <em>L2</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.FactorLevelsImpl#getStart1 <em>Start1</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.FactorLevelsImpl#getEnd1 <em>End1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FactorLevelsImpl extends MinimalEObjectImpl.Container implements FactorLevels
{
  /**
   * The default value of the '{@link #getFacName() <em>Fac Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFacName()
   * @generated
   * @ordered
   */
  protected static final String FAC_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFacName() <em>Fac Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFacName()
   * @generated
   * @ordered
   */
  protected String facName = FAC_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getL() <em>L</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getL()
   * @generated
   * @ordered
   */
  protected static final String L_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getL() <em>L</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getL()
   * @generated
   * @ordered
   */
  protected String l = L_EDEFAULT;

  /**
   * The default value of the '{@link #getL1() <em>L1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getL1()
   * @generated
   * @ordered
   */
  protected static final Levels L1_EDEFAULT = Levels.HIGH;

  /**
   * The cached value of the '{@link #getL1() <em>L1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getL1()
   * @generated
   * @ordered
   */
  protected Levels l1 = L1_EDEFAULT;

  /**
   * The default value of the '{@link #getL2() <em>L2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getL2()
   * @generated
   * @ordered
   */
  protected static final Levels L2_EDEFAULT = Levels.HIGH;

  /**
   * The cached value of the '{@link #getL2() <em>L2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getL2()
   * @generated
   * @ordered
   */
  protected Levels l2 = L2_EDEFAULT;

  /**
   * The default value of the '{@link #getStart1() <em>Start1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart1()
   * @generated
   * @ordered
   */
  protected static final String START1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStart1() <em>Start1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart1()
   * @generated
   * @ordered
   */
  protected String start1 = START1_EDEFAULT;

  /**
   * The default value of the '{@link #getEnd1() <em>End1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd1()
   * @generated
   * @ordered
   */
  protected static final String END1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEnd1() <em>End1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd1()
   * @generated
   * @ordered
   */
  protected String end1 = END1_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FactorLevelsImpl()
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
    return ExperimentOntologyPackage.Literals.FACTOR_LEVELS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFacName()
  {
    return facName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFacName(String newFacName)
  {
    String oldFacName = facName;
    facName = newFacName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.FACTOR_LEVELS__FAC_NAME, oldFacName, facName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getL()
  {
    return l;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setL(String newL)
  {
    String oldL = l;
    l = newL;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.FACTOR_LEVELS__L, oldL, l));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Levels getL1()
  {
    return l1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setL1(Levels newL1)
  {
    Levels oldL1 = l1;
    l1 = newL1 == null ? L1_EDEFAULT : newL1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.FACTOR_LEVELS__L1, oldL1, l1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Levels getL2()
  {
    return l2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setL2(Levels newL2)
  {
    Levels oldL2 = l2;
    l2 = newL2 == null ? L2_EDEFAULT : newL2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.FACTOR_LEVELS__L2, oldL2, l2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStart1()
  {
    return start1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStart1(String newStart1)
  {
    String oldStart1 = start1;
    start1 = newStart1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.FACTOR_LEVELS__START1, oldStart1, start1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEnd1()
  {
    return end1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnd1(String newEnd1)
  {
    String oldEnd1 = end1;
    end1 = newEnd1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.FACTOR_LEVELS__END1, oldEnd1, end1));
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
      case ExperimentOntologyPackage.FACTOR_LEVELS__FAC_NAME:
        return getFacName();
      case ExperimentOntologyPackage.FACTOR_LEVELS__L:
        return getL();
      case ExperimentOntologyPackage.FACTOR_LEVELS__L1:
        return getL1();
      case ExperimentOntologyPackage.FACTOR_LEVELS__L2:
        return getL2();
      case ExperimentOntologyPackage.FACTOR_LEVELS__START1:
        return getStart1();
      case ExperimentOntologyPackage.FACTOR_LEVELS__END1:
        return getEnd1();
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
      case ExperimentOntologyPackage.FACTOR_LEVELS__FAC_NAME:
        setFacName((String)newValue);
        return;
      case ExperimentOntologyPackage.FACTOR_LEVELS__L:
        setL((String)newValue);
        return;
      case ExperimentOntologyPackage.FACTOR_LEVELS__L1:
        setL1((Levels)newValue);
        return;
      case ExperimentOntologyPackage.FACTOR_LEVELS__L2:
        setL2((Levels)newValue);
        return;
      case ExperimentOntologyPackage.FACTOR_LEVELS__START1:
        setStart1((String)newValue);
        return;
      case ExperimentOntologyPackage.FACTOR_LEVELS__END1:
        setEnd1((String)newValue);
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
      case ExperimentOntologyPackage.FACTOR_LEVELS__FAC_NAME:
        setFacName(FAC_NAME_EDEFAULT);
        return;
      case ExperimentOntologyPackage.FACTOR_LEVELS__L:
        setL(L_EDEFAULT);
        return;
      case ExperimentOntologyPackage.FACTOR_LEVELS__L1:
        setL1(L1_EDEFAULT);
        return;
      case ExperimentOntologyPackage.FACTOR_LEVELS__L2:
        setL2(L2_EDEFAULT);
        return;
      case ExperimentOntologyPackage.FACTOR_LEVELS__START1:
        setStart1(START1_EDEFAULT);
        return;
      case ExperimentOntologyPackage.FACTOR_LEVELS__END1:
        setEnd1(END1_EDEFAULT);
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
      case ExperimentOntologyPackage.FACTOR_LEVELS__FAC_NAME:
        return FAC_NAME_EDEFAULT == null ? facName != null : !FAC_NAME_EDEFAULT.equals(facName);
      case ExperimentOntologyPackage.FACTOR_LEVELS__L:
        return L_EDEFAULT == null ? l != null : !L_EDEFAULT.equals(l);
      case ExperimentOntologyPackage.FACTOR_LEVELS__L1:
        return l1 != L1_EDEFAULT;
      case ExperimentOntologyPackage.FACTOR_LEVELS__L2:
        return l2 != L2_EDEFAULT;
      case ExperimentOntologyPackage.FACTOR_LEVELS__START1:
        return START1_EDEFAULT == null ? start1 != null : !START1_EDEFAULT.equals(start1);
      case ExperimentOntologyPackage.FACTOR_LEVELS__END1:
        return END1_EDEFAULT == null ? end1 != null : !END1_EDEFAULT.equals(end1);
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
    result.append(" (facName: ");
    result.append(facName);
    result.append(", l: ");
    result.append(l);
    result.append(", l1: ");
    result.append(l1);
    result.append(", l2: ");
    result.append(l2);
    result.append(", start1: ");
    result.append(start1);
    result.append(", end1: ");
    result.append(end1);
    result.append(')');
    return result.toString();
  }

} //FactorLevelsImpl
