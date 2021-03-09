package ro.unibuc.lab4.polymorphism.overloading;

/**
 * Static polymorphism = OVERLOADING
 */
public class Product {

    // encapsulation
    private String code;
    private double price;
    private double sellingPrice;


    public Product() {
    }

    //constructor overloading
    public Product(String code, double price, double sellingPrice) {
        this.code = code;
        this.price = price;
        this.sellingPrice = sellingPrice;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //read only
    public double getSellingPrice() {
        return sellingPrice;
    }

    public double computePrice(int noOfItems) {
        return price * noOfItems;
    }

    public double computePrice(int noOfItems, double discount) {
        if (noOfItems >= 3) {
            sellingPrice = price - (price * discount) / 100;
        }
        return sellingPrice * noOfItems;
    }

}
