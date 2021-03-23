package ro.unibuc.lab6.practice.ex2;

public class Main {

    public static void main(String[] args) {

        /**
         * Write a program which sort movies by their names ascending and by their years descending
         */

        MovieService service = new MovieService();
        Movie[] movies = service.init(10);
        service.sortByNameAndYear(movies);

        System.out.println("Movies after sorting by rating");
        for (Movie movie : movies) {
            System.out.println(movie.getName() + " - " + movie.getYear() + " - " + movie.getRating());
        }

    }
}
