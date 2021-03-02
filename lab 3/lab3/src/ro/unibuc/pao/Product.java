package ro.unibuc.pao;

public class Product {

    int stock;
    int pieces;

    public Product() {
        this.stock = 120;
        this.pieces = 1;
    }

    void buy() {
        if (stock > pieces) {
            stock = stock - pieces;
        }
    }

}
