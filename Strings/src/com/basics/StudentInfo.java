package com.basics;

/*
 * Basic information of students is formatted based on the requirements 
 */
public class StudentInfo {
	String studentName;
	String address;
	String phoneNumber;
	String schoolName;
	int marks;

	// Constructor chaining to keep one value constant
	public StudentInfo() {
		this("name", "bengaluru", "9090909090", "Schl Name", 350);

	}

	public StudentInfo(String _studentName, String _address, String _phoneNumber, String _schoolName, int _marks) {
		this.studentName = _studentName;
		this.address = _address;
		this.phoneNumber = _phoneNumber;
		this.schoolName = _schoolName;
		this.marks = _marks;
	}

	public void printDetails() {
		System.out.println("Name of the Student: " + studentName + "\nAddress: " + address + "\nPhone Number: "
				+ phoneNumber + "\nSchool Name: " + schoolName + "\nMarks: " + marks);
	}
}
