package org.example;

class ExtraPepperoni extends DishDecorator {
    public ExtraPepperoni(Dish dish) {
        super(dish);
    }

    @Override
    public String getDescription() {
        return dish.getDescription() + ", Extra Pepperoni";
    }

    @Override
    public double getCost() {
        return dish.getCost() + 3.0;
    }
}
