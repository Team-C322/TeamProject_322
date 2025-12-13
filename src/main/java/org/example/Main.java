package org.example;
import allclasses.bartasevich.generator.CourierGenerator;
import allclasses.bartasevich.generator.OrderGenerator;
import allclasses.bartasevich.model.Courier;
import allclasses.bartasevich.model.Order;
import allclasses.karachebanDI.StudyDesk;
import allclasses.balova.OpticsCalculator;

//TIP <h2> ДЛЯ ИСПОЛЬЗОВАНИЯ СВОЕГО КЛАССА ИМПОРТИРУЙТЕ ЕГО </h2>
// Пример импорта выше
//
// <h3>Перед началом работы гайс установите зависимости командой "mvn clean install"</h3>

public class Main {
    public static void main(String[] args) {

        karachebanDI();
        bartasevich();
        balova();

    }
    //region Методы студентов
    // Пример оформления смотрите тут
    private static void karachebanDI(){

        StudyDesk desk = new StudyDesk("Стол", 1425232, 11000, 200, 100, 70);

        System.out.println("*********************************");
        System.out.println("Характеристики стола");
        System.out.println(desk.ToString());
        System.out.println("Посмотрите цену в USD");
        desk.ShowPrice("USD");
        System.out.println("Для покупки свяжитесь со мной");
        desk.ContactToBuy();
    }

    private static void bartasevich(){
        Courier courier = CourierGenerator.getDefault();
        Order order = OrderGenerator.getOrderSomeDataWithTwoColors();
        System.out.println("\n***************** Бартасевич И. Г. *********************");
        System.out.println("\nИнформация о заказе:");
        System.out.println(order.toString());
    }

    private static void balova() {
        System.out.println("\n***************** Балова *********************");
        System.out.println("Расчеты оптических систем\n");

        System.out.println("Предмет перед собирающей линзой (30 см, +10 дптр)");
        OpticsCalculator.solveProblem(30.0, 10.0);
        System.out.println();

        System.out.println("Предмет внутри фокуса собирающей линзы (5 см, +10 дптр)");
        OpticsCalculator.solveProblem(5.0, 10.0);
        System.out.println();

        System.out.println("Предмет перед рассеивающей линзой (20 см, -5 дптр)");
        OpticsCalculator.solveProblem(20.0, -5.0);
        System.out.println();
    }
    //endregion
}
