import org.example.customer.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {

    @Test
    void tryCreateCustomerWithInvalidName() {
        try {
            Customer customer = new Customer("");
        } catch (IllegalArgumentException e) {
            assertEquals("Customer name cannot be null or empty", e.getMessage());
        }
    }

    @Test
    void createValidCustomer() {
        Customer customer = new Customer("Pedro");
        assertEquals("Pedro", customer.getName());
    }

}
