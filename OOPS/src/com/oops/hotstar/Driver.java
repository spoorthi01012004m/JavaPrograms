package com.oops.hotstar;

public class Driver {

	public static void main(String[] args) {
		UserCount user1 = new UserCount("guest", "Free");
		UserCount user2 = new UserCount("guest", "Free");
		UserCount user3 = new UserCount("Spoorthi", "Paid", "HTP01");
		UserCount user4 = new UserCount("Rithu", "Paid", "HTP03");
		
		System.out.println(UserCount.liveUserCount);

	}

}
