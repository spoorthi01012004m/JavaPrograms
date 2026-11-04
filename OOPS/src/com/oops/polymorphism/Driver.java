package com.oops.polymorphism;

//this is parent class 
class User {
	public void doLogin(String userId) {
		System.out.println("User.doLogin()");
	}

	public void checkDownCast() {
		System.out.println("User.checkDownCast()");
	}
}

//child class with overridden method 
class AdminUser extends User {
	@Override
	public void doLogin(String adminUserId) {
		System.out.println("AdminUser.doLogin()");
	}

}

public class Driver {

	public static void main(String[] args) {
		User u1 = new User();
		
		User u2 = new AdminUser(); // automatically up casted
		u2.doLogin("80EMP");
//		AdminUser au1 = (AdminUser)new User();
		AdminUser au1 = (AdminUser)u2; // explicitly down cast
		u2.doLogin("RS566");
		u2.checkDownCast();

	}

}
