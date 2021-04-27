package ro.unibuc.lab10.stream.example1;

import java.util.Arrays;
import java.util.List;

/**
 * Reduction:
 * Stream API allows reducing a sequence of elements to some value according to a
 * specified function with the help of the reduce() method of the type Stream.
 * This method takes two parameters: first -> start value , second -> an accumulator
 * function.
 */
public class StreamReductionExample {
    public static void main(String[] args) {
        List<Integer> noteBac = Arrays.asList(3, 2, 4);
        int nota = noteBac.stream()
                .reduce(1, (accumulator, current) -> accumulator + current);

        System.out.println(nota);
    }
}
