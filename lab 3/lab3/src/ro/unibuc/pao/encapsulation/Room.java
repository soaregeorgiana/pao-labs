package ro.unibuc.pao.encapsulation;

/**
 * The internal representation of objects should generally be hidden.
 * The idea of hiding this internal representation is called Encapsulation (one of the four fundamental OOP concepts)
 * In encapsulation, the variables of a class will be hidden from other classes,
 * and can be accessed only through the methods of their current class (getters and setters)
 * <p>
 * In order to achieve encapsulation we need to use access modifiers private for all fields and expose public getters and setters:
 * Access modifiers:
 * - public (if a class or a class member is public, it can be used anywhere in the program)
 * - protected (if a class member is protected -> usable within its own package and from the classes which inherit the base class that contains the protected field)
 * - default (if a class or a class member does not have any access modifier -> only usable within its own package)
 * - private (if a class member is private, it is only accessible from within the class where it's declared)
 * <p>
 * Benefits:
 * - a class can have total control over what is stored in its fields
 * - the fields can be made read-only or write-only
 * - it improves maintainability and flexibility and re-usability
 * - increased security of data
 */
public class Room {

    private int floor;
    public int number;

    public Room() {
        this.floor = 5;
    }

    public int getFloor() {
        return floor;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int newNumber) {
        this.number = newNumber;
    }

}
