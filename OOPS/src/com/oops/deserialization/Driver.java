package com.oops.deserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.oops.serialization.Message;

public class Driver {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//De serialization 
		FileInputStream  fis = new FileInputStream("D:\\Java Programming Language\\JavaWorkSpace\\OOPS\\message.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
        Message message = (Message)ois.readObject();
        System.out.println("Whatsapp message is :"+ message.getMessage());
	}

}
