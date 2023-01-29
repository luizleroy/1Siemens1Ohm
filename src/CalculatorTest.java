import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

    @Test
    @DisplayName(value = "Add two numbers")
    public void add() {
        assertEquals(4, Calculator.add(2, 2));
    }
}