package org.example.order.factoryMethod;

import org.example.order.Order;
import org.example.order.states.ReceivedState;

public class PickupOrder extends Order {
    public PickupOrder(String orderId, double amount) {
        super(orderId, amount);
    }

    @Override
    public String processOrder() {
        return "Processando pedido para retirada: " + orderId;
    }

    @Override
    public Order clone() {
        PickupOrder clone = new PickupOrder(this.orderId, this.amount);
        clone.setPriceStrategy(this.priceStrategy);
        clone.state = new ReceivedState();
        return clone;
    }
}
