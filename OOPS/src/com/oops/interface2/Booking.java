package com.oops.interface2;

/**
 * Represents a booking made by a customer.
 */
public class Booking {

	private int bookingId;
	private String customerName;
	private String bookingDate;
	private String status;

	public String getStatus() {
		return status;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
