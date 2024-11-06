package models;

public class SavingsAccount extends BankAccount {
    private double interestRate = 0.02;

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }
    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal for: " + amount + "from sabings account. Current balance: "
                    + balance);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void applyInterest() {
        balance += balance * interestRate;
        System.out.println("Interest applied. Current balance: " + balance);
    }
}
