package com.ilp.utility;

import com.ilp.services.EmailNotificationService;
import com.ilp.services.PushNotificationService;

public class NotificationSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 EmailNotificationService emailNotificationService = new EmailNotificationService();
	     emailNotificationService.sendEmail("Your booking is successful.");
	     
	     PushNotificationService pushNotificationService = new PushNotificationService();
	     pushNotificationService.sendPushNotification("Your booking is successful");
	     
	}

}
