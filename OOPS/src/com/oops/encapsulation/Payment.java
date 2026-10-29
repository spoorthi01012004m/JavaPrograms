package com.oops.encapsulation;

public class Payment {
	 private int balance;//keep data as private to achieve encapsulation 

	public Payment(int balance) {
		super();
		this.balance = balance;
	}
	//setter
	public void doDebit(int _amount) {
		balance = balance - _amount;
		
	}
	//setter
	public void doCredit(int _amount) {
		balance = balance + _amount;
		
	}
	
	//getter method to get the value modified through methods
	public int getBalance() {
		return balance;
	}
	 
}
