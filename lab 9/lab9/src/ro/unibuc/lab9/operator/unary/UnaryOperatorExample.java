package ro.unibuc.lab9.operator.unary;

import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

/**
 * A UnaryOperator FI is a specialization of Function whose operand and
 * result are the same type.
 * Its abstract method is apply(Object).
 * Java 8 provides separated classes for the primitive data types: IntUnaryOperator,
 * DoubleUnaryOperator, and LongUnaryOperator.
 */
public class UnaryOperatorExample {

    public static void convertToUppercase() {
        UnaryOperator<String> convertToUppercase = String::toUpperCase;
        System.out.println(convertToUppercase.apply("This is my text"));
    }

    public static void doubleIt(int d) {
        IntUnaryOperator doubleIt = x -> x * 2;
        System.out.println(doubleIt.applyAsInt(d));
    }

    public static void squareItLongUnaryOperator() {
        LongUnaryOperator squareIt = x -> x * x;
        System.out.println(squareIt.applyAsLong(6));
    }

    public static void squareItDoubleUnaryOperator() {
        DoubleUnaryOperator squareIt = x -> x * x;
        System.out.println(squareIt.applyAsDouble(6.0));
    }
}
