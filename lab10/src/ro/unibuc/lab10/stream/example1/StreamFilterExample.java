package ro.unibuc.lab10.stream.example1;

import ro.unibuc.lab10.dto.Movie;
import ro.unibuc.lab10.stream.util.MovieUtil;

import java.util.List;
import java.util.stream.Stream;

/**
 * The filter() method allows us to pick a stream of elements which satisfy a predicate
 */
public class StreamFilterExample {

    public static void main(String[] args) {
        List<Movie> movieList = MovieUtil.initialiseMovieList();

        movieList.stream()
                .filter(movie -> movie.getRating() > 9)
                .filter(movie -> movie.getTitle().startsWith("S"))
                .distinct()
                .forEach(System.out :: println);
    }
}
