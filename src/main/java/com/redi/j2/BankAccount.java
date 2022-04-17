package com.redi.j2;

public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getCurrentBalance() {
        return balance;
    }

    public void depositMoney(double amount) {
        balance += amount;
    }

    public double withdrawMoney(double amount) {
        if (amount <= 0 || balance < amount) return 0;
        balance -= amount;
        return amount;
    }
}
