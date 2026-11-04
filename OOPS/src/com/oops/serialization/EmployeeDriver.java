package com.oops.serialization;

import java.io.IOException;

public class EmployeeDriver {

	public static void main(String[] args) throws IOException {
		Employee employee1 = new Employee("IT201", "Jose", "Backend Developer", 60000);

		SerializeEmployeeData data = new SerializeEmployeeData();
		data.serialize(employee1);

	}

}
