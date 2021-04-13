package ro.unibuc.lab9.predicate;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        System.out.println(PredicateExample.isDivisibleByThreeLongPredicate(27));
        System.out.println(PredicateExample.isDivisibleByThreeLongPredicate(20));
        System.out.println(PredicateExample.isEvenPredicate(3));
        System.out.println(PredicateExample.isNegativeIntPredicate(-4));
        System.out.println(PredicateExample.isPositiveDoublePredicate(0.0));
        System.out.println(PredicateExample.whichIsBiggerBiPredicate(5, 3));
        PredicateExample.streamFilter(new String[]{"Apple", "Grapes", "Orange"});

        //---------------------------------------------------------------//
        System.out.println("Default methods: negate, and, or");
        Predicate<String> startsWith = text -> text.startsWith("S");
        Predicate<String> negateStartsWith = startsWith.negate();
        Predicate<String> endsWith = text -> text.endsWith("t");

        Predicate<String> orPredicate = startsWith.or(endsWith);
        Predicate<String> andPredicate = startsWith.and(endsWith);

        System.out.println(orPredicate.test("Restaurant"));//true
        System.out.println(andPredicate.test("Restaurant"));//false

        System.out.println(orPredicate.test("Student"));//true
        System.out.println(andPredicate.test("Student"));//true
    }
}
