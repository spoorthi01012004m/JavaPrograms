package com.oops.encapsulation;

public class UserATM {

	public static void main(String[] args) {
		ATM user1 = new ATM(150000l, "209879");
		user1.withDraw(6000, "209879");
		user1.depositAmt(3000, "209879");
		System.out.println("balance is: "+user1.getBalance());
		
	}

}
