package com.oops.solid;

public class MiniBus extends Vehicle{
	final double RENT_PER_DAY = 1000;

	public MiniBus(String vehicleName, String vehicleNumber) {
		super(vehicleName, vehicleNumber);
		
	}
	
	@Override 
    public void isVehicleRegistered() {
 	   System.out.println("MiniBus is registered under Government");
    }
	@Override
	public void rentPerDay(int numberOfDays) {
		System.out.println("Total rent is: "+numberOfDays * RENT_PER_DAY);
	}
	
	@Override
	public void showDetailsOfVehicle() {
		System.out.println("Vehicle Name: " + vehicleName);
		System.out.println("Vehicle Number: " + vehicleNumber);
		System.out.println("It is a Desiel vehicle , milage - 15KM/Ltr");
	}

}
