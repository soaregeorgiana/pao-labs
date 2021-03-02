package ro.unibuc.pao.inheritance;

/**
 * A class can be declared to inherit another class using the "extends" keyword.
 * A child class can extend only one parent class
 * <p>
 * IS-A relationship : Bus is a Car
 * <p>
 * The class derived has the characteristics of the base class and it can be particularised by:
 * - adding new fields
 * - adding new behaviours
 * - changing fields -> hiding fields
 * - changing behaviour -> overriding
 */
public class Bus extends Car {

    //adding new fields
    private String route;

    public Bus(String route) {
        this.route = route;
    }

    //adding new behaviours
    public void makeAStop(){
        System.out.println("The bus makes a stop");
    }

}
