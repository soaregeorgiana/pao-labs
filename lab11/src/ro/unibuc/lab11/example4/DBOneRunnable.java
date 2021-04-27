package ro.unibuc.lab11.example4;

public class DBOneRunnable implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(3000); // BLOCKED
            System.out.println("DB1 querying ended");
        } catch (InterruptedException ex) {
        }
    }
}
