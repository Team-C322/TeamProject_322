package allclasses.Budykin;

public class Counter implements ICounter {
    private int value;

    public Counter() {
        value = 0;
    }

    @Override
    public void increment() {
        value++;
    }

    @Override
    public void add(int amount) {
        value += amount;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void reset() {
        value = 0;
    }
}
