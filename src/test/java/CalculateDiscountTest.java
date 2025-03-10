import org.example.Order;
import org.example.OrderFactory;
import org.example.RegularPriceStrategy;
import org.example.VIPDiscountStrategy;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateDiscountTest {

    private Order order;

    @Before
    public void setUp() throws Exception {
        order = OrderFactory.createOrder("delivery", "001", 100);
    }

    @Test
    public void calculateVIPDiscount() {
        order.setPriceStrategy(new VIPDiscountStrategy());

        assertEquals(88, order.calculatePrice());
    }

    @Test
    public void calculateRegularPrice() {
        order.setPriceStrategy(new RegularPriceStrategy());

        assertEquals(110, order.calculatePrice());
    }
}
