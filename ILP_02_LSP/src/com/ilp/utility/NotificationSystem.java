package com.ilp.utility;

import com.ilp.services.EmailNotification;
import com.ilp.interfaces.SendNotification;
import com.ilp.services.SMSNotification;

public class NotificationSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SendNotification smsNotification = new SMSNotification();
        smsNotification.sendNotifications("Your booking is successful.");
        
        SendNotification emailNotification = new EmailNotification();
        emailNotification.sendNotifications("Your booking is successful.");
	}

}
