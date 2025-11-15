package allclasses.zhuravelPS;

public class Charger {
    private final String model;
    private final int power;
    private boolean isConnected;

    public Charger(String model, int power) {
        this.model = model;
        this.power = power;
        this.isConnected = false;
    }

    public void connect() {
        if (!isConnected) {
            isConnected = true;
            System.out.println(model + " подключено к сети.");
        } else {
            System.out.println(model + " уже было подключено.");
        }
    }

    public double calculateChargingTime(int batteryCapacity) {
        if (!isConnected) {
            System.out.println("Сначала подключите зарядное устройство!");
            return -1;
        }
        return (double) batteryCapacity / power;
    }

    public String getModel() {
        return model;
    }

    public boolean isConnected() {
        return isConnected;
    }
}