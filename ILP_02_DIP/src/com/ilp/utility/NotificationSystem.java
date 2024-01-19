package com.ilp.utility;

import com.ilp.interfaces.SendNotification;
import com.ilp.services.EmailNotification;
import com.ilp.services.SMSNotification;

public class NotificationSystem {

    private final SendNotification sendNotification;

    public NotificationSystem(SendNotification sendNotification) {
        this.sendNotification = sendNotification;
    }

    public void sendNotifications(String message) {
        sendNotification.sendNotifications(message);
    }

    public static void main(String[] args) {
        SendNotification smsNotification = new SMSNotification();
        SendNotification emailNotification = new EmailNotification();

        NotificationSystem smsSystem = new NotificationSystem(smsNotification);
        smsSystem.sendNotifications("Your booking is successful.");

        NotificationSystem emailSystem = new NotificationSystem(emailNotification);
        emailSystem.sendNotifications("Your booking is successful.");
    }
}
