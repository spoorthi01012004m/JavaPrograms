package com.oops.interface4;

public interface ITicketBooking {
	//abstract methods - what to do 
	void book();
	void cancelBooking();
	void checkStatus();
	
	//optional method
	public default void autoUpgrade() {
		//autoUpgrade (check status - check DB for availability - upgrades it)
		connectDB();
		System.out.println("ITicketBooking.autoUpgrade()");
	}
	
	public default void sendNotification() {
		connectDB();
		System.out.println("ITicketBooking.sendNotification().....sending notification");
	}
	
	private void connectDB() {
		System.out.println("ITicketBooking.connectDB(.....connecting to DB)");
	}
	//static method (common method or utility method)
	
	public static void printDetails() {
		System.out.println("ITicketBooking.printDeatils()");
	}

}
