package ro.unibuc.lab4.practising;

public class DayTime extends Subscription {

    public DayTime(int price) {
        super(price);
    }

    @Override
    public String getInvoice() {
        return "A day time subscription costs: " + super.price;
    }
}
