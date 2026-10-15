package com.methods;

public class ExtractDomainName {

	public static void main(String[] args) {
		String emailId = args[0];
		
		System.out.println("Domain name is: "+ emailId.substring(0, 5));

	}

}
