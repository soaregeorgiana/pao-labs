package ro.unibuc.pao.inheritance;

/**
 * Inheritance is a process of defining a new class based on an existing class by extending its common data members and methods.
 * Benefits:
 * re-usability of code so that a class has to write only the particular features
 * and rest of the common attributes and behaviours can be extended from the base class
 */
public class Car {

    protected int wheels;
    protected int doors;

    public Car() {
        this.wheels = 4;
        this.doors = 4;
    }

    public void consumeFuel() {
        System.out.println("The car consumes fuel");
    }
}
