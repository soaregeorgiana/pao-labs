package ro.unibuc.lab4.polymorphism.overriding;

/**
 * Dynamic Polymorphism = OVERRIDING
 * Rules for Method Overriding
 * - The method must have the same name as in the super class
 * - The method must have the same parameter as in the super class.
 * - There must be an IS-A relationship (inheritance).
 * - THe return type must the same or a more specific one
 * - The access modifier could be the same or a more public one (protected -> protected/public)
 * <p>
 * Final methods cannot be overridden
 */
public class BankAccount {

    protected String owner;
    protected double balance;
    protected int number;
    protected final String bankPrefix;

    public BankAccount(String owner, double balance, int number, String bankPrefix) {
        this.owner = owner;
        this.balance = balance;
        this.number = number;
        this.bankPrefix = bankPrefix;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getBankPrefix() {
        return bankPrefix;
    }

    protected double deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
        return balance;
    }

    protected double withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
        return balance;
    }

    public final String computeIban() {
        return bankPrefix + number;
    }

    @Override
    public String toString() {
        return "Bank account details: " + "owner= " + owner + ", balance= " + balance + ",IBAN " + computeIban();
    }
}
