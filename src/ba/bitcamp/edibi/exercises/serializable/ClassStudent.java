package ba.bitcamp.edibi.exercises.serializable;

import java.io.Serializable;

public class ClassStudent implements Serializable {

	/**
	 * @serial version for "serializable" object
	 */

	private static final long serialVersionUID = 7199890441950433111L;
	private String studentName;
	private String lastName;
	private int age;
/**
 * Constructor with values
 * @param studentName
 * @param lastName
 * @param age
 */
	public ClassStudent(String studentName, String lastName, int age) {
		this.studentName=studentName;
		this.lastName=lastName;
		this.age=age;

	}

	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}

	/**
	 * @param studentName
	 *            the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student's Name: " + studentName + ", Last Name: "
				+ lastName + ", Age: " + age;
	}

}
