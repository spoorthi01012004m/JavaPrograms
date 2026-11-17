package com.oops.exception;

import java.io.Serializable;

/*
 * This class act as a blue print for an employee
 * @param name(employee name), empID(Employee ID), phoneNumber(employee mobile number)
 * This class have permission to serialize it's objects
 */
public class Employee implements Serializable {
	private String name;
	private String empId;
	private String phoneNumber;
	private int age;

	public Employee(String name, String empId, String phoneNumber, int age) {
		super();
		this.name = name;
		this.empId = empId;
		this.phoneNumber = phoneNumber;
		this.age = age;
	}

	// getter method to get the value of the object attributes
	public String getName() {
		return name;
	}

	public String getEmpId() {
		return empId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public int getAge() {
		return age;
	}

}
