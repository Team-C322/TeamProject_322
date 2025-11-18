package org.example;
import allclasses.bartasevich.generator.CourierGenerator;
import allclasses.bartasevich.generator.OrderGenerator;
import allclasses.bartasevich.model.Courier;
import allclasses.bartasevich.model.Order;
import allclasses.karachebanDI.StudyDesk;
import allclasses.Yarish.SimpleMath;

//TIP <h2> ДЛЯ ИСПОЛЬЗОВАНИЯ СВОЕГО КЛАССА ИМПОРТИРУЙТЕ ЕГО </h2>
// Пример импорта выше
//
// <h3>Перед началом работы гайс установите зависимости командой "mvn clean install"</h3>

public class Main {
    public static void main(String[] args) {

        karachebanDI();
        bartasevich();
        Yarish();

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
    //endregion

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
}
