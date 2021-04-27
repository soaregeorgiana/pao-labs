package ro.unibuc.lab11.example5;

import static ro.unibuc.lab11.example5.Main.bucket;

/**
 * As long as a thread owns an intrinsic lock, no other thread can acquire the same lock. The other
 * thread will block when it attempts to acquire the lock.
 */
public class Consumer implements Runnable {

//    @Override
//    public void run() {
//        while (true) { //C1[10] C2[10]
//            if (!bucket.isEmpty()) {
//                int n = bucket.get(0); //JVM C1 runnable -> running
//                bucket.remove(0); //C2[] -> C2 -> runnable
//                System.out.println(Thread.currentThread().getName() + " took out value " + n);
//            }
//        }
//
//    }

    @Override
    public void run() {
        //not sync
        while (true) { //C1[10] C2[10]
            synchronized (bucket) { //monitor
                if (!bucket.isEmpty()) {
                    int n = bucket.get(0); //JVM C1 runnable -> running
                    bucket.remove(0); //C2[] -> C2 -> runnable
                    System.out.println(Thread.currentThread().getName() + " took out value " + n);
                }
            }

            //not sync
        }

    }
}
