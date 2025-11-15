package org.example;
import allclasses.bartasevich.generator.CourierGenerator;
import allclasses.bartasevich.generator.OrderGenerator;
import allclasses.bartasevich.model.Courier;
import allclasses.bartasevich.model.Order;
import allclasses.karachebanDI.StudyDesk;
import allclasses.mardanov.Transformer;

//TIP <h2> ДЛЯ ИСПОЛЬЗОВАНИЯ СВОЕГО КЛАССА ИМПОРТИРУЙТЕ ЕГО </h2>
// Пример импорта выше
//
// <h3>Перед началом работы гайс установите зависимости командой "mvn clean install"</h3>

public class Main {
    public static void main(String[] args) {

        karachebanDI();
        bartasevich();
        mardanov();

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

    private static void mardanov(){
        Transformer transformer1 = new Transformer();
        Transformer transformer2 = new Transformer("SuperBot", 2.5, true);
        System.out.println("\n***************** Марданов *********************");
        System.out.println("Трансформер 1: " + transformer1.toString());
        System.out.println("Трансформер 2: " + transformer2.toString());
        transformer1.setName("DefaultBot");
        transformer1.setMultiplier(1.5);
        transformer1.setActive(true);
        System.out.println("После изменений: " + transformer1.toString());
        System.out.println("Верхний регистр: " + transformer2.toUpperCase("hello world"));
        System.out.println("Реверс: " + transformer2.reverseString("hello"));
        System.out.println("Умножение: " + transformer2.multiplyNumber(10));
        int[] numbers = {1, 2, 3, 4, 5};
        int[] result = transformer2.doubleArrayValues(numbers);
        System.out.print("Массив преобразован: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Преобразований до сброса: " + transformer2.getTransformationCount());
        transformer2.resetCounter();
        System.out.println("Преобразований после сброса: " + transformer2.getTransformationCount());
        transformer2.setActive(false);
        System.out.println("Неактивный трансформер: " + transformer2.toUpperCase("test"));
    }
    //endregion
}
