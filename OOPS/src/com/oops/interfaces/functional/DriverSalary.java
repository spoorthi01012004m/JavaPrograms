package com.oops.interfaces.functional;

public class DriverSalary {
	public static void main(String args[]) {
		// instance of employee class
		Employee manager1 = new Employee("MD120", "Partha", 60000);
		Employee manager2 = new Employee("MD121", "Rahul", 60000);
		Employee developer = new Employee("MD123", "Priya", 40000);

		ProcessSalary process = new ProcessSalary();

		// Calculating developer's total salary
		ISalaryCalculator developerSalary = (salary) -> {
			return salary + (salary * 0.2);
		};

		// Calculating manager's total salary
		ISalaryCalculator managerSalary = (salary) -> {
			return salary + (salary * 0.3);
		};

		// Calculating tester's total salary
		ISalaryCalculator testerSalary = (salary) -> {
			return salary + (salary * 0.15);
		};

		process.processPayment(manager1, testerSalary);
		process.processPayment(developer, testerSalary);

	}

}
