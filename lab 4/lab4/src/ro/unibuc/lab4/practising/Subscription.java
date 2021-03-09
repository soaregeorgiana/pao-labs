package ro.unibuc.lab4.practising;

public abstract class Subscription {

    protected int price;

    public Subscription(int price) {
        this.price = price;
    }

    public abstract String getInvoice();
}
