package org.example;
import allclasses.bartasevich.generator.CourierGenerator;
import allclasses.bartasevich.generator.OrderGenerator;
import allclasses.bartasevich.model.Courier;
import allclasses.bartasevich.model.Order;
import allclasses.karachebanDI.StudyDesk;
import allclasses.smorgun.Cat;

//TIP <h2> ДЛЯ ИСПОЛЬЗОВАНИЯ СВОЕГО КЛАССА ИМПОРТИРУЙТЕ ЕГО </h2>
// Пример импорта выше
//
// <h3>Перед началом работы гайс установите зависимости командой "mvn clean install"</h3>

public class Main {
    public static void main(String[] args) {

        karachebanDI();
        bartasevich();
        smorgun();

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

    private static void smorgun()
    {
    System.out.println("\n*****************Сморгун*********************");
    System.out.println("\nИнформация о котах:");
    Cat[] cats = {
        new Cat("Барсик", 3, "Мужской", "Британский"),
        new Cat("Мурка", 2, "Женский", "Сиамская"), 
        new Cat("Васька", 4, "Мужской", "Дворовый")
    };

    for (int i = 0; i < cats.length; i++) {
        System.out.println("\nКот №" + (i + 1) + ":");
        cats[i].displayInfo();
        cats[i].meow();
    }
    
    System.out.println("\nДополнительная информация:");
    System.out.println("Самый старший кот: " + cats[2].getName() + " (" + cats[2].getAge() + " года)");
    System.out.println("Единственная кошка: " + cats[1].getName() + " (" + cats[1].getBreed() + ")");
    }

    //endregion

    
}
