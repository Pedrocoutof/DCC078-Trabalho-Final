import static org.junit.Assert.*;

import org.example.order.*;
import org.example.order.factoryMethod.DeliveryOrder;
import org.example.order.factoryMethod.OnSiteOrder;
import org.example.order.factoryMethod.OrderFactory;
import org.example.order.factoryMethod.PickupOrder;
import org.junit.jupiter.api.Test;

public class OrderFactoryTest {

    @Test
    public void testCreateDeliveryOrder() {
        Order order = OrderFactory.createOrder("delivery", "001", 50.0);

        assertNotNull(order);

        assertTrue(order instanceof DeliveryOrder);

        assertEquals("001", order.getOrderId());
        assertEquals(50.0, order.getAmount(), 0.001);

        assertEquals("Recebido", order.getState().getStateName());
    }

    @Test
    public void testCreatePickupOrder() {
        Order order = OrderFactory.createOrder("pickup", "001", 50.0);

        assertNotNull(order);

        assertTrue(order instanceof PickupOrder);

        assertEquals("001", order.getOrderId());
        assertEquals(50.0, order.getAmount(), 0.001);

        assertEquals("Recebido", order.getState().getStateName());
    }

    @Test
    public void testCreateOnSiteOrderOrder() {
        Order order = OrderFactory.createOrder("onsite", "001", 50.0);

        assertNotNull(order);

        assertTrue(order instanceof OnSiteOrder);

        assertEquals("001", order.getOrderId());
        assertEquals(50.0, order.getAmount(), 0.001);

        assertEquals("Recebido", order.getState().getStateName());
    }

    @Test
    public void testCreateOrderInvalidType() {
        try {
            OrderFactory.createOrder("invalid", "001", 50.0);
        } catch(IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Tipo de pedido desconhecido"));
        }
    }
}