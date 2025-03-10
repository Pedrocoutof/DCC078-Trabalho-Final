package org.example;

public class VIPDiscountStrategy implements PriceCalculationStrategy {
    @Override
    public double calculate(double basePrice) {
        double discount = 0.2;
        double newPrice = basePrice - (basePrice * discount);
        double tax = GlobalConfig.getInstance().getServiceTax();
        return newPrice + (newPrice * tax);
    }
}