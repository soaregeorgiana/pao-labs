package lab7.io;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WritingDataService {

    public static void writeUsingFileOutputStream(String text) {
        try (FileOutputStream out = new FileOutputStream("output1.txt")) {
            out.write(text.getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeUsingFileWriter(String text) {
        try (FileWriter out = new FileWriter("output2.txt")) {
            out.write(text);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeUsingDataOutputStream(String text) {
    }

    public static void writeUsingBufferedOutputStream(String text) {
    }

    /**
     * BufferedWriter class is used to provide buffering for Writer instances. It makes the performance
     * fast. It inherits Writer class. The buffering characters are used for providing the efficient writing
     * of single arrays, characters, and strings.
     */
    public static void writeUsingBufferedWriter(String text) {
    }

    public static void writeWithRandomAccessFile() throws IOException {
    }
}
