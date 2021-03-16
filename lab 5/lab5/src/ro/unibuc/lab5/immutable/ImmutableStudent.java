package ro.unibuc.lab5.immutable;

/**
 * Once an object is created, we cannot change its content.
 * All the wrapper classes (like Integer, Boolean, Byte, Short) and String class are immutable
 * We can create our own immutable class as well by following the rules:
 * - Make your class final, so that no other classes can extend it
 * - Data members in the class must be declared as final
 * (so that they're initialized only once inside the constructor and never modified afterward)
 * - Define a parameterized constructor
 * - Getter methods for all the variables in the class
 * - Don't expose setter methods ( to not have the option to change the value of the instance variable)
 * - When exposing methods which modify the state of the class, you must always return a new instance of the class
 * - If the class holds a mutable object:
 * -- inside the constructor, make sure to use a clone copy of the passed argument
 * and never set your mutable field to the real instance passed through the constructor,
 * this is to prevent others who pass the object from modifying it afterwords.
 * -- make sure to always return a clone copy of the field and never return the real object instance
 * <p>
 * <p>
 * Practicing!!
 * Ensure the following class is an immutable one
 */
public class ImmutableStudent {

    private int id;
    private String name;
    private BirthDate date;

    public ImmutableStudent(int id, String name, BirthDate birthDate) {
        this.id = id;
        this.name = name;
        this.date = birthDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BirthDate getDate() {
        return date;
    }

    public void setDate(BirthDate date) {
        this.date = date;
    }
}
