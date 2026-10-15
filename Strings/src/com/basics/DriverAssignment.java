package com.basics;

class Employee {
	int id;

	public Employee(int id) {

		this.id = id;
	}
}

public class DriverAssignment {

	public static void main(String[] args) {
		// if concat word is not referring by any variable then it just creates obj in
		// heap with local refer variables
		String s = "Hello";
		s.concat(" World");
		System.out.println(s);

		// checks address to compare, Object class equal method is used
		Employee emp1 = new Employee(101);
		Employee emp2 = new Employee(101);
		System.out.println(emp1.equals(emp2));

		//when literals concated no new object will be created separately in heap , only 1 obj created in SCP
		String str = "Ja" + "va";
		String str1 = "Java";
		System.out.println(str == str1);
		
		//
		String sp = new String("Spring");
		String sp1 = sp.intern();
		System.out.println(sp == sp1);
		System.out.println(sp1 == "Spring");
		

	}

}
