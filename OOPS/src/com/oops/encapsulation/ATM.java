package com.oops.encapsulation;

public class ATM {
	private Long balance;
	private String securePin;

	public ATM(Long balance, String securePin) {
		super();
		this.balance = balance;
		this.securePin = securePin;
	}
	// public method to deposit amount

	public void depositAmt(int amountToDeposit, String enteredPin) {
		System.out.println("Current  balance amount : " + balance);
		if (enteredPin.equals(securePin) && amountToDeposit > 0) {
			this.balance += amountToDeposit;
			System.out.println("Amount Deposited successfully !!\n Balance amount after deposit : " + balance);
		} else
			System.out.println("Error: Incorrect pin entered");
	}
	// public method to withdraw amount

	public void withDraw(int amountToWithdraw, String enteredPin) {
		if (enteredPin.equals(securePin) && amountToWithdraw <= balance) {
			this.balance -= amountToWithdraw;
			System.out.println("Amount withdraw successful!!\nBalance amount after withdraw : " + balance);
		} else
			System.out.println("Error: Incorrect pin entered or insufficient balance");
	}

	public Long getBalance() {
		return balance;
	}

}
