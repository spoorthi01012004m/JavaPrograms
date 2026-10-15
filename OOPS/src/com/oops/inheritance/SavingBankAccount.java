package com.oops.inheritance;

//using the existing class  
public class SavingBankAccount extends Account {
	public void openSavingAccount(String name, String address, String type) {
		openBankAccount(name, address, type); // calling Account class method
	}

}
