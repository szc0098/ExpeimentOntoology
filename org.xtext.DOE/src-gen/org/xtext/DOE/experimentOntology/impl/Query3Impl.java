/**
 */
package org.xtext.DOE.experimentOntology.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.DOE.experimentOntology.ExperimentOntologyPackage;
import org.xtext.DOE.experimentOntology.Levels;
import org.xtext.DOE.experimentOntology.Query3;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.Query3Impl#getFactor1 <em>Factor1</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.Query3Impl#getControl1 <em>Control1</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.Query3Impl#getLevel2 <em>Level2</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.Query3Impl#getX2 <em>X2</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.Query3Impl#getResponse1 <em>Response1</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.Query3Impl#getLevel4 <em>Level4</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.Query3Impl#getX4 <em>X4</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.Query3Impl#getLevel <em>Level</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.Query3Impl#getFactor <em>Factor</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.Query3Impl#getControl <em>Control</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.Query3Impl#getResponse <em>Response</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.Query3Impl#getStart1 <em>Start1</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.Query3Impl#getEnd1 <em>End1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Query3Impl extends RelationalQueryImpl implements Query3
{
  /**
   * The default value of the '{@link #getFactor1() <em>Factor1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFactor1()
   * @generated
   * @ordered
   */
  protected static final String FACTOR1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFactor1() <em>Factor1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFactor1()
   * @generated
   * @ordered
   */
  protected String factor1 = FACTOR1_EDEFAULT;

  /**
   * The default value of the '{@link #getControl1() <em>Control1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControl1()
   * @generated
   * @ordered
   */
  protected static final String CONTROL1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getControl1() <em>Control1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControl1()
   * @generated
   * @ordered
   */
  protected String control1 = CONTROL1_EDEFAULT;

  /**
   * The default value of the '{@link #getLevel2() <em>Level2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevel2()
   * @generated
   * @ordered
   */
  protected static final Levels LEVEL2_EDEFAULT = Levels.HIGH;

  /**
   * The cached value of the '{@link #getLevel2() <em>Level2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevel2()
   * @generated
   * @ordered
   */
  protected Levels level2 = LEVEL2_EDEFAULT;

  /**
   * The default value of the '{@link #getX2() <em>X2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX2()
   * @generated
   * @ordered
   */
  protected static final String X2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getX2() <em>X2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX2()
   * @generated
   * @ordered
   */
  protected String x2 = X2_EDEFAULT;

  /**
   * The default value of the '{@link #getResponse1() <em>Response1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponse1()
   * @generated
   * @ordered
   */
  protected static final String RESPONSE1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getResponse1() <em>Response1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponse1()
   * @generated
   * @ordered
   */
  protected String response1 = RESPONSE1_EDEFAULT;

  /**
   * The default value of the '{@link #getLevel4() <em>Level4</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevel4()
   * @generated
   * @ordered
   */
  protected static final Levels LEVEL4_EDEFAULT = Levels.HIGH;

  /**
   * The cached value of the '{@link #getLevel4() <em>Level4</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevel4()
   * @generated
   * @ordered
   */
  protected Levels level4 = LEVEL4_EDEFAULT;

  /**
   * The default value of the '{@link #getX4() <em>X4</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX4()
   * @generated
   * @ordered
   */
  protected static final String X4_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getX4() <em>X4</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX4()
   * @generated
   * @ordered
   */
  protected String x4 = X4_EDEFAULT;

  /**
   * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevel()
   * @generated
   * @ordered
   */
  protected static final Levels LEVEL_EDEFAULT = Levels.HIGH;

  /**
   * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevel()
   * @generated
   * @ordered
   */
  protected Levels level = LEVEL_EDEFAULT;

  /**
   * The default value of the '{@link #getFactor() <em>Factor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFactor()
   * @generated
   * @ordered
   */
  protected static final String FACTOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFactor() <em>Factor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFactor()
   * @generated
   * @ordered
   */
  protected String factor = FACTOR_EDEFAULT;

  /**
   * The default value of the '{@link #getControl() <em>Control</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControl()
   * @generated
   * @ordered
   */
  protected static final String CONTROL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getControl() <em>Control</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControl()
   * @generated
   * @ordered
   */
  protected String control = CONTROL_EDEFAULT;

  /**
   * The default value of the '{@link #getResponse() <em>Response</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponse()
   * @generated
   * @ordered
   */
  protected static final String RESPONSE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getResponse() <em>Response</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponse()
   * @generated
   * @ordered
   */
  protected String response = RESPONSE_EDEFAULT;

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
  protected Query3Impl()
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
    return ExperimentOntologyPackage.Literals.QUERY3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFactor1()
  {
    return factor1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFactor1(String newFactor1)
  {
    String oldFactor1 = factor1;
    factor1 = newFactor1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.QUERY3__FACTOR1, oldFactor1, factor1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getControl1()
  {
    return control1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setControl1(String newControl1)
  {
    String oldControl1 = control1;
    control1 = newControl1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.QUERY3__CONTROL1, oldControl1, control1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Levels getLevel2()
  {
    return level2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLevel2(Levels newLevel2)
  {
    Levels oldLevel2 = level2;
    level2 = newLevel2 == null ? LEVEL2_EDEFAULT : newLevel2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.QUERY3__LEVEL2, oldLevel2, level2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getX2()
  {
    return x2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setX2(String newX2)
  {
    String oldX2 = x2;
    x2 = newX2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.QUERY3__X2, oldX2, x2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getResponse1()
  {
    return response1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResponse1(String newResponse1)
  {
    String oldResponse1 = response1;
    response1 = newResponse1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.QUERY3__RESPONSE1, oldResponse1, response1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Levels getLevel4()
  {
    return level4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLevel4(Levels newLevel4)
  {
    Levels oldLevel4 = level4;
    level4 = newLevel4 == null ? LEVEL4_EDEFAULT : newLevel4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.QUERY3__LEVEL4, oldLevel4, level4));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getX4()
  {
    return x4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setX4(String newX4)
  {
    String oldX4 = x4;
    x4 = newX4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.QUERY3__X4, oldX4, x4));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Levels getLevel()
  {
    return level;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLevel(Levels newLevel)
  {
    Levels oldLevel = level;
    level = newLevel == null ? LEVEL_EDEFAULT : newLevel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.QUERY3__LEVEL, oldLevel, level));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFactor()
  {
    return factor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFactor(String newFactor)
  {
    String oldFactor = factor;
    factor = newFactor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.QUERY3__FACTOR, oldFactor, factor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getControl()
  {
    return control;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setControl(String newControl)
  {
    String oldControl = control;
    control = newControl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.QUERY3__CONTROL, oldControl, control));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getResponse()
  {
    return response;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResponse(String newResponse)
  {
    String oldResponse = response;
    response = newResponse;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.QUERY3__RESPONSE, oldResponse, response));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.QUERY3__START1, oldStart1, start1));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.QUERY3__END1, oldEnd1, end1));
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
      case ExperimentOntologyPackage.QUERY3__FACTOR1:
        return getFactor1();
      case ExperimentOntologyPackage.QUERY3__CONTROL1:
        return getControl1();
      case ExperimentOntologyPackage.QUERY3__LEVEL2:
        return getLevel2();
      case ExperimentOntologyPackage.QUERY3__X2:
        return getX2();
      case ExperimentOntologyPackage.QUERY3__RESPONSE1:
        return getResponse1();
      case ExperimentOntologyPackage.QUERY3__LEVEL4:
        return getLevel4();
      case ExperimentOntologyPackage.QUERY3__X4:
        return getX4();
      case ExperimentOntologyPackage.QUERY3__LEVEL:
        return getLevel();
      case ExperimentOntologyPackage.QUERY3__FACTOR:
        return getFactor();
      case ExperimentOntologyPackage.QUERY3__CONTROL:
        return getControl();
      case ExperimentOntologyPackage.QUERY3__RESPONSE:
        return getResponse();
      case ExperimentOntologyPackage.QUERY3__START1:
        return getStart1();
      case ExperimentOntologyPackage.QUERY3__END1:
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
      case ExperimentOntologyPackage.QUERY3__FACTOR1:
        setFactor1((String)newValue);
        return;
      case ExperimentOntologyPackage.QUERY3__CONTROL1:
        setControl1((String)newValue);
        return;
      case ExperimentOntologyPackage.QUERY3__LEVEL2:
        setLevel2((Levels)newValue);
        return;
      case ExperimentOntologyPackage.QUERY3__X2:
        setX2((String)newValue);
        return;
      case ExperimentOntologyPackage.QUERY3__RESPONSE1:
        setResponse1((String)newValue);
        return;
      case ExperimentOntologyPackage.QUERY3__LEVEL4:
        setLevel4((Levels)newValue);
        return;
      case ExperimentOntologyPackage.QUERY3__X4:
        setX4((String)newValue);
        return;
      case ExperimentOntologyPackage.QUERY3__LEVEL:
        setLevel((Levels)newValue);
        return;
      case ExperimentOntologyPackage.QUERY3__FACTOR:
        setFactor((String)newValue);
        return;
      case ExperimentOntologyPackage.QUERY3__CONTROL:
        setControl((String)newValue);
        return;
      case ExperimentOntologyPackage.QUERY3__RESPONSE:
        setResponse((String)newValue);
        return;
      case ExperimentOntologyPackage.QUERY3__START1:
        setStart1((String)newValue);
        return;
      case ExperimentOntologyPackage.QUERY3__END1:
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
      case ExperimentOntologyPackage.QUERY3__FACTOR1:
        setFactor1(FACTOR1_EDEFAULT);
        return;
      case ExperimentOntologyPackage.QUERY3__CONTROL1:
        setControl1(CONTROL1_EDEFAULT);
        return;
      case ExperimentOntologyPackage.QUERY3__LEVEL2:
        setLevel2(LEVEL2_EDEFAULT);
        return;
      case ExperimentOntologyPackage.QUERY3__X2:
        setX2(X2_EDEFAULT);
        return;
      case ExperimentOntologyPackage.QUERY3__RESPONSE1:
        setResponse1(RESPONSE1_EDEFAULT);
        return;
      case ExperimentOntologyPackage.QUERY3__LEVEL4:
        setLevel4(LEVEL4_EDEFAULT);
        return;
      case ExperimentOntologyPackage.QUERY3__X4:
        setX4(X4_EDEFAULT);
        return;
      case ExperimentOntologyPackage.QUERY3__LEVEL:
        setLevel(LEVEL_EDEFAULT);
        return;
      case ExperimentOntologyPackage.QUERY3__FACTOR:
        setFactor(FACTOR_EDEFAULT);
        return;
      case ExperimentOntologyPackage.QUERY3__CONTROL:
        setControl(CONTROL_EDEFAULT);
        return;
      case ExperimentOntologyPackage.QUERY3__RESPONSE:
        setResponse(RESPONSE_EDEFAULT);
        return;
      case ExperimentOntologyPackage.QUERY3__START1:
        setStart1(START1_EDEFAULT);
        return;
      case ExperimentOntologyPackage.QUERY3__END1:
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
      case ExperimentOntologyPackage.QUERY3__FACTOR1:
        return FACTOR1_EDEFAULT == null ? factor1 != null : !FACTOR1_EDEFAULT.equals(factor1);
      case ExperimentOntologyPackage.QUERY3__CONTROL1:
        return CONTROL1_EDEFAULT == null ? control1 != null : !CONTROL1_EDEFAULT.equals(control1);
      case ExperimentOntologyPackage.QUERY3__LEVEL2:
        return level2 != LEVEL2_EDEFAULT;
      case ExperimentOntologyPackage.QUERY3__X2:
        return X2_EDEFAULT == null ? x2 != null : !X2_EDEFAULT.equals(x2);
      case ExperimentOntologyPackage.QUERY3__RESPONSE1:
        return RESPONSE1_EDEFAULT == null ? response1 != null : !RESPONSE1_EDEFAULT.equals(response1);
      case ExperimentOntologyPackage.QUERY3__LEVEL4:
        return level4 != LEVEL4_EDEFAULT;
      case ExperimentOntologyPackage.QUERY3__X4:
        return X4_EDEFAULT == null ? x4 != null : !X4_EDEFAULT.equals(x4);
      case ExperimentOntologyPackage.QUERY3__LEVEL:
        return level != LEVEL_EDEFAULT;
      case ExperimentOntologyPackage.QUERY3__FACTOR:
        return FACTOR_EDEFAULT == null ? factor != null : !FACTOR_EDEFAULT.equals(factor);
      case ExperimentOntologyPackage.QUERY3__CONTROL:
        return CONTROL_EDEFAULT == null ? control != null : !CONTROL_EDEFAULT.equals(control);
      case ExperimentOntologyPackage.QUERY3__RESPONSE:
        return RESPONSE_EDEFAULT == null ? response != null : !RESPONSE_EDEFAULT.equals(response);
      case ExperimentOntologyPackage.QUERY3__START1:
        return START1_EDEFAULT == null ? start1 != null : !START1_EDEFAULT.equals(start1);
      case ExperimentOntologyPackage.QUERY3__END1:
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
    result.append(" (factor1: ");
    result.append(factor1);
    result.append(", control1: ");
    result.append(control1);
    result.append(", Level2: ");
    result.append(level2);
    result.append(", x2: ");
    result.append(x2);
    result.append(", response1: ");
    result.append(response1);
    result.append(", Level4: ");
    result.append(level4);
    result.append(", x4: ");
    result.append(x4);
    result.append(", level: ");
    result.append(level);
    result.append(", factor: ");
    result.append(factor);
    result.append(", control: ");
    result.append(control);
    result.append(", response: ");
    result.append(response);
    result.append(", start1: ");
    result.append(start1);
    result.append(", end1: ");
    result.append(end1);
    result.append(')');
    return result.toString();
  }

} //Query3Impl
