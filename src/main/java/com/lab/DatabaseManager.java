package com.lab;

public class DatabaseManager {
    private String connectionString;
    private boolean connected;

    public DatabaseManager(String connectionString) {
        this.connectionString = connectionString;
        this.connected = false;
    }

    public void connect() {
        System.out.println("Connecting to: " + connectionString);
        this.connected = true;
    }

    public void executeQuery(String query) {
        if (!connected) {
            connect();
        }
        System.out.println("Executing: " + query);
    }

    public void disconnect() {
        System.out.println("Disconnecting...");
        this.connected = false;
    }
}