package ro.unibuc.pao.arrays;

/**
 * The Arrays class in java.util package is a part of the Java Collection Framework.
 * This class provides static methods to dynamically create and access (manipulate) Java ro.unibuc.pao.arrays (such as sorting, searching).
 * It consists of only static methods and the methods of Object class.
 * The methods of this class can be used by the class name itself.
 * <p>
 * Syntax to use Array: Arrays.<function name>;
 */

import java.util.Arrays;

/**
 * Write a program that searches for a specified element in an array with the help of Binary Search algorithm.
 * <p>
 * Binary search algorithm
 * - searches a specified array for a specified value
 * - the array must be sorted (as by the sort method) prior to making this call.
 * -    if it is not sorted, the results are undefined.
 * -    if the array contains multiple elements with the specified value, there is no guarantee which one will be found.
 * Returns:
 * - index of the search key, if it is contained in the array; otherwise, - (insertion point + 1).
 * <p>
 * This method can be used by all primitive types.
 */
public class Example1 {

    public static void main(String[] args) {

        int[] input = {2, 5, 3, 7, 1};

        int specifiedValue = 6;

        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();
        Arrays.sort(input);
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }

        System.out.println();
        int index = Arrays.binarySearch(input, specifiedValue);
        if (index < 0) {
            System.out.println("The value is not present!");
        } else {
            System.out.println(specifiedValue + " exists at index " + index);
        }
    }

}
