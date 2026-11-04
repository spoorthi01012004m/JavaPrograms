package com.oops.deserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.oops.serialization.Employee;

public class DriverEmployee {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fileInput = new FileInputStream(
				"D:\\Java Programming Language\\JavaWorkSpace\\OOPS\\employee.txt");
		ObjectInputStream objectInput = new ObjectInputStream(fileInput);
		Employee employee = (Employee) objectInput.readObject();
		System.out.println("Employee Name: " + employee.getEmployeeName());
		System.out.println("Employee department: " + employee.getDepartment());
		System.out.println("Employee salary: " + employee.getSalary());
		objectInput.close();

	}

}
