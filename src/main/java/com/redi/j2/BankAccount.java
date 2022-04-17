package com.redi.j2;

public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = Math.max(balance, 0);
    }

    public double getCurrentBalance() {
        return balance;
    }

    public void depositMoney(double amount) {
        if (amount <= 0) return;
        balance += amount;
    }

    public double withdrawMoney(double amount) {
        if (amount <= 0 || balance < amount) return 0;
        balance -= amount;
        return amount;
    }
}
