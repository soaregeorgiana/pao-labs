package ro.unibuc.lab6.genericinterfaces.example2;


import ro.unibuc.lab6.genericinterfaces.example1.Car;

public class Main {

    public static void main(String[] args) {
        Producer<Car> carProducer = new MyCarProducer();
        Car produced = carProducer.produce();
    }
}
