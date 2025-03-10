
import org.example.DishPreparation;
import org.example.PastaPreparation;
import org.example.PizzaPreparation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DishPreparationTest {

    @Test
    public void testPreparePastaDish() {
        DishPreparation pastaPreparation = new PastaPreparation();

        assertEquals("Preparando macarrão, alho e azeite.", pastaPreparation.getPrepareIngredients());
        assertEquals("Cozinhando o macarrão e preparando o molho.", pastaPreparation.getCook());
        assertEquals("Finalizando com parmesão e salsa.", pastaPreparation.getGarnish());
    }

    @Test
    public void testPreparePastaIngredients() {
        DishPreparation pastaPreparation = new PastaPreparation();

        String ingredients = pastaPreparation.getPrepareIngredients();
        assertEquals("Preparando macarrão, alho e azeite.", ingredients);
    }

    @Test
    public void testPastaCook() {
        DishPreparation pastaPreparation = new PastaPreparation();

        String cooking = pastaPreparation.getCook();
        assertEquals("Cozinhando o macarrão e preparando o molho.", cooking);
    }

    @Test
    public void testPastaGarnish() {
        DishPreparation pastaPreparation = new PastaPreparation();

        String garnish = pastaPreparation.getGarnish();
        assertEquals("Finalizando com parmesão e salsa.", garnish);
    }

    @Test
    public void testPastaServe() {
        DishPreparation pastaPreparation = new PastaPreparation();

        String serving = pastaPreparation.prepareDish();
        assertTrue(serving.contains("Servindo o prato"));
    }
    @Test
    public void testPreparePizzaDish() {
        DishPreparation pizzaPreparation = new PizzaPreparation();

        assertEquals("Preparando massa, molho de tomate e queijo.", pizzaPreparation.getPrepareIngredients());
        assertEquals("Assando a pizza no forno.", pizzaPreparation.getCook());
        assertEquals("Finalizando com manjericão e azeite.", pizzaPreparation.getGarnish());
    }

    @Test
    public void testPreparePizzaIngredients() {
        DishPreparation pizzaPreparation = new PizzaPreparation();

        String ingredients = pizzaPreparation.getPrepareIngredients();
        assertEquals("Preparando massa, molho de tomate e queijo.", ingredients);
    }

    @Test
    public void testPizzaCook() {
        DishPreparation pizzaPreparation = new PizzaPreparation();

        String cooking = pizzaPreparation.getCook();
        assertEquals("Assando a pizza no forno.", cooking);
    }

    @Test
    public void testPizzaGarnish() {
        DishPreparation pizzaPreparation = new PizzaPreparation();

        String garnish = pizzaPreparation.getGarnish();
        assertEquals("Finalizando com manjericão e azeite.", garnish);
    }

    @Test
    public void testPizzaServe() {
        DishPreparation pizzaPreparation = new PizzaPreparation();

        String serving = pizzaPreparation.prepareDish();
        assertTrue(serving.contains("Servindo o prato"));
    }
}
