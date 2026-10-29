package com.oops.inheritance1;

public class Vehicle {
	private String vehicleNumber;
	private String brandName;
	private double perDayPrice;
	
    public Vehicle(String vehicleNumber, String brandName, double perDayPrice) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.brandName = brandName;
		this.perDayPrice = perDayPrice;
	}

	// Vehicle class includes common details of all the vehicle act as parent class
	public void displayVehicleDetails(int numberOfDays) {
		double totalPrice = 0;
		if (numberOfDays > 0) {
			totalPrice = perDayPrice * numberOfDays;
			System.out.println("Total amount for " + numberOfDays + " days: " + totalPrice);
		} else
			System.out.println("Please Enter number of days");
		System.out.println("Vehicle Number: "+vehicleNumber);
		System.out.println("Vehicle Brand: "+brandName);
	}
}

class Bike extends Vehicle{
     
	public Bike(String vehicleNumber, String brandName, double perDayPrice) {
		super(vehicleNumber, brandName, perDayPrice);
	}
	
}

