package com.oops.basic.staticblock;

//student class is a blue print for student object 
//@parameter studentName , register number, student age
public class Student {

	// static initialization block is executed only once when the class loaded
	// before creating an object
	// this prints common school name of all students
	static {
		System.out.println("School Name: S.H.V English High school");
	}

	// class is well encapsulated
	private String studentName;
	private String regNo;
	private String age;
	int numberOfObj = 0;

	// Instance Initialization block is executed in each object
	{
		numberOfObj = numberOfObj + 1;
		System.out.println("Hi I am in student instance block !!!");
		System.out.println("Obj: "+numberOfObj);
	}

	public Student(String studentName, String regNo, String age) {
		super();
		// ---> this line dedicated to IIB
		this.studentName = studentName;
		this.regNo = regNo;
		this.age = age;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}
