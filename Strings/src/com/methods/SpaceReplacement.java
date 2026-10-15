package com.methods;

public class SpaceReplacement {

	public static void main(String[] args) {
		String sentence = args[0];
		
		System.out.println("Before applying 'Replace' :" +sentence);
		System.out.println("After applying 'Replace': "+ sentence.replace(" ", "-"));
	}

}
