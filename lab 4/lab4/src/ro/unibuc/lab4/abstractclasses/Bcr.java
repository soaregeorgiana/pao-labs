package ro.unibuc.lab4.abstractclasses;

public class Bcr extends Bank {

    private String salut;

    @Override
    public int configureInterestRate() {
        interestRate = 8;
        return interestRate;
    }
}
