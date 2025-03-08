package org.example;

class OnSiteOrder extends Order {
    public OnSiteOrder(String orderId, double amount) {
        super(orderId, amount);
    }

    @Override
    public void processOrder() {
        System.out.println("Processando pedido para consumo no local: " + orderId);
    }
}