package ro.unibuc.lab9.predicate.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class ExerciseOne {
    /**
     * Generate 100 codes and extract the ones started with 1
     * Generate codes using UUID.randomUUID().toString()
     */
    public static void main(String[] args) {

        List<String> codes = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            codes.add(UUID.randomUUID().toString());
        }

        System.out.println(
                codes.stream()
                        .filter(code -> code.startsWith("1"))
                        .collect(Collectors.joining(",")));
    }
}
