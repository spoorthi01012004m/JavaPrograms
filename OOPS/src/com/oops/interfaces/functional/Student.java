package com.oops.interfaces.functional;
/*
 * This class is allowing to copy its object by implementing 
 */
public class Student implements Cloneable {
	String studentName;
	String studentAge;

	public Student(String studentName, String studentAge) {
		super();
		this.studentName = studentName;
		this.studentAge = studentAge;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

}
