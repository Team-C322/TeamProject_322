package yurchenkoTests;

import allclasses.yurchenko.Square;
import org.junit.Assert;
import org.junit.Test;

public class SquareTest {

    // Тест 1: Конструктор и вычисление площади
    @Test
    public void constructorAndCalculateArea_workCorrectly() {
        Square square = new Square(4.0);

        Assert.assertEquals(4.0, square.getSide(), 0.0001);
        Assert.assertEquals(16.0, square.calculateArea(), 0.0001);
    }

    // Тест 2: Вычисление периметра
    @Test
    public void calculatePerimeter_returnsCorrectValue() {
        Square square = new Square(5.0);

        double expectedPerimeter = 20.0; // 4 * 5
        double actualPerimeter = square.calculatePerimeter();

        Assert.assertEquals(expectedPerimeter, actualPerimeter, 0.001);
    }

    // Тест 3: Вычисление диагонали
    @Test
    public void calculateDiagonal_returnsCorrectValue() {
        Square square = new Square(3.0);

        double expectedDiagonal = 3.0 * Math.sqrt(2);
        double actualDiagonal = square.calculateDiagonal();

        Assert.assertEquals(expectedDiagonal, actualDiagonal, 0.001);
    }

    // Тест 4: Сравнение квадратов (равные)
    @Test
    public void isEqual_returnsTrue_whenSidesAreEqual() {
        Square square1 = new Square(4.0);
        Square square2 = new Square(4.0);

        Assert.assertTrue(square1.isEqual(square2));
    }

    // Тест 5: Сравнение квадратов (неравные)
    @Test
    public void isEqual_returnsFalse_whenSidesAreDifferent() {
        Square square1 = new Square(4.0);
        Square square2 = new Square(5.0);

        Assert.assertFalse(square1.isEqual(square2));
    }

    // Тест 6: Масштабирование квадрата
    @Test
    public void scale_changesSideCorrectly() {
        Square square = new Square(3.0);

        square.scale(2.0); // Увеличиваем в 2 раза

        Assert.assertEquals(6.0, square.getSide(), 0.0001);
        Assert.assertEquals(36.0, square.calculateArea(), 0.0001);
    }

    // Тест 7: Создание квадрата с отрицательной стороной (исключение)
    @Test(expected = IllegalArgumentException.class)
    public void constructor_throwsException_whenSideIsNegative() {
        new Square(-2.0);
    }

    // Тест 8: Создание квадрата с нулевой стороной (исключение)
    @Test(expected = IllegalArgumentException.class)
    public void constructor_throwsException_whenSideIsZero() {
        new Square(0.0);
    }

    // Тест 9: Проверка сообщения исключения
    @Test
    public void constructor_throwsExceptionWithCorrectMessage() {
        try {
            new Square(-5.0);
            Assert.fail("Ожидалось исключение, но оно не было выброшено");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Сторона квадрата должна быть положительным числом", e.getMessage());
        }
    }

    // Тест 10: Множественные проверки для одного квадрата
    @Test
    public void multipleCalculations_workCorrectly() {
        Square square = new Square(2.5);

        // Проверяем все вычисления для одного квадрата
        Assert.assertEquals(2.5, square.getSide(), 0.0001);
        Assert.assertEquals(6.25, square.calculateArea(), 0.001); // 2.5 * 2.5
        Assert.assertEquals(10.0, square.calculatePerimeter(), 0.001); // 4 * 2.5
        Assert.assertEquals(2.5 * Math.sqrt(2), square.calculateDiagonal(), 0.001);

        // Проверяем сравнение
        Square sameSquare = new Square(2.5);
        Square differentSquare = new Square(3.0);
        Assert.assertTrue(square.isEqual(sameSquare));
        Assert.assertFalse(square.isEqual(differentSquare));

        // Проверяем масштабирование
        square.scale(2.0);
        Assert.assertEquals(5.0, square.getSide(), 0.0001);
        Assert.assertEquals(25.0, square.calculateArea(), 0.001);
    }
}