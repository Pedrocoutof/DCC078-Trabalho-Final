import org.example.GlobalConfig;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GlobalConfigTest {

    @Test
    public void checkServiceTaxValue() {
        double serviceTax =  GlobalConfig.getInstance().getServiceTax();

        assertEquals(0.1, serviceTax);
    }

    @Test
    public void checkOpeningHoursValue() {
        String openingHours =  GlobalConfig.getInstance().getOpeningHours();

        assertEquals("08:00 - 22:00", openingHours);
    }

}
