package com.oops.exception;

import java.util.Scanner;

public class CalcDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		Calculator calculator = new Calculator(num1, num2);
		int addRes = calculator.add(num1, num2);
		System.out.println("Addition result is: " + addRes);
		try {
			double res = calculator.divide(num1, num2);
			System.out.println("The division result is: " + res);
		} catch (ArithmeticException e) {
			System.out.println("Number greater than zero cannot be divided by zero");
			e.printStackTrace();
		}

	}

}
