package ro.unibuc.lab9.practice.dto;

public class Product {

    private String name;
    private Double price;
    private Double rating;

    public Product(String name, Double price, Double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}
