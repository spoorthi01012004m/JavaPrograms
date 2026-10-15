package com.oops.basic.staticblock;

public class StaticUser {
	String userName;
	String userId;
	String phoneNum;

	static // static block executed only once just after class loaded , before creating new
			// object
	{
		System.out.println("Executing static block, after class loading before object creation");
	}
	      
	static //static block more than one then it executes based on priority
	{
		System.out.println("static block2");
	}
	
	static
	{
		System.out.println("Static block3");
	}

	public StaticUser(String userName, String userId, String phoneNum) {
		super(); // first line of constructor always either super() or this()
		System.out.println("Entered Static user object");
		this.phoneNum = phoneNum;
		this.userId = userId;
		this.userName = userName;
	}

}
