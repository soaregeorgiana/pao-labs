package lab7.io.exercises.ex2.services;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LoggingService {

    public void log(String message) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("students-management.txt", true))){
            writer.write(message);
            writer.write("\n");
        } catch (IOException e){
            //TODO
            System.out.println(e.getMessage());
        }
    }
}
