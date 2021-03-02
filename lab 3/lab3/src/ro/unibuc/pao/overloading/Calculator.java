package ro.unibuc.pao.overloading;

/**
 * A class can have multiple versions of its constructor or methods = overloading
 * Overloading allows different methods to have the same name,
 * but different signatures where the signature can differ by:
 * - the number of input parameters
 * - the data type of input parameters
 * - the order of the input parameters
 */

/**
 * Write a program that allows you to calculate the sum between 2 int/double values, 3 int/double values and between an int and a double value
 * The return value should be a double
 */
public class Calculator {

    // difference in the data type of input parameters
    public double sum(int a, int b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    // difference in the number of input parameters
    public double sum(int a, int b, int c) {
        return a + b + c;
    }

    public double sum(double a, double b, double c) {
        return a + b + c;
    }

    // difference in the order of the input params
    public double sum(int a, double b) {
        return a + b;
    }

    public double sum(double a, int b) {
        return a + b;
    }

//    public double sum(int a, float b) {
//        return a + b;
//    }

}
