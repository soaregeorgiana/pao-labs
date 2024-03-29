package ro.unibuc.lab10.stream.example2;

import java.util.stream.Stream;

/**
 * Stream.generate():
 * - The generate() method accepts a Supplier<T> for element generation.
 * - As the resulting stream is infinite, we should specify the desired size or the generate()
 * method will work until it reaches the memory limit;
 */
public class StreamGenerateExample {

    /*
     creates a sequence of ten strings with the value - "element".
     */
    public static void main(String[] args) {
        Stream<String> myStringStream = Stream.generate(() -> "Hi")
                .limit(10);

        myStringStream.forEach(System.out :: println);
    }
}
