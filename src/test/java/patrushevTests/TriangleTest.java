package patrushevTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import allclasses.patrushev.Triangle;

@Epic("Класс Triangle")
@Feature("Расчёт свойств треугольника")
public class TriangleTest {

    @Test
    @Story("Расчёт периметра")
    @Description("Проверяет, что периметр треугольника со сторонами 3, 4 и 5 корректно вычисляется как 12.0")
    public void testPerimeter() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(12.0, triangle.getPerimeter(), 0.001);
    }

    @Test
    @Story("Расчёт площади")
    @Description("Проверяет, что площадь прямоугольного треугольника со сторонами 3, 4 и 5 корректно вычисляется как 6.0 (по формуле Герона)")
    public void testArea() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(6.0, triangle.getArea(), 0.001);
    }

    @Test
    @Story("Геттеры сторон")
    @Description("Проверяет, что геттеры возвращают значения сторон, переданные при создании объекта")
    public void testGetters() {
        Triangle triangle = new Triangle(5, 6, 7);
        assertEquals(5.0, triangle.getA(), 0.0);
        assertEquals(6.0, triangle.getB(), 0.0);
        assertEquals(7.0, triangle.getC(), 0.0);
    }

    @Test
    @Story("Строковое представление")
    @Description("Проверяет, что метод toString() содержит все три длины сторон в формате 'x.0'")
    public void testToString() {
        Triangle triangle = new Triangle(1, 2, 3);
        assertTrue(triangle.toString().contains("1.0"));
        assertTrue(triangle.toString().contains("2.0"));
        assertTrue(triangle.toString().contains("3.0"));
    }
}