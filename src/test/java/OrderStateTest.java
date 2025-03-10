import org.example.Order;
import org.example.OrderFactory;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class OrderStateTest {
    @Test
    public void testOrderStateFlow() {
        Order order = OrderFactory.createOrder("delivery", "001", 50.0);

        assertEquals( "Recebido", order.getState().getStateName());

        order.getState().next(order);
        assertEquals( "Em preparação", order.getState().getStateName());

        order.getState().next(order);
        assertEquals( "Pronto", order.getState().getStateName());

        order.getState().next(order);
        assertEquals( "Entregue", order.getState().getStateName());

    }

    @Test
    public void tryNextStatusInDelivered() {
        Order order = OrderFactory.createOrder("delivery", "001", 50.0);

        order.getState().next(order);
        order.getState().next(order);
        order.getState().next(order);

        try {
            order.getState().next(order);
        } catch (UnsupportedOperationException e) {
            assertEquals("Pedido já entregue.", e.getMessage());
        }
    }
}
