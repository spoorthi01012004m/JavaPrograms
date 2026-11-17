package com.oops.exception;

/*
 * This class used to calculate two number ,operation includes addition and division
 */
public class Calculator {
	private int a;
	private int b;
	

	public Calculator(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int add(int num1, int num2) {
		return num1 + num2;

	}

	public double divide(int num1, int num2) {
		return num1 / num2;

	}

}
