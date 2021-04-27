package ro.unibuc.lab11.example5;

import java.util.ArrayList;
import java.util.List;

/**
 * Interference happens when two operations, running in different threads, but acting on
 * the same data, interleave. This means that the two operations consist of multiple steps,
 * and the sequences of steps overlap.
 */
public class Main {

    public static List<Integer> bucket = new ArrayList<>(); // arrayList is not synchronized

    /**
     * We;ll have a producer which adds numbers to the bucket
     * And a consumer which takes numbers to the bucket
     */
    public static void main(String[] args) {

    }
}
