package ro.unibuc.lab6.example3;

public interface SuperInterfaceOne {

    String abstractMethod();

    default String defaultMethod() {
        return "Parent default implementation";
    }
}

