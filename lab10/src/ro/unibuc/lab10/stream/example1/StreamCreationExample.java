package ro.unibuc.lab10.stream.example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * Streams can be created from different element sources e.g. collection or array with the
 * help of stream() and of() methods;
 * A stream() default method is added to the Collection interface and allows creating a
 * Stream<T> using any collection as an element source;
 */
public class StreamCreationExample {

    public static void main(String[] args) {

        String[] myArray = { "Hello", ",", " world", "!"  };

        // using Arrays.stream()
        Stream <String> myStringStream = Arrays.stream(myArray);


        // using Stream.of()
        Stream <String> myStringStream2 = Stream.of( "Hello", ",", " world", "!" );


        // creating a stream using any collection as an element source

        List<String> myStringList = Arrays.asList( "Hello", ",", " world", "!" );

        Stream <String> myStringListStream = myStringList.stream();


    }
}
