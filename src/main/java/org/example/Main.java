package org.example;
import allclasses.bartasevich.generators.CourierGenerator;
import allclasses.bartasevich.generators.OrderGenerator;
import allclasses.bartasevich.model.Courier;
import allclasses.bartasevich.model.Order;
import allclasses.karachebanDI.StudyDesk;
import allclasses.kotelnikov.PiggyBank;

//TIP <h2> ДЛЯ ИСПОЛЬЗОВАНИЯ СВОЕГО КЛАССА ИМПОРТИРУЙТЕ ЕГО </h2>
// Пример импорта выше
//
// <h3>Перед началом работы гайс установите зависимости командой "mvn clean install"</h3>

public class Main {
    public static void main(String[] args) {

        karachebanDI();
        bartasevich();
        kotelnikov();
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
    private static void kotelnikov(){
        System.out.println("\n***************** Котельников *********************");
        PiggyBank myPiggyBank = new PiggyBank("Egor");
        System.out.println("Тестируем копилку");
        myPiggyBank.addMoney(1000.0);
        myPiggyBank.addMoney(500.50);
        myPiggyBank.takeMoney(300.0);
        myPiggyBank.printInfo();
        System.out.println("\nПроверка обработки ошибок");
        myPiggyBank.addMoney(-100.0);
        myPiggyBank.takeMoney(2000.0);
        System.out.println("\nФинальный баланс: $" + myPiggyBank.getBalance() + ".");
    }
    //endregion
}
