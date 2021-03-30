package lab7.exceptions.example1;

/**
 * There are plenty of places where things can go wrong. Some of these places are marked with
 * exceptions, either in the signature or the Javadoc: public FileOutputStream(String name) throws FileNotFoundException {}
 * <p>
 * ExceptionHandling:
 * -> The simplest way to handle an exception is to rethrow it
 * -> If we want to try and handle the exception ourselves, we can use a try-catch block.
 * -> There are times when we have code that needs to execute regardless of whether an exception
 * occurs, and this is where the finally keyword comes in.
 * Even if a FileNotFoundException is thrown up the call stack, Java will call the contents of finally
 * before doing that.
 */
public class ExceptionHandling {

}
