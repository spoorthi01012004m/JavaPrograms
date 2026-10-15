package com.stringbuilder;

public class Driver1 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Just "); // 'Just' - anything in double "" that goes to SCP and heap
														// referred by local str variable in SCp and by sb in heap

		sb.append("Vibes"); // 'Vibes' goes to SCP , Then original content in heap will be changed to Just
							// Vibes
		System.out.println(sb); // total 3 - obj , 2 - SCP, 1 - heap

		StringBuilder name = new StringBuilder("Ram"); // 1-obj SCP, 1 - heap
		StringBuilder name1 = new StringBuilder("Anji"); //

		System.out.println(name.equals(name1));

	}

}
