package ro.unibuc.lab6.practice.ex3;

public interface Filterable<T> {

    Product[] filter(Product[] products, T value);
}
