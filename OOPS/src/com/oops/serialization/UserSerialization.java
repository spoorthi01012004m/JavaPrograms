package com.oops.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class UserSerialization {
	public void serialize(User user) throws IOException {
		FileOutputStream fis = new FileOutputStream("user.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fis);
		oos.writeObject(user);
		oos.close();
	}

}
