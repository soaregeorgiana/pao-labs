package ro.unibuc.lab6.genericinterfaces.example1;

public class Main {

    public static void main(String[] args) {

        Producer carProducer = new CarProducer();
        Car car = (Car) carProducer.produce();
    }

}
