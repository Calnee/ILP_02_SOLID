package com.ilp.services;

import com.ilp.interfaces.SendNotification;

public class SMSNotification implements SendNotification{

	@Override
	public void sendNotifications(String message) {
		// TODO Auto-generated method stub
		System.out.println("SMS Notification:"+ message);
	}

}
