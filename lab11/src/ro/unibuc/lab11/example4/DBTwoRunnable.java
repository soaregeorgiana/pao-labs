package ro.unibuc.lab11.example4;

public class DBTwoRunnable implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(2000); // BLOCKED
            System.out.println("DB2 querying ended");
        } catch (InterruptedException ex) {
        }
    }
}
