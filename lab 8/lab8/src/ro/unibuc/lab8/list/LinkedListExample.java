package ro.unibuc.lab8.list;

import ro.unibuc.lab8.model.Element;

import java.util.LinkedList;

/**
 * LinkedList: is doubly-linked list implementation of the List and Deque interfaces.
 * It implements all optional list operations, and permits all elements (including null).
 * Features :
 * -> doubly linked list implementation which implements List and Deque
 * interfaces. Therefore, It can also be used as a Queue, Deque or Stack.
 * -> permits all elements including duplicates and NULL.
 * -> maintains the insertion order of the elements
 * -> we can use ListIterator to iterate LinkedList elements
 * -> we can access elements in sequential order only . It does not support
 * accessing elements randomly.
 * Constructors:
 * -> LinkedList() : initializes an empty LinkedList implementation.
 * -> LinkedListExample(Collection c) : initializes a LinkedList containing the
 * elements of the specified collection, in the order they are returned by the
 * collection’s iterator.
 * <p>
 * Methods: add(Object o), add(int index, Object element), addFirst(Object o),
 * addLast(Object o), size(), contains(), getFirst(), getLast(), iterator(), etc
 */
public class LinkedListExample {
    //Create linked list
    LinkedList<Element> linkedList = new LinkedList<>();

    private static final LinkedListExample instance = new LinkedListExample();

    private LinkedListExample() {
    }

    public static LinkedListExample getInstance() {
        return instance;
    }

    public void add(Element element) {
        //Add elements
    }

    public void add(int index, Element element) {
        //Add elements
    }

    public void addFirst(Element element) {
        //Add elements
    }

    public void remove(int index) {
        //Remove element by index
    }

    public void remove(Element value) {
        //Remove element by value
    }

    public Element getFirst() {
        // Return first element
        return null;
    }

    public Element getLast() {
        // Return last element
        return null;
    }

    public Element getElementAtIndex(int index) {
        // Return element at index
        return null;
    }

    public void displayLinkedListUsingIterator() {
    }

    public void displayLinkedListUsingForEach() {
    }

    public String[] getLinkedListAsArray() {
        return null;
    }

    public LinkedList<Element> getArrayAsLinkedList(Element[] array) {
        return null;
    }

    public void sort() {
    }

    public void reverseOrder() {
    }

}
