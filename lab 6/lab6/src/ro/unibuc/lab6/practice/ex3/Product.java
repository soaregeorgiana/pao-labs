package ro.unibuc.lab6.practice.ex3;

public class Product {

    private int price;
    private int stock;

    public Product(int price, int stock) {
        this.price = price;
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", stock=" + stock +
                '}';
    }
}
