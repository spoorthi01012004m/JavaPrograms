package com.oops.polymorphism;

// payment through Credit card
// Extending payment class and overriding it's method
public class CreditCardPayment extends Payment {
	@Override
	public void doPayment() {
		System.out.println("CreditCardPayment.doPayment().........");
	}

}
