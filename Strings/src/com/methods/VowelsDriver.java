package com.methods;

public class VowelsDriver {

	public static void main(String[] args) {
		CountVowels count1 = new CountVowels("Roshni");
		int numVowels = count1.countVowels(count1.word);
		System.out.println("Number of vowels in the word '"+count1.word+"' is: "+numVowels);

	}

}
