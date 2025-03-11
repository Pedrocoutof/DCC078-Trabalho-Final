package org.example.templateMethod;

public abstract class DishPreparation {

    public final String prepareDish() {
        prepareIngredients();
        cook();
        garnish();
        return serve();
    }

    protected abstract String prepareIngredients();
    protected abstract String cook();
    protected abstract String garnish();

    public String getPrepareIngredients() {
        return prepareIngredients();
    }

    public String getCook() {
        return cook();
    }

    public String getGarnish() {
        return garnish();
    }

    private String serve() {
        return "Servindo o prato.";
    }
}