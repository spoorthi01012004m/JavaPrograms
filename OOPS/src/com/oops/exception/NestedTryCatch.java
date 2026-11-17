package com.oops.exception;

public class NestedTryCatch {

	public static void main(String[] args) {
		String employees[] = {"Ram", "saru", "Jai", "Jeevith"};
		
		try {
			System.out.println("Outer try block started....");
			try {
				System.out.println("Inner try block started....");
				double salary = (10000/0);
				System.out.println("Employee salary : "+salary);				
			}catch (ArithmeticException e) {
				System.out.println("Salary calculation error, amount is dividing by 0");
				e.printStackTrace();
			}
			System.out.println("Employee name: "+employees[4]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid employee index");
			e.printStackTrace();
		}
		System.out.println("Application completed..!");
	}

}
