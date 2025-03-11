package org.example.order.states;

import org.example.order.Order;

public class DeliveredState implements OrderState {
    @Override
    public void next(Order order) {
        throw new UnsupportedOperationException("Pedido já entregue.");
    }

    @Override
    public String getStateName() {
        return "Entregue";
    }
}