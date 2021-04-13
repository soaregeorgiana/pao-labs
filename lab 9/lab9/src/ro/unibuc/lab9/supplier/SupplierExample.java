package ro.unibuc.lab9.supplier;

import java.util.List;

/**
 * A Supplier accepts no argument and returns a result .
 * Its abstract method is get() .
 * Java 8 provides convenient interfaces for the primitive data types: IntSupplier,
 * DoubleSupplier, BooleanSupplier, and LongSupplier.
 */
public class SupplierExample {

    public static boolean getAsBooleanUsingBooleanSupplier() {
        return false;
    }

    public static double getAsDoubleUsingDoubleSupplier() {
        return 0.0;
    }

    public static int getAsIntUsingIntSupplier() {
        return 0;
    }

    public static long getAsLongUsingLongSupplier() {
        return 0L;
    }

    public static String asStringUsingSupplier() {
        return null;
    }

    public static String find(List<String> words, String lookingFor) {
        return null;
    }
}
