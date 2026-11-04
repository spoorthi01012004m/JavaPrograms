package com.oops.serialization;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 2L;

	private String userID;
	private String userName;
	private String email;
	private transient String password;
	private transient String sessionToken;

	public User(String userID, String userName, String email, String password, String sessionToken) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.sessionToken = sessionToken;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getUserID() {
		return userID;
	}

	public String getUserName() {
		return userName;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getSessionToken() {
		return sessionToken;
	}

}
