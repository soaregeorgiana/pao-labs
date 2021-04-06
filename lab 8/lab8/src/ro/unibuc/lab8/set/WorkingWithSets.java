package ro.unibuc.lab8.set;


import ro.unibuc.lab8.model.Element;

import java.util.Arrays;
import java.util.Collections;

public class WorkingWithSets {

    public static void main(String[] args) {

        Element elementOne = new Element(1, "Doi", "Trei");
        Element elementTwo = new Element(2, "Trei", "Patru");

        HashSetExample hashSetExample = HashSetExample.getInstance();
        System.out.println(hashSetExample);
        hashSetExample.addAll(Arrays.asList(elementOne, elementTwo));

        System.out.println(hashSetExample.contains(elementOne));
        System.out.println(hashSetExample.contains(new Element(2, "Trei", "Patruu")));

        hashSetExample.displayElementsUsingForEach();
        hashSetExample.retainAll(Collections.EMPTY_LIST);
        System.out.println(hashSetExample.isEmpty());
    }
}
