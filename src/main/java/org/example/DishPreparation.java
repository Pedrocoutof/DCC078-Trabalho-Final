package org.example;

/* ===============================
   Template Method – Fluxo de Preparo de Pratos
   =============================== */
abstract class DishPreparation {
    // Template Method final que define o fluxo de preparo
    public final void prepareDish() {
        prepareIngredients();
        cook();
        garnish();
        serve();
    }

    protected abstract String prepareIngredients();
    protected abstract String cook();
    protected abstract String garnish();

    private String serve() {
        return "Servindo o prato.";
    }
}