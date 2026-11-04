package com.oops.basic.staticblock;

public class Employee {
	private int empId;
	private String empName;
	private String department;
	private static int empCount = 100;

	static {
		System.out.println("Entered static block");
		System.out.println("Company Name: " + "SPOORTHI VENDORS");
	}

	{
		System.out.println("Entered IIB");
		empId = empCount++;
		department = "Development";

	}

	public Employee(String empName, String _department) {
		super();

		this.empName = empName;
		if(_department != null && !_department.isEmpty()) {
		this.department = _department;
		}
	}

	public void empDetails() {
		System.out.println(
				"Employee ID: " + empId + "\nEmployee Name: " + empName + "\nEmployee Department: " + department);

	}

}
