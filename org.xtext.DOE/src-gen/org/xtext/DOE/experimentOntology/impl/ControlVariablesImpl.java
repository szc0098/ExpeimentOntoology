/**
 */
package org.xtext.DOE.experimentOntology.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.DOE.experimentOntology.ControlVariables;
import org.xtext.DOE.experimentOntology.ExperimentOntologyPackage;
import org.xtext.DOE.experimentOntology.Values;
import org.xtext.DOE.experimentOntology.VariableType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Variables</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.ControlVariablesImpl#getControlName <em>Control Name</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.ControlVariablesImpl#getControlType <em>Control Type</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.ControlVariablesImpl#getControlValue <em>Control Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControlVariablesImpl extends MinimalEObjectImpl.Container implements ControlVariables
{
  /**
   * The default value of the '{@link #getControlName() <em>Control Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControlName()
   * @generated
   * @ordered
   */
  protected static final String CONTROL_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getControlName() <em>Control Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControlName()
   * @generated
   * @ordered
   */
  protected String controlName = CONTROL_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getControlType() <em>Control Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControlType()
   * @generated
   * @ordered
   */
  protected static final VariableType CONTROL_TYPE_EDEFAULT = VariableType.QUALITATIVE;

  /**
   * The cached value of the '{@link #getControlType() <em>Control Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControlType()
   * @generated
   * @ordered
   */
  protected VariableType controlType = CONTROL_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getControlValue() <em>Control Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControlValue()
   * @generated
   * @ordered
   */
  protected Values controlValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ControlVariablesImpl()
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
    return ExperimentOntologyPackage.Literals.CONTROL_VARIABLES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getControlName()
  {
    return controlName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setControlName(String newControlName)
  {
    String oldControlName = controlName;
    controlName = newControlName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.CONTROL_VARIABLES__CONTROL_NAME, oldControlName, controlName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableType getControlType()
  {
    return controlType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setControlType(VariableType newControlType)
  {
    VariableType oldControlType = controlType;
    controlType = newControlType == null ? CONTROL_TYPE_EDEFAULT : newControlType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.CONTROL_VARIABLES__CONTROL_TYPE, oldControlType, controlType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Values getControlValue()
  {
    return controlValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetControlValue(Values newControlValue, NotificationChain msgs)
  {
    Values oldControlValue = controlValue;
    controlValue = newControlValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.CONTROL_VARIABLES__CONTROL_VALUE, oldControlValue, newControlValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setControlValue(Values newControlValue)
  {
    if (newControlValue != controlValue)
    {
      NotificationChain msgs = null;
      if (controlValue != null)
        msgs = ((InternalEObject)controlValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExperimentOntologyPackage.CONTROL_VARIABLES__CONTROL_VALUE, null, msgs);
      if (newControlValue != null)
        msgs = ((InternalEObject)newControlValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExperimentOntologyPackage.CONTROL_VARIABLES__CONTROL_VALUE, null, msgs);
      msgs = basicSetControlValue(newControlValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.CONTROL_VARIABLES__CONTROL_VALUE, newControlValue, newControlValue));
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
      case ExperimentOntologyPackage.CONTROL_VARIABLES__CONTROL_VALUE:
        return basicSetControlValue(null, msgs);
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
      case ExperimentOntologyPackage.CONTROL_VARIABLES__CONTROL_NAME:
        return getControlName();
      case ExperimentOntologyPackage.CONTROL_VARIABLES__CONTROL_TYPE:
        return getControlType();
      case ExperimentOntologyPackage.CONTROL_VARIABLES__CONTROL_VALUE:
        return getControlValue();
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
      case ExperimentOntologyPackage.CONTROL_VARIABLES__CONTROL_NAME:
        setControlName((String)newValue);
        return;
      case ExperimentOntologyPackage.CONTROL_VARIABLES__CONTROL_TYPE:
        setControlType((VariableType)newValue);
        return;
      case ExperimentOntologyPackage.CONTROL_VARIABLES__CONTROL_VALUE:
        setControlValue((Values)newValue);
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
      case ExperimentOntologyPackage.CONTROL_VARIABLES__CONTROL_NAME:
        setControlName(CONTROL_NAME_EDEFAULT);
        return;
      case ExperimentOntologyPackage.CONTROL_VARIABLES__CONTROL_TYPE:
        setControlType(CONTROL_TYPE_EDEFAULT);
        return;
      case ExperimentOntologyPackage.CONTROL_VARIABLES__CONTROL_VALUE:
        setControlValue((Values)null);
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
      case ExperimentOntologyPackage.CONTROL_VARIABLES__CONTROL_NAME:
        return CONTROL_NAME_EDEFAULT == null ? controlName != null : !CONTROL_NAME_EDEFAULT.equals(controlName);
      case ExperimentOntologyPackage.CONTROL_VARIABLES__CONTROL_TYPE:
        return controlType != CONTROL_TYPE_EDEFAULT;
      case ExperimentOntologyPackage.CONTROL_VARIABLES__CONTROL_VALUE:
        return controlValue != null;
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
    result.append(" (controlName: ");
    result.append(controlName);
    result.append(", controlType: ");
    result.append(controlType);
    result.append(')');
    return result.toString();
  }

} //ControlVariablesImpl
