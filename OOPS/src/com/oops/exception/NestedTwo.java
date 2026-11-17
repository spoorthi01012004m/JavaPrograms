package com.oops.exception;

public class NestedTwo {

	public static void main(String[] args) {
		// outer try block
		try {
			System.out.println("A");
			try { // inner try block
				System.out.println("B");
				int amount = 100 / 0; // this is risky line causes arithmatic exception
				System.out.println("C");
			} catch (ArithmeticException e) {
				System.out.println("D");
			}
			System.out.println("E"); // No exception arises
		} catch (Exception e) {
			System.out.println("F");
		}
		System.out.println("G");

	}

}
