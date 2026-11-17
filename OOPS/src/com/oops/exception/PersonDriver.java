package com.oops.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PersonDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int age = 0;
		try {
			age = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Input age is invalid! Please enter age in number");
			e.printStackTrace();
		}
		Person p1 = new Person(name, age);
		System.out.println("Person name: "+p1.getName());
		System.out.println("Person age: "+p1.getAge());

	}

}
