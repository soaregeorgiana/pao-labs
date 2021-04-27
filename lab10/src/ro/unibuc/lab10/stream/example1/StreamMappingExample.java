package ro.unibuc.lab10.stream.example1;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Mapping
 * map() method - convert elements of a Stream by applying a special function to them and
 * to collect these new elements into a Stream;
 * If you have a stream where every element contains its own sequence of elements and
 * you want to create a stream of these inner elements, you should use the flatMap()
 * method;
 */
public class StreamMappingExample {

    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("Actor 1", "Actor 2");
        List<String> list2 = Arrays.asList("Actor 1", "Actor 3", "Actor 4");

        List<List<String>> actorsInMovies = Arrays.asList(list1, list2);

        actorsInMovies.stream()
                .flatMap(Collection::stream)
                .distinct()
                .forEach(System.out::println);

    }
}
