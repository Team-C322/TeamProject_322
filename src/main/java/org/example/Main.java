package org.example;
import allclasses.karachebanDI.StudyDesk;
import allclasses.patrushev.Triangle;

//TIP <h2> ДЛЯ ИСПОЛЬЗОВАНИЯ СВОЕГО КЛАССА ИМПОРТИРУЙТЕ ЕГО </h2>
// Пример импорта выше
//
// <h3>Перед началом работы гайс установите зависимости командой "mvn clean install"</h3>

public class Main {
    public static void main(String[] args) {

        karachebanDI();
        patrushevClassShowCase();

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
    //endregion
}
