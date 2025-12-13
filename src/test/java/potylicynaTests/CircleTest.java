package potylicynaTests;

import allclasses.potylicyna.Circle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void testCalculateArea() {
        Circle circle = new Circle("red", 3.0, 100);
        assertEquals(28.27, circle.calculateArea(), 0.01);
    }

    @Test
    void testCalculateCircumference() {
        Circle circle = new Circle("blue", 2.0, 50);
        assertEquals(12.57, circle.calculateCircumference(), 0.01);
    }

    @Test
    void testGetDescription() {
        Circle circle = new Circle("green", 5.0, 200);
        String expected = "Круг: цвет=green, радиус=5,0 см, площадь=78,5 кв.см";
        assertEquals(expected, circle.getDescription());
    }

    @Test
    void testSettersAndGetters() {
        Circle circle = new Circle();
        circle.setColor("yellow");
        circle.setRadius(10.0);
        circle.setPrice(150.0);

        assertEquals("yellow", circle.getColor());
        assertEquals(10.0, circle.getRadius());
        assertEquals(150.0, circle.getPrice());
    }
}