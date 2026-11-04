package com.oops.serialization;

import java.io.Serializable;

/*
 * Email class represents the email requirements with mail ID and mail message
 * This also implements serialization and allowing write it's object to byte streams through network it transfered to file  
 */
public class Email implements Serializable{
	
	// this static final attribute is used to give unique ID to this class otherwise
		// JVM creates default serialVersionUID
		private static final Long serialVersionUID = 1L;
		
	private String mailId;
	private String mailMessage;

	public Email(String mailId, String mailMessage) {
		super();
		this.mailId = mailId;
		this.mailMessage = mailMessage;
	}

	// getters and setters to get the message and mail id
	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getMailMessage() {
		return mailMessage;
	}

	public void setMailMessage(String mailMessage) {
		this.mailMessage = mailMessage;
	}

}
