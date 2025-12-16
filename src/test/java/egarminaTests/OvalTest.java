package egarminaTests;

import org.junit.Assert;
import org.junit.Test;
import allclasses.egarmina.Oval;

public class OvalTest {
    @Test
    public void constructorWithParametersAndGetters_workCorrectly() {
        Oval oval = new Oval(3, 5);

        Assert.assertEquals(3, oval.getA(), 0.00001);
        Assert.assertEquals(5, oval.getB(), 0.00001);
    }

    @Test
    public void constructorWithoutParametersAndGetters_workCorrectly() {
        Oval oval = new Oval();

        Assert.assertEquals(1, oval.getA(), 0.00001);
        Assert.assertEquals(1, oval.getB(), 0.00001);
    }

    @Test
    public void getArea_integerValues_returnCorrectAnswer() {
        Oval oval = new Oval(2, 3);
        double expectedRes = Math.PI * 2 * 3; // π * a * b
        double res = oval.getArea();

        Assert.assertEquals(expectedRes, res, 0.00001);
    }

    @Test
    public void getArea_doubleValues_returnCorrectAnswer() {
        Oval oval = new Oval(2.5, 3.2);
        double expectedRes = Math.PI * 2.5 * 3.2;
        double res = oval.getArea();

        Assert.assertEquals(expectedRes, res, 0.00001);
    }

    @Test
    public void getPerimeter_integerValues_returnCorrectAnswer() {
        Oval oval = new Oval(2, 3);
        // Формула Рамануджана: π * (3(a + b) - sqrt((3a + b)(a + 3b)))
        double expectedRes = Math.PI * (3 * (2 + 3) - Math.sqrt((3 * 2 + 3) * (2 + 3 * 3)));
        double res = oval.getPerimeter();

        Assert.assertEquals(expectedRes, res, 0.00001);
    }

    @Test
    public void getPerimeter_doubleValues_returnCorrectAnswer() {
        Oval oval = new Oval(2.5, 3.2);
        double expectedRes = Math.PI * (3 * (2.5 + 3.2) - Math.sqrt((3 * 2.5 + 3.2) * (2.5 + 3 * 3.2)));
        double res = oval.getPerimeter();

        Assert.assertEquals(expectedRes, res, 0.00001);
    }

    @Test
    public void getArea_circleCase_returnCorrectAnswer() {
        // Для круга (a = b = r) площадь должна быть πr²
        Oval circle = new Oval(4, 4);
        double expectedRes = Math.PI * 4 * 4;
        double res = circle.getArea();

        Assert.assertEquals(expectedRes, res, 0.00001);
    }

    @Test
    public void getPerimeter_circleCase_returnCorrectAnswer() {
        // Для круга (a = b = r) периметр должен быть 2πr
        Oval circle = new Oval(4, 4);
        double expectedRes = 2 * Math.PI * 4;
        double res = circle.getPerimeter();

        Assert.assertEquals(expectedRes, res, 0.00001);
    }
}