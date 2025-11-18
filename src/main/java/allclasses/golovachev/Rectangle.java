package allclasses.golovachev;

public class Rectangle {
    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public Rectangle() {
        this.a = 1;
        this.b = 1;
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double GetArea() {
        return a * b;
    }

    public double GetPerimetr() {
        return (a + b) * 2;
    }

    @Override
    public String toString() {
        return "Ширина: " + a + "Высота: " + b;
    }

}
