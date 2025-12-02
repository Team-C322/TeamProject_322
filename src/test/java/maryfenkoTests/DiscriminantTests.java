package maryfenkoTests;

import allclasses.maryfenko.Discriminant;

public class DiscriminantTests {

    public static void main(String[] args) {
        System.out.println("=== Тестирование класса Discriminant ===\n");

        int passedTests = 0;
        int totalTests = 0;

        // Тест 1: Конструктор по умолчанию
        totalTests++;
        try {
            Discriminant d = new Discriminant();
            if (d.getA() == 0 && d.getB() == 0 && d.getC() == 0 && d.getDiscriminantValue() == 0) {
                System.out.println("Тест 1 пройден: Конструктор по умолчанию");
                passedTests++;
            } else {
                System.out.println("Тест 1 не пройден: Конструктор по умолчанию");
            }
        } catch (Exception e) {
            System.out.println("Тест 1 не пройден: " + e.getMessage());
        }

        // Тест 2: Конструктор с параметрами
        totalTests++;
        try {
            Discriminant d = new Discriminant(1, -3, 2);
            if (d.getA() == 1 && d.getB() == -3 && d.getC() == 2 && d.getDiscriminantValue() == 1) {
                System.out.println("Тест 2 пройден: Конструктор с параметрами");
                passedTests++;
            } else {
                System.out.println("Тест 2 не пройден: Конструктор с параметрами");
            }
        } catch (Exception e) {
            System.out.println("Тест 2 не пройден: " + e.getMessage());
        }

        // Тест 3: Два корня
        totalTests++;
        try {
            Discriminant d = new Discriminant(1, 5, 6);
            if (d.getNumberOfRoots() == 2 && d.getDiscriminantValue() == 1) {
                System.out.println("Тест 3 пройден: Два корня");
                passedTests++;
            } else {
                System.out.println("Тест 3 не пройден: Два корня");
            }
        } catch (Exception e) {
            System.out.println("Тест 3 не пройден: " + e.getMessage());
        }

        // Тест 4: Один корень
        totalTests++;
        try {
            Discriminant d = new Discriminant(1, 4, 4);
            if (d.getNumberOfRoots() == 1 && d.getDiscriminantValue() == 0) {
                System.out.println("Тест 4 пройден: Один корень");
                passedTests++;
            } else {
                System.out.println("Тест 4 не пройден: Один корень");
            }
        } catch (Exception e) {
            System.out.println("Тест 4 не пройден: " + e.getMessage());
        }

        // Тест 5: Нет корней
        totalTests++;
        try {
            Discriminant d = new Discriminant(1, 2, 5);
            if (d.getNumberOfRoots() == 0 && d.getDiscriminantValue() == -16) {
                System.out.println("Тест 5 пройден: Нет корней");
                passedTests++;
            } else {
                System.out.println("Тест 5 не пройден: Нет корней");
            }
        } catch (Exception e) {
            System.out.println("Тест 5 не пройден: " + e.getMessage());
        }

        // Тест 6: Линейное уравнение
        totalTests++;
        try {
            Discriminant d = new Discriminant(0, 2, 4);
            if (d.getNumberOfRoots() == 1) {
                System.out.println("Тест 6 пройден: Линейное уравнение");
                passedTests++;
            } else {
                System.out.println("Тест 6 не пройден: Линейное уравнение");
            }
        } catch (Exception e) {
            System.out.println("Тест 6 не пройден: " + e.getMessage());
        }

        // Тест 7: Сеттеры и пересчет дискриминанта
        totalTests++;
        try {
            Discriminant d = new Discriminant();
            d.setA(2);
            d.setB(7);
            d.setC(3);
            if (d.getDiscriminantValue() == 25) {
                System.out.println("Тест 7 пройден: Сеттеры и пересчет дискриминанта");
                passedTests++;
            } else {
                System.out.println("Тест 7 не пройден: Сеттеры и пересчет дискриминанта");
            }
        } catch (Exception e) {
            System.out.println("Тест 7 не пройден: " + e.getMessage());
        }

        // Тест 8: Метод toString
        totalTests++;
        try {
            Discriminant d = new Discriminant(1.5, 2.5, 3.5);
            String str = d.toString();
            if (str.contains("a=1.50") && str.contains("b=2.50") && str.contains("c=3.50")) {
                System.out.println("Тест 8 пройден: Метод toString");
                passedTests++;
            } else {
                System.out.println("Тест 8 не пройден: Метод toString");
            }
        } catch (Exception e) {
            System.out.println("Тест 8 не пройден: " + e.getMessage());
        }

        // Итоги
        System.out.println("\n=== Результаты тестирования ===");
        System.out.println("Пройдено тестов: " + passedTests + " из " + totalTests);
        System.out.println("Успешность: " + (passedTests * 100 / totalTests) + "%");

        if (passedTests == totalTests) {
            System.out.println("\nВсе тесты пройдены успешно!");
        } else {
            System.out.println("\nНекоторые тесты не пройдены");
        }
    }
}
