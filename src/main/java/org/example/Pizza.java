package org.example;

class Pizza implements Dish {
    @Override
    public String getDescription() {
        return "Pizza";
    }

    @Override
    public double getCost() {
        return 10.0;
    }
}