package allclasses.kotelnikov;

public class PiggyBank {
    private double savings;
    private String owner;
    private int transactionCount;

    public PiggyBank(String ownerName) {
        this.savings = 0.0;
        this.owner = ownerName;
        this.transactionCount = 0;
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            savings += amount;
            transactionCount++;
            System.out.println("Добавлено: $" + amount + ".");
        } else {
            System.out.println("Ошибка: сумма должна быть положительной!");
        }
    }

    public double takeMoney(double amount) {
        if (amount > 0 && amount <= savings) {
            savings -= amount;
            transactionCount++;
            System.out.println("Извлечено: $" + amount + ".");
            return amount;
        } else {
            System.out.println("Ошибка: недостаточно средств или неверная сумма!");
            return 0.0;
        }
    }

    public double getBalance() {
        return savings;
    }

    public void printInfo() {
        System.out.println("Владелец: " + owner);
        System.out.println("Баланс: $" + savings + ".");
        System.out.println("Количество операций: " + transactionCount);
    }
}