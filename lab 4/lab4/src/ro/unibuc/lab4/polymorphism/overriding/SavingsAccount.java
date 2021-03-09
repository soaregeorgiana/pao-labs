package ro.unibuc.lab4.polymorphism.overriding;

public class SavingsAccount extends BankAccount {

    private double minBalance;
    private double maxBalance;


    public SavingsAccount(String owner, double balance, int number, String bankPrefix, double minBalance, double maxBalance) {
        super(owner, balance, number, bankPrefix);
        this.minBalance = minBalance;
        this.maxBalance = maxBalance;
    }

    @Override
    public double deposit(double amount) {
        if (amount > 0) {
            double current = balance + amount;
            if (current >= minBalance && current <= maxBalance) {
                balance = current;
            }
        }
        return balance;
    }

    @Override
    public String toString() {
        return super.toString() + ", minBalance " + minBalance + ", maxBalance " + maxBalance;
    }
}
