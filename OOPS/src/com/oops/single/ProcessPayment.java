package com.oops.single;

public class ProcessPayment {
	public void processPayment(Payment payment) {
		payment.doPayment(payment.getOrderId(), payment.getTotalAmount());
		payment.getPaymentDetails();
	}

}
