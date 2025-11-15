package zhuraveltest;

import allclasses.zhuravelPS.Charger;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class chargertests {
    private Charger charger;

    @Before
    public void setUp() {
        charger = new Charger("SuperCharger 1000", 65);
    }

    @Test
    public void testInitialState() {
        assertFalse(charger.isConnected());
        assertEquals("SuperCharger 1000", charger.getModel());
    }

    @Test
    public void testConnect() {
        charger.connect();
        assertTrue(charger.isConnected());
    }

    @Test
    public void testCalculateChargingTimeWhenDisconnected() {
        assertEquals(-1, charger.calculateChargingTime(5000), 0.001);
    }

    @Test
    public void testCalculateChargingTimeWhenConnected() {
        charger.connect();
        double time = charger.calculateChargingTime(5000);
        assertEquals(76.92, time, 0.01);
    }
}