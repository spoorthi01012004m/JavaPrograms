package com.oops.encapsulation;

public class FundTransferDriver {

	public static void main(String[] args) {
		ManageFundTransfer user1 = new ManageFundTransfer("Jagan", "60065789879", 12000);
		user1.amountTransfer(13000);
		System.out.println("Balance amount is: "+ user1.getBalance());
		

	}

}
