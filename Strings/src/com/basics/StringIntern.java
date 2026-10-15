package com.basics;

public class StringIntern {

	public static void main(String[] args) {
		String s1 = "Rameshwaram";
		String s2 = "Cafe";
		
		String s3 = s1 + s2;  //stores in heap new StringBuilder()
		String s4 = "RameshwaramCafe";
		
		//String intern creates a copy of the obj (which stored in heap) in SCP, before creating copy it checks is there any object with same content 
		//if it is there it will refer the same content/object in SCP
		System.out.println(s4 == s3.intern()); //true
		
		

	}

}
