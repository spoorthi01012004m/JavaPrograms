package com.oops.exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeDriver {

	public static void main(String[] args) throws FileNotFoundException {
		Employee employee = new Employee("Gani", "EP012", "9087678923", 24);

		// serialization
		try {
			//contains risk line
			FileOutputStream fos = new FileOutputStream("EmployeeInfo.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(employee);
			System.out.println("Object serialized succefully");
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Serialization failed ..!");
		}

	}

}
