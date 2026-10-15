package com.stringbuffer;

public class AddSentence {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello everyone");
		System.out.println(sb);
		sb.append(" I am Spoorthi, Completed B.E in 2026"); // .append() method is used add string to the existing one
		System.out.println(sb);
		System.out.println(sb.length());
	}

}
