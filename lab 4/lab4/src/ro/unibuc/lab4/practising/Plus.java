package ro.unibuc.lab4.practising;

public class Plus extends Subscription{

    public Plus(int price) {
        super(price);
    }

    @Override
    public String getInvoice() {
        return "A plus subscription costs: " + super.price;
    }
}
