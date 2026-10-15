package com.oops.encapsulation;

public class DriverPayment {

	public static void main(String[] args) {
		Payment trans1  = new Payment(100);
		trans1.doCredit(50);
		trans1.doDebit(20);
		System.out.println(trans1.getBalance());

	}

}
