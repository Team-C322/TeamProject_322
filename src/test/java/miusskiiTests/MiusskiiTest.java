package miusskiiTests;

import allclasses.miusskii.MiusskiiClass;
import org.junit.Test;
import java.util.List; 
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

    @Test
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
    public void testAddEmptyLanguage() {
        MiusskiiClass mc = new MiusskiiClass();
        
        mc.addLanguage(""); 
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddNullLanguage() {
        MiusskiiClass mc = new MiusskiiClass();
        
        mc.addLanguage(null); 
    }


    @Test
    public void testContainsLanguageCaseSensitive() {
        MiusskiiClass mc = new MiusskiiClass();
        
        mc.addLanguage("Java");
        
        assertTrue(mc.containsLanguage("Java"));
        assertFalse(mc.containsLanguage("java"));
        assertFalse(mc.containsLanguage("JAVA"));
    }

    @Test
    public void testEmptyList() {
        MiusskiiClass mc = new MiusskiiClass();
        
        assertEquals(0, mc.getAll().size());
        assertFalse(mc.containsLanguage("AnyLanguage"));
        assertTrue(mc.getAll().isEmpty());
    }

    @Test
    public void testAddLanguageWithSpaces() {
        MiusskiiClass mc = new MiusskiiClass();
        
        mc.addLanguage("  Java  "); 
        
        assertEquals(1, mc.getAll().size());
        assertEquals("  Java  ", mc.getAll().get(0)); 
        assertTrue(mc.containsLanguage("  Java  "));
    }
}