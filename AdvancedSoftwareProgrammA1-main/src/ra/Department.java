/**
 */
package ra;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ra.Department#getCoordinator <em>Coordinator</em>}</li>
 *   <li>{@link ra.Department#getName <em>Name</em>}</li>
 *   <li>{@link ra.Department#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see ra.RaPackage#getDepartment()
 * @model
 * @generated
 */
public interface Department extends EObject {
	/**
	 * Returns the value of the '<em><b>Coordinator</b></em>' containment reference list.
	 * The list contents are of type {@link ra.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinator</em>' containment reference list.
	 * @see ra.RaPackage#getDepartment_Coordinator()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getCoordinator();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ra.RaPackage#getDepartment_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ra.Department#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link ra.Course}.
	 * It is bidirectional and its opposite is '{@link ra.Course#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see ra.RaPackage#getDepartment_Courses()
	 * @see ra.Course#getDepartment
	 * @model opposite="Department" containment="true" required="true"
	 * @generated
	 */
	EList<Course> getCourses();

} // Department
