package com.ilp.service;

import com.ilp.interfaces.NotificationService;

public class TicketBookingSystem {
	 private NotificationService notificationService;

	    public TicketBookingSystem(NotificationService notificationService) {
	        this.setNotificationService(notificationService);
	    }
	    
	    public void bookTicket(String passengerName, String trainName, boolean isBookingSuccessful) {
	        if (isBookingSuccessful) {
	            String message = String.format("Ticket booked successfully for passenger %s on train %s.", passengerName, trainName);
	            notificationService.sendNotification(message);
	        } else {
	            String message = String.format("Ticket booking failed for passenger %s on train %s. Please try again.", passengerName, trainName);
	            notificationService.sendNotification(message);
	        }
	    }

		public NotificationService getNotificationService() {
			return notificationService;
		}

		public void setNotificationService(NotificationService notificationService) {
			this.notificationService = notificationService;
		}
}
