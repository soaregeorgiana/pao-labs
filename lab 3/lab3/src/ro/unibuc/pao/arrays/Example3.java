package ro.unibuc.pao.arrays;

import java.util.Arrays;

/**
 * Arrays.fill(int[] a, int value)
 * Assigns the specified value to each element of the specified array
 * This method could be used by all primitive data types
 */
public class Example3 {

    public static void main(String[] args) {

        int[] arrayToBeFilled = new int[5];
        Arrays.fill(arrayToBeFilled, 3);

        for(int i =0; i< arrayToBeFilled.length; i++){
            System.out.println(arrayToBeFilled[i]);
        }
    }

}
