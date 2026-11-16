package com.basics;

public class Driver2 {
 public static void main(String args[]) {
	 /*
	  * Shree - SCP and 1obj, 'Ram' - SCP and 1obj
	  * "Ram" - Heap and 1 obj, "ShreeRam" - heap and 1 obj
	  * total 4 obj
	  */
	 String name = "Shree" + new String("Ram");
	 System.out.println(name);
 }
}
