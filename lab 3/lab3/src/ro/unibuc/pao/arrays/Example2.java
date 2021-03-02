package ro.unibuc.pao.arrays;

import java.util.Arrays;

/**
 * Write a program that compares two ro.unibuc.pao.arrays:
 * <p>
 * Arrays.compare(int[]a, int[]b) -> Compares two ro.unibuc.pao.arrays lexicographically.
 * Returns:
 * - the value 0 if the first and second array are equal and contain the same elements in the same order;
 * - a value less than 0 if the first array is lexicographically less than the second array;
 * - and a value greater than 0 if the first array is lexicographically greater than the second array
 * This method can be used by all primitive types.
 * <p>
 * Arrays.equals(int[]a, int[]b)
 * Returns true if two specified ro.unibuc.pao.arrays are equal to one another
 * Two ro.unibuc.pao.arrays are considered equal if both ro.unibuc.pao.arrays contain the same number of elements,
 * and all corresponding pairs of elements in the two ro.unibuc.pao.arrays are equal
 * This method can be used by all primitive types.
 */
public class Example2 {

    public static void main(String[] args) {
        // define the two ro.unibuc.pao.arrays

        int[] first = {1, 2, 3, 4};
        int[] second = {1, 2, 3, 6};

        int result = Arrays.compare(first, second);

        if(result == 0 ){
            System.out.println("The ro.unibuc.pao.arrays are equal");
        } else {
            System.out.println("The ro.unibuc.pao.arrays are not equal");
        }

        boolean isEqual = Arrays.equals(first, second);
        System.out.println("Are these ro.unibuc.pao.arrays equal? " + isEqual);
    }

}
