/**
 */
package org.xtext.DOE.experimentOntology.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.DOE.experimentOntology.ExperimentOntologyPackage;
import org.xtext.DOE.experimentOntology.Response;
import org.xtext.DOE.experimentOntology.ResponseType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.ResponseImpl#getResponseName <em>Response Name</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.ResponseImpl#getResponseType <em>Response Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponseImpl extends MinimalEObjectImpl.Container implements Response
{
  /**
   * The default value of the '{@link #getResponseName() <em>Response Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponseName()
   * @generated
   * @ordered
   */
  protected static final String RESPONSE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getResponseName() <em>Response Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponseName()
   * @generated
   * @ordered
   */
  protected String responseName = RESPONSE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getResponseType() <em>Response Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponseType()
   * @generated
   * @ordered
   */
  protected static final ResponseType RESPONSE_TYPE_EDEFAULT = ResponseType.SIMPLE;

  /**
   * The cached value of the '{@link #getResponseType() <em>Response Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponseType()
   * @generated
   * @ordered
   */
  protected ResponseType responseType = RESPONSE_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ResponseImpl()
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
    return ExperimentOntologyPackage.Literals.RESPONSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getResponseName()
  {
    return responseName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResponseName(String newResponseName)
  {
    String oldResponseName = responseName;
    responseName = newResponseName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.RESPONSE__RESPONSE_NAME, oldResponseName, responseName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResponseType getResponseType()
  {
    return responseType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResponseType(ResponseType newResponseType)
  {
    ResponseType oldResponseType = responseType;
    responseType = newResponseType == null ? RESPONSE_TYPE_EDEFAULT : newResponseType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.RESPONSE__RESPONSE_TYPE, oldResponseType, responseType));
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
      case ExperimentOntologyPackage.RESPONSE__RESPONSE_NAME:
        return getResponseName();
      case ExperimentOntologyPackage.RESPONSE__RESPONSE_TYPE:
        return getResponseType();
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
      case ExperimentOntologyPackage.RESPONSE__RESPONSE_NAME:
        setResponseName((String)newValue);
        return;
      case ExperimentOntologyPackage.RESPONSE__RESPONSE_TYPE:
        setResponseType((ResponseType)newValue);
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
      case ExperimentOntologyPackage.RESPONSE__RESPONSE_NAME:
        setResponseName(RESPONSE_NAME_EDEFAULT);
        return;
      case ExperimentOntologyPackage.RESPONSE__RESPONSE_TYPE:
        setResponseType(RESPONSE_TYPE_EDEFAULT);
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
      case ExperimentOntologyPackage.RESPONSE__RESPONSE_NAME:
        return RESPONSE_NAME_EDEFAULT == null ? responseName != null : !RESPONSE_NAME_EDEFAULT.equals(responseName);
      case ExperimentOntologyPackage.RESPONSE__RESPONSE_TYPE:
        return responseType != RESPONSE_TYPE_EDEFAULT;
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
    result.append(" (responseName: ");
    result.append(responseName);
    result.append(", responseType: ");
    result.append(responseType);
    result.append(')');
    return result.toString();
  }

} //ResponseImpl
