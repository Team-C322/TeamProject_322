package kotelnikovTests;

import allclasses.kotelnikov.PiggyBank;
import org.junit.Test;
import static org.junit.Assert.*;

public class PiggyBankTest {

    @Test
    public void testAddMoney() {
        PiggyBank bank = new PiggyBank("Тестовый пользователь");
        bank.addMoney(100.0);
        assertEquals(100.0, bank.getBalance(), 0.001); // 0.001 - погрешность для double
    }

    @Test
    public void testTakeMoney() {
        PiggyBank bank = new PiggyBank("Тестовый пользователь");
        bank.addMoney(200.0);
        double taken = bank.takeMoney(50.0);
        assertEquals(50.0, taken, 0.001);
        assertEquals(150.0, bank.getBalance(), 0.001);
    }

    @Test
    public void testTakeMoneyMoreThanBalance() {
        PiggyBank bank = new PiggyBank("Тестовый пользователь");
        bank.addMoney(100.0);
        double taken = bank.takeMoney(200.0);
        assertEquals(0.0, taken, 0.001);
        assertEquals(100.0, bank.getBalance(), 0.001);
    }

    @Test
    public void testAddNegativeMoney() {
        PiggyBank bank = new PiggyBank("Тестовый пользователь");
        bank.addMoney(50.0);
        bank.addMoney(-10.0);
        assertEquals(50.0, bank.getBalance(), 0.001);
    }
}