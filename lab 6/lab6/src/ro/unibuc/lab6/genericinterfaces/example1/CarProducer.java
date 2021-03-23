package ro.unibuc.lab6.genericinterfaces.example1;

public class CarProducer implements Producer {

    @Override
    public Object produce() {
        return new Car();
    }
}
