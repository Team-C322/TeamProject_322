package allclasses.mardanov;

public class Transformer {
    private String name;
    private int transformationCount;
    private double multiplier;
    private boolean isActive;

    public Transformer() {
        this.name = "DefaultTransformer";
        this.transformationCount = 0;
        this.multiplier = 1.0;
        this.isActive = true;
    }

    public Transformer(String name, double multiplier, boolean isActive) {
        this.name = name;
        this.transformationCount = 0;
        this.multiplier = multiplier;
        this.isActive = isActive;
    }

    public String toUpperCase(String text) {
        if (!isActive) {
            return "Transformer is inactive";
        }
        transformationCount++;
        return text.toUpperCase();
    }

    public String reverseString(String text) {
        if (!isActive) {
            return "Transformer is inactive";
        }
        transformationCount++;
        return new StringBuilder(text).reverse().toString();
    }

    public double multiplyNumber(double number) {
        if (!isActive) {
            return -1;
        }
        transformationCount++;
        return number * multiplier;
    }

    public int[] doubleArrayValues(int[] array) {
        if (!isActive) {
            return new int[0];
        }
        transformationCount++;
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = (int)(array[i] * multiplier);
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTransformationCount() {
        return transformationCount;
    }

    public double getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(double multiplier) {
        this.multiplier = multiplier;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void resetCounter() {
        transformationCount = 0;
    }

    @Override
    public String toString() {
        return String.format("Transformer{name='%s', count=%d, multiplier=%.2f, active=%s}",
                name, transformationCount, multiplier, isActive);
    }
}
