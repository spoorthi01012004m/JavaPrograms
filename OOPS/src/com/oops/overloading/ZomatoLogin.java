package com.oops.overloading;

/*
 * This class represents the method overloading 
 * To achieve method overloading methods name should be same but number , order and type of argument should be different
 */
public class ZomatoLogin {

	public void doLogin(String phoneNumber, int otp) {
		System.out.println("ZomatoLogin.mobNumLogin(String phoneNumber, int otp)");
	}

	public void doLogin(String gmail, String password) {
		System.out.println("ZomatoLogin.doLogin(String gmail, String password)");
	}

	public void doLogin(String google) {
		System.out.println("ZomatoLogin.doLogin(String google)");
	}

}
