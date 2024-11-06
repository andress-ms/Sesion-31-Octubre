package models;

public class Bank {
    public void performOperations(BankAccount account) {
        account.deposit(1000);
        account.withdraw(200);
    }
}
