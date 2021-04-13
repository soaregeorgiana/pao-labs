package ro.unibuc.lab9.supplier;

import java.util.List;
import java.util.Random;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

/**
 * A Supplier accepts no argument and returns a result .
 * Its abstract method is get() .
 * Java 8 provides convenient interfaces for the primitive data types: IntSupplier,
 * DoubleSupplier, BooleanSupplier, and LongSupplier.
 */
public class SupplierExample {

    public static boolean getAsBooleanUsingBooleanSupplier() {
        BooleanSupplier booleanSupplier = () -> {
            Random random = new Random();
            return random.nextBoolean();
        };
        return booleanSupplier.getAsBoolean();
    }

    public static double getAsDoubleUsingDoubleSupplier() {
        DoubleSupplier pi = () -> Math.PI;
        return pi.getAsDouble();
    }

    public static int getAsIntUsingIntSupplier() {
        return 0;
    }

    public static long getAsLongUsingLongSupplier() {
        LongSupplier max = () -> Long.MAX_VALUE;
        return max.getAsLong();
    }

    public static String asStringUsingSupplier() {
        Supplier<String> msg = () -> "Some message";
        return msg.get();
    }

    public static String find(List<String> words, String lookingFor) {
        return words.stream()
                .filter(word -> word.equals(lookingFor))
                .findAny()
                .orElseGet(() -> "Not Found!");
    }
}
