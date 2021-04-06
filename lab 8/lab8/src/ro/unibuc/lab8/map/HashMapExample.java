package ro.unibuc.lab8.map;

import ro.unibuc.lab8.model.Element;

import java.util.HashMap;

/**
 * HashMap: It is used to store key and value pairs. Each key is mapped to a single
 * value in the map.
 * Features :
 * -> cannot contain duplicate keys
 * -> allows multiple null values but only one null key
 * -> is an unordered collection. It does not guarantee any specific order of the
 * elements
 * -> a value can be retrieved only using the associated key
 * -> stores only object references . So primitives must be used with their
 * corresponding wrapper classes. Eg: int will be stored as Integer
 */
public class HashMapExample {
    private static final HashMapExample instance = new HashMapExample();

    private final HashMap<Integer, Element> map = new HashMap<>();

    private HashMapExample() {
    }

    public static HashMapExample getInstance() {
        return instance;
    }

    public void add(Integer key, Element value) {
    }

    public Element getElementBy(Integer key) {
        return null;
    }

    public Element removeElementBy(Integer key) {
        return null;
    }

    public void displayMap() {
    }

    public void anotherDisplayMap() {

    }
}
