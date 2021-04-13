package ro.unibuc.lab9.supplier;

import java.util.Arrays;
import java.util.List;

public class SupplierDemo {

    public static void main(String[] args) {
        System.out.println(SupplierExample.getAsBooleanUsingBooleanSupplier());
        System.out.println(SupplierExample.getAsDoubleUsingDoubleSupplier());
        System.out.println(SupplierExample.getAsIntUsingIntSupplier());
        System.out.println(SupplierExample.getAsLongUsingLongSupplier());
        System.out.println(SupplierExample.asStringUsingSupplier());

        List<String> words = Arrays.asList("red", "apple", "night", "day");
        System.out.println(SupplierExample.find(words, "pink"));
    }
}