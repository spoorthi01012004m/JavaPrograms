package com.oops.interface2;

public class MonitoringReading {
	public void farmMonitoring(IFarmSensor farmSensor, String fieldId, String startTime, String endTime) {
		farmSensor.getSensorReading();
		farmSensor.getSensorReading(fieldId);
		farmSensor.getSensorReading(startTime, endTime, fieldId);
	}
}
