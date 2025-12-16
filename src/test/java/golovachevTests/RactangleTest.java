package golovachevTests;

import org.junit.Assert;
import org.junit.Test;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import allclasses.golovachev.Rectangle;

public class RactangleTest {
    
    @Test
    @DisplayName("Тест конструктора с параметрами и геттеров")
    @Description("Проверка корректности работы конструктора с параметрами и методов getA(), getB()")
    public void constructorWithParametersAndGetters_workCorrectly() {
        Rectangle rect = new Rectangle(3, 5);

        Assert.assertEquals(3, rect.getA(), 0.00001);
        Assert.assertEquals(5, rect.getB(), 0.00001);
    }

    @Test
    @DisplayName("Тест конструктора без параметров и геттеров")
    @Description("Проверка корректности работы конструктора по умолчанию и методов getA(), getB()")
    public void constructorWithoutParametersAndGetters_workCorrectly() {
        Rectangle rect = new Rectangle();

        Assert.assertEquals(1, rect.getA(), 0.00001);
        Assert.assertEquals(1, rect.getB(), 0.00001);
    }

    @Test
    @DisplayName("Расчет площади для целочисленных значений")
    @Description("Проверка корректности вычисления площади прямоугольника с целыми сторонами")
    public void getArea_integerValues_returnCorrectAnswer() {
        Rectangle rect = new Rectangle(2, 3);
        double expectedRes = 6;
        double res = rect.GetArea();

        Assert.assertEquals(expectedRes, res, 0.00001);
    }

    @Test
    @DisplayName("Расчет площади для вещественных значений")
    @Description("Проверка корректности вычисления площади прямоугольника с дробными сторонами")
    public void getArea_doubleValues_returnCorrectAnswer() {
        Rectangle rect = new Rectangle(2.5, 3.2);
        double expectedRes = 8;
        double res = rect.GetArea();

        Assert.assertEquals(expectedRes, res, 0.00001);
    }

    @Test
    @DisplayName("Расчет периметра для целочисленных значений")
    @Description("Проверка корректности вычисления периметра прямоугольника с целыми сторонами")
    public void getPerimetr_integerValues_returnCorrectAnswer() {
        Rectangle rect = new Rectangle(2, 3);
        double expectedRes = 10;
        double res = rect.GetPerimetr();

        Assert.assertEquals(expectedRes, res, 0.00001);
    }

    @Test
    @DisplayName("Расчет периметра для вещественных значений")
    @Description("Проверка корректности вычисления периметра прямоугольника с дробными сторонами")
    public void getPerimetr_doubleValues_returnCorrectAnswer() {
        Rectangle rect = new Rectangle(2.5, 3.2);
        double expectedRes = 11.4;
        double res = rect.GetPerimetr();

        Assert.assertEquals(expectedRes, res, 0.00001);
    }
}
