package com.oops.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MessageSerialization {
	public void serializeMssg(Message message) throws IOException {
		FileOutputStream fos = new FileOutputStream("message.txt");
		ObjectOutputStream oos  = new ObjectOutputStream(fos);
		oos.writeObject(message);
		oos.close();
	}

}
