package org.example;

class RegularPriceStrategy implements PriceCalculationStrategy {
    @Override
    public double calculate(double basePrice) {
        double tax = GlobalConfig.getInstance().getServiceTax();
        return basePrice + (basePrice * tax);
    }
}