package org.example.order.factoryMethod;

import org.example.order.Order;
import org.example.order.states.ReceivedState;

public class OnSiteOrder extends Order {
    public OnSiteOrder(String orderId, double amount) {
        super(orderId, amount);
    }

    @Override
    public String processOrder() {
        return "Processando pedido para consumo no local: " + orderId;
    }

    @Override
    public Order clone() {
        OnSiteOrder clone = new OnSiteOrder(this.orderId, this.amount);
        clone.setPriceStrategy(this.priceStrategy);
        clone.state = new ReceivedState();
        return clone;
    }
}
