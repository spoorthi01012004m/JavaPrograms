package com.oops.interface4;

public class Driver {

	public static void main(String[] args) {
		ITicketBooking booking = new TrainTicketBooking();
		booking.autoUpgrade();
		booking.book();
		ITicketBooking.printDetails();

	}

}
