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
import org.xtext.DOE.experimentOntology.DependentVariables;
import org.xtext.DOE.experimentOntology.ExperimentOntologyPackage;
import org.xtext.DOE.experimentOntology.IndependentVariables;
import org.xtext.DOE.experimentOntology.Variables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variables</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.VariablesImpl#getIndependentVariables <em>Independent Variables</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.VariablesImpl#getControlVariables <em>Control Variables</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.VariablesImpl#getDependentVariables <em>Dependent Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariablesImpl extends MinimalEObjectImpl.Container implements Variables
{
  /**
   * The cached value of the '{@link #getIndependentVariables() <em>Independent Variables</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndependentVariables()
   * @generated
   * @ordered
   */
  protected IndependentVariables independentVariables;

  /**
   * The cached value of the '{@link #getControlVariables() <em>Control Variables</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControlVariables()
   * @generated
   * @ordered
   */
  protected ControlVariables controlVariables;

  /**
   * The cached value of the '{@link #getDependentVariables() <em>Dependent Variables</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDependentVariables()
   * @generated
   * @ordered
   */
  protected DependentVariables dependentVariables;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariablesImpl()
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
    return ExperimentOntologyPackage.Literals.VARIABLES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndependentVariables getIndependentVariables()
  {
    return independentVariables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIndependentVariables(IndependentVariables newIndependentVariables, NotificationChain msgs)
  {
    IndependentVariables oldIndependentVariables = independentVariables;
    independentVariables = newIndependentVariables;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.VARIABLES__INDEPENDENT_VARIABLES, oldIndependentVariables, newIndependentVariables);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndependentVariables(IndependentVariables newIndependentVariables)
  {
    if (newIndependentVariables != independentVariables)
    {
      NotificationChain msgs = null;
      if (independentVariables != null)
        msgs = ((InternalEObject)independentVariables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExperimentOntologyPackage.VARIABLES__INDEPENDENT_VARIABLES, null, msgs);
      if (newIndependentVariables != null)
        msgs = ((InternalEObject)newIndependentVariables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExperimentOntologyPackage.VARIABLES__INDEPENDENT_VARIABLES, null, msgs);
      msgs = basicSetIndependentVariables(newIndependentVariables, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.VARIABLES__INDEPENDENT_VARIABLES, newIndependentVariables, newIndependentVariables));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ControlVariables getControlVariables()
  {
    return controlVariables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetControlVariables(ControlVariables newControlVariables, NotificationChain msgs)
  {
    ControlVariables oldControlVariables = controlVariables;
    controlVariables = newControlVariables;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.VARIABLES__CONTROL_VARIABLES, oldControlVariables, newControlVariables);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setControlVariables(ControlVariables newControlVariables)
  {
    if (newControlVariables != controlVariables)
    {
      NotificationChain msgs = null;
      if (controlVariables != null)
        msgs = ((InternalEObject)controlVariables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExperimentOntologyPackage.VARIABLES__CONTROL_VARIABLES, null, msgs);
      if (newControlVariables != null)
        msgs = ((InternalEObject)newControlVariables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExperimentOntologyPackage.VARIABLES__CONTROL_VARIABLES, null, msgs);
      msgs = basicSetControlVariables(newControlVariables, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.VARIABLES__CONTROL_VARIABLES, newControlVariables, newControlVariables));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DependentVariables getDependentVariables()
  {
    return dependentVariables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDependentVariables(DependentVariables newDependentVariables, NotificationChain msgs)
  {
    DependentVariables oldDependentVariables = dependentVariables;
    dependentVariables = newDependentVariables;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.VARIABLES__DEPENDENT_VARIABLES, oldDependentVariables, newDependentVariables);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDependentVariables(DependentVariables newDependentVariables)
  {
    if (newDependentVariables != dependentVariables)
    {
      NotificationChain msgs = null;
      if (dependentVariables != null)
        msgs = ((InternalEObject)dependentVariables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExperimentOntologyPackage.VARIABLES__DEPENDENT_VARIABLES, null, msgs);
      if (newDependentVariables != null)
        msgs = ((InternalEObject)newDependentVariables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExperimentOntologyPackage.VARIABLES__DEPENDENT_VARIABLES, null, msgs);
      msgs = basicSetDependentVariables(newDependentVariables, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.VARIABLES__DEPENDENT_VARIABLES, newDependentVariables, newDependentVariables));
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
      case ExperimentOntologyPackage.VARIABLES__INDEPENDENT_VARIABLES:
        return basicSetIndependentVariables(null, msgs);
      case ExperimentOntologyPackage.VARIABLES__CONTROL_VARIABLES:
        return basicSetControlVariables(null, msgs);
      case ExperimentOntologyPackage.VARIABLES__DEPENDENT_VARIABLES:
        return basicSetDependentVariables(null, msgs);
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
      case ExperimentOntologyPackage.VARIABLES__INDEPENDENT_VARIABLES:
        return getIndependentVariables();
      case ExperimentOntologyPackage.VARIABLES__CONTROL_VARIABLES:
        return getControlVariables();
      case ExperimentOntologyPackage.VARIABLES__DEPENDENT_VARIABLES:
        return getDependentVariables();
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
      case ExperimentOntologyPackage.VARIABLES__INDEPENDENT_VARIABLES:
        setIndependentVariables((IndependentVariables)newValue);
        return;
      case ExperimentOntologyPackage.VARIABLES__CONTROL_VARIABLES:
        setControlVariables((ControlVariables)newValue);
        return;
      case ExperimentOntologyPackage.VARIABLES__DEPENDENT_VARIABLES:
        setDependentVariables((DependentVariables)newValue);
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
      case ExperimentOntologyPackage.VARIABLES__INDEPENDENT_VARIABLES:
        setIndependentVariables((IndependentVariables)null);
        return;
      case ExperimentOntologyPackage.VARIABLES__CONTROL_VARIABLES:
        setControlVariables((ControlVariables)null);
        return;
      case ExperimentOntologyPackage.VARIABLES__DEPENDENT_VARIABLES:
        setDependentVariables((DependentVariables)null);
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
      case ExperimentOntologyPackage.VARIABLES__INDEPENDENT_VARIABLES:
        return independentVariables != null;
      case ExperimentOntologyPackage.VARIABLES__CONTROL_VARIABLES:
        return controlVariables != null;
      case ExperimentOntologyPackage.VARIABLES__DEPENDENT_VARIABLES:
        return dependentVariables != null;
    }
    return super.eIsSet(featureID);
  }

} //VariablesImpl
