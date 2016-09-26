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
import org.xtext.DOE.experimentOntology.Values;
import org.xtext.DOE.experimentOntology.properties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.propertiesImpl#getPName <em>PName</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.propertiesImpl#getPVal <em>PVal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class propertiesImpl extends MinimalEObjectImpl.Container implements properties
{
  /**
   * The default value of the '{@link #getPName() <em>PName</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPName()
   * @generated
   * @ordered
   */
  protected static final String PNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPName() <em>PName</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPName()
   * @generated
   * @ordered
   */
  protected String pName = PNAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getPVal() <em>PVal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPVal()
   * @generated
   * @ordered
   */
  protected Values pVal;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected propertiesImpl()
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
    return ExperimentOntologyPackage.Literals.PROPERTIES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPName()
  {
    return pName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPName(String newPName)
  {
    String oldPName = pName;
    pName = newPName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.PROPERTIES__PNAME, oldPName, pName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Values getPVal()
  {
    return pVal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPVal(Values newPVal, NotificationChain msgs)
  {
    Values oldPVal = pVal;
    pVal = newPVal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.PROPERTIES__PVAL, oldPVal, newPVal);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPVal(Values newPVal)
  {
    if (newPVal != pVal)
    {
      NotificationChain msgs = null;
      if (pVal != null)
        msgs = ((InternalEObject)pVal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExperimentOntologyPackage.PROPERTIES__PVAL, null, msgs);
      if (newPVal != null)
        msgs = ((InternalEObject)newPVal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExperimentOntologyPackage.PROPERTIES__PVAL, null, msgs);
      msgs = basicSetPVal(newPVal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.PROPERTIES__PVAL, newPVal, newPVal));
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
      case ExperimentOntologyPackage.PROPERTIES__PVAL:
        return basicSetPVal(null, msgs);
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
      case ExperimentOntologyPackage.PROPERTIES__PNAME:
        return getPName();
      case ExperimentOntologyPackage.PROPERTIES__PVAL:
        return getPVal();
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
      case ExperimentOntologyPackage.PROPERTIES__PNAME:
        setPName((String)newValue);
        return;
      case ExperimentOntologyPackage.PROPERTIES__PVAL:
        setPVal((Values)newValue);
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
      case ExperimentOntologyPackage.PROPERTIES__PNAME:
        setPName(PNAME_EDEFAULT);
        return;
      case ExperimentOntologyPackage.PROPERTIES__PVAL:
        setPVal((Values)null);
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
      case ExperimentOntologyPackage.PROPERTIES__PNAME:
        return PNAME_EDEFAULT == null ? pName != null : !PNAME_EDEFAULT.equals(pName);
      case ExperimentOntologyPackage.PROPERTIES__PVAL:
        return pVal != null;
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
    result.append(" (pName: ");
    result.append(pName);
    result.append(')');
    return result.toString();
  }

} //propertiesImpl
