import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void hasAdded(){
        int total = calculator.add(23, 5);
        assertEquals(28, total);
    }
    @Test
    public void hasSubtracted(){
        int total = calculator.subtract(23, 5);
        assertEquals(18, total);
    }
    @Test
    public void hasMultiply(){
        int total = calculator.multiply(23, 5);
        assertEquals(115, total);
    }
    @Test
    public void hasDivide(){
        double total = calculator.divide(23, 5);
        assertEquals(4.6, total, 0.0);
    }
}
