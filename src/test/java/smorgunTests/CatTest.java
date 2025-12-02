package smorgunTests;

import allclasses.smorgun.Cat;
import org.junit.Assert;
import org.junit.Test;


public class CatTest {

    @Test
    public void testCatCreation() {
        Cat cat = new Cat("Барсик", 3, "Мужской", "Британский");
        
        Assert.assertEquals("Барсик", cat.getName());
        Assert.assertEquals(3, cat.getAge());
        Assert.assertEquals("Мужской", cat.getGender());
        Assert.assertEquals("Британский", cat.getBreed());
    }

    @Test
    public void testGetters() {
        Cat cat = new Cat("Рыжик", 1, "Мужской", "Персидский");
       
        Assert.assertEquals("Рыжик", cat.getName());
        Assert.assertEquals(1, cat.getAge());
        Assert.assertEquals("Мужской", cat.getGender());
        Assert.assertEquals("Персидский", cat.getBreed());
      
    }

    @Test
    public void testDifferentCats() {
        Cat cat1 = new Cat("Кексик", 5, "Мужской", "Шотландский");
        Cat cat2 = new Cat("Снежок", 2, "Женский", "Беспородный");
        
        Assert.assertNotEquals(cat1.getName(), cat2.getName());
        Assert.assertNotEquals(cat1.getBreed(), cat2.getBreed());
        Assert.assertEquals("Мужской", cat1.getGender());
        Assert.assertEquals("Женский", cat2.getGender());
    }
}