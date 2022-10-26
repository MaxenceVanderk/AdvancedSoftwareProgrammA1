/**
 */
package ra;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ra.Course#getLabel <em>Label</em>}</li>
 *   <li>{@link ra.Course#getCode <em>Code</em>}</li>
 *   <li>{@link ra.Course#getLecturer <em>Lecturer</em>}</li>
 *   <li>{@link ra.Course#getCredits <em>Credits</em>}</li>
 *   <li>{@link ra.Course#getPeriod <em>Period</em>}</li>
 *   <li>{@link ra.Course#getYear <em>Year</em>}</li>
 *   <li>{@link ra.Course#getDepartment <em>Department</em>}</li>
 * </ul>
 *
 * @see ra.RaPackage#getCourse()
 * @model
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute list.
	 * @see ra.RaPackage#getCourse_Label()
	 * @model required="true" upper="2"
	 * @generated
	 */
	EList<String> getLabel();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see ra.RaPackage#getCourse_Code()
	 * @model required="true"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link ra.Course#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Lecturer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lecturer</em>' reference.
	 * @see #setLecturer(Person)
	 * @see ra.RaPackage#getCourse_Lecturer()
	 * @model required="true"
	 * @generated
	 */
	Person getLecturer();

	/**
	 * Sets the value of the '{@link ra.Course#getLecturer <em>Lecturer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lecturer</em>' reference.
	 * @see #getLecturer()
	 * @generated
	 */
	void setLecturer(Person value);

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see #setCredits(float)
	 * @see ra.RaPackage#getCourse_Credits()
	 * @model required="true"
	 * @generated
	 */
	float getCredits();

	/**
	 * Sets the value of the '{@link ra.Course#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(float value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #isSetPeriod()
	 * @see #unsetPeriod()
	 * @see #setPeriod(String)
	 * @see ra.RaPackage#getCourse_Period()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	String getPeriod();

	/**
	 * Sets the value of the '{@link ra.Course#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #isSetPeriod()
	 * @see #unsetPeriod()
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(String value);

	/**
	 * Unsets the value of the '{@link ra.Course#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPeriod()
	 * @see #getPeriod()
	 * @see #setPeriod(String)
	 * @generated
	 */
	void unsetPeriod();

	/**
	 * Returns whether the value of the '{@link ra.Course#getPeriod <em>Period</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Period</em>' attribute is set.
	 * @see #unsetPeriod()
	 * @see #getPeriod()
	 * @see #setPeriod(String)
	 * @generated
	 */
	boolean isSetPeriod();

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see ra.RaPackage#getCourse_Year()
	 * @model required="true"
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link ra.Course#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Department</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ra.Department#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Department</em>' container reference.
	 * @see #setDepartment(Department)
	 * @see ra.RaPackage#getCourse_Department()
	 * @see ra.Department#getCourses
	 * @model opposite="Courses" required="true" transient="false"
	 * @generated
	 */
	Department getDepartment();

	/**
	 * Sets the value of the '{@link ra.Course#getDepartment <em>Department</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Department</em>' container reference.
	 * @see #getDepartment()
	 * @generated
	 */
	void setDepartment(Department value);

} // Course
