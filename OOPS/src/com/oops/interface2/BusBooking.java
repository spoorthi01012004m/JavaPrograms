package com.oops.interface2;

public class BusBooking implements IBooking{

	@Override
	public Booking book() {
		System.out.println("BusBooking.book()");
		return null;
	}

	@Override
	public void cancelBooking() {
		System.out.println("BusBooking.cancelBooking().......");		
	}

	@Override
	public String checkStatus() {
		System.out.println("BusBooking.checkStatus()");
		return null;
	}

//	/*
//	 * in java version 7 or before to avoid compilation failure unwanted methods are implemented
//	 * without body 
//	 */
//	@Override
//	public void autoUpgrade() {
//		// TODO Auto-generated method stub
//		
//	}

}
