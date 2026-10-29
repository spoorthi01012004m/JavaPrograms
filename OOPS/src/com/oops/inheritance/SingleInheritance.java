package com.oops.inheritance;

///single inheritance
class AdmissionOrder {
	String name;
	String age;
	String address;
	String phoneNumber;

	public AdmissionOrder(String name, String age, String address, String phoneNumber) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public void recordDetails() {
		System.out
				.println("Name: " + name + "\nAge: " + age + "\nAddress: " + address + "\nphoneNumber: " + phoneNumber);
	}

}

class StudentAdmissionOrder extends AdmissionOrder {
	String classOfStudy;

	public StudentAdmissionOrder(String name, String age, String address, String phoneNumber, String classOfStudy) {
		super(name, age, address, phoneNumber);
		this.classOfStudy = classOfStudy;
	}

	public void recordStudentDetails() {
		recordDetails();
		System.out.println("Type: Student" + "\nClass Studying: " + classOfStudy);
	}

}

public class SingleInheritance {

	public static void main(String[] args) {
		StudentAdmissionOrder student1 = new StudentAdmissionOrder("Raj", "20", "Bengaluru", "980765478",
				"1st year MTech");
		student1.recordDetails();
	}

}
