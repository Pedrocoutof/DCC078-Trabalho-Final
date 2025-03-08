package org.example;

public class OnSiteOrder extends Order {
    public OnSiteOrder(String orderId, double amount) {
        super(orderId, amount);
    }

    @Override
    public void processOrder() {
        System.out.println("Processando pedido para consumo no local: " + orderId);
    }

    @Override
    public Order clone() {
        OnSiteOrder clone = new OnSiteOrder(this.orderId, this.amount);
        clone.setPriceStrategy(this.priceStrategy);
        clone.state = new ReceivedState();
        return clone;
    }
}
