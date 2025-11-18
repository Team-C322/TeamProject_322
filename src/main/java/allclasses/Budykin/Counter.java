package allclasses.Budykin;

public class Counter implements ICounter {
    public double value;

    public Counter() {
        value = 0;
    }

    @Override
    public void divide(double amount){
        if (amount == 0){
            throw new ArithmeticException();
        }
        value /= amount;
    }

    @Override
    public void subtract(double amount){
        value -= amount;
    }

    @Override
    public void multiply(double amount) {
        value *= amount;
    }

    @Override
    public void add(int amount) {
        value += amount;
    }

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public void reset() {
        value = 0;
    }
}
