package ro.unibuc.lab9.function;

import java.util.List;

/**
 * A Function accepts one argument and returns one result .
 * Its abstract method is called apply(Object).
 * Java 8 provides several convenient FIs for the primitive data types: IntFunction,
 * DoubleFunction, IntToDoubleFunction, IntToLongFunction, DoubleToIntFunction,
 * DoubleToLongFunction, LongToDoubleFunction, and LongToIntFunction.
 * A BiFunction FI accepts two arguments and produces a result. Its abstract
 * method is called apply(Object, Object).
 * Java 8 also provides ToDoubleBiFunction, ToIntBiFunction, and
 * ToLongBiFunction that accepts two arguments and produces a double-valued,
 * int-valued, and long-valued result.
 */
public class FunctionExample {

    public static String concatStringsBiFunction(String s1, String s2) {
        return null;
    }

    public static int multiplyTwoIntsUsingBiFunction(int i1, int i2) {
        return 0;
    }

    public static double powerTwoIntUsingToDoubleBiFunction(int i1, int i2) {
        return 0.0;
    }

    public static String convertDoubleToStringUsingDoubleFunction(double d) {
        return null;
    }

    public static long convertDoubleToLongUsingDoubleToLongFunction(double d) {
        return 0L;
    }

    public static void convertStringToIntegerFunction(List<String> words) {

    }

    public static String convertIntegerToStringUsingIntFunction(int number) {
        return null;
    }

    public static double convertIntToDoubleUsingIntToDoubleFunction(int number) {
        return 0.0;
    }
}
