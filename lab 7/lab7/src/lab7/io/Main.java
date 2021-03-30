package lab7.io;

public class Main {

    public static void main(String[] args) {
        WritingDataService.writeUsingFileOutputStream("Test One");
        ReadingDataService.readUsingFileInputStream();
//
        WritingDataService.writeUsingFileWriter("Test two");
        ReadingDataService.readUsingFileReader();
//
//        WritingDataService.writeUsingDataOutputStream("Test three");
//        ReadingDataService.readUsingDataInputStream();
//
//        WritingDataService.writeUsingBufferedOutputStream("Test four");
//        ReadingDataService.readUsingBufferedInputStream();
//
//        WritingDataService.writeUsingBufferedWriter("Test five");
//        ReadingDataService.readUsingBufferedReader();

    }
}
