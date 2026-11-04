package com.oops.interfaceConcept;

public class FlightBooking implements IDiscount {
	
	public int calcDiscount(int amount, int rate) {
		int totalAmount  = amount - (amount*rate)/100;
		System.out.println(MAX_VALUE);
		return totalAmount;
				
	}
	public void calcDiscountTax(int tax) {
		System.out.println("FlightBooking.calcDiscountTax()");
	}

}
