package ro.unibuc.lab.references;

/**
 * Arrays
 * They provide an ordered collection of elements.
 * They can be defined in two ways.
 * - First one: int a[]; int c[], d; // here c is an array, while d is a simple int
 * - Second one: int[] b;
 * In order to allocate space: we use the keyword "new" and then int[3] to allocate space to store 3 int values
 * Each element is accessed via an index - and indexes range is from 0 to number of elements in the array minus 1
 * <p>
 * |9|8|7|
 * 0 1 2
 * <p>
 * lastIndex = x.length-1
 */
public class ArrayExample {

    public static void main(String[] args) {

        int[] x;
        x = new int[3];
        /**
         * |4 |6 |8 |
         * 0 1 2
         */

        x[0] = 4;
        x[1] = 6;
        x[2] = 8;

//        int s = 0;
//        for (int i = 0; i < x.length; i++) {
//            s += x[i];
//        }
//        System.out.println(s);

        int[] x1 = new int[2];
        int[] y1 = {};
        int[] y2 = {4, 6, 8};
        int[] y3 = new int[]{2, 3}; //length=2

        int[] a, b, w[]; // w[][]
        int c[], d; // c is an array hence d is a primitive

        int w1[][] = {{1, 2}, {3, 4}};
        w1[0] = new int[2];
        w1[1] = new int[3];

        int test[][] = {{1, 2}, {5, 6}};
        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[i].length; j++) {
                System.out.print(test[i][j] + " ");
            }
        }

        int q[][] = new int[3][];
    }

}
