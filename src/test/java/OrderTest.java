import static org.junit.jupiter.api.Assertions.*;

import org.example.order.Order;
import org.example.order.factoryMethod.OrderFactory;
import org.example.order.states.ReadyState;
import org.example.order.states.ReceivedState;
import org.example.strategy.RegularPriceStrategy;
import org.example.strategy.VIPDiscountStrategy;
import org.junit.jupiter.api.Test;

public class OrderTest {

    @Test
    public void testClone() {
        Order originalOrder = OrderFactory.createOrder("Delivery", "001", 50.0);  // ConcreteOrder é uma implementação concreta de Order
        originalOrder.setState(new ReceivedState());
        originalOrder.setPriceStrategy(new RegularPriceStrategy());

        Order clonedOrder = originalOrder.clone();

        assertNotSame(originalOrder, clonedOrder, "O objeto clonado deve ser uma instância diferente.");

        assertEquals(originalOrder.getOrderId(), clonedOrder.getOrderId(), "O orderId deve ser o mesmo.");
        assertEquals(originalOrder.getAmount(), clonedOrder.getAmount(), "O amount deve ser o mesmo.");

        assertSame(originalOrder.getState().getStateName(), clonedOrder.getState().getStateName(), "O estado deve ser compartilhado entre original e clonado.");
        assertSame(originalOrder.getPriceStrategy(), clonedOrder.getPriceStrategy(), "A estratégia de preço deve ser compartilhada entre original e clonado.");

        clonedOrder.setState(new ReadyState());
        clonedOrder.setPriceStrategy(new VIPDiscountStrategy());

        assertNotSame(originalOrder.getState(), clonedOrder.getState(), "O estado do objeto original não deve ser alterado.");
        assertNotSame(originalOrder.getPriceStrategy(), clonedOrder.getPriceStrategy(), "A estratégia de preço do objeto original não deve ser alterada.");
    }
}

