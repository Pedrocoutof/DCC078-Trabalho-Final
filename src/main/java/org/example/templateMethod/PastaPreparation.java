package org.example.templateMethod;

public class PastaPreparation extends DishPreparation {
    @Override
    protected String prepareIngredients() {
        return "Preparando macarrão, alho e azeite.";
    }

    @Override
    protected String cook() {
        return "Cozinhando o macarrão e preparando o molho.";
    }

    @Override
    protected String garnish() {
        return "Finalizando com parmesão e salsa.";
    }
}
