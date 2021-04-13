package ro.unibuc.lab9.practice.service;

import ro.unibuc.lab9.practice.dto.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProductService {

    private List<Product> products = new ArrayList<>();

    public ProductService() {
        this.initProducts();
    }

    public List<Product> sortByPriceAndRating() {
        Comparator<Product> byPrice = Comparator.comparing(Product::getPrice);
        Comparator<Product> byRating = (p1, p2) -> p2.getRating().compareTo(p1.getRating());
        Comparator<Product> byPriceAndRating = byPrice.thenComparing(byRating);

        this.products.sort(byPriceAndRating);
        return this.products;
    }

    public List<Product> filterByName(String name) {
        Predicate<Product> byName = product -> product.getName().contains(name);
        return this.products.stream()
                .filter(byName)
                .collect(Collectors.toList());
    }

    public void view() {
        Consumer<Product> viewConsumer = System.out::println;
        this.products.forEach(viewConsumer);
    }

    private void initProducts() {
        this.products.add(new Product("black sofa", 3500.99, 4.5));
        this.products.add(new Product("grey sofa", 3500.99, 5.0));
        this.products.add(new Product("pink sofa", 3500.99, 3.8));
        this.products.add(new Product("office desk", 100.78, 4.5));
        this.products.add(new Product("bed", 2500.99, 3.0));
    }
}
