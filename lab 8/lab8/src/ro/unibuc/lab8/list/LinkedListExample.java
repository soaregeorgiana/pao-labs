package ro.unibuc.lab8.list;

import ro.unibuc.lab8.model.Element;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
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
        this.linkedList.add(element);
    }

    public void add(int index, Element element) {
        //Add elements
        this.linkedList.add(index, element);
    }

    public void addFirst(Element element) {
        //Add elements
        this.linkedList.addFirst(element);
    }

    public void remove(int index) {
        //Remove element by index
        this.linkedList.remove(index);
    }

    public void remove(Element value) {
        //Remove element by value
        this.linkedList.remove(value);
    }

    public Element getFirst() {
        // Return first element
        return this.linkedList.getFirst();
    }

    public Element getLast() {
        // Return last element
        return this.linkedList.getLast();
    }

    public Element getElementAtIndex(int index) {
        // Return element at index
        return this.linkedList.get(index);
    }

    public void displayLinkedListUsingIterator() {
        Iterator<Element> iterator = this.linkedList.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void displayLinkedListUsingForEach() {
        for (Element el : linkedList) {
            System.out.println(el);
        }
    }

    public String[] getLinkedListAsArray() {
        String[] myArray = new String[linkedList.size()];
        return linkedList.toArray(myArray);
    }

    public LinkedList<Element> getArrayAsLinkedList(Element[] array) {
        return new LinkedList<>(Arrays.asList(array));
    }

    public void sort() {
       // Collections.sort(linkedList);
        this.linkedList.sort(new Comparator<Element>() {
            @Override
            public int compare(Element o1, Element o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
    }

    public void reverseOrder() {
        Collections.sort(linkedList, Collections.reverseOrder());
    }

    public boolean contain(Element element) {
        return this.linkedList.contains(element);
    }

}
