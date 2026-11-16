package com.oops.cloning.deep;

public class Student implements Cloneable {
	private String studentID;
	private String studentName;
	private String course;
	private StudentAddress address;

	public Student(String studentID, String studentName, String course, StudentAddress address) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.course = course;
		this.address = address;
	}

	public String getStudentID() {
		return studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getCourse() {
		return course;
	}

	public StudentAddress getAddress() {
		return address;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Student student = (Student) super.clone();
		student.address = (StudentAddress) address.clone();
		return student;

	}

}
