package ro.unibuc.lab6.example4;

/**
 * A java class can implement multiple Java interfaces.
 * In that case the class must implement all the methods declared in all the interfaces implemented
 * <p>
 * If a Java class implements multiple Java interfaces,
 * there is a risk that some of these interfaces may contain methods with the same signature.
 * Since a Java class can only implement a method with a given signature once, this might lead to some implementation problems
 */
public class Example4 implements FirstInterface, SecondInterface {


    @Override
    public String firstMethod() {
        return null;
    }

    @Override
    public String secondMethod() {
        return null;
    }

    @Override
    public void defaultMethod() {

    }
}
