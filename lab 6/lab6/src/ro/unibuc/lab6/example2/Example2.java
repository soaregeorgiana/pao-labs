package ro.unibuc.lab6.example2;

/**
 * A claas implementing an interface which inherits from multiple interfaces
 * must implement all methods from  the interface and its superinterfaces
 */
public class Example2 implements SubInterface {

    @Override
    public String abstractMethod() {
        return null;
    }

    @Override
    public String defaultMethod() {
        return "My Default";
    }
}
