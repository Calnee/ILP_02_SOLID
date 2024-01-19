package com.ilp.service;

import com.ilp.interfaces.NotificationService;

public class EmailNotificationService implements NotificationService{

	@Override
	public void sendNotification(String message) {
		// TODO Auto-generated method stub
		 System.out.println("Email Notification: " + message);
	}

}
