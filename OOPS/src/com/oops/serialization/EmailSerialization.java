package com.oops.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * Serializing the object using FileOutputStream class and ObjectOutputStream class
 * writeObject() method is used to write the content to the choose file 
 */
public class EmailSerialization {
	public void emailSerialization(Email email) throws IOException {
		FileOutputStream fos = new FileOutputStream("email.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(email);
		oos.close();
	}

}
