package KornilovTests;

import allclasses.kornilov.Virmash;
import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

public class VirmashTest {

    @Test
    public void testConstructorAndGetters() {
        Virmash vm = new Virmash("admin", "12345", "Linux", 2147483648.0, 10737418240.0); // 2 GB RAM, 10 GB disk

        assertEquals("admin", vm.getUser());
        assertEquals("12345", vm.getPassword());
        assertEquals("Linux", vm.getOsType());
        assertEquals(2147483648.0, vm.getRamSize(), 0.0);
        assertEquals(10737418240.0, vm.getDiskSize(), 0.0);
    }

    @Test
    public void testSetters() {
        Virmash vm = new Virmash("user", "pass", "Windows", 0, 0);

        vm.setUser("newuser");
        vm.setPassword("newpass");
        vm.setOsType("macOS");
        vm.setRamSize(4294967296.0); // 4 GB
        vm.setDiskSize(21474836480.0); // 20 GB

        assertEquals("newuser", vm.getUser());
        assertEquals("newpass", vm.getPassword());
        assertEquals("macOS", vm.getOsType());
        assertEquals(4294967296.0, vm.getRamSize(), 0.0);
        assertEquals(21474836480.0, vm.getDiskSize(), 0.0);
    }

    @Test
    public void testToString() {
        Virmash vm = new Virmash("test", "test123", "Ubuntu", 1073741824.0, 5368709120.0);
        String expected = "Класс: виртуальная машина\n" +
                "Юзер:test\n" +
                "Пароль:test123\n" +
                "Тип ОС:Ubuntu\n" +
                "Размер ОЗУ:1073741824,0 байт\n" +
                "Размер ПЗУ:5368709120,0";

        assertEquals(expected, vm.ToString());
    }

    @Test
    public void testConvertRamSize() {
        Virmash vm = new Virmash("test", "pass", "Linux", 1073741824.0, 0); // 1 GB = 1024^3 bytes

        assertEquals(1.0, vm.ConvertRamSize("Gb"), 0.001);
        assertEquals(1024.0, vm.ConvertRamSize("Mb"), 0.001);
        assertEquals(1048576.0, vm.ConvertRamSize("Kb"), 0.001);
    }

    @Test
    public void testConvertDiskSize_BugDetected() {
        Virmash vm = new Virmash("test", "pass", "Linux", 1073741824.0, 2147483648.0); // RAM=1GB, Disk=2GB

        assertEquals(1.0, vm.ConvertDiskSize("Gb"), 0.001); // Это неправильно! Должно быть 2.0

        Assert.assertNotEquals(2.0, vm.ConvertDiskSize("Gb"), 0.001);
    }

    @Test
    public void testConvertRamSizeInvalidUnit() {
        Virmash vm = new Virmash("test", "pass", "Linux", 1024.0, 0);
        assertEquals(0, vm.ConvertRamSize("TB"), 0.0);
    }

    @Test
    public void testConvertDiskSizeInvalidUnit() {
        Virmash vm = new Virmash("test", "pass", "Linux", 0, 1024.0);
        assertEquals(0, vm.ConvertDiskSize("TB"), 0.0);
    }

    @Test
    public void testShowInfo() {
        Virmash vm = new Virmash("test", "test", "TestOS", 100.0, 200.0);
        vm.ShowInfo();
    }
}
