package com.basics;

/*
 * If any class is final then it cannot become a parent of any other class
 * if any method in class is final then it cannot be override by child class
 * Finally if anything mentioned as 'final' then it cannot be modified by any other class 
 * Any constant variable name should be in capital letters ex: ' UPI_PAYMENT'
 */

class StudentMarks {
	final int MIN_MARKS = 35;

	final public void countMarks() {
		System.out.println("Students Marks, Cannot change marks!!");
//		MIN_MARKS  = 45;
	}

	public void printMarks() {
		System.out.println("Students marks are verified");
	}
}

class Student extends StudentMarks {
//	@Override
//	public void countMarks() {
//		
//	}

	@Override
	public void printMarks() {
		System.out.println("This method can be override");
	}

}

public class StringFinal {

	public static void main(String[] args) {

	}

}
