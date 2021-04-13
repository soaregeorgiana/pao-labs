package ro.unibuc.lab9.practice;

import ro.unibuc.lab9.practice.service.ProductService;

public class FunctionalProgrammingDemo {
    /**
     * 1. Sort by price asc and by rating desc
     * 2. Filter by name (containing)
     * 3. View Products
     */
    public static void main(String[] args) {
        ProductService service = new ProductService();
        service.sortByPriceAndRating();
        service.view();
        System.out.println("==================");
        System.out.println(service.filterByName("sofa"));

    }
}
