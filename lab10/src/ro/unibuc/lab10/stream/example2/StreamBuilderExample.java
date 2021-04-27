package ro.unibuc.lab10.stream.example2;

import java.util.stream.Stream;

/**
 * When builder is used the desired type should be additionally specified in the right part of
 * the statement, otherwise the build() method will create an instance of the
 * Stream<Object>;
 */
public class StreamBuilderExample {

    public static void main(String[] args) {
        Stream<String> myStringStream = Stream.<String> builder()
                .add("Hello, ")
                .add("World!")
                .build();


    }
}
