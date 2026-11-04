package com.oops.interfaceConcept;

/**
 * Interface includes what to implement by other classes
 * By default interface is considered as public and methods of this as abstract and public 
 * in java version 1.5 or 7 or before
 * In interface all attributes acts as 'public static final' by default
 */
interface IDiscount {
	
	public static final int MAX_VALUE = 100;
	
	int calcDiscount(int amount, int rate);

	void calcDiscountTax(int tax);

}
