package com.oops.deserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.oops.serialization.Email;

public class DriverEmail {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fileInputStream = new FileInputStream(
				"D:\\Java Programming Language\\JavaWorkSpace\\OOPS\\email.ser");
		ObjectInputStream objectOutputStream = new ObjectInputStream(fileInputStream);
		Email email = (Email) objectOutputStream.readObject();
		System.out.println("Sender emailID : " + email.getMailId());
		System.out.println("Email : " + email.getMailMessage());
	}

}
