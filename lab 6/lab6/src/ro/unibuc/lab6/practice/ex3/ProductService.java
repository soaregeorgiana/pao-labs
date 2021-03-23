package ro.unibuc.lab6.practice.ex3;

import java.util.Arrays;
import java.util.Random;

public class ProductService {

    private Product[] products = new Product[15];

    public ProductService() {
        this.initProducts();
    }

    public void displayProducts() {
        System.out.println(Arrays.toString(products));
    }

    public Product[] filter(Filterable filterable, int value) {
        return filterable.filter(this.products, value);
    }

    private void initProducts() {
        int[] prices = {10, 15, 20, 25};
        int[] stock = {5, 10, 25};
        Random random = new Random();
        for (int i = 0; i < this.products.length; i++) {
            Product product = new Product(prices[random.nextInt(4)], stock[random.nextInt(3)]);
            products[i] = product;
        }
    }
}
