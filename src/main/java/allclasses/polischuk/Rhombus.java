package allclasses.polischuk;

public class Rhombus {
    private double side;
    private double angle;

    public double getSide() {
        return side;
    }

    public double getAngle() {
        return angle;
    }

    public Rhombus() {
        this.side = 1;
        this.angle = 60;
    }

    public Rhombus(double side, double angle) {
        this.side = side;
        this.angle = angle;
    }

    public double getArea() {
        return side * side * Math.sin(Math.toRadians(angle));
    }

    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Сторона: " + side + "Угол: " + angle;
    }
}