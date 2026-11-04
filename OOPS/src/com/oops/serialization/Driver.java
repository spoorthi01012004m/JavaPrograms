package com.oops.serialization;

import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException {
		Message message = new Message("MSG12", "Yen madthidiri", "AP123");
		MessageSerialization messageSerialization = new MessageSerialization();
		messageSerialization.serializeMssg(message);

	}

}
