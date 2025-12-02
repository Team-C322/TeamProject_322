package yurchenkoTests;

import allclasses.yurchenko.Square;
import java.util.ArrayList;
import java.util.List;

public class SquareTest {

    // Класс для тестового случая
    public static class TestCase {
        private final String testName;
        private final double side;
        private final double expectedArea;
        private final double expectedPerimeter;
        private final boolean shouldThrowException;
        private final String expectedErrorMessage;

        public TestCase(String testName, double side, double expectedArea,
                        double expectedPerimeter, boolean shouldThrowException,
                        String expectedErrorMessage) {
            this.testName = testName;
            this.side = side;
            this.expectedArea = expectedArea;
            this.expectedPerimeter = expectedPerimeter;
            this.shouldThrowException = shouldThrowException;
            this.expectedErrorMessage = expectedErrorMessage;
        }
    }

    // Класс для результатов теста
    public static class TestResult {
        private final String testName;
        private final boolean passed;
        private final String message;

        public TestResult(String testName, boolean passed, String message) {
            this.testName = testName;
            this.passed = passed;
            this.message = message;
        }
    }

    // Основной метод запуска тестов
    public static void main(String[] args) {
        System.out.println("ТЕСТИРОВАНИЕ КЛАССА SQUARE \n");

        // Создаем тестовые случаи (как @Parameterized.Parameters у Бартасевича)
        List<TestCase> testCases = createTestCases();

        // Запускаем все тесты
        List<TestResult> results = new ArrayList<>();
        for (TestCase testCase : testCases) {
            TestResult result = runTestCase(testCase);
            results.add(result);
            printTestResult(result);
        }

        // Выводим итоговую статистику
        printStatistics(results);
    }

    // Метод создания тестовых случаев (аналог getParameters())
    private static List<TestCase> createTestCases() {
        List<TestCase> cases = new ArrayList<>();

        // Позитивные тесты
        cases.add(new TestCase("Создание квадрата со стороной 4",
                4.0, 16.0, 16.0, false, null));
        cases.add(new TestCase("Создание квадрата со стороной 3",
                3.0, 9.0, 12.0, false, null));
        cases.add(new TestCase("Создание квадрата со стороной 5",
                5.0, 25.0, 20.0, false, null));
        cases.add(new TestCase("Создание квадрата со стороной 1",
                1.0, 1.0, 4.0, false, null));

        // Негативные тесты (ожидаем исключения)
        cases.add(new TestCase("Попытка создать квадрат со стороной 0",
                0, 0, 0, true, "Сторона квадрата должна быть положительным числом"));
        cases.add(new TestCase("Попытка создать квадрат с отрицательной стороной",
                -2.0, 0, 0, true, "Сторона квадрата должна быть положительным числом"));
        cases.add(new TestCase("Попытка создать квадрат со стороной -5",
                -5.0, 0, 0, true, "Сторона квадрата должна быть положительным числом"));

        return cases;
    }

    // Метод запуска одного тестового случая
    private static TestResult runTestCase(TestCase testCase) {
        String testName = testCase.testName;

        try {
            // Тест на создание и вычисление площади
            if (testCase.shouldThrowException) {
                try {
                    new Square(testCase.side);
                    return new TestResult(testName, false,
                            "Ожидалось исключение, но оно не было выброшено");
                } catch (IllegalArgumentException e) {
                    if (!e.getMessage().equals(testCase.expectedErrorMessage)) {
                        return new TestResult(testName, false,
                                "Неправильное сообщение об ошибке: " + e.getMessage());
                    }
                    return new TestResult(testName, true,
                            "Исключение выброшено корректно");
                }
            } else {
                // Создаем квадрат
                Square square = new Square(testCase.side);

                // Проверяем площадь (squareCreationAndAreaTest)
                double actualArea = square.calculateArea();
                if (Math.abs(actualArea - testCase.expectedArea) > 0.001) {
                    return new TestResult(testName, false,
                            "Неверная площадь. Ожидалось: " + testCase.expectedArea +
                                    ", Получено: " + actualArea);
                }

                // Проверяем периметр (squarePerimeterTest)
                double actualPerimeter = square.calculatePerimeter();
                if (Math.abs(actualPerimeter - testCase.expectedPerimeter) > 0.001) {
                    return new TestResult(testName, false,
                            "Неверный периметр. Ожидалось: " + testCase.expectedPerimeter +
                                    ", Получено: " + actualPerimeter);
                }

                // Проверяем сравнение (squareComparisonTest)
                Square sameSquare = new Square(testCase.side);
                Square differentSquare = new Square(testCase.side + 1);
                if (!square.isEqual(sameSquare)) {
                    return new TestResult(testName, false,
                            "Квадраты с одинаковой стороной должны быть равны");
                }
                if (square.isEqual(differentSquare)) {
                    return new TestResult(testName, false,
                            "Квадраты с разной стороной не должны быть равны");
                }

                // Проверяем масштабирование (squareScalingTest)
                double scaleFactor = 2.0;
                Square squareForScaling = new Square(testCase.side);
                squareForScaling.scale(scaleFactor);
                double expectedScaledSide = testCase.side * scaleFactor;
                if (Math.abs(squareForScaling.getSide() - expectedScaledSide) > 0.001) {
                    return new TestResult(testName, false,
                            "Неверное масштабирование. Ожидалась сторона: " +
                                    expectedScaledSide + ", Получено: " + squareForScaling.getSide());
                }

                // Проверяем диагональ (squareDiagonalTest)
                double expectedDiagonal = testCase.side * Math.sqrt(2);
                double actualDiagonal = square.calculateDiagonal();
                if (Math.abs(actualDiagonal - expectedDiagonal) > 0.001) {
                    return new TestResult(testName, false,
                            "Неверная диагональ. Ожидалось: " + expectedDiagonal +
                                    ", Получено: " + actualDiagonal);
                }

                return new TestResult(testName, true, "Все проверки пройдены успешно");
            }
        } catch (Exception e) {
            return new TestResult(testName, false,
                    "Непредвиденное исключение: " + e.getMessage());
        }
    }

    // Метод вывода результата одного теста
    private static void printTestResult(TestResult result) {
        if (result.passed) {
            System.out.println(" [" + result.testName + "] - ПРОЙДЕН");
        } else {
            System.out.println("[" + result.testName + "] - НЕ ПРОЙДЕН");
            System.out.println("   Причина: " + result.message);
        }
    }

    // Метод вывода итоговой статистики
    private static void printStatistics(List<TestResult> results) {
        long passedCount = results.stream().filter(r -> r.passed).count();
        long failedCount = results.size() - passedCount;

        System.out.println("\n=== СТАТИСТИКА ТЕСТИРОВАНИЯ ===");
        System.out.println("Всего тестов: " + results.size());
        System.out.println("Пройдено: " + passedCount);
        System.out.println("Не пройдено: " + failedCount);

        if (failedCount == 0) {
            System.out.println("\n ВСЕ ТЕСТЫ УСПЕШНО ПРОЙДЕНЫ!");
        } else {
            System.out.println("\n Некоторые тесты не пройдены");
        }
    }
}