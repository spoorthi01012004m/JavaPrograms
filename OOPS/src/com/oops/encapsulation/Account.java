package com.oops.encapsulation;

public class Account {
	private int balance;
	private String pincode;

	public Account(int balance, String pincode) {
		super();
		this.balance = balance;
		this.pincode = pincode;
	}

	public void credit(int amount, String pin) {
		if (balance > amount && pincode.equals(pin)) {
			balance += amount;
			System.out.println("Balance amount is:" + balance);
		} else {
			System.out.println("Please enter correct pin..");
		}
	}

}
