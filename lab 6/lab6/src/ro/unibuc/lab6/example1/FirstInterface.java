package ro.unibuc.lab6.example1;

/**
 * Interfaces:
 * are similar to a class
 * can contain
 * -> constants
 * -> abstract methods (no need to add explicitly the abstract keyword)
 * -> default implementation for methods (starting with java 8):
 * ---> Java 8 has added the concept of interface default methods to Java interfaces.
 * ---> An interface default method ca contain a default implementation of that method
 * ---> Classes that implement the interface but which contain no implementation for the default interface
 * ---> will then automatically get the default method implementation.
 * ---> We mark a method in an interface as a default one using the 'default' keyword
 * -> static methods with implementation
 * ---> Static methods do not depend on the need to  create object of a class
 * ---> We can refer them by the class itself.
 * ---> Static method in interfaces can be useful when we have some utility methods we would like to make available,
 * ---> which fit naturally into an interface related to the same responsibility.
 * -> private methods (starting with java 9)
 * are declared using Java 'interface' keyword
 * can be declared public or package scope(no access modifier)
 * CAN_DO
 */
public interface FirstInterface {

}
