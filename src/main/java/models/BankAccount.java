package models;

abstract class BankAccount {
    protected double balance;

    public BankAccount() {
    }

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit amount: " + amount + "Current balance: " + balance);
    }

    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}
