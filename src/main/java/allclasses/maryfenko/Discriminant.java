package allclasses.maryfenko;

public class Discriminant {
    private double a;
    private double b;
    private double c;
    private double discriminantValue;

    public Discriminant() {
        this(0, 0, 0);
    }

    public Discriminant(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        calculateDiscriminant();
    }

    public double calculateDiscriminant() {
        this.discriminantValue = b * b - 4 * a * c;
        return this.discriminantValue;
    }

    public int getNumberOfRoots() {
        if (a == 0) {
            return 1;
        }

        if (discriminantValue > 0) {
            return 2;
        } else if (discriminantValue == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
        calculateDiscriminant();
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
        calculateDiscriminant();
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
        calculateDiscriminant();
    }

    public double getDiscriminantValue() {
        return discriminantValue;
    }

    @Override
    public String toString() {
        return String.format("Discriminant{a=%.2f, b=%.2f, c=%.2f, D=%.2f}", a, b, c, discriminantValue);
    }
}
