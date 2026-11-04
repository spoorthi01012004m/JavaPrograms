package com.oops.serialization;

import java.io.Serializable;

public class Message implements Serializable{
	private String mssgId;
	private String message;
	private transient String userID;

	private static final long serialVersionUID = 1L;

	public Message(String mssgId, String message, String userID) {
		super();
		this.mssgId = mssgId;
		this.message = message;
		this.userID = userID;
	}

	public String getMssgId() {
		return mssgId;
	}

	public void setMssgId(String mssgId) {
		this.mssgId = mssgId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
