package miusskiiTests;

import allclasses.miusskii.MiusskiiClass;
import org.junit.Test;
import java.util.List; 
import static org.junit.Assert.*;
import io.qameta.allure.*;

@Epic("Тестирование класса MiusskiiClass")
@Feature("Управление языками программирования")
public class MiusskiiTest {

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Story("Добавление и проверка языков")
    @Description("Тест проверяет базовое добавление языков и их наличие в списке")
    @DisplayName("Базовое добавление языков и проверка содержания")
    public void testAddAndCheck() {
        MiusskiiClass a = new MiusskiiClass();

        a.addLanguage("JavaScript");
        a.addLanguage("Java");

        assertEquals(2, a.getAll().size());
        assertTrue(a.containsLanguage("Java"));
        assertFalse(a.containsLanguage("Python"));
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Story("Дублирование элементов")
    @Description("Тест проверяет возможность добавления дублирующихся языков")
    @DisplayName("Добавление дублирующихся языков")
    public void testAddDuplicateLanguages() {
        MiusskiiClass mc = new MiusskiiClass();

        mc.addLanguage("Java");
        mc.addLanguage("Python");
        mc.addLanguage("Java");

        assertEquals(3, mc.getAll().size()); 
        assertEquals("Java", mc.getAll().get(0));
        assertEquals("Python", mc.getAll().get(1));
        assertEquals("Java", mc.getAll().get(2));
    }

    @Test(expected = IllegalArgumentException.class)
    @Severity(SeverityLevel.CRITICAL)
    @Story("Валидация входных данных")
    @Description("Тест проверяет обработку пустых строк при добавлении языка")
    @DisplayName("Добавление пустой строки в качестве языка")
    public void testAddEmptyLanguage() {
        MiusskiiClass mc = new MiusskiiClass();
        
        mc.addLanguage(""); 
    }

    @Test(expected = IllegalArgumentException.class)
    @Severity(SeverityLevel.CRITICAL)
    @Story("Валидация входных данных")
    @Description("Тест проверяет обработку null значений при добавлении языка")
    @DisplayName("Добавление null в качестве языка")
    public void testAddNullLanguage() {
        MiusskiiClass mc = new MiusskiiClass();
        
        mc.addLanguage(null); 
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Story("Регистрозависимость")
    @Description("Тест проверяет регистрозависимость при проверке наличия языка")
    @DisplayName("Проверка регистрозависимости языка")
    public void testContainsLanguageCaseSensitive() {
        MiusskiiClass mc = new MiusskiiClass();
        
        mc.addLanguage("Java");
        
        assertTrue(mc.containsLanguage("Java"));
        assertFalse(mc.containsLanguage("java"));
        assertFalse(mc.containsLanguage("JAVA"));
    }

    @Test
    @Severity(SeverityLevel.MINOR)
    @Story("Работа с пустым списком")
    @Description("Тест проверяет поведение методов при пустом списке языков")
    @DisplayName("Работа с пустым списком языков")
    public void testEmptyList() {
        MiusskiiClass mc = new MiusskiiClass();
        
        assertEquals(0, mc.getAll().size());
        assertFalse(mc.containsLanguage("AnyLanguage"));
        assertTrue(mc.getAll().isEmpty());
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Story("Обработка пробелов")
    @Description("Тест проверяет добавление языка с пробелами по краям")
    @DisplayName("Добавление языка с пробелами")
    public void testAddLanguageWithSpaces() {
        MiusskiiClass mc = new MiusskiiClass();
        
        mc.addLanguage("  Java  "); 
        
        assertEquals(1, mc.getAll().size());
        assertEquals("  Java  ", mc.getAll().get(0)); 
        assertTrue(mc.containsLanguage("  Java  "));
    }
}