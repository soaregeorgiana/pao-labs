package ro.unibuc.lab6.example3;

public interface SuperInterfaceTwo {
    Double abstractMethod();

    default Double defaultMethod() {
        return 0.2;
    }
}
