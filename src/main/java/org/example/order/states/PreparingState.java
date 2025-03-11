package org.example.order.states;

import org.example.order.Order;

public class PreparingState implements OrderState {
    @Override
    public void next(Order order) {
        order.setState(new ReadyState());
    }

    @Override
    public String getStateName() {
        return "Em preparação";
    }
}