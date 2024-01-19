package com.ilp.services;

import com.ilp.interfaces.SendNotification;

public class NotificationServices {
	public static SendNotification createNotification(String type) {
        if ("SMS".equals(type)) {
            return new SMSNotification();
        } else if ("Email".equals(type)) {
            return new EmailNotification();
        } else {
            throw new IllegalArgumentException("Invalid notification type");
        }
    }
}
