package ro.unibuc.lab5.composition;

public class HotelManagerApp {

    public static void main(String[] args) {

        Hotel myHotel = new Hotel("Ritz", 3);

        myHotel.addRoom("double", 100);
        myHotel.addRoom("SINGLE", 101);
        myHotel.addRoom("Deluxe", 102);

        System.out.println(myHotel.computePrice()); //3600
    }
}
