package com.lab;

public class ECommerceApp {
    public static void main(String[] args) {
        // Multiple database connections
        DatabaseManager db1 = new DatabaseManager("jdbc:mysql://localhost:3306/orders");
        DatabaseManager db2 = new DatabaseManager("jdbc:mysql://localhost:3306/orders");
        DatabaseManager db3 = new DatabaseManager("jdbc:mysql://localhost:3306/orders");

        db1.executeQuery("SELECT * FROM orders");
        db2.executeQuery("SELECT * FROM customers");
        db3.executeQuery("SELECT * FROM products");

        // Complex email service creation
        EmailService emailService = new EmailService("smtp.gmail.com", 587,
                "myuser@gmail.com", "mypassword");
        emailService.sendEmail("customer@email.com", "Welcome", "Thank you for joining!");

        // Notification handling
        NotificationManager notifier = new NotificationManager();
        notifier.sendNotification("EMAIL", "Order confirmed", "customer@email.com");
        notifier.sendNotification("SMS", "Order shipped", "+1234567890");

        // Order processing
        OrderProcessor processor = new OrderProcessor();
        processor.addListener("EMAIL");
        processor.addListener("INVENTORY");
        processor.addListener("BILLING");
        processor.processOrder("ORD001", 99.99);
    }
}