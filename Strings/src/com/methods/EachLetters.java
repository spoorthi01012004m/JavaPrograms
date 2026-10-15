package com.methods;

public class EachLetters {

	public static void main(String[] args) {
		String name = args[0];
		 
		for(int i = 0 ; i<name.length(); i++) {
			System.out.print(name.charAt(i)+" ");
		}

	}

}
