package ro.unibuc.lab11.example5;

import java.util.Random;

import static ro.unibuc.lab11.example5.Main.bucket;

public class Producer implements Runnable {

    @Override
    public void run() {
        // max 500
        Random r = new Random();
        while (true) {
            // pay attention to this
            synchronized (bucket) {
                if (bucket.size() < 500) {
                    int n = r.nextInt(1000); // [0,999]
                    bucket.add(n);
                    System.out.println(Thread.currentThread().getName() + " added value " + n);
                }
            }
        }
    }
}
