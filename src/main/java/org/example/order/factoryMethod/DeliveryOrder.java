package org.example.order.factoryMethod;

import org.example.order.Order;
import org.example.order.states.ReceivedState;

public class DeliveryOrder extends Order {
    public DeliveryOrder(String orderId, double amount) {
        super(orderId, amount);
    }

    @Override
    public String processOrder() {
        return "Processando pedido de delivery: " + orderId;
    }

    @Override
    public Order clone() {
        DeliveryOrder clone = new DeliveryOrder(this.orderId, this.amount);
        clone.setPriceStrategy(this.priceStrategy);
        // inicia com o estado padrão
        clone.state = new ReceivedState();
        return clone;
    }
}