package com.oops.inheritance;

public class FullTimeEmployee extends EmployeeMain {
	private double bonus  = 5000;

	public FullTimeEmployee(String name, String employeeId, double salary) {
		super(name, employeeId, salary);
         
	}
	
	@Override
	public void calculateSalary(String employeeId) {
		if(employeeId.equals(employeeId)) {
			baseSalary = baseSalary + bonus;
		}	
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Employee Type: Full-Time");
		System.out.println("Final Salary: "+ baseSalary);
	}
	

}
