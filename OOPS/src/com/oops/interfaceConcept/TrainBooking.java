package com.oops.interfaceConcept;

public class TrainBooking implements IDiscount{
	
	public int calcDiscount(int amount, int rate) {
		System.out.println("No Discount applicable");
		return amount;
	}
	
	public void calcDiscountTax(int tax) {
		System.out.println("TrainBooking.calcDiscountTax()");
	}

}
