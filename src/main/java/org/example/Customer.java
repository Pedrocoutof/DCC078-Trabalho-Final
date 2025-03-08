package org.example;

public class Customer implements OrderObserver {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String status) {
        System.out.println("Notificação para " + name + ": " + status);
    }
}
