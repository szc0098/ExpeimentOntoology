/**
 */
package org.xtext.DOE.experimentOntology.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.DOE.experimentOntology.ExperimentOntologyPackage;
import org.xtext.DOE.experimentOntology.GuardCondition;
import org.xtext.DOE.experimentOntology.Mechanism;
import org.xtext.DOE.experimentOntology.Reaction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mechanism</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.MechanismImpl#getMechanismName <em>Mechanism Name</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.MechanismImpl#getLHS <em>LHS</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.MechanismImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.MechanismImpl#getRHS <em>RHS</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MechanismImpl extends MinimalEObjectImpl.Container implements Mechanism
{
  /**
   * The default value of the '{@link #getMechanismName() <em>Mechanism Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMechanismName()
   * @generated
   * @ordered
   */
  protected static final String MECHANISM_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMechanismName() <em>Mechanism Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMechanismName()
   * @generated
   * @ordered
   */
  protected String mechanismName = MECHANISM_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getLHS() <em>LHS</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLHS()
   * @generated
   * @ordered
   */
  protected Reaction lhs;

  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected GuardCondition condition;

  /**
   * The cached value of the '{@link #getRHS() <em>RHS</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRHS()
   * @generated
   * @ordered
   */
  protected Reaction rhs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MechanismImpl()
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
    return ExperimentOntologyPackage.Literals.MECHANISM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMechanismName()
  {
    return mechanismName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMechanismName(String newMechanismName)
  {
    String oldMechanismName = mechanismName;
    mechanismName = newMechanismName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.MECHANISM__MECHANISM_NAME, oldMechanismName, mechanismName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reaction getLHS()
  {
    return lhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLHS(Reaction newLHS, NotificationChain msgs)
  {
    Reaction oldLHS = lhs;
    lhs = newLHS;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.MECHANISM__LHS, oldLHS, newLHS);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLHS(Reaction newLHS)
  {
    if (newLHS != lhs)
    {
      NotificationChain msgs = null;
      if (lhs != null)
        msgs = ((InternalEObject)lhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExperimentOntologyPackage.MECHANISM__LHS, null, msgs);
      if (newLHS != null)
        msgs = ((InternalEObject)newLHS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExperimentOntologyPackage.MECHANISM__LHS, null, msgs);
      msgs = basicSetLHS(newLHS, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.MECHANISM__LHS, newLHS, newLHS));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GuardCondition getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(GuardCondition newCondition, NotificationChain msgs)
  {
    GuardCondition oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.MECHANISM__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(GuardCondition newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExperimentOntologyPackage.MECHANISM__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExperimentOntologyPackage.MECHANISM__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.MECHANISM__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reaction getRHS()
  {
    return rhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRHS(Reaction newRHS, NotificationChain msgs)
  {
    Reaction oldRHS = rhs;
    rhs = newRHS;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.MECHANISM__RHS, oldRHS, newRHS);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRHS(Reaction newRHS)
  {
    if (newRHS != rhs)
    {
      NotificationChain msgs = null;
      if (rhs != null)
        msgs = ((InternalEObject)rhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExperimentOntologyPackage.MECHANISM__RHS, null, msgs);
      if (newRHS != null)
        msgs = ((InternalEObject)newRHS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExperimentOntologyPackage.MECHANISM__RHS, null, msgs);
      msgs = basicSetRHS(newRHS, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.MECHANISM__RHS, newRHS, newRHS));
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
      case ExperimentOntologyPackage.MECHANISM__LHS:
        return basicSetLHS(null, msgs);
      case ExperimentOntologyPackage.MECHANISM__CONDITION:
        return basicSetCondition(null, msgs);
      case ExperimentOntologyPackage.MECHANISM__RHS:
        return basicSetRHS(null, msgs);
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
      case ExperimentOntologyPackage.MECHANISM__MECHANISM_NAME:
        return getMechanismName();
      case ExperimentOntologyPackage.MECHANISM__LHS:
        return getLHS();
      case ExperimentOntologyPackage.MECHANISM__CONDITION:
        return getCondition();
      case ExperimentOntologyPackage.MECHANISM__RHS:
        return getRHS();
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
      case ExperimentOntologyPackage.MECHANISM__MECHANISM_NAME:
        setMechanismName((String)newValue);
        return;
      case ExperimentOntologyPackage.MECHANISM__LHS:
        setLHS((Reaction)newValue);
        return;
      case ExperimentOntologyPackage.MECHANISM__CONDITION:
        setCondition((GuardCondition)newValue);
        return;
      case ExperimentOntologyPackage.MECHANISM__RHS:
        setRHS((Reaction)newValue);
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
      case ExperimentOntologyPackage.MECHANISM__MECHANISM_NAME:
        setMechanismName(MECHANISM_NAME_EDEFAULT);
        return;
      case ExperimentOntologyPackage.MECHANISM__LHS:
        setLHS((Reaction)null);
        return;
      case ExperimentOntologyPackage.MECHANISM__CONDITION:
        setCondition((GuardCondition)null);
        return;
      case ExperimentOntologyPackage.MECHANISM__RHS:
        setRHS((Reaction)null);
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
      case ExperimentOntologyPackage.MECHANISM__MECHANISM_NAME:
        return MECHANISM_NAME_EDEFAULT == null ? mechanismName != null : !MECHANISM_NAME_EDEFAULT.equals(mechanismName);
      case ExperimentOntologyPackage.MECHANISM__LHS:
        return lhs != null;
      case ExperimentOntologyPackage.MECHANISM__CONDITION:
        return condition != null;
      case ExperimentOntologyPackage.MECHANISM__RHS:
        return rhs != null;
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
    result.append(" (mechanismName: ");
    result.append(mechanismName);
    result.append(')');
    return result.toString();
  }

} //MechanismImpl
