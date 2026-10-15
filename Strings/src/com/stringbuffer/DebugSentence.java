package com.stringbuffer;

public class DebugSentence {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("A little cot."); //there is a spelling mistake cot - coat
		System.out.println(sb);
		sb.insert(11, 'a');
		System.out.println(sb);

	}

}
