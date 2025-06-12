package com.lab;

import java.util.List;
import java.util.ArrayList;

public class OrderProcessor {
    private List<String> orderListeners;

    public OrderProcessor() {
        this.orderListeners = new ArrayList<>();
    }

    public void addListener(String listener) {
        orderListeners.add(listener);
    }

    public void processOrder(String orderId, double amount) {
        System.out.println("Processing order: " + orderId);

        // Notify all systems about the order
        for (String listener : orderListeners) {
            if (listener.equals("EMAIL")) {
                System.out.println("Sending email confirmation for order: " + orderId);
            } else if (listener.equals("INVENTORY")) {
                System.out.println("Updating inventory for order: " + orderId);
            } else if (listener.equals("BILLING")) {
                System.out.println("Processing payment of $" + amount);
            }
        }
    }
}