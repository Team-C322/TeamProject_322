package StatsyukTests;

import allclasses.Statsyuk.Person;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

// Импорты Allure (обязательно проверь, чтобы они подтянулись)
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.junit4.DisplayName;

@DisplayName("Тесты функциональности класса Person") // Название всего набора тестов
public class PersonTests {

    @Test
    @DisplayName("Проверка дня рождения") // Красивое имя теста в отчете
    @Description("Этот тест проверяет, что возраст человека увеличивается на 1 после вызова метода celebrateBirthday") // Описание
    public void testCelebrateBirthday() {
        // Используем методы-шаги
        Person person = createPersonStep("Алиса", 25, "Москва");
        celebrateBirthdayStep(person);
        checkAgeStep(person, 26);
    }

    @Test
    @DisplayName("Проверка получения информации")
    @Description("Тест проверяет, что метод getInfo возвращает строку в правильном формате")
    public void testGetInfo() {
        Person person = createPersonStep("Боб", 30, "Питер");
        String expectedInfo = "Имя: Боб, Возраст: 30, Город: Питер";
        checkInfoStep(person, expectedInfo);
    }

    // --- Вспомогательные методы с аннотацией @Step (как на скриншоте 9) ---

    @Step("Создание пользователя: имя {name}, возраст {age}, город {city}")
    public Person createPersonStep(String name, int age, String city) {
        return new Person(name, age, city);
    }

    @Step("Пользователь отмечает день рождения")
    public void celebrateBirthdayStep(Person person) {
        person.celebrateBirthday();
    }

    @Step("Проверка: возраст должен стать {expectedAge}")
    public void checkAgeStep(Person person, int expectedAge) {
        assertEquals("Возраст не совпал!", expectedAge, person.getAge());
    }

    @Step("Проверка: информация о пользователе должна быть '{expectedInfo}'")
    public void checkInfoStep(Person person, String expectedInfo) {
        assertEquals("Инфо не совпало!", expectedInfo, person.getInfo());
    }
}