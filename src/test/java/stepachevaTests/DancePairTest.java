package stepchevaTests;

import static org.junit.Assert.*;
import org.junit.Test;

import allclasses.stepcheva.DancePair;

public class DancePairTest {

    @Test
    public void testGetters() {
        DancePair pair = new DancePair("Анна", "Илья", "Вальс");
        assertEquals("Анна", pair.getPartner1());
        assertEquals("Илья", pair.getPartner2());
        assertEquals("Вальс", pair.getStyle());
    }

    @Test
    public void testCompletePair() {
        DancePair pair = new DancePair("Ольга", "Павел", "Танго");
        assertTrue(pair.isCompletePair());
    }

    @Test
    public void testIncompletePair() {
        DancePair pair = new DancePair("", "Дмитрий", "Самба");
        assertFalse(pair.isCompletePair());
    }

    @Test
    public void testToString() {
        DancePair pair = new DancePair("Алиса", "Георгий", "Ча-ча-ча");
        String s = pair.toString();

        assertTrue(s.contains("Алиса"));
        assertTrue(s.contains("Георгий"));
        assertTrue(s.contains("Ча-ча-ча"));
    }
}
