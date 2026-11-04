package com.oops.interface4;

public class BusTicketBooking implements ITicketBooking{

	@Override
	public void book() {
		System.out.println("BusTicketBooking.book()");
		
	}

	@Override
	public void cancelBooking() {
		System.out.println("BusTicketBooking.cancelBooking()");
		
	}

	@Override
	public void checkStatus() {
		System.out.println("BusTicketBooking.checkStatus()");
		
	}
	
//	void printDetails() {
//		ITicketBooking.printDetails();
//	}

}
