package com.redi.j2;

public class MoneyTransferTransaction {

    public boolean transferMoney(BankAccount source, BankAccount destination, double amount) {
        if (amount <=0 || source.getCurrentBalance() < amount) return false;
        destination.depositMoney(source.withdrawMoney(amount));
        return true;
    }
}
