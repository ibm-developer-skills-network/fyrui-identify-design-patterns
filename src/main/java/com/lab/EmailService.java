package com.lab;

public class EmailService {
    private String smtpServer;
    private int port;
    private String username;
    private String password;

    public EmailService(String smtpServer, int port, String username, String password) {
        this.smtpServer = smtpServer;
        this.port = port;
        this.username = username;
        this.password = password;
    }

    public void sendEmail(String to, String subject, String body) {
        System.out.println("Sending email to: " + to);
        System.out.println("Subject: " + subject);
        System.out.println("Via: " + smtpServer + ":" + port);
    }
}