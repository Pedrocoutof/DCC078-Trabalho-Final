package org.example;

class ExtraCheese extends DishDecorator {
    public ExtraCheese(Dish dish) {
        super(dish);
    }

    @Override
    public String getDescription() {
        return dish.getDescription() + ", Extra Cheese";
    }

    @Override
    public double getCost() {
        return dish.getCost() + 2.0;
    }
}
