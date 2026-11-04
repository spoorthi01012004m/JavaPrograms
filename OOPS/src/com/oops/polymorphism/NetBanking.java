package com.oops.polymorphism;

//payment through net bank
//Extending payment class and overriding it's method
public class NetBanking extends Payment {
	@Override
	public void doPayment() {
		System.out.println("NetBanking.doPayment().....");
	}

}
