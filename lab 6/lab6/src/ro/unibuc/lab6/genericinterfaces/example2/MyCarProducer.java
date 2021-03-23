package ro.unibuc.lab6.genericinterfaces.example2;

import ro.unibuc.lab6.genericinterfaces.example1.Car;

public class MyCarProducer implements Producer<Car> {

    @Override
    public Car produce() {
        return new Car();
    }
}
