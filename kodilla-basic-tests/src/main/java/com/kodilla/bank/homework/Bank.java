package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;
    private int numberOfDevices;

    public Bank(int numberOfDevices) {
        this.numberOfDevices = numberOfDevices;
        this.cashMachines = new CashMachine[numberOfDevices];

        for (int i = 0; i < cashMachines.length; i++) {
            cashMachines[i] = new CashMachine();
        }
    }

    public int getNumberOfDevices() {
        return numberOfDevices;
    }

    public void addTransaction(int deviceNumber, int amount) {
        if (deviceNumber < cashMachines.length) {
            cashMachines[deviceNumber].addTransaction(amount);
        }
    }

    public int getTotalBalance() {
        int sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum = sum + cashMachines[i].getBalance();
        }
        return sum;
    }

    public int getTotalNumberOfDeposits() {
        int sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum = sum + cashMachines[i].getNumberOfDeposits();
        }
        return sum;
    }

    public int getTotalNumberOfWithdrawals() {
        int sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum = sum + cashMachines[i].getNumberOfWithdrawals();
        }

        return sum;

    }

    public double getTotalAverageDeposits() {
        if (this.cashMachines.length == 0) {
            return 0;
        }

        double sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum = sum + cashMachines[i].getAverageDeposit();
        }

        return sum / cashMachines.length;
    }

    public double getTotalAverageWithdrawals() {
        if (this.cashMachines.length == 0) {
            return 0;
        }

        double sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum = sum + cashMachines[i].getAverageWithdrawals();
        }

        return (sum / cashMachines.length) * -1;
    }
}
