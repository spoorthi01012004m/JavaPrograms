package com.basics;

public class StringEquals {

	public static void main(String[] args) {
		// string objects using string literals
		String name1 = "Krishna";
		String name2 = "Krishna";
		System.out.println(name1.equals(name2)); // return true , it compares same sequence of characters

		String student = new String("Akshath");
		String student1 = new String("Akshath");
		System.out.println(student.equals(student1));// return true, this equals belongs to String class

		User user1 = new User("Bunty");
		User user2 = new User("Bunty");
		System.out.println(user1.equals(user2)); // this equals belongs to Object.class , default it checks address

	}

}

class User {
	String name;

	public User(String name) {
		super();
		this.name = name;

	}
}
