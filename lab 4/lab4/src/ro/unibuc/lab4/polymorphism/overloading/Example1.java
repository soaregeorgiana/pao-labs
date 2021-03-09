package ro.unibuc.lab4.polymorphism.overloading;

import java.util.Random;

public class Example1 {
    public static void main(String[] args) {

        Product choco = new Product("CH10", 20, 20);

        Random random = new Random();
        if (random.nextBoolean()) {
            System.out.println("The price with the applied discount: " + choco.computePrice(3, 10));
        } else {
            System.out.println("The price with no applied discount: " + choco.computePrice(3));
        }
    }
}
