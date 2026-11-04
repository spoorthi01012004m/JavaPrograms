package com.oops.interface2;

public class FarmMonitoringSystem {

	public static void main(String[] args) {
		MonitoringReading monitoringReading = new MonitoringReading();
		monitoringReading.farmMonitoring(new SoilMoistureSensor(56.7), "IDF102", "12:57:34", "02:20:00");

	}

}
