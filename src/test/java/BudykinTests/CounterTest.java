package BudykinTests;

import allclasses.Budykin.Counter;
import allclasses.Budykin.ICounter;
import org.junit.Test;
import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void initialValueShouldBeZero() {
        ICounter c = new Counter();
        assertEquals(0.0, c.getValue(), 0.0001);
    }

    @Test
    public void addShouldIncreaseValueByAmount() {
        ICounter c = new Counter();
        c.add(5);
        assertEquals(5.0, c.getValue(), 0.0001);
    }

    @Test
    public void subtractShouldDecreaseValueByAmount() {
        ICounter c = new Counter();
        c.add(10);
        c.subtract(3);
        assertEquals(7.0, c.getValue(), 0.0001);
    }

    @Test
    public void multiplyShouldMultiplyValueByAmount() {
        ICounter c = new Counter();
        c.add(4);
        c.multiply(2.5);
        assertEquals(10.0, c.getValue(), 0.0001);
    }

    @Test
    public void divideShouldDivideValueByAmount() {
        ICounter c = new Counter();
        c.add(10);
        c.divide(2);
        assertEquals(5.0, c.getValue(), 0.0001);
    }

    @Test(expected = ArithmeticException.class)
    public void divideByZeroShouldThrowException() {
        ICounter c = new Counter();
        c.add(10);
        c.divide(0);  // ожидаем исключение
    }

    @Test
    public void resetShouldReturnValueToZero() {
        ICounter c = new Counter();
        c.add(10);
        c.reset();
        assertEquals(0.0, c.getValue(), 0.0001);
    }
}

