package org.example;

public class Customer implements OrderObserver {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public String update(String status) {
        return "Notificação para " + name + ": " + status;
    }
}
