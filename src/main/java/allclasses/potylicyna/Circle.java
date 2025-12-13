package allclasses.potylicyna;

public class Circle {
    //region Поля
    private String color = "white";
    private double radius = 1.0;
    private double price = 0.0;
    //endregion

    //region Конструкторы
    public Circle() {}

    public Circle(String color, double radius, double price) {
        this.color = color;
        this.radius = radius;
        this.price = price;
    }
    //endregion

    //region Методы
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public String getDescription() {
        return String.format("Круг: цвет=%s, радиус=%.1f см, площадь=%.1f кв.см",
                color, radius, calculateArea());
    }

    public void printPrice() {
        System.out.printf("Цена круга: %.2f руб\n", price);
    }
    //endregion

    //region Геттеры и сеттеры
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //endregion
}