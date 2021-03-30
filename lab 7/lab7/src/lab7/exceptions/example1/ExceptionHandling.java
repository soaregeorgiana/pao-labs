package lab7.exceptions.example1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

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

    public void write() throws FileNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("input.txt");
        //TODO:
    }

    public void writeToFile() {
        try {
            //TODO:
            FileOutputStream fileOutputStream = new FileOutputStream("input.txt");
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
            //TODO
        }
    }

    public void writeToFileAndPrintInfo() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("input.txt");
            //TODO:
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
            //TODO
        } finally {
            System.out.println("This is some info");
        }
    }

    public void writeNumberToFile() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("input.txt");
            fileOutputStream.write(String.valueOf(95).getBytes());
        } catch (FileNotFoundException exception) {
            System.out.println("Not Found");
            //TODO
        } catch (IOException e) {
            e.printStackTrace();
            //TODO
        } finally {
            System.out.println("This is some info");
        }
    }

    //java 7
    public void writeTextToFile() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("input.txt");
            int number = Integer.parseInt("2f5");
            fileOutputStream.write(String.valueOf(number).getBytes());
        } catch (IOException | NumberFormatException exception) {
            System.out.println("Not Found");
            //TODO
        } finally {
            System.out.println("This is some info");
        }
    }


    public void openExistingFile(String filePath) {
        RandomAccessFile file = null;
        try {
            file = new RandomAccessFile(filePath, "r");
            System.out.println(file.readLine());
            return;
        } catch (FileNotFoundException exception) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Sth wrong");
        } finally {
            System.out.println("This instruction will be always called");
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void openExistingFileWithTryWithResources(String filePath) {
        try (RandomAccessFile file = new RandomAccessFile(filePath, "r")){
            System.out.println(file.readLine());
        } catch (FileNotFoundException exception) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Sth wrong");
        }
    }

}
