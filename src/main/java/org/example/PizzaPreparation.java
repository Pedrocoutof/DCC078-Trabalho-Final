package org.example;

class PizzaPreparation extends DishPreparation {
    @Override
    protected String prepareIngredients() {
        return "Preparando massa, molho de tomate e queijo.";
    }

    @Override
    protected String cook() {
        return "Assando a pizza no forno.";
    }

    @Override
    protected String garnish() {
        return "Finalizando com manjericão e azeite.";
    }
}
