package allclasses.egarmina;

public class Oval {
    private double a; // большая полуось
    private double b; // малая полуось

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public Oval() {
        this.a = 1;
        this.b = 1;
    }

    public Oval(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getArea() {
        return Math.PI * a * b;
    }

    public double getPerimeter() {
        // Приближенная формула для периметра эллипса
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }

    @Override
    public String toString() {
        return "Большая полуось: " + a + " Малая полуось: " + b;
    }
}