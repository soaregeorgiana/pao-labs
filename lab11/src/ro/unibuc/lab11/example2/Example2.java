package ro.unibuc.lab11.example2;

public class Example2 {

    public static void main(String[] args) {

        Runnable r1 = new OddNumbersRunnable();

        Thread t1 = new Thread(r1); // NEW
        Thread t2 = new Thread(r1, "T2"); // NEW

        t1.start(); //RUNNABLE
        t2.start();

        System.out.println("END!" + " - "+ Thread.currentThread().getName());

    }
}
