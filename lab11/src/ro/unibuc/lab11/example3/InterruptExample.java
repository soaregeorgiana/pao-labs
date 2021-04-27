package ro.unibuc.lab11.example3;

import java.util.Arrays;
import java.util.List;

/**
 * An interrupt is an indication to a thread that it should stop what it is doing and do
 * something else. It's up to the programmer to decide exactly how a thread responds to an
 * interrupt, but it is very common for the thread to terminate
 */
public class InterruptExample implements Runnable {

    @Override
    public void run() {
        List<String> words = Arrays.asList("Hello", "there", "How", "are", "you");

        for(String s : words) {
            System.out.println(s);
            if(Thread.interrupted()){
                System.out.println("We've been interrupted");
                return;
            }
        }

    }
}
