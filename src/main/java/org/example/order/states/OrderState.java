package org.example.order.states;

import org.example.order.Order;

public interface OrderState {
    void next(Order order);
    String getStateName();
}