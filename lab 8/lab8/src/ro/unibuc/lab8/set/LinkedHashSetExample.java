package ro.unibuc.lab8.set;


import ro.unibuc.lab8.model.Element;

import java.util.LinkedHashSet;

/**
 * This implementation differs from
 * {@code HashSet} in that it maintains a doubly-linked list running through
 * all of its entries.  This linked list defines the iteration ordering,
 * which is the order in which elements were inserted into the set
 */
public class LinkedHashSetExample {
    public static void main(String[] args) {

        Element elementOne = new Element(1, "Doi", "Trei");
        Element elementTwo = new Element(2, "Trei", "Patru");

        LinkedHashSet<Element> elements = new LinkedHashSet<>();
        elements.add(elementOne);
        elements.add(elementTwo);

        for (Element element : elements) {
            System.out.println(element);
        }

    }
}
