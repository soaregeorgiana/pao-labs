package ro.unibuc.lab9.function;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.DoubleFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToDoubleBiFunction;
import java.util.stream.Collectors;

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
        BiFunction<String, String, String> concat = (a, b) -> a + b;
        return concat.apply(s1, s2);
    }

    public static int multiplyTwoIntsUsingBiFunction(int i1, int i2) {
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
        return multiply.apply(i1, i2);
    }

    public static double powerTwoIntUsingToDoubleBiFunction(int i1, int i2) {
        ToDoubleBiFunction<Integer, Integer> power = (a, b) -> Math.pow(a, b);
        return power.applyAsDouble(i1, i2);
    }

    public static String convertDoubleToStringUsingDoubleFunction(double d) {
        DoubleFunction<String> doubleFunction = num -> Double.toString(num);
        return doubleFunction.apply(d);
    }

    public static long convertDoubleToLongUsingDoubleToLongFunction(double d) {
        DoubleToLongFunction doubleToLongFunction = num -> (long) num;
        return doubleToLongFunction.applyAsLong(d);
    }

    public static void convertStringToIntegerFunction(List<String> words) {
        Function<String, Integer> lengthFunction = String::length;
        List<Integer> wordsLength = words.stream()
                .map(lengthFunction)
                .collect(Collectors.toList());

        for (int n : wordsLength) {
            System.out.println(n);
        }
    }

    public static String convertIntegerToStringUsingIntFunction(int number) {
        IntFunction<String> intFunction = n -> Integer.toString(n);
        return intFunction.apply(number);
    }

    public static double convertIntToDoubleUsingIntToDoubleFunction(int number) {
        IntToDoubleFunction intToDoubleFunction = n -> (double) number;
        return intToDoubleFunction.applyAsDouble(number);
    }
}
