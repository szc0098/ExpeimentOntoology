/**
 */
package org.xtext.DOE.experimentOntology.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.DOE.experimentOntology.ExperimentOntologyPackage;
import org.xtext.DOE.experimentOntology.PerformanceMeasure;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Performance Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.PerformanceMeasureImpl#getExpectedResponse <em>Expected Response</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.PerformanceMeasureImpl#getEr <em>Er</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.PerformanceMeasureImpl#getStd <em>Std</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PerformanceMeasureImpl extends MinimalEObjectImpl.Container implements PerformanceMeasure
{
  /**
   * The default value of the '{@link #getExpectedResponse() <em>Expected Response</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpectedResponse()
   * @generated
   * @ordered
   */
  protected static final String EXPECTED_RESPONSE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExpectedResponse() <em>Expected Response</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpectedResponse()
   * @generated
   * @ordered
   */
  protected String expectedResponse = EXPECTED_RESPONSE_EDEFAULT;

  /**
   * The default value of the '{@link #getEr() <em>Er</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEr()
   * @generated
   * @ordered
   */
  protected static final String ER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEr() <em>Er</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEr()
   * @generated
   * @ordered
   */
  protected String er = ER_EDEFAULT;

  /**
   * The default value of the '{@link #getStd() <em>Std</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStd()
   * @generated
   * @ordered
   */
  protected static final String STD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStd() <em>Std</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStd()
   * @generated
   * @ordered
   */
  protected String std = STD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PerformanceMeasureImpl()
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
    return ExperimentOntologyPackage.Literals.PERFORMANCE_MEASURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExpectedResponse()
  {
    return expectedResponse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpectedResponse(String newExpectedResponse)
  {
    String oldExpectedResponse = expectedResponse;
    expectedResponse = newExpectedResponse;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.PERFORMANCE_MEASURE__EXPECTED_RESPONSE, oldExpectedResponse, expectedResponse));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEr()
  {
    return er;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEr(String newEr)
  {
    String oldEr = er;
    er = newEr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.PERFORMANCE_MEASURE__ER, oldEr, er));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStd()
  {
    return std;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStd(String newStd)
  {
    String oldStd = std;
    std = newStd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.PERFORMANCE_MEASURE__STD, oldStd, std));
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
      case ExperimentOntologyPackage.PERFORMANCE_MEASURE__EXPECTED_RESPONSE:
        return getExpectedResponse();
      case ExperimentOntologyPackage.PERFORMANCE_MEASURE__ER:
        return getEr();
      case ExperimentOntologyPackage.PERFORMANCE_MEASURE__STD:
        return getStd();
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
      case ExperimentOntologyPackage.PERFORMANCE_MEASURE__EXPECTED_RESPONSE:
        setExpectedResponse((String)newValue);
        return;
      case ExperimentOntologyPackage.PERFORMANCE_MEASURE__ER:
        setEr((String)newValue);
        return;
      case ExperimentOntologyPackage.PERFORMANCE_MEASURE__STD:
        setStd((String)newValue);
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
      case ExperimentOntologyPackage.PERFORMANCE_MEASURE__EXPECTED_RESPONSE:
        setExpectedResponse(EXPECTED_RESPONSE_EDEFAULT);
        return;
      case ExperimentOntologyPackage.PERFORMANCE_MEASURE__ER:
        setEr(ER_EDEFAULT);
        return;
      case ExperimentOntologyPackage.PERFORMANCE_MEASURE__STD:
        setStd(STD_EDEFAULT);
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
      case ExperimentOntologyPackage.PERFORMANCE_MEASURE__EXPECTED_RESPONSE:
        return EXPECTED_RESPONSE_EDEFAULT == null ? expectedResponse != null : !EXPECTED_RESPONSE_EDEFAULT.equals(expectedResponse);
      case ExperimentOntologyPackage.PERFORMANCE_MEASURE__ER:
        return ER_EDEFAULT == null ? er != null : !ER_EDEFAULT.equals(er);
      case ExperimentOntologyPackage.PERFORMANCE_MEASURE__STD:
        return STD_EDEFAULT == null ? std != null : !STD_EDEFAULT.equals(std);
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
    result.append(" (expectedResponse: ");
    result.append(expectedResponse);
    result.append(", er: ");
    result.append(er);
    result.append(", std: ");
    result.append(std);
    result.append(')');
    return result.toString();
  }

} //PerformanceMeasureImpl
