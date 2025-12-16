package BalovaTests;

import allclasses.balova.OpticsCalculator;
import org.junit.Assert;
import org.junit.Test;

public class OpticsCalculatorTest {

    // Тесты для getImageDistance
    @Test
    public void getImageDistance_ConvergingLens_RealImage() {
        double objectDistance = 30.0;
        double opticalPower = 10.0;
        double expected = 15.0;

        double actual = OpticsCalculator.getImageDistance(objectDistance, opticalPower);

        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void getImageDistance_ConvergingLens_VirtualImage() {
        double objectDistance = 5.0;
        double opticalPower = 10.0;
        double expected = -10.0;

        double actual = OpticsCalculator.getImageDistance(objectDistance, opticalPower);

        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void getImageDistance_DivergingLens_AlwaysVirtual() {
        double objectDistance = 20.0;
        double opticalPower = -5.0;
        double expected = -10;

        double actual = OpticsCalculator.getImageDistance(objectDistance, opticalPower);

        Assert.assertEquals(expected, actual, 0.001);
    }

    // Тесты для getImageType
    @Test
    public void getImageType_PositiveDistance_RealImage() {
        double imageDistance = 25.0;

        String result = OpticsCalculator.getImageType(imageDistance);

        Assert.assertEquals("действительное", result);
    }

    @Test
    public void getImageType_NegativeDistance_VirtualImage() {
        double imageDistance = -15.0;

        String result = OpticsCalculator.getImageType(imageDistance);

        Assert.assertEquals("мнимое", result);
    }

    // Тесты для getMagnification
    @Test
    public void getMagnification_EnlargedImage() {
        double objectDistance = 10.0;
        double imageDistance = 20.0;
        double expected = 2.0;

        double actual = OpticsCalculator.getMagnification(objectDistance, imageDistance);

        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void getMagnification_ReducedImage() {
        double objectDistance = 30.0;
        double imageDistance = 15.0;
        double expected = 0.5;

        double actual = OpticsCalculator.getMagnification(objectDistance, imageDistance);

        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void getMagnification_SameSize() {
        double objectDistance = 20.0;
        double imageDistance = 20.0;
        double expected = 1.0;

        double actual = OpticsCalculator.getMagnification(objectDistance, imageDistance);

        Assert.assertEquals(expected, actual, 0.001);
    }

    // Тест для solveProblem
    @Test
    public void solveProblem_WorksCorrectly() {
        double objectDistance = 30.0;
        double opticalPower = 10.0;

        // Проверяем, что метод выполняется без ошибок
        OpticsCalculator.solveProblem(objectDistance, opticalPower);
    }
}