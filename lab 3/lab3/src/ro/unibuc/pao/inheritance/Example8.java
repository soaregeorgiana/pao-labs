package ro.unibuc.pao.inheritance;

public class Example8 {

    public static void main(String[] args) {

        Car baseCar = new Car();
        System.out.println("Doors " + baseCar.doors);
        System.out.println("Wheels " + baseCar.wheels);
        baseCar.consumeFuel();

        Bus bus = new Bus("A-B");
        System.out.println("Doors for bus " + bus.doors);
        System.out.println("Wheels for bus " + bus.wheels);
        bus.consumeFuel();
        bus.makeAStop();

        Car newCar = new Bus("B-C");
        newCar.consumeFuel();
    }
}
