package org.example;

public class PickupOrder extends Order {
    public PickupOrder(String orderId, double amount) {
        super(orderId, amount);
    }

    @Override
    public void processOrder() {
        System.out.println("Processando pedido para retirada: " + orderId);
    }
}