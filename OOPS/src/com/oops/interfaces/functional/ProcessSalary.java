package com.oops.interfaces.functional;

/*
 * This class is responsible for processing employee salaries.
 * It uses functional interface and lambda expression
 * to calculate the total salary based on employee's basic salary
 */
public class ProcessSalary {

	public void processPayment(Employee employee, ISalaryCalculator calculator) {
//		ISalaryCalculator salary = (basicSalary) -> {
//			double totalSalary = 0;
//			
//			// Add 20% increment when the basic salary is 40k -- > developer
//			if (basicSalary == 40000) {
//				totalSalary = (basicSalary + (basicSalary * 0.2));
//			}
//			
//			// Add 30% increment when the employee's basic salary is 60k --> manager
//			else if (basicSalary == 60000) {
//				totalSalary = (basicSalary + (basicSalary * 0.3));
//			}
//			
//			// Add 15% increment when basic salary is 35000 --> Tester
//			else if (basicSalary == 35000) {
//				totalSalary = (basicSalary + (basicSalary * 0.15));
//			}
//
//			return totalSalary;
//		};
//		double totalSalary = salary.calcSalary(employee.basicSalary);
//		System.out.println("Total Employee salary is: " + totalSalary);
          
		double totalSalary =  calculator.calcSalary(employee.getBasicSalary());
		
		System.out.println("Employee ID: "+employee.getEmployeeID());
		System.out.println("Employee Name: "+employee.getEmployeeName());
		System.out.println("Total Salary: "+totalSalary);
		System.out.println();
	}

}
