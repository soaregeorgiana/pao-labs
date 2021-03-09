package ro.unibuc.lab4.abstractclasses;

public class Example5 {

    public static void main(String[] args) {

        Bank b;
        b = new Ing();
        b.configureInterestRate();
        b.displayInterestRate();

        b = new Bcr();
        b.configureInterestRate();
        b.displayInterestRate();
    }
}
