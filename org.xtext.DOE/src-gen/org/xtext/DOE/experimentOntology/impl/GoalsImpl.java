/**
 */
package org.xtext.DOE.experimentOntology.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.DOE.experimentOntology.ExperimentOntologyPackage;
import org.xtext.DOE.experimentOntology.Goals;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goals</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.GoalsImpl#getObjOfStudy <em>Obj Of Study</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.GoalsImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.GoalsImpl#getFocus <em>Focus</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.GoalsImpl#getViewPoint <em>View Point</em>}</li>
 *   <li>{@link org.xtext.DOE.experimentOntology.impl.GoalsImpl#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GoalsImpl extends ExperimentOntologyImpl implements Goals
{
  /**
   * The default value of the '{@link #getObjOfStudy() <em>Obj Of Study</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjOfStudy()
   * @generated
   * @ordered
   */
  protected static final String OBJ_OF_STUDY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getObjOfStudy() <em>Obj Of Study</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjOfStudy()
   * @generated
   * @ordered
   */
  protected String objOfStudy = OBJ_OF_STUDY_EDEFAULT;

  /**
   * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPurpose()
   * @generated
   * @ordered
   */
  protected static final String PURPOSE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPurpose()
   * @generated
   * @ordered
   */
  protected String purpose = PURPOSE_EDEFAULT;

  /**
   * The default value of the '{@link #getFocus() <em>Focus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFocus()
   * @generated
   * @ordered
   */
  protected static final String FOCUS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFocus() <em>Focus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFocus()
   * @generated
   * @ordered
   */
  protected String focus = FOCUS_EDEFAULT;

  /**
   * The default value of the '{@link #getViewPoint() <em>View Point</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewPoint()
   * @generated
   * @ordered
   */
  protected static final String VIEW_POINT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getViewPoint() <em>View Point</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewPoint()
   * @generated
   * @ordered
   */
  protected String viewPoint = VIEW_POINT_EDEFAULT;

  /**
   * The default value of the '{@link #getContext() <em>Context</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContext()
   * @generated
   * @ordered
   */
  protected static final String CONTEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getContext() <em>Context</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContext()
   * @generated
   * @ordered
   */
  protected String context = CONTEXT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GoalsImpl()
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
    return ExperimentOntologyPackage.Literals.GOALS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getObjOfStudy()
  {
    return objOfStudy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjOfStudy(String newObjOfStudy)
  {
    String oldObjOfStudy = objOfStudy;
    objOfStudy = newObjOfStudy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.GOALS__OBJ_OF_STUDY, oldObjOfStudy, objOfStudy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPurpose()
  {
    return purpose;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPurpose(String newPurpose)
  {
    String oldPurpose = purpose;
    purpose = newPurpose;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.GOALS__PURPOSE, oldPurpose, purpose));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFocus()
  {
    return focus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFocus(String newFocus)
  {
    String oldFocus = focus;
    focus = newFocus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.GOALS__FOCUS, oldFocus, focus));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getViewPoint()
  {
    return viewPoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setViewPoint(String newViewPoint)
  {
    String oldViewPoint = viewPoint;
    viewPoint = newViewPoint;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.GOALS__VIEW_POINT, oldViewPoint, viewPoint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getContext()
  {
    return context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContext(String newContext)
  {
    String oldContext = context;
    context = newContext;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExperimentOntologyPackage.GOALS__CONTEXT, oldContext, context));
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
      case ExperimentOntologyPackage.GOALS__OBJ_OF_STUDY:
        return getObjOfStudy();
      case ExperimentOntologyPackage.GOALS__PURPOSE:
        return getPurpose();
      case ExperimentOntologyPackage.GOALS__FOCUS:
        return getFocus();
      case ExperimentOntologyPackage.GOALS__VIEW_POINT:
        return getViewPoint();
      case ExperimentOntologyPackage.GOALS__CONTEXT:
        return getContext();
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
      case ExperimentOntologyPackage.GOALS__OBJ_OF_STUDY:
        setObjOfStudy((String)newValue);
        return;
      case ExperimentOntologyPackage.GOALS__PURPOSE:
        setPurpose((String)newValue);
        return;
      case ExperimentOntologyPackage.GOALS__FOCUS:
        setFocus((String)newValue);
        return;
      case ExperimentOntologyPackage.GOALS__VIEW_POINT:
        setViewPoint((String)newValue);
        return;
      case ExperimentOntologyPackage.GOALS__CONTEXT:
        setContext((String)newValue);
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
      case ExperimentOntologyPackage.GOALS__OBJ_OF_STUDY:
        setObjOfStudy(OBJ_OF_STUDY_EDEFAULT);
        return;
      case ExperimentOntologyPackage.GOALS__PURPOSE:
        setPurpose(PURPOSE_EDEFAULT);
        return;
      case ExperimentOntologyPackage.GOALS__FOCUS:
        setFocus(FOCUS_EDEFAULT);
        return;
      case ExperimentOntologyPackage.GOALS__VIEW_POINT:
        setViewPoint(VIEW_POINT_EDEFAULT);
        return;
      case ExperimentOntologyPackage.GOALS__CONTEXT:
        setContext(CONTEXT_EDEFAULT);
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
      case ExperimentOntologyPackage.GOALS__OBJ_OF_STUDY:
        return OBJ_OF_STUDY_EDEFAULT == null ? objOfStudy != null : !OBJ_OF_STUDY_EDEFAULT.equals(objOfStudy);
      case ExperimentOntologyPackage.GOALS__PURPOSE:
        return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
      case ExperimentOntologyPackage.GOALS__FOCUS:
        return FOCUS_EDEFAULT == null ? focus != null : !FOCUS_EDEFAULT.equals(focus);
      case ExperimentOntologyPackage.GOALS__VIEW_POINT:
        return VIEW_POINT_EDEFAULT == null ? viewPoint != null : !VIEW_POINT_EDEFAULT.equals(viewPoint);
      case ExperimentOntologyPackage.GOALS__CONTEXT:
        return CONTEXT_EDEFAULT == null ? context != null : !CONTEXT_EDEFAULT.equals(context);
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
    result.append(" (objOfStudy: ");
    result.append(objOfStudy);
    result.append(", purpose: ");
    result.append(purpose);
    result.append(", focus: ");
    result.append(focus);
    result.append(", viewPoint: ");
    result.append(viewPoint);
    result.append(", context: ");
    result.append(context);
    result.append(')');
    return result.toString();
  }

} //GoalsImpl
