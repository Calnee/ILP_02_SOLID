package com.ilp.services;

import com.ilp.interfaces.EmailNotification;

public class EmailNotificationService implements EmailNotification{

	@Override
	public void sendEmail(String message) {
		// TODO Auto-generated method stub
		System.out.println("Email Notification:"+ message);
	}

}
