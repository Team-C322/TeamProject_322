package patrushevTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import allclasses.patrushev.Triangle;


public class TriangleTest {
    @Test
    public void testPerimeter() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(12.0, triangle.getPerimeter(), 0.001);
    }

    @Test
    public void testArea() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(6.0, triangle.getArea(), 0.001);
    }

    @Test
    public void testGetters() {
        Triangle triangle = new Triangle(5, 6, 7);
        assertEquals(5.0, triangle.getA(), 0.0);
        assertEquals(6.0, triangle.getB(), 0.0);
        assertEquals(7.0, triangle.getC(), 0.0);
    }

    @Test
    public void testToString() {
        Triangle triangle = new Triangle(1, 2, 3);
        assertTrue(triangle.toString().contains("1.0"));
        assertTrue(triangle.toString().contains("2.0"));
        assertTrue(triangle.toString().contains("3.0"));
    }
}
