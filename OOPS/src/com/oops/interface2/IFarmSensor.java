package com.oops.interface2;

public interface IFarmSensor {
	void getSensorReading();// gives sensor default readings

	void getSensorReading(String fieldId); // gives readings of particular field

	void getSensorReading(String startTime, String endTime, String fieldId);// provides sensor data in particular period

}
