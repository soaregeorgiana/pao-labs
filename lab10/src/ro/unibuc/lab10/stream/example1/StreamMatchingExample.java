package ro.unibuc.lab10.stream.example1;

import ro.unibuc.lab10.dto.Movie;
import ro.unibuc.lab10.stream.util.MovieUtil;

import java.util.Arrays;
import java.util.List;

/**
 * Matching
 * Stream API gives a handy set of instruments to validate elements of a sequence
 * according to some predicate: anyMatch(), allMatch(), noneMatch().
 * Those are terminal operations which return a boolean.
 */
public class StreamMatchingExample {

    public static void main(String[] args) {
        List<Movie> movieList = MovieUtil.initialiseMovieList();

        boolean anyMatchResult = movieList.stream().anyMatch(movie -> movie.getYear() == 2004),
                allMatchResult = movieList.stream().allMatch(movie -> movie.getYear() == 2004),
                noneMatchResult = movieList.stream().noneMatch(movie -> movie.getYear() == 2004);

        System.out.println(Arrays.asList(anyMatchResult, allMatchResult, noneMatchResult));
    }
}
