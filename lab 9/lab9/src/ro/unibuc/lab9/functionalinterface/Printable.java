package ro.unibuc.lab9.functionalinterface;

/**
 * Java Functional Interfaces:
 * -> The term Java functional interface was introduced in Java 8.
 * -> A functional interface in Java is an interface that contains only a single abstract
 * (unimplemented) method.
 * -> A functional interface can contain default and static methods which do have an
 * implementation, in addition to the single unimplemented method.
 * <p/>
 *
 * @FunctionalInterface - marks an interface as a FI.
 * Java compiler will throw an error when an interface marked with
 * @FunctionalInterface has more than one abstract methods.
 */
public interface Printable {

}
