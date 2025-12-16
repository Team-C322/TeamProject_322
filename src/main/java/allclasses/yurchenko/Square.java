package allclasses.yurchenko;

public class Square {
    private double side;

    // Конструкторы
    public Square() {
        this.side = 1.0;
    }

    public Square(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Сторона квадрата должна быть положительным числом");
        }
        this.side = side;
    }

    // Геттеры и сеттеры
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Сторона квадрата должна быть положительным числом");
        }
        this.side = side;
    }

    // Методы для вычислений
    public double calculateArea() {
        return side * side;
    }

    public double calculatePerimeter() {
        return 4 * side;
    }

    public double calculateDiagonal() {
        return side * Math.sqrt(2);
    }

    // Методы для сравнения
    public boolean isEqual(Square other) {
        return Double.compare(this.side, other.side) == 0;
    }

    public boolean isLargerThan(Square other) {
        return this.side > other.side;
    }

    // Метод для масштабирования
    public void scale(double factor) {
        if (factor <= 0) {
            throw new IllegalArgumentException("Коэффициент масштабирования должен быть положительным");
        }
        this.side *= factor;
    }

    // Информационный метод
    public void printInfo() {
        System.out.printf("Квадрат со стороной: %.2f%n", side);
        System.out.printf("Площадь: %.2f%n", calculateArea());
        System.out.printf("Периметр: %.2f%n", calculatePerimeter());
        System.out.printf("Диагональ: %.2f%n", calculateDiagonal());
    }

    // Переопределение методов Object
    @Override
    public String toString() {
        return String.format("Square{side=%.2f, area=%.2f, perimeter=%.2f}",
                side, calculateArea(), calculatePerimeter());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Square square = (Square) obj;
        return Double.compare(square.side, side) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(side);
    }

    // Main метод для тестирования
    public static void main(String[] args) {
        Square square = new Square(5.0);
        square.printInfo();
    }
}