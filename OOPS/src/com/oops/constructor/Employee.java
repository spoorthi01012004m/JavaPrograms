package com.oops.constructor;

/*
 * Constructor is a special method in java , which is used to initialize objects.
 * Main purpose of the constructor is to set initial values for the objects attributes.
 * At the time of calling constructor , memory is allocated to the objects 
 */
public class Employee {
	private String empName;
	private String empId;
	private String empPhoneNumber;

	public Employee() {
		System.out.println("Constructor with zero parameters....");
	}

	public Employee(String empName, String empId) {
		super();
		this.empName = empName;
		this.empId = empId;
		System.out.println("Constructor with two parameters........");
	}

	public Employee(String empName, String empId, String empPhoneNumber) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empPhoneNumber = empPhoneNumber;
		System.out.println("Constructor with three parameters..........");
	}

}
