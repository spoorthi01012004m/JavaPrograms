package com.oops.marker;

/*
 * Object of User class can cleaned by giving permission to clean data 
 * This class implements Cleaner interface which act as a tag and allow class to do special activities
 */
public class User implements Cleaner{
	private String userName;
	private String userID;

	public User(String userName, String userID) {
		super();
		this.userName = userName;
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserID() {
		return userID;
	}

}
