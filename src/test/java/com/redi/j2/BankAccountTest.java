package com.redi.j2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void shouldStartWithCorrectAmount() {

        // given - the initial amount of money
        double money = 100.0;

        // when - we create the account
        BankAccount account = new BankAccount(money);

        // then - the money should be in the account
        assertEquals(100, account.getCurrentBalance(), "The initial balance is not being set correctly");
    }

    @Test
    void shouldAddDepositToBalance() {

        // given - an account with some money
        double money = 100.0;
        BankAccount account = new BankAccount(money);

        // and - an amount we want to deposit
        double deposit = 50.0;

        // when - we make the deposit
        account.depositMoney(deposit);

        // then - the money must be added to the current balance
        assertEquals(money+deposit, account.getCurrentBalance(), "The deposited amount must be added to the current balance");
    }

    @Test
    void shouldNotMakeDepositWithInvalidAmount() {

        // given - an account with some money
        double money = 100.0;
        BankAccount account = new BankAccount(money);

        // and - an amount we want to deposit
        double deposit = -50.0;

        // when - we make the deposit
        account.depositMoney(deposit);

        // then - the balance should not change
        assertEquals(money, account.getCurrentBalance(), "The deposit should not be performed with an invalid amount "+deposit);
    }

    @Test
    void shouldWithdrawMoneyIfThereIsEnoughBalance() {

        // given - an account with some money
        double money = 100.0;
        BankAccount account = new BankAccount(money);

        // and - an amount we want to withdraw
        double amount = 50.0;

        // when - we make the withdrawal
        double withdrawnMoney = account.withdrawMoney(amount);

        // then - the withdrawn amount is what we expected
        assertEquals(amount, withdrawnMoney, "The withdrawn amount is not correct");

        // and - the amount must be deducted from the balance
        assertEquals(money-amount, account.getCurrentBalance(), "The withdrawn amount must be deducted from the balance");
    }

    @Test
    void shouldNotWithdrawMoneyIfThereIsNotEnoughBalance() {

        // given - an account with some money
        double money = 100.0;
        BankAccount account = new BankAccount(money);

        // and - an amount we want to withdraw
        double amount = 100.1;

        // when - we make the withdrawal
        double withdrawnMoney = account.withdrawMoney(amount);

        // then - the withdrawal should not happen
        assertEquals(0, withdrawnMoney, "The withdrawal should not happen if there is not enough balance");

        // and - the balance should not change at all
        assertEquals(money, account.getCurrentBalance(), "Balance cannot be changed if withdrawal is rejected");
    }

    @Test
    void shouldNotWithdrawMoneyIfAmountIsInvalid() {

        // given - an account with some money
        double money = 100.0;
        BankAccount account = new BankAccount(money);

        // and - an amount we want to withdraw
        double amount = -100;

        // when - we make the withdrawal
        double withdrawnMoney = account.withdrawMoney(amount);

        // then - the withdrawal should not happen
        assertEquals(0, withdrawnMoney, "The withdrawal should not happen if the specified amount is negative");

        // and - the balance should not change at all
        assertEquals(money, account.getCurrentBalance(), "Balance cannot be changed if withdrawal is rejected");
    }
}