package ro.unibuc.lab8.set;

import ro.unibuc.lab8.model.Element;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

/**
 * Constructs a new, empty tree set, sorted according to the
 * natural ordering of its elements.  All elements inserted into
 * the set must implement the {@link Comparable} interface.
 * <p>
 * Provides also a constructor with the Comparator parameter that will be used to order the set.
 * It's a bit slower.
 */
public class TreeSetExample {
    public static void main(String[] args) {

        Element elementOne = new Element(1, "Doi", "Trei");
        Element elementTwo = new Element(2, "Trei", "Patru");
        workWithTreeSet(Arrays.asList(elementOne, elementTwo));

    }

    private static void workWithTreeSet(List<Element> elementList) {
        TreeSet<Element> elements = new TreeSet<>();
        elements.addAll(elementList);

        for (Element element : elements) {
            System.out.println(element);
        }

        //TODO: Create a ComparatorClass
    }
}
