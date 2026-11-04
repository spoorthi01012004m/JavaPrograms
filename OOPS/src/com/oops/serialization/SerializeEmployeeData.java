package com.oops.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeEmployeeData {
	public void serialize(Employee employee) throws IOException {
		FileOutputStream fileOutput = new FileOutputStream("employee.txt");
		ObjectOutputStream  objectOutput = new ObjectOutputStream(fileOutput);
		objectOutput.writeObject(employee);
		objectOutput.close();
	}

}
