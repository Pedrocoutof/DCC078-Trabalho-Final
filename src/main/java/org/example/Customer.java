package org.example;

import java.util.Observable;
import java.util.Observer;

public class Customer implements Observer {
    private String name;

    public Customer(String name) {
        this.setName(name);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Customer name cannot be null or empty");
        }

        this.name = name;
    }

    @Override
    public void update(Observable order, Object arg) {
        if(order instanceof Order) {
            Order currentOrder = (Order) order;
            // notifica usuário
        } else {
            throw new IllegalArgumentException("Observable não tratado.");
        }
    }
}
