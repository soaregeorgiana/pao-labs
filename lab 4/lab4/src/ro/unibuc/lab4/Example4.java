package ro.unibuc.lab4;

public class Example4 {

    /**
     * Every class in java has the characteristics of the Object class defined in java.lang package
     * Defines a couple of methods that are inherited by all objects:
     * - clone: create a new object instance that duplicates the current instance
     * - hashCode: get a hash code for the current instance
     * - toString: return string of characters representing the current instance
     * - equals: compare another objects to the current instance for equality
     */

    public static void main(String[] args) {

        Book b1 = new Book("Baltagul", "Mihail Sadoveanu", 180);
        Book b2 = b1;
        Book b3 = new Book("Baltagul", "Mihail Sadoveanu", 180);
        Book b4 = new Book("Mara", "Ioan Slavici", 220);

        System.out.println(b1 == b2); //true
        System.out.println(b1 == b3); //false

        System.out.println(b1.equals(b3)); //true
        System.out.println(b3.equals(b4)); // false
        System.out.println(b1.hashCode() == b3.hashCode()); // true
    }

}
