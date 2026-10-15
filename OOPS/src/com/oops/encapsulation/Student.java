package com.oops.encapsulation;

public class Student {
	private String name;
	private int marks;
	private String rollNumber;

	public Student(String name, String rollNumber) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
	}

	// method to update and set the marks
	public void updateMarks(int _marks) {
		if (_marks > 0 && _marks <= 100) {
			this.marks = _marks;
		} else
			System.out.println("Marks should be between 0 to 100");
	}

	// method to get grade
	public char getGrade() {
		if (marks >= 90 && marks <= 100) {
			return 'A';
		} else if (marks >= 75 && marks <= 89) {
			return 'B';
		} else if (marks >= 60 && marks <= 74)
			return 'C';
		else
			return 'D';

	}

	// method to get marks
	public int getMarks() {
		return marks;
	}

}
