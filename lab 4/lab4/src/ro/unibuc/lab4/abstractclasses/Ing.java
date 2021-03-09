package ro.unibuc.lab4.abstractclasses;

public class Ing extends Bank {

    @Override
    public int configureInterestRate() {
        interestRate = 7;
        return interestRate;
    }
}
