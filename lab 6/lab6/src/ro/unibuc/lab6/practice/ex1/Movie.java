package ro.unibuc.lab6.practice.ex1;

/**
 * A comparable object is capable of comparing itself with another object.
 * The class itself must implement the java.lang.Comparable interface to compare its instances.
 * -> Comparable provides a single sorting sequence. In other words,
 * we can sort the collection on the basis of a single element such as name, or rating or year.
 * -> Comparable affects the original class, i.e., the actual class is modified.
 * -> Sorting in a natural order
 */
public class Movie implements Comparable<Movie>{

    private String name;
    private double rating;
    private int year;

    public Movie(String name, Double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(Movie movie) {
        if (this.rating == movie.rating) {
            return 0;
        } else if (this.rating > movie.rating) {
            return 1;
        } else {
            return -1;
        }
//        return Double.compare(this.rating, movie.rating);
    }
}
