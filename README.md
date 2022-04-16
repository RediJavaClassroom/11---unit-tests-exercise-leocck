# [Class 11 - Unit Tests Exercise](https://redi-school.github.io/intermediate-java/11-software-testing/)

## Tasks
  
### Exercise 1 - Testing a Method

Given the following method specification, create tests **before** implementing it (TDD). 

- Inside the `Main` class, write the method `hasDuplicates` that receives a List of Integers and returns a boolean
    - **_Hint_**: you can use create a `Set` with the elements from the List and use it to check if the size changed ;)

Use the provided example tests as a base and follow the same naming/structure convention.

### Exercise 2 - Testing a Class

Given the following class specification, create tests **before** implementing it (TDD).

- Class `BankAccount`
    - Constructor that receives the starting balance (amount of money in the account)
    - Method `getCurrentBalance`, which should return the current balance
    - Method `depositMoney`, which receives an amount and adds it to the current balance
    - Method `withdrawMoney`, which deducts the amount from the balance and returns it
        - In case there is not enough money in the account, it should not deduct any money and return zero

Start by copying the placeholder code below to your new class, then create the corresponding `BankAccountTests` class, and have fun!

```java
public class BankAccount {

    public BankAccount(double balance) {
        
    }
    
    public double getCurrentBalance() {
        return 0;
    }
    
    public void depositMoney(double amount) {
        
    }
    
    public double withdrawMoney(double amount) {
        return 0;
    }
}
```

## Want a Challenge? (Optional)
- Create another class called `MoneyTransferTransaction` (using TDD)
  - Implement the method `boolean transferMoney(BankAccount source, BankAccount destination, double amount)`, which transfers money from one account to another
  - Create tests for the _"happy path"_ and _"edge cases"_.
