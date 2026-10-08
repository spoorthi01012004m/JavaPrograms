package com.basics;

public class StudentDriver {

	public static void main(String[] args) {
		StudentInfo student1 = new StudentInfo();
		StudentInfo student2 = new StudentInfo("Raju", "Bengaluru Karnataka", "8907689098","Grishma Puplic School", 578);
		student1.printDetails();
		student2.printDetails();

	}

}
