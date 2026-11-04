package com.oops.solid;

public class Driver {

	public static void main(String[] args) {
		Vehicle v1 = new Bike("TVS Victor", "KA-03-6012");
		IncludeVehicle vehicle = new IncludeVehicle();
		vehicle.addVehicle(v1);

	}

}
