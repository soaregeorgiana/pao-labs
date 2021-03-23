package ro.unibuc.lab6.practice.ex2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class MovieService {

    public Movie[] init(int number) {
        Movie[] movies = new Movie[number];
        for (int i = 0; i < number; i++) {
            Random rand = new Random();
            movies[i] = new Movie(generateRandomStrings(8), rand.nextDouble() * i, 2000 + rand.nextInt(22));
        }
        return movies;
    }

    public void sortByNameAndYear(Movie[] movies) {
        Arrays.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        Arrays.sort(movies, new MovieYearComparator());
    }

    private String generateRandomStrings(int length) {
        String allowedChars = "ascvbndhfukdtyohatf";
        StringBuilder sb = new StringBuilder();
        int i = 0;
        Random rand = new Random();
        while (i < length) {
            sb.append(allowedChars.charAt(rand.nextInt(length)));
            i++;
        }
        return sb.toString();
    }
}
