package com.oops.hotstar;

public class UserCount {
	String userName;
	String userId;
	String accType;

	public static int liveUserCount = 0; 

	public UserCount(String userName, String accType) {
		super();
		this.accType = accType;
		this.userName = userName;

	}

	public UserCount(String userName, String accType, String userId) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.accType = accType;

	}

	// instance initialization block
	{
		liveUserCount += 1;

	}

}
