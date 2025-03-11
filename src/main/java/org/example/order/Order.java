package org.example.order;

import org.example.order.prototype.Prototype;
import org.example.order.states.OrderState;
import org.example.order.states.ReceivedState;
import org.example.strategy.PriceCalculationStrategy;

import java.util.Observable;

public abstract class Order extends Observable implements Prototype {
    protected String orderId;
    protected double amount;
    protected OrderState state;
    protected PriceCalculationStrategy priceStrategy;

    public Order(String orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
        this.state = new ReceivedState();
    }

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

    public abstract String processOrder();

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