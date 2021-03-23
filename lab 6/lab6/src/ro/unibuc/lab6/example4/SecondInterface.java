package ro.unibuc.lab6.example4;

public interface SecondInterface {
    String secondMethod();

    default void defaultMethod() {
        System.out.println("Default");
    }
}
