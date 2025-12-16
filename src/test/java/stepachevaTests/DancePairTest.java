package stepachevaTests;

import static org.junit.Assert.*;
import org.junit.Test;

import allclasses.stepacheva.DancePair;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

@Epic("Танцевальные пары")
@Feature("Класс DancePair")
public class DancePairTest {

    @Test
    @Story("Проверка геттеров")
    @Description("Проверяется корректность работы методов getPartner1, getPartner2 и getStyle")
    @Severity(SeverityLevel.NORMAL)
    public void testGetters() {
        DancePair pair = new DancePair("Анна", "Илья", "Вальс");

        assertEquals("Анна", pair.getPartner1());
        assertEquals("Илья", pair.getPartner2());
        assertEquals("Вальс", pair.getStyle());
    }

    @Test
    @Story("Проверка полной пары")
    @Description("Проверяется, что пара считается полной, если оба партнёра заданы")
    @Severity(SeverityLevel.CRITICAL)
    public void testCompletePair() {
        DancePair pair = new DancePair("Ольга", "Павел", "Танго");

        assertTrue(pair.isCompletePair());
    }

    @Test
    @Story("Проверка неполной пары")
    @Description("Проверяется, что пара считается неполной, если один партнёр не задан")
    @Severity(SeverityLevel.CRITICAL)
    public void testIncompletePair() {
        DancePair pair = new DancePair("", "Дмитрий", "Самба");

        assertFalse(pair.isCompletePair());
    }

    @Test
    @Story("Проверка метода toString")
    @Description("Проверяется, что строковое представление содержит имена партнёров и стиль танца")
    @Severity(SeverityLevel.MINOR)
    public void testToString() {
        DancePair pair = new DancePair("Алиса", "Георгий", "Ча-ча-ча");
        String s = pair.toString();

        assertTrue(s.contains("Алиса"));
        assertTrue(s.contains("Георгий"));
        assertTrue(s.contains("Ча-ча-ча"));
    }
}
