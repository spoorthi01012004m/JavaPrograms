package com.oops.encapsulation;

/*
 * This class is able to achieve encapsulation 
 */
public class ManageFundTransfer {
	private String accHolderName;
	private String accNumber;
	private int balance;
	private int amount;

	public ManageFundTransfer(String accHolderName, String accNumber, int balance) {
		super();
		this.accHolderName = accHolderName;
		this.accNumber = accNumber;
		this.balance = balance;
	}

	public void amountTransfer(int amount) { // method to transfer amount
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Amount transfered successfully to " + accHolderName + ", Account number: " + accNumber);
		} else if (amount < 0) {
			System.err.println("Please enter the proper amount");
		} else if (amount > balance) {
			System.err.println("Insuffient Bank Balance ..!");
		}
	}

	// get balance amount
	public int getBalance() {
		return balance;
	}

}
