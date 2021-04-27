package ro.unibuc.lab10.stream.example2;

import java.util.stream.IntStream;

/**
 * Stream of Primitives:
 * - Since version 8 Java offers a possibility to create streams out of three primitive types:
 * int, long and double.
 * - As Stream<T> is a generic interface and there is no way to use primitives as a type
 * parameter with generics, three new special interfaces were created: IntStream,
 * LongStream, DoubleStream.
 */
public class StreamOfPrimitives {

    public static void main(String[] args) {
        IntStream myIntStream = IntStream.rangeClosed(1, 16);

        myIntStream.forEach(System.out :: println);
    }
}
