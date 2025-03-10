import static org.junit.jupiter.api.Assertions.*;

import org.example.*;
import org.junit.jupiter.api.Test;

public class OrderTest {

    @Test
    public void testClone() {
        Order originalOrder = OrderFactory.createOrder("delivery", "001", 50.0);  // ConcreteOrder é uma implementação concreta de Order
        originalOrder.setState(new ReceivedState());
        originalOrder.setPriceStrategy(new RegularPriceStrategy());

        Order clonedOrder = originalOrder.clone();

        // Verificar se o objeto clonado é uma instância diferente
        assertNotSame(originalOrder, clonedOrder, "O objeto clonado deve ser uma instância diferente.");

        // Verificar se os valores dos campos primitivos são iguais
        assertEquals(originalOrder.getOrderId(), clonedOrder.getOrderId(), "O orderId deve ser o mesmo.");
        assertEquals(originalOrder.getAmount(), clonedOrder.getAmount(), "O amount deve ser o mesmo.");

        // Verificar se os objetos internos são compartilhados (clonagem rasa)
        assertSame(originalOrder.getState().getStateName(), clonedOrder.getState().getStateName(), "O estado deve ser compartilhado entre original e clonado.");
        assertSame(originalOrder.getPriceStrategy(), clonedOrder.getPriceStrategy(), "A estratégia de preço deve ser compartilhada entre original e clonado.");

        // Alterar o estado ou estratégia de preço no objeto clonado e garantir que o original não seja afetado (não esperado em clonagem rasa)
        clonedOrder.setState(new ReadyState());
        clonedOrder.setPriceStrategy(new VIPDiscountStrategy());

        // Verificar que a alteração do clonado não afetou o original
        assertNotSame(originalOrder.getState(), clonedOrder.getState(), "O estado do objeto original não deve ser alterado.");
        assertNotSame(originalOrder.getPriceStrategy(), clonedOrder.getPriceStrategy(), "A estratégia de preço do objeto original não deve ser alterada.");
    }
}

