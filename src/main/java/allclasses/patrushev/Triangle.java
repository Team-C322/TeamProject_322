package allclasses.patrushev;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public double getArea() {
        double p = getPerimeter() / 2.0; 
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double getA() { return a; }
    public double getB() { return b; }
    public double getC() { return c; }

    @Override
    public String toString() {
        return "Triangle{" + a + ", " + b + ", " + c + "}";
    }
}