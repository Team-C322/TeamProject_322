package org.example;

import allclasses.Budykin.Counter;
import allclasses.Statsyuk.Person;
import allclasses.bartasevich.generator.CourierGenerator;
import allclasses.bartasevich.generator.OrderGenerator;
import allclasses.bartasevich.model.Courier;
import allclasses.bartasevich.model.Order;
import allclasses.egarmina.Oval;
import allclasses.golovachev.Rectangle;
import allclasses.karachebanDI.StudyDesk;
import allclasses.mardanov.Transformer;
import allclasses.smorgun.Cat;
import allclasses.kornilov.Virmash;
import allclasses.kotelnikov.PiggyBank;
import allclasses.patrushev.Triangle;
import allclasses.Yarish.SimpleMath;
import allclasses.egarmina.Oval;
import allclasses.mardanov.Transformer;
import allclasses.miusskii.MiusskiiClass;
import allclasses.shchegoleva.Trapezium;
import allclasses.polischuk.Rhombus;
import allclasses.stepacheva.DancePair;
import allclasses.potylicyna.Circle;

//TIP <h2> ДЛЯ ИСПОЛЬЗОВАНИЯ СВОЕГО КЛАССА ИМПОРТИРУЙТЕ ЕГО </h2>
// Пример импорта выше
//
// <h3>Перед началом работы гайс установите зависимости командой "mvn clean install"</h3>

public class Main {
    public static void main(String[] args) {
        shchegoleva();
        karachebanDI();
        bartasevich();
        smorgun();
        golovachevClassShowCase();
        patrushevClassShowCase();
        budykinClassShowCase();
        Yarish();
        egarmina();
        mardanov();
        kotelnikov();
        statsyuk();
        kornilov();
        miusskii();
        polischukClassShowCase();
        stepchevaClassShowCase();
        potylicynaMethod();
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
    private static void miusskii(){
    System.out.println("\n***************** МИУССКИЙ Е. А. *********************");

        MiusskiiClass a = new MiusskiiClass();

        // Добавление языков
        a.addLanguage("JavaScript");
        a.addLanguage("Java");
        a.addLanguage("HTML");
        
        // Попытка добавить дубликат
        a.addLanguage("Java");
        
        System.out.println("Всего языков: " + a.getAll().size());

        System.out.println("\nСписок веб-языков:");
        for (String lang : a.getAll()) {
            System.out.println("- " + lang);
        }

        // Проверка наличия
        System.out.println("\nПроверка языков:");
        checkLanguage(a, "Java");
        checkLanguage(a, "PHP");
        checkLanguage(a, "JavaScript");
        checkLanguage(a, "Python");
        
        // Проверка на пустой язык (с обработкой исключения)
        System.out.println("\nПопытка добавить пустой язык:");
        try {
            a.addLanguage("");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    // Вспомогательный метод для проверки языка
    private static void checkLanguage(MiusskiiClass mc, String language) {
        System.out.print(language + ": ");
        if (mc.containsLanguage(language)) {
            System.out.println("найден!");
        } else {
            System.out.println("не найден.");
        }
    }


    private static void stepchevaClassShowCase() {
        System.out.println("\n***************** Степчева *********************");

        DancePair pair = new DancePair("Алиса", "Георгий", "Ча-ча-ча");

        System.out.println("Информация о паре:");
        System.out.println(pair);

        System.out.println("Пара полная? → " + pair.isCompletePair());

        System.out.println("Мини-оценка пары:");
        System.out.println("Балл пары: " + pair.evaluate());

        System.out.println("Автор: Степчева");
    }

    private static void bartasevich() {
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

    private static void statsyuk(){
        Person person = new Person("Oleg", 18, "SPb");
        System.out.println("\n***************** Стацюк Дмитрий *********************");
        System.out.println("Сейчас человеку лет: " + person.getAge());
        System.out.println("Празднуем др!");
        person.celebrateBirthday();
        System.out.println("Сейчас человеку лет: " + person.getAge());
        System.out.println("Вся информация о человеке: ");
        System.out.println(person.getInfo());
    }
    private static void shchegoleva() {
        Trapezium tr = new Trapezium(2.0, 6.0, 3.0, 4.0, 2.5);

        System.out.println("*********************************");
        System.out.println("Характеристики трапеции");
        System.out.println(tr.toString());
        System.out.println("Периметр трапеции:");
        System.out.println("P = " + tr.getPerimeter());
        System.out.println("Площадь трапеции:");
        System.out.println("S = " + tr.getArea());
        System.out.println("Для использования свяжитесь со мной");
        System.out.println("Автор: Щеголёва");
    }

    private static void kornilov(){
        Virmash virmash = new Virmash("user0", "1234", "Ubuntu", 1024d, 2048d);
        System.out.println("\n***************** Корнилов Лев *********************");
        System.out.println("Информация о виртуальной машине:");
        virmash.ShowInfo();
        System.out.println("Данные о иртуальной машине в строку: " + virmash.ToString());
        System.out.println("Конвертированный в Kб размер диска: " + virmash.ConvertDiskSize("Kb"));

    }

    private static void polischukClassShowCase() {
        Rhombus rhombus = new Rhombus(5, 60);

        System.out.println("************** Полищук А.Ф. ***************");
        System.out.println("Характеристики ромба");
        System.out.println(rhombus.toString());
        System.out.println("Площадь ромба");
        System.out.println(rhombus.getArea());
        System.out.println("Периметр ромба");
        System.out.println(rhombus.getPerimeter());
    }
    public static void potylicynaMethod() {
        System.out.println("\n*****************  Потылицына З. С. *********************");
        System.out.println("Демонстрация работы класса Circle:");
        System.out.println("Характеристики круга:");
        Circle circle = new Circle("purple", 7.5, 300);
        System.out.println(circle.getDescription());
        circle.printPrice();
        System.out.printf("Длина окружности: %.1f см\n", circle.calculateCircumference());
    }
    // endregion
}
