package ro.unibuc.lab10.stream.example1;

import ro.unibuc.lab10.dto.Movie;
import ro.unibuc.lab10.stream.util.MovieUtil;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Stream Operations:
 * -> intermediate operations (return Stream<T> ): allow chaining
 * eg: the distinct() method represents an intermediate operation, which creates a new stream
 * of unique elements of the previous stream.
 * -> terminal operations (return a result of definite type).
 * eg: the count() method is a terminal operation, which returns the stream's size.
 * Operations on streams don't change the source.
 */
public class StreamOperationsExample {
    /**
     * Write a program which returns the number of the distinct elements for an array
     */
    public static void main(String[] args) {

        List <Movie> movieList = MovieUtil.initialiseMovieList();

        Stream <Movie> movieListStream = movieList.stream()
                .distinct();

        Stream <Movie> modifiedStream = movieListStream.map(movie -> {
            movie.setTitle(movie.getTitle().toUpperCase());
            return movie;
        });

        movieList.forEach(System.out :: println);

        System.out.println();

        modifiedStream.forEach(System.out :: println);

//        movieListStream.forEach(System.out :: println);

//        long movieCount = movieListStream.count();

//        System.out.println(movieCount);
    }
}
