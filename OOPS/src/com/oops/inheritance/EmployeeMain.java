package com.oops.inheritance;

public class EmployeeMain {
	String name;
	protected String employeeId;
	protected double baseSalary;

	public EmployeeMain(String name, String employeeId, double baseSalary) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.baseSalary = baseSalary;
	}

	public void displayDetails() {
		System.out.println("Employee Name: " + name + "\nEmployee ID: " + employeeId );
	}
	public void calculateSalary(String employeeId) {
		if(employeeId.equals(employeeId)) {
			baseSalary = baseSalary;
		}
		
	}
	

}
