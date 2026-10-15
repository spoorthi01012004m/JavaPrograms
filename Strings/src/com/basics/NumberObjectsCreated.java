package com.basics;

public class NumberObjectsCreated {

	public static void main(String[] args) {
		String str1 = "java";// 1 obj SCP
		String str2 = new String("java"); // obj 1-heap
		String str3 = str2.intern();// it checks is there any object with same content , "java" is there so it refer
									// old obj
		String str4 = "java"; // refer obj with same content
		String str5 = new String("javascript").intern();// 1 copy in SCP

		System.out.println(str1 == str2);
		System.out.println(str3 == str4);
		System.out.println(str5 == "javascript");

	}

}
