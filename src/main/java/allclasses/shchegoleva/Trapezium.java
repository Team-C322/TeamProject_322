package allclasses.shchegoleva;

public class Trapezium {

    private double topBase;
    private double bottomBase;
    private double leftLeg;
    private double rightLeg;
    private double height;

    // Геттеры
    public double getTopBase() {
        return topBase;
    }

    public double getBottomBase() {
        return bottomBase;
    }

    public double getLeftLeg() {
        return leftLeg;
    }

    public double getRightLeg() {
        return rightLeg;
    }

    public double getHeight() {
        return height;
    }

    // Конструктор без параметров
    public Trapezium() {
        this.topBase = 2.0;
        this.bottomBase = 4.0;
        this.leftLeg = 3.0;
        this.rightLeg = 3.0;
        this.height = 2.5;
    }

    // Конструктор с параметрами
    public Trapezium(double topBase, double bottomBase, double leftLeg,
                     double rightLeg, double height) {
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        this.height = height;
    }

    // Площадь
    public double getArea() {
        return (topBase + bottomBase) * height / 2.0;
    }

    // Периметр
    public double getPerimeter() {
        return topBase + bottomBase + leftLeg + rightLeg;
    }

    @Override
    public String toString() {
        return "Верхнее основание: " + topBase +
                ", Нижнее основание: " + bottomBase +
                ", Левая сторона: " + leftLeg +
                ", Правая сторона: " + rightLeg +
                ", Высота: " + height;
    }
}
