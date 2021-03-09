package ro.unibuc.lab4.practising;

public class FullTime extends Subscription {

    public FullTime(int price) {
        super(price);
    }

    @Override
    public String getInvoice() {
        return "A full time subscription costs: " + super.price;
    }
}
