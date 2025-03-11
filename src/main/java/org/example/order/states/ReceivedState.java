package org.example.order.states;

import org.example.order.Order;

public class ReceivedState implements OrderState {
    @Override
    public void next(Order order) {
        order.setState(new PreparingState());
    }

    @Override
    public String getStateName() {
        return "Recebido";
    }
}
