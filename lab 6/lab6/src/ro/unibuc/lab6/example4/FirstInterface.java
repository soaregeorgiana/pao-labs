package ro.unibuc.lab6.example4;

public interface FirstInterface {
    String firstMethod();

    default void defaultMethod(){
        System.out.println("Default");
    }
}
