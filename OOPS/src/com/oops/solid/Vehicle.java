package com.oops.solid;

public class Vehicle {
	public final double RENT_PER_DAY = 0 ;
	public String vehicleName;
	public String vehicleNumber;

	public Vehicle(String vehicleName, String vehicleNumber) {
		super();
		this.vehicleName = vehicleName;
		this.vehicleNumber = vehicleNumber;
	}

	public void isVehicleRegistered() {
		System.out.println("Yes vehicle registered");
	}

	public void rentPerDay(int numberOfDays) {
		System.out.println("Retal amount per day is:");
	}

	public void showDetailsOfVehicle() {
		System.out.println("Vehicle Name: " + vehicleName);
		System.out.println("Vehicle Number: " + vehicleNumber);
	}

}
