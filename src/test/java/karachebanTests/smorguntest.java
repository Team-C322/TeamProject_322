package smorguntest;

import allclasses.smorgun.Cat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CatTest {

    @Test
    public void testCatCreation() {
        Cat cat = new Cat("Барсик", 3, "Мужской", "Британский");
        
        assertEquals("Барсик", cat.getName());
        assertEquals(3, cat.getAge());
        assertEquals("Мужской", cat.getGender());
        assertEquals("Британский", cat.getBreed());
    }

    @Test
    public void testDisplayInfo() 
    {
        Cat cat = new Cat("Мурка", 2, "Женский", "Сиамская");
        
        assertDoesNotThrow(() -> cat.displayInfo());
    }

    @Test
    public void testMeow() {
        Cat cat = new Cat("Васька", 4, "Мужской", "Дворовый");
        
        // Проверка что метод meow() не выбрасывает исключений
        assertDoesNotThrow(() -> cat.meow());
    }

    @Test
    public void testGetters() {
        Cat cat = new Cat("Рыжик", 1, "Мужской", "Персидский");
        
        assertAll("Геттеры",
            () -> assertEquals("Рыжик", cat.getName()),
            () -> assertEquals(1, cat.getAge()),
            () -> assertEquals("Мужской", cat.getGender()),
            () -> assertEquals("Персидский", cat.getBreed())
        );
    }

    @Test
    public void testDifferentCats() {
        Cat cat1 = new Cat("Кексик", 5, "Мужской", "Шотландский");
        Cat cat2 = new Cat("Снежок", 2, "Женский", "Беспородный");
        
        assertNotEquals(cat1.getName(), cat2.getName());
        assertNotEquals(cat1.getBreed(), cat2.getBreed());
        assertEquals("Мужской", cat1.getGender());
        assertEquals("Женский", cat2.getGender());
    }
}