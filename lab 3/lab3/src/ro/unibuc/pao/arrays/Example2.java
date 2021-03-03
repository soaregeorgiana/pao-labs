package ro.unibuc.pao.arrays;

import java.util.Arrays;

/**
 * Write a program that compares two arrays:
 * <p>
 * Arrays.compare(int[]a, int[]b) -> Compares two  arrays lexicographically.
 * Returns:
 * - the value 0 if the first and second array are equal and contain the same elements in the same order;
 * - a value less than 0 if the first array is lexicographically less than the second array;
 * - and a value greater than 0 if the first array is lexicographically greater than the second array
 * This method can be used by all primitive types.
 * <p>
 * Arrays.equals(int[]a, int[]b)
 * Returns true if two specified arrays are equal to one another
 * Two  arrays are considered equal if both arrays contain the same number of elements,
 * and all corresponding pairs of elements in the two arrays are equal
 * This method can be used by all primitive types.
 */
public class Example2 {

    public static void main(String[] args) {
        // define the two arrays

        int[] first = {2, 3, 4};
        int[] second = {1, 1, 1, 1, 1, 1};

        int result = Arrays.compare(first, second);

        if (result == 0) {//result = 1
            System.out.println("The arrays are equal");
        } else {
            System.out.println("The arrays are not equal");
        }

        boolean isEqual = Arrays.equals(first, second);
        System.out.println("Are these arrays equal? " + isEqual);
    }

}
