package org.example;

class DeliveredState implements OrderState {
    @Override
    public void next(Order order) {
        throw new UnsupportedOperationException("Pedido já entregue.");
    }

    @Override
    public String getStateName() {
        return "Entregue";
    }
}