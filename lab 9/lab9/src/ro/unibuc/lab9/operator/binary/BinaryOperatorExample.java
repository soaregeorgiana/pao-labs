package ro.unibuc.lab9.operator.binary;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

/**
 * A BinaryOperator FI is a specialization of BiFunction whose operands and
 * result are the same type .
 * Its abstract method is apply(Object) .
 * Java 8 provides separated classes for the int, long, and double data type as
 * IntBinaryOperator, LongBinaryOperator, and DoubleBinaryOperator
 */
public class BinaryOperatorExample {

    public static void add() {
        BinaryOperator<Integer> add = Integer::sum;
        System.out.println(add.apply(10, 12));
    }

    public static void addNumbersUsingIntBinaryOperator() {
        IntBinaryOperator add = Integer::sum;
        System.out.println(add.applyAsInt(10, 12));
    }

    public static void multiplyNumbersUsingLongBinaryOperator() {
        LongBinaryOperator multiply = (a, b) -> a * b;
        System.out.println(multiply.applyAsLong(23L, 10L));
    }

    public static void powerToNumberUsingDoubleBinaryOperator() {
        DoubleBinaryOperator power = (a, b) -> Math.pow(a, b);
        System.out.println(power.applyAsDouble(5,3));
    }
}
