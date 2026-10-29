package com.oops.abstraction;

public class DriverAccount {

	public static void main(String[] args) {
		PersonAccount transfer = new PersonAccount(8000, "2678");
		transfer.credit(900, "2678");

	}

}
