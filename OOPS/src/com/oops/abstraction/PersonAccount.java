package com.oops.abstraction;

public class PersonAccount {
	private double balance;
	private String securePin;
	
	
	public PersonAccount(double balance, String securePin) {
		super();
		this.balance = balance;
		this.securePin = securePin;
	}
	public void credit(double amount, String pin) {
		if(checkBalance(amount) && validatePin(pin)) {
			balance += amount;
			System.out.println(balance);
		}
		
	}
	private boolean checkBalance(double amount) {
		if(balance > amount) {
			return true;
		}
		else
			System.out.println("Insufficient bank balance..");
		return false;
	}
	
	private boolean validatePin(String pin) {
		if(securePin.equals(pin)) {
			return true;
		}
		else {
			System.out.println("Enter valid pin.");
		}
		return false;
	}
	

}
