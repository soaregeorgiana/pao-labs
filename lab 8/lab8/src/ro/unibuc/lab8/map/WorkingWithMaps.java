package ro.unibuc.lab8.map;


import ro.unibuc.lab8.model.Element;

import java.util.Map;
import java.util.TreeMap;


/**
 * Map
 * stores data in key-value pairs (keys should be immutable).
 * cannot contain duplicate keys ;
 * each key can map to at most one value;
 * provides three collection views, which allow a map’s contents to be viewed as a
 * set of keys, collection of values, or set of key-value mappings.
 * some useful classes which implement Map interface are: ConcurrentHashMap,
 * ConcurrentSkipListMap, EnumMap, HashMap, Hashtable, IdentityHashMap,
 * LinkedHashMap, Properties, TreeMap and WeakHashMap.
 */
public class WorkingWithMaps {

    public static void main(String[] args) {
        HashMapExample hashMapExample = HashMapExample.getInstance();
        hashMapExample.add(1, new Element(1, "Doi", "Trei"));
        hashMapExample.add(2, new Element(2, "Doi", "Trei"));
        hashMapExample.add(13, new Element(13, "Doi", "Trei"));
        hashMapExample.add(13, new Element(13, "Doi", "Trei"));

        hashMapExample.anotherDisplayMap();

        System.out.println("Working with tree maps");
        workWithTreeMap();
    }

    /**
     * Constructs a new, empty tree map, using the natural ordering of its
     * keys.  All keys inserted into the map must implement the {@link
     * Comparable} interface.
     */
    private static void workWithTreeMap() {
        Map<String, Element> treeMap = new TreeMap<>();
        treeMap.put("unu", new Element(1, "Doi", "Trei"));
        treeMap.put("doi", new Element(2, "Doi", "Trei"));
        treeMap.put("trei", new Element(13, "Doi", "Trei"));
        treeMap.put("patru", new Element(13, "Doi", "Trei"));
        System.out.println(treeMap.keySet());


        //TODO: use a Comparator for Keys
    }
}
