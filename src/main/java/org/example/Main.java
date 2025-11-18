package org.example;

import allclasses.Budykin.Counter;
import allclasses.bartasevich.generator.CourierGenerator;
import allclasses.bartasevich.generator.OrderGenerator;
import allclasses.bartasevich.model.Courier;
import allclasses.bartasevich.model.Order;
import allclasses.golovachev.Rectangle;
import allclasses.karachebanDI.StudyDesk;
import allclasses.patrushev.Triangle;

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
        budykinClassShowCase();
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

    private static void budykinClassShowCase(){
        System.out.println("\n***************** Будыкин Н. К. *********************");
        Counter calc = new Counter();
        System.out.println("\nНачало работы");
        System.out.println("Начальное значение счетчика:");
        System.out.println("value = " + calc.getValue());
        System.out.println("Добавляем 10:");
        calc.add(10);
        System.out.println("value = " + calc.getValue());
        System.out.println("Умножаем на 2:");
        calc.multiply(2);
        System.out.println("value = " + calc.getValue());
        System.out.println("Вычитаем 5:");
        calc.subtract(5);
        System.out.println("value = " + calc.getValue());
        System.out.println("Делим на 3:");
        calc.divide(3);
        System.out.println("value = " + calc.getValue());
        System.out.println("Сбрасываем счетчик:");
        calc.reset();
        System.out.println("value = " + calc.getValue());
        System.out.println("\nАвтор: Будыкин");
    }
    // endregion
}
