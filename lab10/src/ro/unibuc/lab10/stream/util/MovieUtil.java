package ro.unibuc.lab10.stream.util;

import ro.unibuc.lab10.dto.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieUtil {
    public static List <Movie> initialiseMovieList() {
        List <Movie> movieList = new ArrayList <> ();

        movieList.add(new Movie("Saw", 10.0, 2004));

        movieList.add(new Movie("Saw", 10.0, 2004));

        movieList.add(new Movie("The Shawshank Redemption", 5.4, 1994));
        movieList.add(new Movie("Godzilla", 9.2, 2018));
        movieList.add(new Movie("Thunder Force", 9.2, 2021));

        return movieList;
    }
}
