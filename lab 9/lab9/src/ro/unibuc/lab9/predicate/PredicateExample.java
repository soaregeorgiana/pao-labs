package ro.unibuc.lab9.predicate;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Predicate FI accepts one argument and returns a Boolean value . Its
 * abstract method is test(Object).
 * A BiPredicate FI accepts two arguments and returns a Boolean value. Java 8
 * also provides IntPredicate, LongPredicate, and DoublePredicate for the primitive
 * data types.
 */
public class PredicateExample {

    public static boolean whichIsBiggerBiPredicate(int n1, int n2) {
        BiPredicate<Integer, Integer> isBigger = (x, y) -> x > y;
        return isBigger.test(n1, n2);
    }

    public static boolean isPositiveDoublePredicate(double n) {
        DoublePredicate isPositive = x -> x >= 0;
        return isPositive.test(n);
    }

    public static boolean isNegativeIntPredicate(int n1) {
        IntPredicate isNegative = x -> x < 0;
        return isNegative.test(n1);
    }

    public static boolean isDivisibleByThreeLongPredicate(int nr) {
        LongPredicate isDivisible = x -> x % 3 == 0;
        return isDivisible.test(nr);
    }

    public static boolean isEvenPredicate(int nr) {
        Predicate<Integer> isEven = x -> x % 2 == 0;
        return isEven.test(nr);
    }

    public static void streamFilter(String[] fruits) {
        Predicate<String> startsWith = fruit -> fruit.startsWith("A");
        List<String> filtered = Stream.of(fruits)
                .filter(startsWith)
                .collect(Collectors.toList());
        System.out.println(filtered);
    }
}
