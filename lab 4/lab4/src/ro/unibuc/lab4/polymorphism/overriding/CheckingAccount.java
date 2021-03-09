package ro.unibuc.lab4.polymorphism.overriding;

public class CheckingAccount extends BankAccount {

    private double fee;

    public CheckingAccount(String owner, double balance, int number, String bankPrefix, double fee) {
        //
        super(owner, balance, number, bankPrefix);
        this.fee = fee;
    }

    @Override
    public double withdraw(double amount) {
        if (fee > 0) {
            double amountPlusFee = amount + (amount * fee) / 100;
            if (balance >= amountPlusFee) {
                balance -= amountPlusFee;
            }
        } else {
            super.withdraw(amount);
        }
        return balance;
    }

    @Override
    public String toString() {
        return super.toString() + ", fee " + fee;
    }
}
