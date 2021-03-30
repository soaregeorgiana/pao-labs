package lab7.exceptions.example1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.file.AccessDeniedException;

public class AntiPatterns {

    /**
     * swallowing Exceptions
     */
    public static void writeTimetable() {
        try {
            FileOutputStream outputStream = new FileOutputStream("input.txt");
            // TODO
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            // we should log the errors
        }
    }

    /**
     * using return in a finally Block
     */
    public static boolean getGrade() {
        try {
            FileOutputStream outputStream = new FileOutputStream("input.txt");
            // TODO
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            return false;
        }
    }

    /**
     * using throw in a finally Block
     */
    public void throwingInFinally() throws AccessDeniedException {
        try {
            FileOutputStream outputStream = new FileOutputStream("input.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            throw new AccessDeniedException("there is a problem");
        }
    }

}
