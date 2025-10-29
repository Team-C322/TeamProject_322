package karachebanTests;

import allclasses.karachebanDI.StudyDesk;
import org.junit.Assert;
import org.junit.Test;

public class StudyDeskTest {

    @Test
    public void constructorAndGetters_workCorrectly() {
        StudyDesk desk = new StudyDesk("desk", 12345, 8000, 120, 60, 75);

        Assert.assertEquals("desk", desk.getType());
        Assert.assertEquals(12345, desk.getSerialNumber());
        Assert.assertEquals(8000, desk.getPrice(), 0.0001);
        Assert.assertEquals(120, desk.getLength(),0.0001);
        Assert.assertEquals(60, desk.getWidth(),0.0001);
        Assert.assertEquals(75, desk.getHeight(),0.0001);
    }

    @Test
    public void convertPrice_returnsUsdValue_whenCurrencyIsUSD() {
        StudyDesk desk = new StudyDesk("desk", 1, 8000, 100, 50, 70);

        double expectedUsd = 8000 / 80.0;
        double actualUsd = desk.ConvertPrice("USD");

        Assert.assertEquals(expectedUsd, actualUsd, 0.001);
    }

    @Test
    public void convertPrice_returnsRUBValue_whenCurrencyIsRUB() {
        StudyDesk desk = new StudyDesk("desk", 1, 8000, 100, 50, 70);

        double actualRub = desk.ConvertPrice("RUB");

       Assert.assertEquals(8000, actualRub, 0.001);
    }

    @Test
    public void toString_thenContainsTypeAndSerialNumber() {
        StudyDesk desk = new StudyDesk("desk", 12345, 8000, 120, 60, 75);

        String text = desk.ToString();

        Assert.assertTrue(text.contains("Тип: desk"));
        Assert.assertTrue(text.contains("Серийный номер: 12345"));
    }
}
