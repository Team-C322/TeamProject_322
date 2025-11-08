package golovachevTests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import allclasses.golovachev.Rectangle;

public class RactangleTest {
    @Test
    public void constructorWithParametersAndGetters_workCorrectly() {
        Rectangle rect = new Rectangle(3, 5);

        assertEquals(3, rect.getA());
        assertEquals(5, rect.getB());
    }

    @Test
    public void constructorWithoutParametersAndGetters_workCorrectly() {
        Rectangle rect = new Rectangle();

        assertEquals(1, rect.getA());
        assertEquals(1, rect.getB());
    }

    @Test
    public void getArea_integerValues_returnCorrectAnswer() {
        Rectangle rect = new Rectangle(2, 3);
        double expectedRes = 6;
        double res = rect.GetArea();

        assertEquals(expectedRes, res);
    }

    @Test
    public void getArea_doubleValues_returnCorrectAnswer() {
        Rectangle rect = new Rectangle(2.5, 3.2);
        double expectedRes = 8;
        double res = rect.GetArea();

        assertEquals(expectedRes, res);
    }

    @Test
    public void getPerimetr_integerValues_returnCorrectAnswer() {
        Rectangle rect = new Rectangle(2, 3);
        double expectedRes = 10;
        double res = rect.GetPerimetr();

        assertEquals(expectedRes, res);
    }

    @Test
    public void getPerimetr_doubleValues_returnCorrectAnswer() {
        Rectangle rect = new Rectangle(2.5, 3.2);
        double expectedRes = 11.4;
        double res = rect.GetPerimetr();

        assertEquals(expectedRes, res);
    }
}
