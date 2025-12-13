package golovachevTests;

import org.junit.Assert;
import org.junit.Test;
import allclasses.golovachev.Rectangle;

public class RactangleTest {
    @Test
    public void constructorWithParametersAndGetters_workCorrectly() {
        Rectangle rect = new Rectangle(3, 5);

        Assert.assertEquals(3, rect.getA(), 0.00001);
        Assert.assertEquals(5, rect.getB(), 0.00001);
    }

    @Test
    public void constructorWithoutParametersAndGetters_workCorrectly() {
        Rectangle rect = new Rectangle();

        Assert.assertEquals(1, rect.getA(), 0.00001);
        Assert.assertEquals(1, rect.getB(), 0.00001);
    }

    @Test
    public void getArea_integerValues_returnCorrectAnswer() {
        Rectangle rect = new Rectangle(2, 3);
        double expectedRes = 6;
        double res = rect.GetArea();

        Assert.assertEquals(expectedRes, res, 0.00001);
    }

    @Test
    public void getArea_doubleValues_returnCorrectAnswer() {
        Rectangle rect = new Rectangle(2.5, 3.2);
        double expectedRes = 8;
        double res = rect.GetArea();

        Assert.assertEquals(expectedRes, res, 0.00001);
    }

    @Test
    public void getPerimetr_integerValues_returnCorrectAnswer() {
        Rectangle rect = new Rectangle(2, 3);
        double expectedRes = 10;
        double res = rect.GetPerimetr();

        Assert.assertEquals(expectedRes, res, 0.00001);
    }

    @Test
    public void getPerimetr_doubleValues_returnCorrectAnswer() {
        Rectangle rect = new Rectangle(2.5, 3.2);
        double expectedRes = 11.4;
        double res = rect.GetPerimetr();

        Assert.assertEquals(expectedRes, res, 0.00001);
    }
}
