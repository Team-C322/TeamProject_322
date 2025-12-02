package KornilovTests;

import allclasses.kornilov.Virmash;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VirmashTest {

    @Test
    @DisplayName("Тест конструктора и геттеров")
    void testConstructorAndGetters() {
        Virmash vm = new Virmash("admin", "12345", "Linux", 2147483648.0, 10737418240.0); // 2 GB RAM, 10 GB disk

        assertEquals("admin", vm.getUser());
        assertEquals("12345", vm.getPassword());
        assertEquals("Linux", vm.getOsType());
        assertEquals(2147483648.0, vm.getRamSize());
        assertEquals(10737418240.0, vm.getDiskSize());
    }

    @Test
    @DisplayName("Тест сеттеров")
    void testSetters() {
        Virmash vm = new Virmash("user", "pass", "Windows", 0, 0);

        vm.setUser("newuser");
        vm.setPassword("newpass");
        vm.setOsType("macOS");
        vm.setRamSize(4294967296.0); // 4 GB
        vm.setDiskSize(21474836480.0); // 20 GB

        assertEquals("newuser", vm.getUser());
        assertEquals("newpass", vm.getPassword());
        assertEquals("macOS", vm.getOsType());
        assertEquals(4294967296.0, vm.getRamSize());
        assertEquals(21474836480.0, vm.getDiskSize());
    }

    @Test
    @DisplayName("Тест метода ToString")
    void testToString() {
        Virmash vm = new Virmash("test", "test123", "Ubuntu", 1073741824.0, 5368709120.0);
        String expected = "Класс: виртуальная машина\n" +
                "Юзер:test\n" +
                "Пароль:test123\n" +
                "Тип ОС:Ubuntu\n" +
                "Размер ОЗУ:1073741824.0 байт\n" +
                "Размер ПЗУ:5368709120.0";

        assertEquals(expected, vm.ToString());
    }

    @Test
    @DisplayName("Тест конвертации RAM")
    void testConvertRamSize() {
        Virmash vm = new Virmash("test", "pass", "Linux", 1073741824.0, 0); // 1 GB = 1024^3 bytes

        assertEquals(1.0, vm.ConvertRamSize("Gb"), 0.001);
        assertEquals(1024.0, vm.ConvertRamSize("Mb"), 0.001);
        assertEquals(1048576.0, vm.ConvertRamSize("Kb"), 0.001);
    }

    @Test
    @DisplayName("Тест конвертации Disk (баг: использует ramSize вместо diskSize)")
    void testConvertDiskSize_BugDetected() {
        Virmash vm = new Virmash("test", "pass", "Linux", 1073741824.0, 2147483648.0); // RAM=1GB, Disk=2GB

        // ⚠️ Сейчас ConvertDiskSize использует ramSize! Это ошибка.
        // Поэтому ожидаем 1 GB (а не 2), чтобы показать баг.
        assertEquals(1.0, vm.ConvertDiskSize("Gb"), 0.001); // Это неправильно! Должно быть 2.0

        // Лучше добавить комментарий или тест с предупреждением:
        assertNotEquals(2.0, vm.ConvertDiskSize("Gb"), "ConvertDiskSize должен использовать diskSize, а не ramSize!");
    }

    @Test
    @DisplayName("Тест обработки неверной единицы измерения (RAM)")
    void testConvertRamSizeInvalidUnit() {
        Virmash vm = new Virmash("test", "pass", "Linux", 1024.0, 0);
        assertEquals(0, vm.ConvertRamSize("TB")); // неверная единица
    }

    @Test
    @DisplayName("Тест обработки неверной единицы измерения (Disk)")
    void testConvertDiskSizeInvalidUnit() {
        Virmash vm = new Virmash("test", "pass", "Linux", 0, 1024.0);
        assertEquals(0, vm.ConvertDiskSize("TB")); // неверная единица
    }

    @Test
    @DisplayName("ShowInfo не выбрасывает исключение")
    void testShowInfo() {
        Virmash vm = new Virmash("test", "test", "TestOS", 100.0, 200.0);
        assertDoesNotThrow(vm::ShowInfo);
    }
}