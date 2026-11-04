package com.oops.interfaceConcept;

public class Driver {

	public static void main(String[] args) {
		FlightBooking booking1 = new FlightBooking();
		booking1.calcDiscount(3000, 2);
		booking1.calcDiscountTax(3);
	}

}
