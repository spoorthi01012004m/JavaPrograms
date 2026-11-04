package com.oops.interfaces.functional;

public class DriverStudent {

	public static void main(String[] args) throws  CloneNotSupportedException{
		Student student1 = new Student("Ravi", "19");
		Student student2 = student1;
		
		Student student3 = (Student)student1.clone();
		System.out.println(student1 instanceof Student);//true
		System.out.println(student2 instanceof Student);//true
		System.out.println(student3 == student1);//false
		System.out.println(student1 == student2);//true

	}

}
