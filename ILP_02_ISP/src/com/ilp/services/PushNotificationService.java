package com.ilp.services;

import com.ilp.interfaces.PushNotification;

public class PushNotificationService implements PushNotification{

	@Override
	public void sendPushNotification(String message) {
		// TODO Auto-generated method stub
		System.out.println("Push Notification:"+ message);
	}

}
