package com.oops.marker;

public class User1 implements CopyObj {
	private String name;
	private int age;

	public User1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}
