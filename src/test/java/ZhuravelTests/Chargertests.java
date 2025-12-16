package ZhuravelTests;

import allclasses.Zhuravel.Charger;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;

public class Chargertests {
    private Charger charger;

    @Before
    @DisplayName("Подготовка тестового окружения")
    @Description("Создание экземпляра зарядного устройства для тестирования")
    public void setUp() {
        charger = new Charger("SuperCharger 1000", 65);
    }

    @Test
    @DisplayName("Проверка начального состояния зарядного устройства")
    @Description("Тест проверяет, что новое зарядное устройство правильно инициализируется и не подключено")
    public void testInitialState() {
        assertFalse(charger.isConnected());
        assertEquals("SuperCharger 1000", charger.getModel());
    }

    @Test
    @DisplayName("Тестирование подключения зарядного устройства")
    @Description("Проверка функции подключения зарядного устройства к сети")
    public void testConnect() {
        charger.connect();
        assertTrue(charger.isConnected());
    }

    @Test
    @DisplayName("Расчет времени зарядки при отключенном устройстве")
    @Description("Проверка, что расчет времени возвращает -1 при отключенном зарядном устройстве")
    public void testCalculateChargingTimeWhenDisconnected() {
        assertEquals(-1, charger.calculateChargingTime(5000), 0.001);
    }

    @Test
    @DisplayName("Расчет времени зарядки при подключенном устройстве")
    @Description("Проверка корректного расчета времени зарядки батареи емкостью 5000 мАч")
    public void testCalculateChargingTimeWhenConnected() {
        charger.connect();
        double time = charger.calculateChargingTime(5000);
        assertEquals(76.92, time, 0.01);
    }
}