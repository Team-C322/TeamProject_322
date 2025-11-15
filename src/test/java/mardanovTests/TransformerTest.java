package mardanovTests;

import allclasses.mardanov.Transformer;
import org.junit.Assert;
import org.junit.Test;

public class TransformerTest {

    @Test
    public void constructorAndGetters_workCorrectly() {
        Transformer transformer = new Transformer("SuperBot", 2.5, true);

        Assert.assertEquals("SuperBot", transformer.getName());
        Assert.assertEquals(2.5, transformer.getMultiplier(), 0.0001);
        Assert.assertTrue(transformer.isActive());
    }

    @Test
    public void toUpperCase_returnsUppercaseString_whenTransformerIsActive() {
        Transformer transformer = new Transformer("TestBot", 1.0, true);

        String result = transformer.toUpperCase("hello world");

        Assert.assertEquals("HELLO WORLD", result);
    }

    @Test
    public void toUpperCase_returnsInactiveMessage_whenTransformerIsInactive() {
        Transformer transformer = new Transformer("TestBot", 1.0, false);

        String result = transformer.toUpperCase("hello world");

        Assert.assertEquals("Transformer is inactive", result);
    }

    @Test
    public void multiplyNumber_returnsMultipliedValue_whenTransformerIsActive() {
        Transformer transformer = new Transformer("TestBot", 3.0, true);

        double result = transformer.multiplyNumber(5.0);

        Assert.assertEquals(15.0, result, 0.0001);
    }

    @Test
    public void toString_thenContainsNameAndMultiplier() {
        Transformer transformer = new Transformer("SuperBot", 2.5, true);

        String text = transformer.toString();

        Assert.assertTrue(text.contains("SuperBot"));
        Assert.assertTrue(text.contains("2.5"));
    }
}