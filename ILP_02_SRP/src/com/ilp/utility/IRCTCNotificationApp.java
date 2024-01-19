package com.ilp.utility;

import com.ilp.service.EmailNotificationService;
import com.ilp.service.SMSNotificationService;
import com.ilp.service.TicketBookingSystem;
import com.ilp.service.WhatsAppNotificationService;

public class IRCTCNotificationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create instances of notification services
        EmailNotificationService emailNotificationService = new EmailNotificationService();
        SMSNotificationService smsNotificationService = new SMSNotificationService();
        WhatsAppNotificationService whatsAppNotificationService = new WhatsAppNotificationService();

        // Create instance of TicketBookingSystem with Email notification
        TicketBookingSystem emailBookingSystem = new TicketBookingSystem(emailNotificationService);

        // Book ticket and send notifications
        emailBookingSystem.bookTicket("John Doe", "Express 123", true);

        // Create instance of TicketBookingSystem with SMS notification
        TicketBookingSystem smsBookingSystem = new TicketBookingSystem(smsNotificationService);

        // Book ticket and send notifications
        smsBookingSystem.bookTicket("John Doe", "Express 123", true);
        
        TicketBookingSystem whatsAppBookingSystem = new TicketBookingSystem(whatsAppNotificationService);
        whatsAppBookingSystem.bookTicket("John Doe", "Express 123", true);
        
	}

}
