package com.redi.j2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTransferTransactionTest {

    @Test
    void shouldMakeTransferForValidScenario() {

        // given two bank accounts with same initial balance
        double initialBalance = 100;
        BankAccount account1 = new BankAccount(initialBalance);
        BankAccount account2 = new BankAccount(initialBalance);

        // and - a money transfer transaction
        MoneyTransferTransaction transaction = new MoneyTransferTransaction();

        // and - the amount we want to transfer
        double amount = 30;

        // when - we try to transfer the money
        boolean success = transaction.transferMoney(account1, account2, amount);

        // then - the transaction should succeed
        assertTrue(success, "The transaction should work when scenario is valid");

        // and - the balances must be updated
        assertEquals(initialBalance-amount, account1.getCurrentBalance(), "Source account must have the amount deducted from its balance");
        assertEquals(initialBalance+amount, account2.getCurrentBalance(), "Destination account must have the amount credited to the balance");
    }

    @Test
    void shouldNotMakeTransferWithInvalidAmount() {

        // given two bank accounts with same initial balance
        double initialBalance = 100;
        BankAccount account1 = new BankAccount(initialBalance);
        BankAccount account2 = new BankAccount(initialBalance);

        // and - a money transfer transaction
        MoneyTransferTransaction transaction = new MoneyTransferTransaction();

        // and - the invalid amount
        double amount = -30;

        // when - we try to transfer the money
        boolean success = transaction.transferMoney(account1, account2, amount);

        // then - the transaction should fail
        assertFalse(success, "The transaction should not be made if amount if invalid "+amount);

        // and - the balances cannot be changed
        assertEquals(initialBalance, account1.getCurrentBalance(), "Balance of source account cannot be changed if transaction is rejected");
        assertEquals(initialBalance, account2.getCurrentBalance(), "Balance of destination account cannot be changed if transaction is rejected");
    }

    @Test
    void shouldNotMakeTransferIfSourceAccountDoesNotHaveEnoughBalance() {

        // given two bank accounts with same initial balance
        double initialBalance = 100;
        BankAccount account1 = new BankAccount(initialBalance);
        BankAccount account2 = new BankAccount(initialBalance);

        // and - a money transfer transaction
        MoneyTransferTransaction transaction = new MoneyTransferTransaction();

        // and - the amount we want to transfer
        double amount = 150;

        // when - we try to transfer the money
        boolean success = transaction.transferMoney(account1, account2, amount);

        // then - the transaction should fail
        assertFalse(success, "The transaction should not be made if source account does not have enough balance");

        // and - the balances cannot be changed
        assertEquals(initialBalance, account1.getCurrentBalance(), "Balance of source account cannot be changed if transaction is rejected");
        assertEquals(initialBalance, account2.getCurrentBalance(), "Balance of destination account cannot be changed if transaction is rejected");
    }
}