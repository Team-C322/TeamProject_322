package Yarishtests;

import allclassess.Yarish.SimpleMath;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleMathTest {

    @Test
    public void testFactorialWithPositiveNumber() {
        SimpleMath math = new SimpleMath();
        int result = math.factorial(5);
        assertEquals(120, result);
    }

    @Test
    public void testFactorialWithZero() {
        SimpleMath math = new SimpleMath();
        int result = math.factorial(0);
        assertEquals(1, result);
    }

    @Test
    public void testFactorialWithNegative() {
        SimpleMath math = new SimpleMath();
        int result = math.factorial(-5);
        assertEquals(-1, result);
    }

    @Test
    public void testIsEvenWithEvenNumber() {
        SimpleMath math = new SimpleMath();
        boolean result = math.isEven(4);
        assertTrue(result);
    }

    @Test
    public void testIsEvenWithOddNumber() {
        SimpleMath math = new SimpleMath();
        boolean result = math.isEven(7);
        assertFalse(result);
    }

    @Test
    public void testSumToN() {
        SimpleMath math = new SimpleMath();
        int result = math.sumToN(5);
        assertEquals(15, result);
    }

    @Test
    public void testIsPositive() {
        SimpleMath math = new SimpleMath();
        assertTrue(math.isPositive(10));
        assertFalse(math.isPositive(-5));
        assertFalse(math.isPositive(0));
    }
}