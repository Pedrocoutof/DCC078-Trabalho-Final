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

    protected abstract void prepareIngredients();
    protected abstract void cook();
    protected abstract void garnish();

    private void serve() {
        System.out.println("Servindo o prato.");
    }
}