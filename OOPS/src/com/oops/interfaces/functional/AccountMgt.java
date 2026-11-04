package com.oops.interfaces.functional;

@FunctionalInterface
public interface AccountMgt extends AccountSection { // this extending another interface which one abstract technically
														// now AccountMgt includes 2 abstract method it violets
														// Functional Interface rule
//	void detailsOfTransaction();
}
