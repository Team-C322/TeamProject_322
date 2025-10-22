package karachebanTests;

import allclasses.karachebanDI.StudyDesk;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudyDeskTest {

    @Test
    public void constructorAndGetters_workCorrectly() {
        StudyDesk desk = new StudyDesk("desk", 12345, 8000, 120, 60, 75);

        assertEquals("desk", desk.getType());
        assertEquals(12345, desk.getSerialNumber());
        assertEquals(8000, desk.getPrice());
        assertEquals(120, desk.getLength());
        assertEquals(60, desk.getWidth());
        assertEquals(75, desk.getHeight());
    }

    @Test
    public void convertPrice_returnsUsdValue_whenCurrencyIsUSD() {
        StudyDesk desk = new StudyDesk("desk", 1, 8000, 100, 50, 70);

        double expectedUsd = 8000 / 80.0;
        double actualUsd = desk.ConvertPrice("USD");

        assertEquals(expectedUsd, actualUsd, 0.001);
    }

    @Test
    public void convertPrice_returnsRUBValue_whenCurrencyIsRUB() {
        StudyDesk desk = new StudyDesk("desk", 1, 8000, 100, 50, 70);

        double actualRub = desk.ConvertPrice("RUB");

        assertEquals(8000, actualRub);
    }

    @Test
    public void toString_thenContainsTypeAndSerialNumber() {
        StudyDesk desk = new StudyDesk("desk", 12345, 8000, 120, 60, 75);

        String text = desk.ToString();

        assertTrue(text.contains("Тип: desk"));
        assertTrue(text.contains("Серийный номер: 12345"));
    }
}
