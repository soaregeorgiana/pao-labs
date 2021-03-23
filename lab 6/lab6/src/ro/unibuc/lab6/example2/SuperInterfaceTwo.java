package ro.unibuc.lab6.example2;

public interface SuperInterfaceTwo {
    String abstractMethod();

    default String defaultMethod() {
        return "Parent default implementation";
    }

    default String myDefaultMethod() {
        return "Lets keep this one default";
    }
}
