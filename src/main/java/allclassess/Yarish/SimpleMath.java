package allclassess.Yarish;

public class SimpleMath {

    //вычисление факториала
    public int factorial(int n) {
        if (n < 0) {
            return -1;
        }

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    //проверка на четность
    public boolean isEven(int n) {
        return n % 2 == 0;
    }

    //вычисление суммы чисел от 1 до n
    public int sumToN(int n) {
        if (n < 0) {
            return -1;
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    //проверка на положительное число
    public boolean isPositive(int n) {
        return n > 0;
    }
}