package com.oops.basic.staticblock;

public class BankAccount {

	private Long accNum;
	private String accHolderName;
	private double balance;

	// static block to print bank details once before user start creates their
	// accounts

	static {
		System.out.println("Bank Name: SBI\nIFSC code: SBION01910\nMINIMUM BALANCE: 100\n");
	}

	// IIB executes in every object creation , default account status is 'Active'

	{
		System.out.println("Account status: " + "ACTIVE");
	}
}
