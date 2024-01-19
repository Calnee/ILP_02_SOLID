package com.ilp.services;

public class EmailNotification extends BaseNotification{

	@Override
	public void sendNotifications(String message) {
		// TODO Auto-generated method stub
		System.out.println("Email Notification:"+ message);
	}

}
