package potylicynaTests;

import allclasses.potylicyna.Circle;
import org.junit.Assert;
import org.junit.Test;

public class CircleTest {

    @Test
    public void testCalculateArea() {
        Circle circle = new Circle("red", 3.0, 100);
       Assert.assertEquals(28.27, circle.calculateArea(), 0.01);
    }

    @Test
    public void testCalculateCircumference() {
        Circle circle = new Circle("blue", 2.0, 50);
        Assert.assertEquals(12.57, circle.calculateCircumference(), 0.01);
    }

    @Test
    public void testGetDescription() {
        Circle circle = new Circle("green", 5.0, 200);
        String expected = "Круг: цвет=green, радиус=5,0 см, площадь=78,5 кв.см";
        Assert.assertEquals(expected, circle.getDescription());
    }

    @Test
    public void testSettersAndGetters() {
        Circle circle = new Circle();
        circle.setColor("yellow");
        circle.setRadius(10.0);
        circle.setPrice(150.0);

        Assert.assertEquals("yellow", circle.getColor());
        Assert.assertEquals(10.0, circle.getRadius(), 0.0001);
        Assert.assertEquals(150.0, circle.getPrice(), 0.0001);
    }
}