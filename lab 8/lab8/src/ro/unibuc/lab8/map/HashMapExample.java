package ro.unibuc.lab8.map;

import ro.unibuc.lab8.model.Element;

import java.util.HashMap;
import java.util.Iterator;

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

    /**
     * Associates the specified value with the specified key in this map.
     * If the map previously contained a mapping for the key, the old
     * value is replaced.
     */
    public void add(Integer key, Element value) {
        if (!map.containsKey(key)) {
            map.put(key, value);
        } else {
            System.out.println("Already exists");
        }
    }

    public Element getElementBy(Integer key) {
        return map.get(key);
    }

    public Element removeElementBy(Integer key) {
        return null;
    }

    public void displayMap() {
        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();

            System.out.println("The key is::" + key + " and values are :: " + map.get(key));
        }
    }

    public void anotherDisplayMap() {
        for (Integer key : map.keySet()) {
            Element value = map.get(key);

            System.out.println("The key is :: " + key + ", and value is :: " + value);
        }
    }
}
