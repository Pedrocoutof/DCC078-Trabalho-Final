import org.example.abstractFactory.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MenuFactoryTest {
    @Test
    public void createFastFoodMenuTest() {
        MenuFactory menuFactory = new FastFoodMenuFactory();
        Menu menu = menuFactory.createMenu();

        assertEquals("Fast Food Menu: Burger, Fries, Soda", menu.showMenu());
    }

    @Test
    public void createBuffetMenuTest() {
        MenuFactory menuFactory = new BuffetMenuFactory();
        Menu menu = menuFactory.createMenu();

        assertEquals("Buffet Menu: Salada, Massa, Sobremesa", menu.showMenu());
    }

    @Test
    public void createALaCarteMenuTest() {
        MenuFactory menuFactory = new ALaCarteMenuFactory();
        Menu menu = menuFactory.createMenu();

        assertEquals("À la Carte Menu: Bife, Vinho, Sobremesa", menu.showMenu());
    }
}
