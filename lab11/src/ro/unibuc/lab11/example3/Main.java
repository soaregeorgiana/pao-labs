package ro.unibuc.lab11.example3;

public class Main {
    public static void main(String[] args) {

        Thread t1 = new Thread(new InterruptExample());

        t1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){}
        t1.interrupt();
    }
}
