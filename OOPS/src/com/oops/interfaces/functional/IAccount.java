package com.oops.interfaces.functional;

@FunctionalInterface
public interface IAccount {
//	void openAccount();
	String openAccount(String name, String accNumber, double balance);
	
	public default void accInfo() {
		System.out.println("IAccount.accInfo()");
	}

}
