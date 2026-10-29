package com.oops.inheritance;

public class EmployeeManagementDriver {

	public static void main(String[] args) {
		FullTimeEmployee emp1 = new FullTimeEmployee("Ramesh", "EC123", 900000);
		emp1.calculateSalary("EC123");
		emp1.displayDetails();

	}

}
