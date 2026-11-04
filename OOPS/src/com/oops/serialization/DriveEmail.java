package com.oops.serialization;

import java.io.IOException;

public class DriveEmail {

	public static void main(String[] args) throws IOException {
		Email email = new Email("hakunamatata@gmail", "Dear Monisha, \n\nHow are you, I hope you are doing good! ");
		EmailSerialization serialization = new EmailSerialization();
		serialization.emailSerialization(email);

	}

}
