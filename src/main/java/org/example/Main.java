package org.example;

import allclasses.bartasevich.generator.CourierGenerator;
import allclasses.bartasevich.generator.OrderGenerator;
import allclasses.bartasevich.model.Courier;
import allclasses.bartasevich.model.Order;
import allclasses.golovachev.Rectangle;
import allclasses.karachebanDI.StudyDesk;
import allclasses.patrushev.Triangle;
import allclasses.Yarish.SimpleMath;
import allclasses.egarmina.Oval;

//TIP <h2> ДЛЯ ИСПОЛЬЗОВАНИЯ СВОЕГО КЛАССА ИМПОРТИРУЙТЕ ЕГО </h2>
// Пример импорта выше
//
// <h3>Перед началом работы гайс установите зависимости командой "mvn clean install"</h3>

public class Main {
    public static void main(String[] args) {

        karachebanDI();
        bartasevich();
        golovachevClassShowCase();
        patrushevClassShowCase();
        Yarish();
        egarmina();
    }

    // region Методы студентов
    // Пример оформления смотрите тут
    private static void karachebanDI() {

        StudyDesk desk = new StudyDesk("Стол", 1425232, 11000, 200, 100, 70);

        System.out.println("*********************************");
        System.out.println("Характеристики стола");
        System.out.println(desk.ToString());
        System.out.println("Посмотрите цену в USD");
        desk.ShowPrice("USD");
        System.out.println("Для покупки свяжитесь со мной");
        desk.ContactToBuy();
    }

    private static void bartasevich() {
        Courier courier = CourierGenerator.getDefault();
        Order order = OrderGenerator.getOrderSomeDataWithTwoColors();
        System.out.println("\n***************** Бартасевич И. Г. *********************");
        System.out.println("\nИнформация о заказе:");
        System.out.println(order.toString());
    }

    private static void golovachevClassShowCase() {
        Rectangle rect = new Rectangle(1.5, 4);

        System.out.println("*********************************");
        System.out.println("Характеристики прямоугольника");
        System.out.println(rect.toString());
        System.out.println("Площадь прямоугольника");
        System.out.println(rect.GetArea());
        System.out.println("Периметр прямоугольника");
        System.out.println(rect.GetPerimetr());
    }

    private static void patrushevClassShowCase() {
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println("*********************************");
        System.out.println("Характеристики треугольника");
        System.out.println(triangle.toString());
        System.out.println("Периметр треугольника:");
        System.out.println("P = " + triangle.getPerimeter());
        System.out.println("Площадь треугольника:");
        System.out.println("S = " + triangle.getArea());
        System.out.println("Для использования свяжитесь со мной");
        System.out.println("Автор: Патрушев");
    }

    private static void Yarish(){
        SimpleMath math = new SimpleMath();
        System.out.println("\n**************************************");
        System.out.println("Демонстрация работы класса SimpleMath:");
        System.out.println("\n1. Вычисление факториала:");
        System.out.println("Факториал 5 = " + math.factorial(5));
        System.out.println("Факториал 2 = " + math.factorial(2));
        System.out.println("\n2. Проверка четности:");
        System.out.println("Число 4 четное? " + math.isEven(4));
        System.out.println("Число 7 четное? " + math.isEven(7));
        System.out.println("\n3. Сумма чисел от 1 до N:");
        System.out.println("Сумма чисел от 1 до 7 = " + math.sumToN(7));
        System.out.println("\n4. Проверка положительности:");
        System.out.println("Число 10 положительное? " + math.isPositive(10));
        System.out.println("Число -3 положительное? " + math.isPositive(-3));
        System.out.println("**************************************");
    }

    private static void egarmina() {
        Oval oval = new Oval(3, 2);
        Oval circle = new Oval(4, 4); // частный случай - круг

        System.out.println("*********************************");
        System.out.println("Характеристики овала");
        System.out.println(oval.toString());
        System.out.println("Площадь овала: " + oval.getArea());
        System.out.println("Периметр овала: " + oval.getPerimeter());

        System.out.println("\nХарактеристики круга (частный случай овала)");
        System.out.println(circle.toString());
        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Периметр круга: " + circle.getPerimeter());
        System.out.println("Автор: Егармина");
    }

    // endregion
}
