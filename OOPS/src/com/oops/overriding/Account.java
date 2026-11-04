package com.oops.overriding;

public class Account {
	public void openAccount(String name, String phoneNumber, String adhaarNumber) {
		System.out.println("Account opened successfully! \n Name: " + name + "\nPhone Number: " + phoneNumber
				+ "\nAdhaar Number: " + adhaarNumber);
	}
	static void checkStatic() {
		System.out.println("Account.checkStatic()");
	}

}


class SavingAccount extends Account {
	/*
	 * must use override annotation without @Override method will be considered as a new method 
	 * method name should be same as parent method
	 * number, order and type of arguments should be same
	 * return should be same except covariant 
	 * access modifier should be same or widen 
	 * 
	 */
	@Override
	public void openAccount(String _name, String _mobNumber, String govId) {
		System.out.println("This is SAVING ACCOUNT");
		System.out.println("Account opened successfully! \nName: " + _name + "\nPhone Number: " + _mobNumber
				+ "/nAdhaar Number: " + govId);

	}
	
	static void checkStatic() {
		System.out.println("SavingAccount.checkStatic()");
	}
}
