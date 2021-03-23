package ro.unibuc.lab6.practice.ex3;

import java.util.Arrays;

public class PriceFilter implements Filterable<Integer> {

    @Override
    public Product[] filter(Product[] products, Integer value) {
        Product[] filteredProducts = new Product[0];
        for (Product product : products) {
            if (product.getPrice() == value) {
                filteredProducts = Arrays.copyOf(filteredProducts, filteredProducts.length + 1);
                filteredProducts[filteredProducts.length - 1] = product;
            }
        }
        return filteredProducts;
    }
}
