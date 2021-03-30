package lab7.exceptions.example1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 * An exception is an unwanted or unexpected event which occurs during the execution of
 * a program that disrupts the normal flow of that program
 * <p>
 * Error : indicates a serious problem that a reasonable application should not try to catch
 * Exception : indicates conditions that a reasonable application might try to catch.
 * <p>
 * The Exception Handling in Java is one of the powerful mechanisms to handle the runtime errors
 * so that normal flow of the application can be maintained.
 * <p>
 * Exceptions are Java objects with all of them extending from Throwable. There are three main
 * categories of exceptions:
 * -> Checked exceptions: exceptions that the Java compiler requires us to handle (IOException, SQLException)
 * -> Unchecked exceptions / Runtime exceptions: exceptions that the Java compiler does not require us to handle (NullPointerException, ArrayIndexOutOfBoundsException)
 * -> Errors: even though they don't extend RuntimeException, they are also unchecked (StackOverflowError, OutOfMemoryError)
 */
public class WorkingWithExceptions {

    public static void main(String[] args) throws FileNotFoundException {

//        File file = new File("/non-existing.txt");
//        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
//
//        String myString = null;
//        System.out.println(myString.length());

        int[] myArray = {1,2};
        System.out.println(myArray[3]);
    }

}
