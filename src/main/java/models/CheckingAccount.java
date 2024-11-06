package models;

public class CheckingAccount extends BankAccount {
    private double overdraftLimit = 500;

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawal for " + amount + " from checking account. Current balance: " + balance);
        } else {
            System.out.println("Insufficient funds");
        }
    }
}
