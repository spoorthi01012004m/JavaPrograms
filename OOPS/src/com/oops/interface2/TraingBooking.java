package com.oops.interface2;

public class TraingBooking implements IBooking {

	@Override
	public Booking book() {
		Booking booking = new Booking();
		booking.setBookingId(2345);
		booking.setCustomerName("Dinku");
		booking.setBookingDate("23-04-2027");
		booking.setStatus("Confirmed");
		return booking;
	}

	@Override
	public void cancelBooking() {
		System.out.println("TraingBooking.cancelBooking()......canceled");

	}

	@Override
	public String checkStatus() {
		Booking booking = new Booking();
		String status = booking.getStatus();
		return status;
	}

	//new feature required in to this class 
	@Override
	public void autoUpgrade() {
		System.out.println("TraingBooking.autoUpgrade()");
		
	}

}
