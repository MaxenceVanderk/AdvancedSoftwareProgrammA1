/**
 */
package ra.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import ra.Course;
import ra.Department;
import ra.Person;
import ra.RaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ra.impl.CourseImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link ra.impl.CourseImpl#getCode <em>Code</em>}</li>
 *   <li>{@link ra.impl.CourseImpl#getLecturer <em>Lecturer</em>}</li>
 *   <li>{@link ra.impl.CourseImpl#getCredits <em>Credits</em>}</li>
 *   <li>{@link ra.impl.CourseImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link ra.impl.CourseImpl#getYear <em>Year</em>}</li>
 *   <li>{@link ra.impl.CourseImpl#getDepartment <em>Department</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseImpl extends MinimalEObjectImpl.Container implements Course {
	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected EList<String> label;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLecturer() <em>Lecturer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLecturer()
	 * @generated
	 * @ordered
	 */
	protected Person lecturer;

	/**
	 * The default value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected static final float CREDITS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected float credits = CREDITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final String PERIOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected String period = PERIOD_EDEFAULT;

	/**
	 * This is true if the Period attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean periodESet;

	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected int year = YEAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RaPackage.Literals.COURSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLabel() {
		if (label == null) {
			label = new EDataTypeUniqueEList<String>(String.class, this, RaPackage.COURSE__LABEL);
		}
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RaPackage.COURSE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getLecturer() {
		if (lecturer != null && lecturer.eIsProxy()) {
			InternalEObject oldLecturer = (InternalEObject)lecturer;
			lecturer = (Person)eResolveProxy(oldLecturer);
			if (lecturer != oldLecturer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RaPackage.COURSE__LECTURER, oldLecturer, lecturer));
			}
		}
		return lecturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetLecturer() {
		return lecturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLecturer(Person newLecturer) {
		Person oldLecturer = lecturer;
		lecturer = newLecturer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RaPackage.COURSE__LECTURER, oldLecturer, lecturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCredits() {
		return credits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredits(float newCredits) {
		float oldCredits = credits;
		credits = newCredits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RaPackage.COURSE__CREDITS, oldCredits, credits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(String newPeriod) {
		String oldPeriod = period;
		period = newPeriod;
		boolean oldPeriodESet = periodESet;
		periodESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RaPackage.COURSE__PERIOD, oldPeriod, period, !oldPeriodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPeriod() {
		String oldPeriod = period;
		boolean oldPeriodESet = periodESet;
		period = PERIOD_EDEFAULT;
		periodESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RaPackage.COURSE__PERIOD, oldPeriod, PERIOD_EDEFAULT, oldPeriodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPeriod() {
		return periodESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(int newYear) {
		int oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RaPackage.COURSE__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Department getDepartment() {
		if (eContainerFeatureID() != RaPackage.COURSE__DEPARTMENT) return null;
		return (Department)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDepartment(Department newDepartment, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDepartment, RaPackage.COURSE__DEPARTMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepartment(Department newDepartment) {
		if (newDepartment != eInternalContainer() || (eContainerFeatureID() != RaPackage.COURSE__DEPARTMENT && newDepartment != null)) {
			if (EcoreUtil.isAncestor(this, newDepartment))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDepartment != null)
				msgs = ((InternalEObject)newDepartment).eInverseAdd(this, RaPackage.DEPARTMENT__COURSES, Department.class, msgs);
			msgs = basicSetDepartment(newDepartment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RaPackage.COURSE__DEPARTMENT, newDepartment, newDepartment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RaPackage.COURSE__DEPARTMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDepartment((Department)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RaPackage.COURSE__DEPARTMENT:
				return basicSetDepartment(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case RaPackage.COURSE__DEPARTMENT:
				return eInternalContainer().eInverseRemove(this, RaPackage.DEPARTMENT__COURSES, Department.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RaPackage.COURSE__LABEL:
				return getLabel();
			case RaPackage.COURSE__CODE:
				return getCode();
			case RaPackage.COURSE__LECTURER:
				if (resolve) return getLecturer();
				return basicGetLecturer();
			case RaPackage.COURSE__CREDITS:
				return getCredits();
			case RaPackage.COURSE__PERIOD:
				return getPeriod();
			case RaPackage.COURSE__YEAR:
				return getYear();
			case RaPackage.COURSE__DEPARTMENT:
				return getDepartment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RaPackage.COURSE__LABEL:
				getLabel().clear();
				getLabel().addAll((Collection<? extends String>)newValue);
				return;
			case RaPackage.COURSE__CODE:
				setCode((String)newValue);
				return;
			case RaPackage.COURSE__LECTURER:
				setLecturer((Person)newValue);
				return;
			case RaPackage.COURSE__CREDITS:
				setCredits((Float)newValue);
				return;
			case RaPackage.COURSE__PERIOD:
				setPeriod((String)newValue);
				return;
			case RaPackage.COURSE__YEAR:
				setYear((Integer)newValue);
				return;
			case RaPackage.COURSE__DEPARTMENT:
				setDepartment((Department)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case RaPackage.COURSE__LABEL:
				getLabel().clear();
				return;
			case RaPackage.COURSE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case RaPackage.COURSE__LECTURER:
				setLecturer((Person)null);
				return;
			case RaPackage.COURSE__CREDITS:
				setCredits(CREDITS_EDEFAULT);
				return;
			case RaPackage.COURSE__PERIOD:
				unsetPeriod();
				return;
			case RaPackage.COURSE__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case RaPackage.COURSE__DEPARTMENT:
				setDepartment((Department)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RaPackage.COURSE__LABEL:
				return label != null && !label.isEmpty();
			case RaPackage.COURSE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case RaPackage.COURSE__LECTURER:
				return lecturer != null;
			case RaPackage.COURSE__CREDITS:
				return credits != CREDITS_EDEFAULT;
			case RaPackage.COURSE__PERIOD:
				return isSetPeriod();
			case RaPackage.COURSE__YEAR:
				return year != YEAR_EDEFAULT;
			case RaPackage.COURSE__DEPARTMENT:
				return getDepartment() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (label: ");
		result.append(label);
		result.append(", code: ");
		result.append(code);
		result.append(", Credits: ");
		result.append(credits);
		result.append(", Period: ");
		if (periodESet) result.append(period); else result.append("<unset>");
		result.append(", Year: ");
		result.append(year);
		result.append(')');
		return result.toString();
	}

} //CourseImpl
