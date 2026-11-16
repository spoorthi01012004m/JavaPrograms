package com.memory.heapsize;

import java.util.ArrayList;
import java.util.List;

public class HeapMonitoringApp {

	private static final List<Employee> empList = new ArrayList<>();

	public static void main(String[] args) throws InterruptedException {
		Runtime runtime = Runtime.getRuntime();
		System.out.println("================HEAP MONITORING=============");
		System.out.println("Process ID: " + ProcessHandle.current().pid());
		System.out.println("Maximum Heap: " + runtime.maxMemory() / (1024 * 1024) + " MB");
        int i = 1;
		while(true) {
			Employee employee = new Employee(i, "Employee-" + i, "Engineering");
			empList.add(employee);
			i++;
		}
//		System.out.println("Employee objects created: " + empList.size());
//
//		long usedMemory = runtime.totalMemory() - runtime.freeMemory();
//		System.out.println("Used Heap: " + usedMemory / (1024 * 1024) + " MB");
//		System.out.println("Application is running...........");
//		Thread.sleep(300000);
	}


}
