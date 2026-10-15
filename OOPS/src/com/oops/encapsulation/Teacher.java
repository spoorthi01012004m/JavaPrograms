package com.oops.encapsulation;

public class Teacher {

	public static void main(String[] args) {
		Student s = new Student("Spoorthi", "1SI22EC102");
		s.updateMarks(190);
		System.out.println(s.getMarks());
		
		//System.out.println(s.getGrade());
	}

}
