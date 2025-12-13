package Yarishtests;

import allclasses.Yarish.SimpleMath;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import io.qameta.allure.Step;
import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleMathTest {

    @Test
    @DisplayName("Вычисление факториала положительного числа")
    @Description("Тест проверяет корректное вычисление факториала для положительного числа 5")
    public void testFactorialWithPositiveNumber() {
        SimpleMath math = new SimpleMath();
        int result = math.factorial(5);
        assertEquals("Факториал 5 должен равняться 120", 120, result);
    }

    @Test
    @DisplayName("Факториал нуля")
    @Description("Тест проверяет, что факториал 0 равен 1")
    public void testFactorialWithZero() {
        SimpleMath math = new SimpleMath();
        int result = math.factorial(0);
        assertEquals("Факториал 0 должен равняться 1", 1, result);
    }

    @Test
    @DisplayName("Факториал отрицательного числа")
    @Description("Тест проверяет обработку отрицательных чисел в факториале")
    public void testFactorialWithNegative() {
        SimpleMath math = new SimpleMath();
        int result = math.factorial(-5);
        assertEquals("Факториал отрицательного числа должен возвращать -1", -1, result);
    }

    @Test
    @DisplayName("Проверка четности числа")
    @Description("Тест проверяет определение четных чисел")
    public void testIsEvenWithEvenNumber() {
        SimpleMath math = new SimpleMath();
        boolean result = math.isEven(4);
        assertTrue("Число 4 должно быть четным", result);
    }

    @Test
    @DisplayName("Проверка нечетности числа")
    @Description("Тест проверяет определение нечетных чисел")
    public void testIsEvenWithOddNumber() {
        SimpleMath math = new SimpleMath();
        boolean result = math.isEven(7);
        assertFalse("Число 7 должно быть нечетным", result);
    }

    @Test
    @DisplayName("Сумма чисел от 1 до N")
    @Description("Тест проверяет вычисление суммы чисел от 1 до заданного числа N")
    public void testSumToN() {
        SimpleMath math = new SimpleMath();
        int result = math.sumToN(5);
        assertEquals("Сумма чисел от 1 до 5 должна равняться 15", 15, result);
    }

    @Test
    @DisplayName("Проверка положительности числа")
    @Description("Тест проверяет определение положительных, отрицательных чисел и нуля")
    public void testIsPositive() {
        SimpleMath math = new SimpleMath();

        checkPositiveNumber(math, 10, true);
        checkPositiveNumber(math, -5, false);
        checkPositiveNumber(math, 0, false);
    }

    @Step("Проверка что число {number} является положительным: ожидается {expected}")
    private void checkPositiveNumber(SimpleMath math, int number, boolean expected) {
        boolean result = math.isPositive(number);
        if (expected) {
            assertTrue("Число " + number + " должно быть положительным", result);
        } else {
            assertFalse("Число " + number + " не должно быть положительным", result);
        }
    }
}