package lab7.io.exercises.ex1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercise1 {

    /**
     * Copy the text from ex1.txt file usingBufferedOutputStream
     * And display the date using DataInputStream
     */

    private final static String RESOURCE_PATH = System.getProperty("user.dir") + "\\lab7\\src\\lab7\\io\\exercises\\ex1\\resources";

    public static void main(String[] args) {
        try {
            copyTextWithBuffer();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        display();

    }

    private static void copyTextWithBuffer() throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(RESOURCE_PATH + "\\ex1.txt"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(RESOURCE_PATH + "\\copy.txt"));
        byte[] bytes = bufferedInputStream.readAllBytes();
        bufferedOutputStream.write(bytes);
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }

    public static void display() {
        StringBuilder builder = new StringBuilder();
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(RESOURCE_PATH + "\\ex1.txt"))) {
            while (dataInputStream.available() > 0) {
                builder.append((char)dataInputStream.read());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(builder);
    }

}
