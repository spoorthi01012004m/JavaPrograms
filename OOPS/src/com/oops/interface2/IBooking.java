package com.oops.interface2;

/*
 * designed 2012
 */

public interface IBooking {
	
	 Booking book();
	 void cancelBooking();
	 String checkStatus();
     
//	 //new feature added in 2022
//	 void autoUpgrade();
	 
	 //to avoid that unwanted method implementation in class java 8 bring new concept
	 //optional method
	 public default void autoUpgrade() {
		 
	 }
}
