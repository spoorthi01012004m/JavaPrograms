package com.oops.polymorphism;

public class Driver2 {
	NetBanking netBanking;
	DebitCardPayment debitCardPayment;
	
	
	public void payments() {
		netBanking = new NetBanking();
		debitCardPayment = new DebitCardPayment();
		System.out.println("We are in payments method .............");
		//further there 1k lines of code but we r not using above objects further.
		//But those objects occupies space in memory which creates memory leak 
		//
		
		
		//nullifying this object reference , so GC removes orphaned objects when JVM requires
		netBanking = null;
		debitCardPayment = null;
	}

}
