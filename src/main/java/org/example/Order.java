package org.example;

import java.util.ArrayList;
import java.util.List;

/* ===============================
   Factory Method – Criação de Pedidos
   =============================== */
abstract class Order {
    protected String orderId;
    protected double amount;
    protected OrderState state;
    private List<OrderObserver> observers = new ArrayList<>();
    protected PriceCalculationStrategy priceStrategy;

    public Order(String orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
        this.state = new ReceivedState(); // estado inicial
    }

    public abstract void processOrder();

    // Observer: gerenciamento de observadores
    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(OrderObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for(OrderObserver observer : observers) {
            observer.update(message);
        }
    }

    // Gerenciamento de estado
    public void setState(OrderState state) {
        this.state = state;
        notifyObservers("Pedido " + orderId + " está " + state.getStateName());
    }

    public OrderState getState() {
        return state;
    }

    // Estratégia de cálculo de preço
    public double calculatePrice() {
        if(priceStrategy != null) {
            return priceStrategy.calculate(amount);
        }
        return amount;
    }

    public void setPriceStrategy(PriceCalculationStrategy strategy) {
        this.priceStrategy = strategy;
    }
}
