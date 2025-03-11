import static org.junit.Assert.assertEquals;

import org.example.decorator.Dish;
import org.example.decorator.ExtraCheese;
import org.example.decorator.ExtraPepperoni;
import org.example.decorator.Pizza;
import org.junit.jupiter.api.Test;

public class DishDecoratorTest {

    @Test
    public void testBasicPizza() {
        Dish pizza = new Pizza();

        assertEquals("Pizza", pizza.getDescription());
        assertEquals(10.0, pizza.getCost(), 0.001);
    }

    @Test
    public void testPizzaWithExtraCheese() {
        Dish pizza = new Pizza();
        pizza = new ExtraCheese(pizza);

        assertEquals("Pizza, Extra Cheese", pizza.getDescription());
        assertEquals(12.0, pizza.getCost(), 0.001);
    }

    @Test
    public void testPizzaWithExtraPepperoni() {
        Dish pizza = new Pizza();
        pizza = new ExtraPepperoni(pizza);

        assertEquals("Pizza, Extra Pepperoni", pizza.getDescription());
        assertEquals(13.0, pizza.getCost(), 0.001);
    }

    @Test
    public void testPizzaWithExtraCheeseAndPepperoni() {
        Dish pizza = new Pizza();
        pizza = new ExtraCheese(pizza);
        pizza = new ExtraPepperoni(pizza);

        assertEquals("Pizza, Extra Cheese, Extra Pepperoni", pizza.getDescription());
        assertEquals(15.0, pizza.getCost(), 0.001);
    }

    @Test
    public void testPizzaWithExtraPepperoniAndCheeseOrder() {
        Dish pizza = new Pizza();
        pizza = new ExtraPepperoni(pizza);
        pizza = new ExtraCheese(pizza);

        assertEquals("Pizza, Extra Pepperoni, Extra Cheese", pizza.getDescription());
        assertEquals(15.0, pizza.getCost(), 0.001);
    }
}
