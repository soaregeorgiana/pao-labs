package ro.unibuc.pao;

public class Example4 {

    public static void main(String[] args) {
        Product productOne;
        productOne = new Product();

        Product productTwo = new Product();

        System.out.println(productOne.stock);
        System.out.println(productTwo.stock);

        productTwo.buy();
        System.out.println(productTwo.stock); // 119
        System.out.println(productOne.stock); // 120

        productOne = productTwo; // these two references will point now to the same object
        System.out.println(productOne.stock); // 119
        productTwo.buy();
        System.out.println(productTwo.stock); // 118
        System.out.println(productOne.stock); // 118

    }
}
