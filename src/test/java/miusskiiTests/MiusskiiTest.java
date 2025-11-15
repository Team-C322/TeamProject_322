package miusskiiTests;

import allclasses.miusskii.MiusskiiClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MiusskiiTest {

    @Test
    public void testAddAndCheck() {
        MiusskiiClass a = new MiusskiiClass();

        a.addLanguage("JavaScript");
        a.addLanguage("Java");

        assertEquals(2, a.getAll().size());
        assertTrue(a.containsLanguage("Java"));
        assertFalse(a.containsLanguage("Python"));
    }
}
