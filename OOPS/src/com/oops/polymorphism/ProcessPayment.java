package com.oops.polymorphism;

// this class is important in polymorphism, which reduced the code also supports polymorphism 
public class ProcessPayment {
	public void processPayment(Payment payment) { // creating Payment class variable as reference point
		payment.doPayment(); // calling object method
	}

}
