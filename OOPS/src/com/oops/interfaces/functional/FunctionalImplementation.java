package com.oops.interfaces.functional;


/*
 * This act as functional interface 
 */
@FunctionalInterface   // this annotation checks the rules of functional interface
public interface FunctionalImplementation {
	void openAccount();  // got only one abstract method
	
	public default void addFunction() {
		System.out.println("FunctionalImplementation.addFunction()");
	}
	
//	void closeAccount();
	

}
