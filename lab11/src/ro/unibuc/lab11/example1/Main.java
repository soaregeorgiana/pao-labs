package ro.unibuc.lab11.example1;

public class Main {

    public static void main(String[] args) {

        Thread t1 = new EvenNumbersThread(); // NEW

       // t1.start(); // NEW-> RUNNABLE

       // t1.run(); // single thread -> main
        t1.start();

        System.out.println("END!");

        // "END", 0, 2,4.. -> the most probable
        //  0,"END!", 2, 4...
        //...
        // 0,2.., "END!"
    }
}
