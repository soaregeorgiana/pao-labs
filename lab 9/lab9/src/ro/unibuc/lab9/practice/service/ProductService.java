package ro.unibuc.lab9.practice.service;

import ro.unibuc.lab9.practice.dto.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    private List<Product> products = new ArrayList<>();

    public ProductService() {
        this.initProducts();
    }

    private void initProducts() {
        this.products.add(new Product("black sofa", 3500.99, 4.5));
        this.products.add(new Product("grey sofa", 3500.99, 5.0));
        this.products.add(new Product("pink sofa", 3500.99, 3.8));
        this.products.add(new Product("office desk", 100.78, 4.5));
        this.products.add(new Product("bed", 2500.99, 3.0));
    }
}
