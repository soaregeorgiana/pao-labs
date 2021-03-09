package ro.unibuc.lab4.practising;

public class SubscriptionFactory {

    public Subscription configureSubscription(String type){
        switch (type){
            case "day":
                return new DayTime(35);
            case "full":
                return new FullTime(45);
            case "plus":
                return new Plus(60);
            default:
                return null; //throw an exception
        }
    }
}
