package com.oops.encapsulation1;

class Bank{
	
}
public class Driver1 {

	public static void main(String[] args) {
        
		Bank b1 = null;
		Bank b2 = new Bank();
		System.out.println(b1.equals(b1));
		String area = args[0];
//		String city = args[1];
//		int num = Integer.parseInt(args[1]);
		int num1 = 24;
		int num2 = 0;
//		System.out.println("Value is: "+ num1/num2); // It will give Arithematicexception 
//		System.out.println(area + " "+ num);
		
//		System.out.println(city);// this gives arrayindexoutofbound  exception 
		System.out.println("Line --- 1");
		System.out.println("Line --- 1");
		System.out.println("Line --- 1");
		
//	String name = "Spoorthi";//positive situation 
    String name = null; // this leads to exception 
	System.out.println(name.length());// 8 , null.length() - we cannot operate on null

	}

}
