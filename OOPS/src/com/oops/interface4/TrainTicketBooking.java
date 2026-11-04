package com.oops.interface4;

public class TrainTicketBooking implements ITicketBooking{

	@Override
	public void book() {
		System.out.println("TrainTicketBooking.book()");
		
	}

	@Override
	public void cancelBooking() {
		System.out.println("TrainTicketBooking.cancelBooking()");
		
	}

	@Override
	public void checkStatus() {
		System.out.println("TrainTicketBooking.checkStatus()");
		
	}
	
	@Override
	public void autoUpgrade() {
		ITicketBooking.super.autoUpgrade();
		System.out.println("TrainTicketBooking.autoUpgrade()");
	}
	
	@Override
	public void sendNotification() {
		ITicketBooking.super.sendNotification();
	}
	
//	public void printDetails() {
//		ITicketBooking.printDetails();
//	}

}
