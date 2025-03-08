package org.example;

class ReadyState implements OrderState {
    @Override
    public void next(Order order) {
        order.setState(new DeliveredState());
    }

    @Override
    public String getStateName() {
        return "Pronto";
    }
}