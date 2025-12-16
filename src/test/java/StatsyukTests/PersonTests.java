// src/test/java/StatsyukTests/PersonTest.java
package StatsyukTests; // <-- Пакет соответствует папке

import allclasses.Statsyuk.Person; // Импорт нашего класса Person
import org.junit.Test; // <-- JUnit 4 @Test
import static org.junit.Assert.assertEquals; // <-- JUnit 4 Assertions

public class PersonTests {

    @Test // <-- Аннотация JUnit 4
    public void testCelebrateBirthday() { // <-- Методы в JUnit 4 должны быть public void
        Person person = new Person("Алиса", 25, "Москва");
        person.celebrateBirthday();
        assertEquals(26, person.getAge());
    }

    @Test // <-- Аннотация JUnit 4
    public void testGetInfo() { // <-- Методы в JUnit 4 должны быть public void
        Person person = new Person("Боб", 30, "Питер");
        String expectedInfo = "Имя: Боб, Возраст: 30, Город: Питер";
        assertEquals(expectedInfo, person.getInfo());
    }
}