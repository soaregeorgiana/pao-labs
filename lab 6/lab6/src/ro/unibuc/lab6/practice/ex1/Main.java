package ro.unibuc.lab6.practice.ex1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /**
         * Write a program which sort movies implicitly by their ratings
         */

        Movie movieOne = new Movie("aba", 5.4, 2012);
        Movie movieTwo = new Movie("bdc", 8.4, 2012);
        Movie movieThree = new Movie("vfv", 3.7, 2012);

        Movie[] movies = {movieOne, movieTwo, movieThree};
        Arrays.sort(movies);
        System.out.println("Movies after sorting by rating");
        for (Movie movie : movies) {
            System.out.println(movie.getName() + "-" + movie.getRating());
        }
    }
}
