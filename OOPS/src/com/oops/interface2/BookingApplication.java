package com.oops.interface2;

public class BookingApplication {

	public static void main(String[] args) {
//		IBooking booking = new BusBooking();
//		booking.book();
//		booking.checkStatus();
		
		IBooking booking2 = new TraingBooking();
		booking2.book();
		booking2.autoUpgrade();

	}

}
