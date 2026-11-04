package com.oops.interfaces.functional;

public interface AccountSection {
	void openAccount();

	public default void accountNumberVerification() {
		System.out.println("AccountSection.accountNumberVerification()");
	}

}
