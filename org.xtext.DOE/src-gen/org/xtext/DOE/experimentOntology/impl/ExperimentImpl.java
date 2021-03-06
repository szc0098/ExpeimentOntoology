/**
 */
package org.xtext.DOE.experimentOntology.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.DOE.experimentOntology.Design;
import org.xtext.DOE.experimentOntology.Experiment;
import org.xtext.DOE.experimentOntology.ExperimentOntologyPackage;
import org.xtext.DOE.experimentOntology.PerformanceMeasure;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Experiment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.ExperimentImpl#getExpName <em>Exp Name</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.ExperimentImpl#getExpDesign <em>Exp Design</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.ExperimentImpl#getPerfMeasure <em>Perf Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExperimentImpl extends ExperimentOntologyImpl implements Experiment
{
  /**
   * The default value of the '{@link #getExpName() <em>Exp Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpName()
   * @generated
   * @ordered
   */
  protected static final String EXP_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExpName() <em>Exp Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpName()
   * @generated
   * @ordered
   */
  protected String expName = EXP_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpDesign() <em>Exp Design</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpDesign()
   * @generated
   * @ordered
   */
  protected Design expDesign;

  /**
   * The cached value of the '{@link #getPerfMeasure() <em>Perf Measure</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPerfMeasure()
   * @generated
   * @ordered
   */
  protected PerformanceMeasure perfMeasure;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExperimentImpl()
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
    return ExperimentOntologyPackage.Literals.EXPERIMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExpName()
  {
    return expName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpName(String newExpName)
  {
    String oldExpName = expName;
    expName = newExpName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.EXPERIMENT__EXP_NAME, oldExpName, expName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Design getExpDesign()
  {
    return expDesign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpDesign(Design newExpDesign, NotificationChain msgs)
  {
    Design oldExpDesign = expDesign;
    expDesign = newExpDesign;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.EXPERIMENT__EXP_DESIGN, oldExpDesign, newExpDesign);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpDesign(Design newExpDesign)
  {
    if (newExpDesign != expDesign)
    {
      NotificationChain msgs = null;
      if (expDesign != null)
        msgs = ((InternalEObject)expDesign).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExperimentOntologyPackage.EXPERIMENT__EXP_DESIGN, null, msgs);
      if (newExpDesign != null)
        msgs = ((InternalEObject)newExpDesign).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExperimentOntologyPackage.EXPERIMENT__EXP_DESIGN, null, msgs);
      msgs = basicSetExpDesign(newExpDesign, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.EXPERIMENT__EXP_DESIGN, newExpDesign, newExpDesign));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PerformanceMeasure getPerfMeasure()
  {
    return perfMeasure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPerfMeasure(PerformanceMeasure newPerfMeasure, NotificationChain msgs)
  {
    PerformanceMeasure oldPerfMeasure = perfMeasure;
    perfMeasure = newPerfMeasure;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.EXPERIMENT__PERF_MEASURE, oldPerfMeasure, newPerfMeasure);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPerfMeasure(PerformanceMeasure newPerfMeasure)
  {
    if (newPerfMeasure != perfMeasure)
    {
      NotificationChain msgs = null;
      if (perfMeasure != null)
        msgs = ((InternalEObject)perfMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExperimentOntologyPackage.EXPERIMENT__PERF_MEASURE, null, msgs);
      if (newPerfMeasure != null)
        msgs = ((InternalEObject)newPerfMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExperimentOntologyPackage.EXPERIMENT__PERF_MEASURE, null, msgs);
      msgs = basicSetPerfMeasure(newPerfMeasure, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.EXPERIMENT__PERF_MEASURE, newPerfMeasure, newPerfMeasure));
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
      case ExperimentOntologyPackage.EXPERIMENT__EXP_DESIGN:
        return basicSetExpDesign(null, msgs);
      case ExperimentOntologyPackage.EXPERIMENT__PERF_MEASURE:
        return basicSetPerfMeasure(null, msgs);
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
      case ExperimentOntologyPackage.EXPERIMENT__EXP_NAME:
        return getExpName();
      case ExperimentOntologyPackage.EXPERIMENT__EXP_DESIGN:
        return getExpDesign();
      case ExperimentOntologyPackage.EXPERIMENT__PERF_MEASURE:
        return getPerfMeasure();
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
      case ExperimentOntologyPackage.EXPERIMENT__EXP_NAME:
        setExpName((String)newValue);
        return;
      case ExperimentOntologyPackage.EXPERIMENT__EXP_DESIGN:
        setExpDesign((Design)newValue);
        return;
      case ExperimentOntologyPackage.EXPERIMENT__PERF_MEASURE:
        setPerfMeasure((PerformanceMeasure)newValue);
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
      case ExperimentOntologyPackage.EXPERIMENT__EXP_NAME:
        setExpName(EXP_NAME_EDEFAULT);
        return;
      case ExperimentOntologyPackage.EXPERIMENT__EXP_DESIGN:
        setExpDesign((Design)null);
        return;
      case ExperimentOntologyPackage.EXPERIMENT__PERF_MEASURE:
        setPerfMeasure((PerformanceMeasure)null);
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
      case ExperimentOntologyPackage.EXPERIMENT__EXP_NAME:
        return EXP_NAME_EDEFAULT == null ? expName != null : !EXP_NAME_EDEFAULT.equals(expName);
      case ExperimentOntologyPackage.EXPERIMENT__EXP_DESIGN:
        return expDesign != null;
      case ExperimentOntologyPackage.EXPERIMENT__PERF_MEASURE:
        return perfMeasure != null;
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
    result.append(" (expName: ");
    result.append(expName);
    result.append(')');
    return result.toString();
  }

} //ExperimentImpl
