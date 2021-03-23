package ro.unibuc.lab6.practice.ex3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /**
         * Filter products by price
         * Filter products by stock
         */

        ProductService service = new ProductService();
        service.displayProducts();
        System.out.println(Arrays.toString(service.filter(new PriceFilter(), 20)));
    }
}
