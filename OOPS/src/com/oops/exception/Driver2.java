package com.oops.exception;

class Account {
	public void openAccount() {
		System.out.println("Opening account..........");
	}
}

public class Driver2 {

	public static void main(String[] args) {
		System.out.println("Main().....Start");
		Account acc1 = new Account();
		int num1 = 24;
		double num = 20;
		
		try {
			acc1.openAccount();  //
			System.out.println("After try");//this line will be ignored 
		} catch (NullPointerException e) { // This catches Null value exceptions
			System.out.println("Object is null.....");
			e.printStackTrace();

		}
		try {
			num = num1 / 0;
		}

		catch (ArithmeticException e) { // this catches only arithmetic related exceptions

			System.out.println("num1 cannot be divided by 0");
			e.printStackTrace();
		}
		System.out.println("Main().......End");

	}

}
