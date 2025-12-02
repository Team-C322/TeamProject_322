package smorgunTests;

import allclasses.smorgun.Cat;

import org.junit.Assert;
import org.junit.Test;

import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;


public class CatTest {

    @Test
    @DisplayName("Британец Барсик 3 года")
    @Description("Проверка добавления нового кота Барсика")
    public void testCatCreation() {
        Cat cat = new Cat("Барсик", 3, "Мужской", "Британский");
        
        Assert.assertEquals("Барсик", cat.getName());
        Assert.assertEquals(3, cat.getAge());
        Assert.assertEquals("Мужской", cat.getGender());
        Assert.assertEquals("Британский", cat.getBreed());
    }

    @Test
    @DisplayName("Персидсикий Рыжик")
    @Description("Проверка добавления нового кота Рыжик")
    public void testGetters() {
        Cat cat = new Cat("Рыжик", 1, "Мужской", "Персидский");
       
        Assert.assertEquals("Рыжик", cat.getName());
        Assert.assertEquals(1, cat.getAge());
        Assert.assertEquals("Мужской", cat.getGender());
        Assert.assertEquals("Персидский", cat.getBreed());
      
    }

    @Test
    @DisplayName("Добавление двух котов")
    @Description("Проверка добавления двух котов")
    public void testDifferentCats() {
        Cat cat1 = new Cat("Кексик", 5, "Мужской", "Шотландский");
        Cat cat2 = new Cat("Снежок", 2, "Женский", "Беспородный");
        
        Assert.assertNotEquals(cat1.getName(), cat2.getName());
        Assert.assertNotEquals(cat1.getBreed(), cat2.getBreed());
        Assert.assertEquals("Мужской", cat1.getGender());
        Assert.assertEquals("Женский", cat2.getGender());
    }
}