package ro.unibuc.lab8.list;

import ro.unibuc.lab8.model.Element;

import java.util.ArrayList;

/**
 * ArrayList: represents a resizable list of objects. We can add, remove, find, sort
 * and replace elements in this list. ArrayList is part of Java’s collection framework
 * and implements Java’s List interface.
 * Java ArrayList class extends AbstractList class which implements List interface.
 * The List interface extends Collection and Iterable interfaces in hierarchical order.
 * Features :
 * -> ordered (elements preserve their ordering which is by default the order in
 * which they were added to the list)
 * -> index based (elements can be randomly accessed using index positions.
 * Index start with '0'.)
 * -> dynamic resizing (grows dynamically when more elements need to be
 * added)
 * -> duplicates allowed (we can add duplicate elements)
 * <p>
 * Methods :
 * add(), addAll(), clear(), clone(), contains(), forEach(), get(), indexOf(),
 * remove(), removeAll(), etc
 */
public class ArrayListExample {

    //Empty ArrayList
    private final ArrayList<Element> elements = new ArrayList<>();
    /**
     * SINGLETON
     * Singleton pattern is one of the simplest design patterns in Java.
     * This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
     * <p>
     * This pattern involves a single class which is responsible to create an object while making sure that only single object gets created.
     * This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.
     */
    private static final ArrayListExample arrayListInstance = new ArrayListExample();

    /**
     * Make the constructor private so that this class cannot be instantiated
     */
    private ArrayListExample() {
    }

    /**
     * Get the only object available
     */
    public static ArrayListExample getInstance() {
        return arrayListInstance;
    }

    public void add(Element element) {
        // add elements to the list
    }

    public void add(int index, Element element) {
        // add elements to the list
    }

    public void remove(int index) {
        // remove element with given index from the list
    }

    public void update(int index, Element element) {
        // update element at given index with given value
    }

    public void displayListUsingIterator() {
    }

    public void displayListUsingForEach() {
    }

    public void displayListUsingFor() {
    }
}
