package ro.unibuc.lab9.predicate;

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
    }
}
