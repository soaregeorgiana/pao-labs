package ro.unibuc.lab10.stream.example2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Stream of File:
 * NIO class Files allows one to generate a Stream<String> of a text file through the lines()
 * method. Every line of the text becomes an element of the stream:
 */
public class StreamOfFileExample {

    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("src/resources/data.txt");

        Stream<String> fileData = Files.lines(filePath);

        fileData.forEach(System.out :: println);
    }
}
