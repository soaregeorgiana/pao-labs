package ro.unibuc.lab11.example2;

/**
 * The Runnable interface defines a single method, run, meant to contain the code
 * executed in the thread. The Runnable object is passed to the Thread constructor, as in
 * the HelloRunnable example
 */

// task -> will be executed by a thread
public class OddNumbersRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i + " - " + Thread.currentThread().getName());
        }
    }
}
