/**
 */
package org.xtext.DOE.experimentOntology.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.DOE.experimentOntology.Design;
import org.xtext.DOE.experimentOntology.DesignType;
import org.xtext.DOE.experimentOntology.ExperimentOntologyPackage;
import org.xtext.DOE.experimentOntology.Iteration;
import org.xtext.DOE.experimentOntology.Variables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Design</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.DesignImpl#getDesignType <em>Design Type</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.DesignImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.DesignImpl#getIteration <em>Iteration</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.DesignImpl#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DesignImpl extends MinimalEObjectImpl.Container implements Design
{
  /**
   * The default value of the '{@link #getDesignType() <em>Design Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDesignType()
   * @generated
   * @ordered
   */
  protected static final DesignType DESIGN_TYPE_EDEFAULT = DesignType.FULLFACTORIAL;

  /**
   * The cached value of the '{@link #getDesignType() <em>Design Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDesignType()
   * @generated
   * @ordered
   */
  protected DesignType designType = DESIGN_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getConstraint() <em>Constraint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraint()
   * @generated
   * @ordered
   */
  protected static final String CONSTRAINT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraint()
   * @generated
   * @ordered
   */
  protected String constraint = CONSTRAINT_EDEFAULT;

  /**
   * The cached value of the '{@link #getIteration() <em>Iteration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIteration()
   * @generated
   * @ordered
   */
  protected Iteration iteration;

  /**
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected Variables variables;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DesignImpl()
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
    return ExperimentOntologyPackage.Literals.DESIGN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DesignType getDesignType()
  {
    return designType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDesignType(DesignType newDesignType)
  {
    DesignType oldDesignType = designType;
    designType = newDesignType == null ? DESIGN_TYPE_EDEFAULT : newDesignType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.DESIGN__DESIGN_TYPE, oldDesignType, designType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getConstraint()
  {
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstraint(String newConstraint)
  {
    String oldConstraint = constraint;
    constraint = newConstraint;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.DESIGN__CONSTRAINT, oldConstraint, constraint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Iteration getIteration()
  {
    return iteration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIteration(Iteration newIteration, NotificationChain msgs)
  {
    Iteration oldIteration = iteration;
    iteration = newIteration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.DESIGN__ITERATION, oldIteration, newIteration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIteration(Iteration newIteration)
  {
    if (newIteration != iteration)
    {
      NotificationChain msgs = null;
      if (iteration != null)
        msgs = ((InternalEObject)iteration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExperimentOntologyPackage.DESIGN__ITERATION, null, msgs);
      if (newIteration != null)
        msgs = ((InternalEObject)newIteration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExperimentOntologyPackage.DESIGN__ITERATION, null, msgs);
      msgs = basicSetIteration(newIteration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.DESIGN__ITERATION, newIteration, newIteration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variables getVariables()
  {
    return variables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariables(Variables newVariables, NotificationChain msgs)
  {
    Variables oldVariables = variables;
    variables = newVariables;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.DESIGN__VARIABLES, oldVariables, newVariables);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariables(Variables newVariables)
  {
    if (newVariables != variables)
    {
      NotificationChain msgs = null;
      if (variables != null)
        msgs = ((InternalEObject)variables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExperimentOntologyPackage.DESIGN__VARIABLES, null, msgs);
      if (newVariables != null)
        msgs = ((InternalEObject)newVariables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExperimentOntologyPackage.DESIGN__VARIABLES, null, msgs);
      msgs = basicSetVariables(newVariables, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.DESIGN__VARIABLES, newVariables, newVariables));
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
      case ExperimentOntologyPackage.DESIGN__ITERATION:
        return basicSetIteration(null, msgs);
      case ExperimentOntologyPackage.DESIGN__VARIABLES:
        return basicSetVariables(null, msgs);
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
      case ExperimentOntologyPackage.DESIGN__DESIGN_TYPE:
        return getDesignType();
      case ExperimentOntologyPackage.DESIGN__CONSTRAINT:
        return getConstraint();
      case ExperimentOntologyPackage.DESIGN__ITERATION:
        return getIteration();
      case ExperimentOntologyPackage.DESIGN__VARIABLES:
        return getVariables();
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
      case ExperimentOntologyPackage.DESIGN__DESIGN_TYPE:
        setDesignType((DesignType)newValue);
        return;
      case ExperimentOntologyPackage.DESIGN__CONSTRAINT:
        setConstraint((String)newValue);
        return;
      case ExperimentOntologyPackage.DESIGN__ITERATION:
        setIteration((Iteration)newValue);
        return;
      case ExperimentOntologyPackage.DESIGN__VARIABLES:
        setVariables((Variables)newValue);
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
      case ExperimentOntologyPackage.DESIGN__DESIGN_TYPE:
        setDesignType(DESIGN_TYPE_EDEFAULT);
        return;
      case ExperimentOntologyPackage.DESIGN__CONSTRAINT:
        setConstraint(CONSTRAINT_EDEFAULT);
        return;
      case ExperimentOntologyPackage.DESIGN__ITERATION:
        setIteration((Iteration)null);
        return;
      case ExperimentOntologyPackage.DESIGN__VARIABLES:
        setVariables((Variables)null);
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
      case ExperimentOntologyPackage.DESIGN__DESIGN_TYPE:
        return designType != DESIGN_TYPE_EDEFAULT;
      case ExperimentOntologyPackage.DESIGN__CONSTRAINT:
        return CONSTRAINT_EDEFAULT == null ? constraint != null : !CONSTRAINT_EDEFAULT.equals(constraint);
      case ExperimentOntologyPackage.DESIGN__ITERATION:
        return iteration != null;
      case ExperimentOntologyPackage.DESIGN__VARIABLES:
        return variables != null;
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
    result.append(" (designType: ");
    result.append(designType);
    result.append(", constraint: ");
    result.append(constraint);
    result.append(')');
    return result.toString();
  }

} //DesignImpl
