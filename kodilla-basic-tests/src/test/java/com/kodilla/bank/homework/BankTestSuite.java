package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    @Test
    public void shouldReturnNumberDevices() {
        Bank bank = new Bank(4);
        assertEquals(4, bank.getNumberOfDevices());
    }

    @Test
    public void shouldCountNumberAllTransactionsEvenIfInvalidTransactionTriedToBeMade() {
        Bank bank = new Bank(4);

        bank.addTransaction(0, 60);
        bank.addTransaction(0, 80);
        bank.addTransaction(0, -100);
        bank.addTransaction(0, 20);

        bank.addTransaction(1, 80);
        bank.addTransaction(1, -200);
        bank.addTransaction(1, 70);
        bank.addTransaction(1, 20);

        bank.addTransaction(2, -50);
        bank.addTransaction(2, -100);
        bank.addTransaction(2, 150);
        bank.addTransaction(2, -10);

        bank.addTransaction(3, 20);
        bank.addTransaction(3, 30);
        bank.addTransaction(3, 40);
        bank.addTransaction(3, -60);

        assertEquals(13, bank.getTotalNumberOfDeposits() + bank.getTotalNumberOfWithdrawals());
    }

    @Test
    public void shouldCountTotalBalanceEvenIfInvalidTransactionTriedToBeMade() {
        Bank bank = new Bank(4);

        bank.addTransaction(0, 60);
        bank.addTransaction(0, 80);
        bank.addTransaction(0, -100);
        bank.addTransaction(0, 20);

        bank.addTransaction(1, 80);
        bank.addTransaction(1, -200);
        bank.addTransaction(1, 70);
        bank.addTransaction(1, 20);

        bank.addTransaction(2, -50);
        bank.addTransaction(2, -100);
        bank.addTransaction(2, 150);
        bank.addTransaction(2, -10);

        bank.addTransaction(3, 20);
        bank.addTransaction(3, 30);
        bank.addTransaction(3, 40);
        bank.addTransaction(3, -60);

        assertEquals(400, bank.getTotalBalance());
    }

    @Test
    public void shouldCountNumberAllDeposits() {
        Bank bank = new Bank(4);

        bank.addTransaction(0, 60);
        bank.addTransaction(0, 80);
        bank.addTransaction(0, -100);
        bank.addTransaction(0, 20);

        bank.addTransaction(1, 80);
        bank.addTransaction(1, -200);
        bank.addTransaction(1, 70);
        bank.addTransaction(1, 20);

        bank.addTransaction(2, -50);
        bank.addTransaction(2, -100);
        bank.addTransaction(2, 150);
        bank.addTransaction(2, -10);

        bank.addTransaction(3, 20);
        bank.addTransaction(3, 30);
        bank.addTransaction(3, 40);
        bank.addTransaction(3, -60);

        assertEquals(10, bank.getTotalNumberOfDeposits());
    }

    @Test
    public void shouldCountNumberAllWithdrawalsEvenIfInvalidTransactionTriedToBeMade() {
        Bank bank = new Bank(4);

        bank.addTransaction(0, 60);
        bank.addTransaction(0, 80);
        bank.addTransaction(0, -100);
        bank.addTransaction(0, 20);

        bank.addTransaction(1, 80);
        bank.addTransaction(1, -200);
        bank.addTransaction(1, 70);
        bank.addTransaction(1, 20);

        bank.addTransaction(2, -50);
        bank.addTransaction(2, -100);
        bank.addTransaction(2, 150);
        bank.addTransaction(2, -10);

        bank.addTransaction(3, 20);
        bank.addTransaction(3, 30);
        bank.addTransaction(3, 40);
        bank.addTransaction(3, -60);

        assertEquals(3, bank.getTotalNumberOfWithdrawals());
    }

    @Test
    public void shouldCalcAverageAllDeposits() {
        Bank bank = new Bank(4);

        bank.addTransaction(0, 60);
        bank.addTransaction(0, 80);
        bank.addTransaction(0, -100);
        bank.addTransaction(0, 20);

        bank.addTransaction(1, 80);
        bank.addTransaction(1, -200);
        bank.addTransaction(1, 70);
        bank.addTransaction(1, 20);

        bank.addTransaction(2, -50);
        bank.addTransaction(2, -100);
        bank.addTransaction(2, 150);
        bank.addTransaction(2, -10);

        bank.addTransaction(3, 20);
        bank.addTransaction(3, 30);
        bank.addTransaction(3, 40);
        bank.addTransaction(3, -60);

        assertEquals(72.5, bank.getTotalAverageDeposits(), 0.01);
    }

    @Test
    public void shouldCalcAverageAllWithdrawalsEvenIfInvalidTransactionTriedToBeMade() {
        Bank bank = new Bank(4);

        bank.addTransaction(0, 60);
        bank.addTransaction(0, 80);
        bank.addTransaction(0, -100);
        bank.addTransaction(0, 20);

        bank.addTransaction(1, 80);
        bank.addTransaction(1, -200);
        bank.addTransaction(1, 70);
        bank.addTransaction(1, 20);

        bank.addTransaction(2, -50);
        bank.addTransaction(2, -100);
        bank.addTransaction(2, 150);
        bank.addTransaction(2, -10);

        bank.addTransaction(3, 20);
        bank.addTransaction(3, 30);
        bank.addTransaction(3, 40);
        bank.addTransaction(3, -60);

        assertEquals(42.5, bank.getTotalAverageWithdrawals(), 0.01);
    }
}
