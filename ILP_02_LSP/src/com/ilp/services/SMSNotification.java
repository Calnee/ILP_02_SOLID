package com.ilp.services;

public class SMSNotification extends BaseNotification{

	@Override
	public void sendNotifications(String message) {
		// TODO Auto-generated method stub
		System.out.println("SMS Notification:"+ message);
	}

}
