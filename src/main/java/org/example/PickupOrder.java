package org.example;

public class PickupOrder extends Order {
    public PickupOrder(String orderId, double amount) {
        super(orderId, amount);
    }

    @Override
    public void processOrder() {
        System.out.println("Processando pedido para retirada: " + orderId);
    }

    @Override
    public Order clone() {
        PickupOrder clone = new PickupOrder(this.orderId, this.amount);
        clone.setPriceStrategy(this.priceStrategy);
        clone.state = new ReceivedState();
        return clone;
    }
}
