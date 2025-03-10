package org.example;

import java.util.Observable;

/* ===============================
   Factory Method – Criação de Pedidos
   Prototype - Clonagem do objeto
   =============================== */

public abstract class Order extends Observable {
    protected String orderId;
    protected double amount;
    protected OrderState state;
    private Customer observer = null;
    protected PriceCalculationStrategy priceStrategy;

    public Order(String orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
        this.state = new ReceivedState(); // estado inicial
    }

    public abstract String processOrder();

    public void setState(OrderState state) {
        this.setChanged();
        this.state = state;
        this.notifyObservers(this);
    }

    public OrderState getState() {
        return state;
    }

    public double calculatePrice() {
        if(priceStrategy != null) {
            return priceStrategy.calculate(amount);
        }
        return amount;
    }

    public void setPriceStrategy(PriceCalculationStrategy strategy) {
        this.priceStrategy = strategy;
    }

    public String getOrderId() {
        return orderId;
    }

    public PriceCalculationStrategy getPriceStrategy() {
        return priceStrategy;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public Order clone() {
        try {
            Order clonedOrder = (Order) super.clone();

            clonedOrder.state = this.state;
            clonedOrder.priceStrategy = this.priceStrategy;

            return clonedOrder;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}