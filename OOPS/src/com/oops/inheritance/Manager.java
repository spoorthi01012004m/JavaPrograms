package com.oops.inheritance;

public class Manager extends Employee {
	public void printDetails(String empId) {
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		markAttendance(empId);
//		System.out.println(salary);
	}
}
