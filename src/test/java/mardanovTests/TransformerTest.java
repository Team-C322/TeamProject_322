package mardanovTests;

import allclasses.mardanov.Transformer;
import org.junit.Assert;
import org.junit.Test;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import io.qameta.allure.Step;
import io.qameta.allure.TmsLink;
import io.qameta.allure.Issue;

public class TransformerTest {

    @Test
    @DisplayName("Проверка создания трансформера и работы геттеров")
    @Description("Тест проверяет корректность инициализации объекта и получения значений полей")
    @TmsLink("TRANSFORMER-1")
    public void constructorAndGetters_workCorrectly() {
        Transformer transformer = createTransformer("SuperBot", 2.5, true);

        Assert.assertEquals("SuperBot", transformer.getName());
        Assert.assertEquals(2.5, transformer.getMultiplier(), 0.0001);
        Assert.assertTrue(transformer.isActive());
    }

    @Test
    @DisplayName("Преобразование текста в верхний регистр")
    @Description("Тест проверяет корректность работы метода toUpperCase при активном состоянии")
    @TmsLink("TRANSFORMER-2")
    public void toUpperCase_returnsUppercaseString_whenTransformerIsActive() {
        Transformer transformer = createTransformer("TestBot", 1.0, true);

        String result = transformToUpperCase(transformer, "hello world");

        Assert.assertEquals("HELLO WORLD", result);
    }

    @Test
    @DisplayName("Проверка неактивного состояния трансформера")
    @Description("Тест проверяет возврат сообщения об ошибке при неактивном состоянии")
    @TmsLink("TRANSFORMER-3")
    @Issue("BUG-123")
    public void toUpperCase_returnsInactiveMessage_whenTransformerIsInactive() {
        Transformer transformer = createTransformer("TestBot", 1.0, false);

        String result = transformToUpperCase(transformer, "hello world");

        Assert.assertEquals("Transformer is inactive", result);
    }

    @Test
    @DisplayName("Умножение чисел трансформером")
    @Description("Тест проверяет корректность умножения чисел на установленный множитель")
    @TmsLink("TRANSFORMER-4")
    public void multiplyNumber_returnsMultipliedValue_whenTransformerIsActive() {
        Transformer transformer = createTransformer("TestBot", 3.0, true);

        double result = multiplyNumber(transformer, 5.0);

        Assert.assertEquals(15.0, result, 0.0001);
    }


    @Step("Создание трансформера с параметрами: имя={name}, множитель={multiplier}, активен={isActive}")
    private Transformer createTransformer(String name, double multiplier, boolean isActive) {
        return new Transformer(name, multiplier, isActive);
    }

    @Step("Преобразование текста в верхний регистр: '{text}'")
    private String transformToUpperCase(Transformer transformer, String text) {
        return transformer.toUpperCase(text);
    }

    @Step("Умножение числа {number} на множитель трансформера")
    private double multiplyNumber(Transformer transformer, double number) {
        return transformer.multiplyNumber(number);
    }

    @Step("Получение строкового представления трансформера")
    private String getTransformerInfo(Transformer transformer) {
        return transformer.toString();
    }
}