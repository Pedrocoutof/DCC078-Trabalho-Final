package org.example;

class VIPDiscountStrategy implements PriceCalculationStrategy {
    @Override
    public double calculate(double basePrice) {
        double discount = 0.2; // 20% de desconto
        double newPrice = basePrice - (basePrice * discount);
        double tax = GlobalConfig.getInstance().getServiceTax();
        return newPrice + (newPrice * tax);
    }
}