package org.example;

class PastaPreparation extends DishPreparation {
    @Override
    protected void prepareIngredients() {
        System.out.println("Preparando macarrão, alho e azeite.");
    }

    @Override
    protected void cook() {
        System.out.println("Cozinhando o macarrão e preparando o molho.");
    }

    @Override
    protected void garnish() {
        System.out.println("Finalizando com parmesão e salsa.");
    }
}
