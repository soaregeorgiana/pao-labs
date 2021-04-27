package ro.unibuc.lab11.example1;

/**
 * Thread => set of instructions executed in a clear, defined order and independent and parallel of
 * other sets of instructions of the same application program
 */
public class EvenNumbersThread extends Thread {

 @Override
    public void run()  {

     try {
         for (int i = 0; i <= 10; i += 2) {
             System.out.println(i);
             Thread.sleep(1000);
         }
     } catch (InterruptedException e){
         e.printStackTrace();
     }
    }
}
