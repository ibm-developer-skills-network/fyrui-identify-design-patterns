package com.lab;

public class NotificationManager {

    public void sendNotification(String type, String message, String recipient) {
        if (type.equals("EMAIL")) {
            // Hard-coded email creation logic
            EmailService email = new EmailService("smtp.gmail.com", 587, "user", "pass");
            email.sendEmail(recipient, "Notification", message);

        } else if (type.equals("SMS")) {
            // Hard-coded SMS creation logic
            System.out.println("SMS to " + recipient + ": " + message);

        } else if (type.equals("PUSH")) {
            // Hard-coded push notification logic
            System.out.println("Push notification to " + recipient + ": " + message);

        } else {
            System.out.println("Unknown notification type: " + type);
        }
    }
}