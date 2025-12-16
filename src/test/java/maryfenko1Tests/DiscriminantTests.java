package maryfenko1Tests;

import org.junit.Assert;
import org.junit.Test;
import allclasses.maryfenko1.Discriminant;

public class DiscriminantTests {

    @Test
    public void defaultConstructor_workCorrectly() {
        Discriminant d = new Discriminant();

        Assert.assertEquals(0.0, d.getA(), 0.00001);
        Assert.assertEquals(0.0, d.getB(), 0.00001);
        Assert.assertEquals(0.0, d.getC(), 0.00001);
        Assert.assertEquals(0.0, d.getDiscriminantValue(), 0.00001);
    }

    @Test
    public void constructorWithParameters_workCorrectly() {
        Discriminant d = new Discriminant(1.0, -3.0, 2.0);

        Assert.assertEquals(1.0, d.getA(), 0.00001);
        Assert.assertEquals(-3.0, d.getB(), 0.00001);
        Assert.assertEquals(2.0, d.getC(), 0.00001);
        Assert.assertEquals(1.0, d.getDiscriminantValue(), 0.00001);
    }

    @Test
    public void getNumberOfRoots_twoRoots_return2() {
        Discriminant d = new Discriminant(1.0, 5.0, 6.0);

        Assert.assertEquals(2, d.getNumberOfRoots());
        Assert.assertEquals(1.0, d.getDiscriminantValue(), 0.00001);
    }

    @Test
    public void getNumberOfRoots_oneRoot_return1() {
        Discriminant d = new Discriminant(1.0, 4.0, 4.0);

        Assert.assertEquals(1, d.getNumberOfRoots());
        Assert.assertEquals(0.0, d.getDiscriminantValue(), 0.00001);
    }

    @Test
    public void getNumberOfRoots_noRoots_return0() {
        Discriminant d = new Discriminant(1.0, 2.0, 5.0);

        Assert.assertEquals(0, d.getNumberOfRoots());
        Assert.assertEquals(-16.0, d.getDiscriminantValue(), 0.00001);
    }

    @Test
    public void getNumberOfRoots_linearEquation_return1() {
        Discriminant d = new Discriminant(0.0, 2.0, 4.0);

        Assert.assertEquals(1, d.getNumberOfRoots());
    }

    @Test
    public void getNumberOfRoots_zeroEquation_infiniteRoots() {
        Discriminant d = new Discriminant(0.0, 0.0, 0.0);

        Assert.assertEquals(Integer.MAX_VALUE, d.getNumberOfRoots());
    }

    @Test
    public void getNumberOfRoots_zeroAAndBNotZero_noRoots() {
        Discriminant d = new Discriminant(0.0, 0.0, 5.0);

        Assert.assertEquals(0, d.getNumberOfRoots());
    }

    @Test
    public void setters_recalculateDiscriminant_workCorrectly() {
        Discriminant d = new Discriminant();

        d.setA(2.0);
        d.setB(7.0);
        d.setC(3.0);

        Assert.assertEquals(2.0, d.getA(), 0.00001);
        Assert.assertEquals(7.0, d.getB(), 0.00001);
        Assert.assertEquals(3.0, d.getC(), 0.00001);
        Assert.assertEquals(25.0, d.getDiscriminantValue(), 0.00001);
    }

    @Test
    public void toString_containsAllFields() {
        Discriminant d = new Discriminant(1.5, 2.5, 3.5);

        String result = d.toString();

        Assert.assertTrue(result.contains("a=1.50"));
        Assert.assertTrue(result.contains("b=2.50"));
        Assert.assertTrue(result.contains("c=3.50"));
        Assert.assertTrue(result.contains("D="));
        Assert.assertTrue(result.startsWith("Discriminant{"));
    }

    @Test
    public void getNumberOfRoots_negativeDiscriminant_return0() {
        Discriminant d = new Discriminant(2.0, 1.0, 3.0);

        Assert.assertEquals(0, d.getNumberOfRoots());
        Assert.assertEquals(-23.0, d.getDiscriminantValue(), 0.00001);
    }

    @Test
    public void getNumberOfRoots_zeroDiscriminant_return1() {
        Discriminant d = new Discriminant(1.0, 2.0, 1.0);

        Assert.assertEquals(1, d.getNumberOfRoots());
        Assert.assertEquals(0.0, d.getDiscriminantValue(), 0.00001);
    }

    @Test
    public void getNumberOfRoots_positiveDiscriminant_return2() {
        Discriminant d = new Discriminant(2.0, 5.0, 2.0);

        Assert.assertEquals(2, d.getNumberOfRoots());
        Assert.assertEquals(9.0, d.getDiscriminantValue(), 0.00001);
    }

    @Test
    public void calculateDiscriminant_returnsCorrectValue() {
        Discriminant d = new Discriminant(3.0, 7.0, 2.0);

        double calculated = d.calculateDiscriminant();

        Assert.assertEquals(25.0, calculated, 0.00001);
        Assert.assertEquals(25.0, d.getDiscriminantValue(), 0.00001);
    }
}