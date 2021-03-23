package ro.unibuc.lab6.practice.ex2;

import java.util.Comparator;

public class MovieYearComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        return o2.getYear() - o1.getYear();
    }
}
