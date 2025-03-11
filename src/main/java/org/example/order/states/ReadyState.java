package org.example.order.states;

import org.example.order.Order;

public class ReadyState implements OrderState {
    @Override
    public void next(Order order) {
        order.setState(new DeliveredState());
    }

    @Override
    public String getStateName() {
        return "Pronto";
    }
}