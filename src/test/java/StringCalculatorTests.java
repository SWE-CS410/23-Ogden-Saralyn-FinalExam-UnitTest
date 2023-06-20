import org.example.StringCalculator;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTests {

    @Test
    public void noNegativeIntegers() {
        String integers = "0,-1";

        assertThrows(RuntimeException.class, () -> StringCalculator.add(integers));
    }

    @Test
    public void ignoreIntegersLargerThanThreeDigits() {
        String integers = "0,1000";

        int result = StringCalculator.add(integers);

        assertEquals(0, result);
    }
}