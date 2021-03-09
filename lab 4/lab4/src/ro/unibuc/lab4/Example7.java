package ro.unibuc.lab4;

public class Example7 {
    public static void main(String[] args) {

        int val1 = 15;
        int val2 = 10;

        System.out.println("val1: " + val1); //15
        System.out.println("val2: " + val2);

        //an exact copy is created for val1 and val2 and stored in a different location on stack
        //the modifications to these copies affect only them and not the original values
        swap(val1, val2);

        System.out.println("val1: " + val1);
        System.out.println("val2: " + val2);

    }

    private static void swap(int i, int j) {
        System.out.println("Inside the method: " + i);
        System.out.println("Inside the method: " + j);

        int temp = i;
        i = j;
        j = temp;

        System.out.println("Inside the method: " + i);
        System.out.println("Inside the method: " + j);

    }
}
