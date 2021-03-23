package ro.unibuc.lab6.functionalinterfaces;

/**
 * The term Java functional interface was introduced in Java 8
 * A functional interface in Java is an interface that contains only a single abstract method
 * A functional interface can contain default and static methods which do have an implementation,
 * in addition to the single unimplemented method
 */

@java.lang.FunctionalInterface
public interface FunctionalInterface {

    void execute();

    default void print(String text) {
        System.out.println(text);
    }

    static void print(String name, String text) {
        System.out.println(name + ": " + text);
    }
}
