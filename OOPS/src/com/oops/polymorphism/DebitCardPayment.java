package com.oops.polymorphism;

//payment through Debit card
//Extending payment class and overriding it's method
public class DebitCardPayment extends Payment {
	@Override
	public void doPayment() {
		System.out.println("DebitCardPayment.doPayment().......");
	}

}
