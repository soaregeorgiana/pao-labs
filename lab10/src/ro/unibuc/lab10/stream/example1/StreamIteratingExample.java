package ro.unibuc.lab10.stream.example1;

import ro.unibuc.lab10.dto.Movie;
import ro.unibuc.lab10.stream.util.MovieUtil;

import java.util.List;

/**
 * Stream API helps to substitute for, for-each and while loops.
 * - It allows concentrating on operation's logic, but not on the iteration over the sequence of
 * elements.
 */
public class StreamIteratingExample {

    public static void main(String[] args) {
        List<Movie> movieList = MovieUtil.initialiseMovieList();

        boolean b = movieList.stream()
                .anyMatch(movie -> movie.getTitle().equals("Saw"));

        System.out.println(b ? "Movie exists." : "Movie does not exist.");
    }
}
