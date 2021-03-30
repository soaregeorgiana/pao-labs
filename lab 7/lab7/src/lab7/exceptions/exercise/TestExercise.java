package lab7.exceptions.exercise;

import java.util.Scanner;

public class TestExercise {

    /**
     * Write a program which divides a number to another.
     * Handle at least two exceptions
     * Create a custom one
     */
    public static void main(String[] args) {

        double result = 0;
        try {
            divide();
        } catch (DivideByZeroException exception){
            System.out.println(exception.getMessage());
        }
    }

    private static double divide() {
        double result = 0.0;
        Scanner inputOne = new Scanner(System.in);
        System.out.println("Enter x: ");
        String sx = inputOne.next();
        System.out.println("Enter y: ");
        String sy = inputOne.next();

        int x, y;
        try {
            x = Integer.parseInt(sx);
            y = Integer.parseInt(sy);
            if (y == 0) {
                throw new DivideByZeroException("y is zero");
            }
            result = (double) x / y;
        } catch (NumberFormatException numberFormatException) {
            System.out.println(numberFormatException.getMessage());
        }
        return result;
    }

}
