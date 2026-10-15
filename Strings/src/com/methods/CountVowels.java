package com.methods;

public class CountVowels {
	String word;

	public CountVowels(String word) {
		super();
		this.word = word;

	}

	public int countVowels(String word) {
		int count = 0;

		char arr[] = word.toLowerCase().toCharArray();

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

			if ((arr[i] == 'a') || (arr[i] == 'e') || (arr[i] == 'i') || (arr[i] == 'o') || (arr[i] == 'u')) {
				count += 1;
			}
			System.out.println();
		}
		return count;
	}

}
