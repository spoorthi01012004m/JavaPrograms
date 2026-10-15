package com.basics;

public class LiteralDriver {

	public static void main(String[] args) {
		String s1 = "Multi Raju";// 1 - obj in SCP s1 refers 
		String s2 = "Bheem"; // 1- obj
		String s3 = "Kaaliya"; // 1- obj
		String s4 = "Bheem";
		System.out.println(s1 == s2);  // compares reference 
		System.out.println(s2 == s4);
	}

}
