package org.example;

class DeliveredState implements OrderState {
    @Override
    public void next(Order order) {
        System.out.println("O pedido já foi entregue.");
    }

    @Override
    public String getStateName() {
        return "Entregue";
    }
}