package org.example;

public class DeliveryOrder extends Order {
    public DeliveryOrder(String orderId, double amount) {
        super(orderId, amount);
    }

    @Override
    public void processOrder() {
        System.out.println("Processando pedido de delivery: " + orderId);
    }

    @Override
    public Order clone() {
        DeliveryOrder clone = new DeliveryOrder(this.orderId, this.amount);
        clone.setPriceStrategy(this.priceStrategy);
        // Estado e observadores não são copiados; inicia com o estado padrão
        clone.state = new ReceivedState();
        return clone;
    }
}