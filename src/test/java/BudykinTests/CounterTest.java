package BudykinTests;

import allclasses.Budykin.Counter;
import allclasses.Budykin.ICounter;
import org.junit.Test;
import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void initialValueShouldBeZero() {
        ICounter c = new Counter();
        assertEquals(0, c.getValue());
    }

    @Test
    public void incrementShouldIncreaseValue() {
        ICounter c = new Counter();
        c.increment();
        assertEquals(1, c.getValue());
    }

    @Test
    public void addShouldIncreaseValueByAmount() {
        ICounter c = new Counter();
        c.add(5);
        assertEquals(5, c.getValue());
    }

    @Test
    public void resetShouldReturnValueToZero() {
        ICounter c = new Counter();
        c.add(10);
        c.reset();
        assertEquals(0, c.getValue());
    }
}

