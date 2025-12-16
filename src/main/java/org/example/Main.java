package org.example;
import allclasses.bartasevich.generator.CourierGenerator;
import allclasses.bartasevich.generator.OrderGenerator;
import allclasses.bartasevich.model.Courier;
import allclasses.bartasevich.model.Order;
import allclasses.karachebanDI.StudyDesk;
import allclasses.miusskii.MiusskiiClass;

//TIP <h2> ДЛЯ ИСПОЛЬЗОВАНИЯ СВОЕГО КЛАССА ИМПОРТИРУЙТЕ ЕГО </h2>
// Пример импорта выше
//
// <h3>Перед началом работы гайс установите зависимости командой "mvn clean install"</h3>

public class Main {
    public static void main(String[] args) {

        karachebanDI();
        bartasevich();
        miusskii();

    }
    //region Методы студентов
        // Пример оформления смотрите тут
    private static void miusskii(){

        System.out.println("\n***************** МИУССКИЙ Е. А. *********************");

        MiusskiiClass a = new MiusskiiClass();

        a.addLanguage("JavaScript");
        a.addLanguage("Java");
        a.addLanguage("HTML");

        System.out.println("Список веб-языков:");
        for (String lang : a.getAll()) {
            System.out.println("- " + lang);
        }

        // Проверка наличия
        System.out.println("\nПроверка языка Java:");
        if (a.containsLanguage("Java")) {
            System.out.println("Java найден!");
        } else {
            System.out.println("Java не найден.");
        }

        System.out.println("\nПроверка языка PHP:");
        if (a.containsLanguage("PHP")) {
            System.out.println("PHP найден!");
        } else {
            System.out.println("PHP не найден.");
        }
}



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
}
