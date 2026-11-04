package com.oops.interfaces.functional;
/*
 * this class creates a employee model 
 */
public class Employee {
	private String employeeID;
	private String employeeName;
	private double basicSalary;

	public Employee(String employeeID, String employeeName, double basicSalary) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	

}
