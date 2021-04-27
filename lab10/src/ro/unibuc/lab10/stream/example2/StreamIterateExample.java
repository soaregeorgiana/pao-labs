package ro.unibuc.lab10.stream.example2;

import java.util.stream.Stream;

/**
 * Another way of creating an infinite stream is by using the iterate() method;
 */
public class StreamIterateExample {
    public static void main(String[] args) {
        Stream<String> myStringStream = Stream.iterate("Hello", word -> word + ", world!")
                .limit(8);

        myStringStream.forEach(System.out::println);
    }
}
