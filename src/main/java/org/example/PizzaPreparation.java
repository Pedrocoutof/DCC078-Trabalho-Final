package org.example;

class PizzaPreparation extends DishPreparation {
    @Override
    protected void prepareIngredients() {
        System.out.println("Preparando massa, molho de tomate e queijo.");
    }

    @Override
    protected void cook() {
        System.out.println("Assando a pizza no forno.");
    }

    @Override
    protected void garnish() {
        System.out.println("Finalizando com manjericão e azeite.");
    }
}
