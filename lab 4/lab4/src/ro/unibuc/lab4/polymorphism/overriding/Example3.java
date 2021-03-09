package ro.unibuc.lab4.polymorphism.overriding;

public class Example3 {

    public static void main(String[] args) {

        BankAccount baseAccount = new BankAccount("Georgiana", 200, 1234, "BK");
        CheckingAccount checkingAccount = new CheckingAccount("Georgiana", 200, 1234, "BK", 15);
        SavingsAccount savingsAccount = new SavingsAccount("Georgiana", 200, 1234, "BK", 100, 15000);


        System.out.println(baseAccount);
        System.out.println(baseAccount.deposit(150));
        System.out.println(baseAccount.withdraw(50));

        System.out.println(checkingAccount);
        System.out.println(checkingAccount.deposit(150));
        System.out.println(checkingAccount.withdraw(50));

        System.out.println(savingsAccount);
        System.out.println(savingsAccount.deposit(150));
        System.out.println(savingsAccount.withdraw(50));

        //upcasting
        BankAccount account = new CheckingAccount("Alaa", 200, 1234, "BK", 15);
    }
}
