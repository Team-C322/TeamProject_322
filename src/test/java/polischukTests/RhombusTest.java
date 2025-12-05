package polischukTests;

import org.junit.Assert;
import org.junit.Test;
import allclasses.polischuk.Rhombus;

public class RhombusTest {
    @Test
    public void constructorWithParametersAndGetters_workCorrectly() {
        Rhombus rhombus = new Rhombus(3, 45);

        Assert.assertEquals(3, rhombus.getSide(), 0.00001);
        Assert.assertEquals(45, rhombus.getAngle(), 0.00001);
    }

    @Test
    public void constructorWithoutParametersAndGetters_workCorrectly() {
        Rhombus rhombus = new Rhombus();

        Assert.assertEquals(1, rhombus.getSide(), 0.00001);
        Assert.assertEquals(60, rhombus.getAngle(), 0.00001);
    }

    @Test
    public void getArea_integerValues_returnCorrectAnswer() {
        Rhombus rhombus = new Rhombus(5, 60);
        double expectedRes = 5 * 5 * Math.sin(Math.toRadians(60));
        double res = rhombus.getArea();

        Assert.assertEquals(expectedRes, res, 0.00001);
    }

    @Test
    public void getArea_doubleValues_returnCorrectAnswer() {
        Rhombus rhombus = new Rhombus(2.5, 45);
        double expectedRes = 2.5 * 2.5 * Math.sin(Math.toRadians(45));
        double res = rhombus.getArea();

        Assert.assertEquals(expectedRes, res, 0.00001);
    }

    @Test
    public void getPerimeter_integerValues_returnCorrectAnswer() {
        Rhombus rhombus = new Rhombus(5, 60);
        double expectedRes = 20;
        double res = rhombus.getPerimeter();

        Assert.assertEquals(expectedRes, res, 0.00001);
    }

    @Test
    public void getPerimeter_doubleValues_returnCorrectAnswer() {
        Rhombus rhombus = new Rhombus(2.5, 45);
        double expectedRes = 10;
        double res = rhombus.getPerimeter();

        Assert.assertEquals(expectedRes, res, 0.00001);
    }
}