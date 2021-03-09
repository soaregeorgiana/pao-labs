package ro.unibuc.lab4.abstractclasses;

/**
 * Abstraction is a process of hiding the implementation details and showing only functionality to the user.
 * <p>
 * A class which is declared as abstract is known as an abstract class:
 * - It can have abstract and non-abstract methods
 * - It cannot be instantiated
 * - It can have constructors and static methods also
 * - It can have final methods which will force the subclass not to change the body of the method
 */
public abstract class Bank {

    protected int interestRate;

    public Bank() {
        System.out.println("Bank constructor from the abstract class");
    }

    public void displayInterestRate() {
        System.out.println("Interest rate: " + interestRate + "%");
    }

    public abstract int configureInterestRate();

    public static void myStaticMethod() {
        System.out.println("This is just for demo purpose");
    }
}
