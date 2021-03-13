import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void factorialTruePositive(){
        assertEquals("Finding factorial of a number for True Positive", 6, calculator.fact(3), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 120, calculator.fact(5), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 5040, calculator.fact(7), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 362880, calculator.fact(9), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Finding factorial of a number for False Positive", 120, calculator.fact(7), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 24, calculator.fact(8), DELTA);
    }

    @Test
    public void powerTruePositive(){
        assertEquals("Finding power for True Positive", 16, calculator.power(2, 4), DELTA);
        assertEquals("Finding power for True Positive", 256, calculator.power(4, 4), DELTA);
        assertEquals("Finding power for True Positive", 27, calculator.power(3, 3), DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("Finding power for False Positive", 6, calculator.power(2, 5), DELTA);
        assertNotEquals("Finding power for False Positive", -7.3, calculator.power(3, 4), DELTA);
        assertNotEquals("Finding power for False Positive", 20, calculator.power(5, 3), DELTA);
    }

    @Test
    public void logTruePositive(){
        assertEquals("Finding natural log for True Positive", 0, calculator.naturalLog(1), DELTA);
        assertEquals("Finding natural log for True Positive", 0, calculator.naturalLog(1), DELTA);
    }

    @Test
    public void logFalsePositive(){
        assertNotEquals("Finding natural log for False Positive", 10, calculator.naturalLog(2.4), DELTA);
        assertNotEquals("Finding natural log for False Positive", 50, calculator.naturalLog(2.1), DELTA);
        assertNotEquals("Finding natural log for False Positive", 30, calculator.naturalLog(2.1), DELTA);
    }

    @Test
    public void sqrootTruePositive(){
        assertEquals("Finding square root for True Positive", 2, calculator.square_root(4), DELTA);
        assertEquals("Finding square root for True Positive", 1, calculator.square_root(1), DELTA);
        assertEquals("Finding square root for True Positive", 4, calculator.square_root(16), DELTA);
        assertEquals("Finding square root for True Positive", 3, calculator.square_root(9), DELTA);

    }

    @Test
    public void sqrootFalsePositive(){
        assertNotEquals("Finding square root for False Positive", 1, calculator.square_root(3), DELTA);
        assertNotEquals("Finding square root for False Positive", 0, calculator.square_root(4), DELTA);

    }


}