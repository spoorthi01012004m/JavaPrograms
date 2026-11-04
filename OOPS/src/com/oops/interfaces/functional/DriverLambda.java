package com.oops.interfaces.functional;

public class DriverLambda {

	public static void main(String[] args) {
		
//	IAccount acc1 = () -> {
//		System.out.println("DriverLambda.main()...............");
//	};
		
		/*
		 * To implement parameterized function
		 */
		IAccount acc1 = (name, accNumber , balance) ->{
			System.out.println("DriverLambda.main().........account opening ");
			System.out.println(name + " Account is opened");
			return "Account opened";
		};
		String result = acc1.openAccount("Spoorthi", "8907654", 3000);
		System.out.println(result);
	
	}

}
