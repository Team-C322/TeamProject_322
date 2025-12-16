package shchegolevaTests;

import org.junit.Assert;
import org.junit.Test;
import allclasses.shchegoleva.Trapezium;

public class TrapeziumTests {

    @Test
    public void constructorWithParametersAndGetters_workCorrectly() {
        Trapezium tr = new Trapezium(2.0, 6.0, 3.0, 4.0, 2.5);

        Assert.assertEquals(2.0, tr.getTopBase(), 0.00001);
        Assert.assertEquals(6.0, tr.getBottomBase(), 0.00001);
        Assert.assertEquals(3.0, tr.getLeftLeg(), 0.00001);
        Assert.assertEquals(4.0, tr.getRightLeg(), 0.00001);
        Assert.assertEquals(2.5, tr.getHeight(), 0.00001);
    }

    @Test
    public void constructorWithoutParametersAndGetters_workCorrectly() {
        Trapezium tr = new Trapezium();

        Assert.assertEquals(2.0, tr.getTopBase(), 0.00001);
        Assert.assertEquals(4.0, tr.getBottomBase(), 0.00001);
        Assert.assertEquals(3.0, tr.getLeftLeg(), 0.00001);
        Assert.assertEquals(3.0, tr.getRightLeg(), 0.00001);
        Assert.assertEquals(2.5, tr.getHeight(), 0.00001);
    }

    @Test
    public void getArea_integerValues_returnCorrectAnswer() {
        Trapezium tr = new Trapezium(3, 7, 5, 5, 4);
        Assert.assertEquals(20.0, tr.getArea(), 0.00001);
    }

    @Test
    public void getArea_doubleValues_returnCorrectAnswer() {
        Trapezium tr = new Trapezium(2.5, 5.5, 3.2, 4.1, 2.8);
        double expected = (2.5 + 5.5) * 2.8 / 2.0;
        Assert.assertEquals(expected, tr.getArea(), 0.00001);
    }

    @Test
    public void getPerimeter_integerValues_returnCorrectAnswer() {
        Trapezium tr = new Trapezium(3, 7, 4, 5, 3);
        Assert.assertEquals(19.0, tr.getPerimeter(), 0.00001);
    }

    @Test
    public void getPerimeter_doubleValues_returnCorrectAnswer() {
        Trapezium tr = new Trapezium(2.3, 6.1, 3.7, 4.2, 2.0);
        Assert.assertEquals(16.3, tr.getPerimeter(), 0.00001);
    }

    @Test
    public void specialCase_rectangle_returnCorrectAreaAndPerimeter() {
        Trapezium rect = new Trapezium(4.0, 4.0, 3.0, 3.0, 3.0);

        Assert.assertEquals(12.0, rect.getArea(), 0.00001);
        Assert.assertEquals(14.0, rect.getPerimeter(), 0.00001);
    }
}
