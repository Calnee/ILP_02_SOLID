package com.ilp.utility;

import com.ilp.interfaces.SendNotification;
//import com.ilp.services.EmailNotification;
import com.ilp.services.NotificationServices;
//import com.ilp.services.SMSNotification;

public class NotificationSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SendNotification smsNotification = NotificationServices.createNotification("SMS");
        smsNotification.sendNotifications("Your booking is successful.");
        
        SendNotification emailNotification = NotificationServices.createNotification("Email");
        emailNotification.sendNotifications("Your booking is successful.");
	}

}
