package org.example;

public class DeliveryOrder extends Order {
    public DeliveryOrder(String orderId, double amount) {
        super(orderId, amount);
    }

    @Override
    public void processOrder() {
        System.out.println("Processando pedido de delivery: " + orderId);
    }
}
