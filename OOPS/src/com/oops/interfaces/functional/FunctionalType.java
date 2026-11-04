package com.oops.interfaces.functional;

public class FunctionalType implements FunctionalImplementation{

	@Override
	public void openAccount() {
		
		System.out.println("FunctionalType.openAccount()");
		
	}
	
	@Override
	public void addFunction() {
		
		System.out.println("FunctionalType.addFunction()");
	}

}
