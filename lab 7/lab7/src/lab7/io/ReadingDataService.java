package lab7.io;

/**
 * Java I/O (Input and Output) is used to process the input and produce the output.
 * The java.io package contains different ways to perform input and output (I/O) in Java.
 * All these streams represent an input source and an output destination.
 * <p>
 * -> InputStream - The InputStream is used to read data from a source
 * -> OutputStream - The OutputStream is used for writing data to a destination.
 */
public class ReadingDataService {

    /**
     * Byte Streams:
     * are used to perform input and output of 8-bit bytes
     * frequently used classes are FileInputStream and FileOutputStream
     */
    public static void readUsingFileInputStream() {
    }

    /**
     * Character streams
     * used to perform input and output for 16-bit unicode.
     * frequently used classes: FileReader and FileWriter
     * internally FileReader uses FileInputStream and FileWriter uses FileOutputStream
     * but here the major difference is that FileReader reads two bytes at a time and
     * FileWriter writes two bytes at a time
     */
    public static void readUsingFileReader() {
    }

    /**
     * DataInputStream class allows an application to read primitive data from the input stream.
     * Java application generally uses the data output stream to write data that can later be read by a
     * data input stream.
     */
    public static void readUsingDataInputStream() {
    }

    /**
     * BufferedInputStream
     * -> provides transparent reading of chunks of bytes and buffering for a Java InputStream,
     * including any subclasses of InputStream
     * -> Reading larger chunks of bytes and buffering them can speed up IO.
     * -> BufferedInputStream reads a larger block at a time into an internal buffer. When you
     * read a byte from the Java BufferedInputStream you are therefore reading it from its
     * internal buffer. When the buffer is fully read, the BufferedInputStream reads another
     * larger block of data into the buffer. This is much faster than reading a single byte at a
     * time from an InputStream, especially for disk access and larger data amounts.
     * To add buffering to an InputStream simply wrap it in a BufferedInputStream
     */
    public static void readUsingBufferedInputStream() {
    }

    /**
     * BufferedReader class is used to read the text from a character-based input stream. It can be
     * used to read data line by line by readLine() method. It makes the performance fast. It inherits
     * Reader class.
     */
    public static void readUsingBufferedReader() {
    }

    /**
     * RandomAccessFile implements DataOutput and DataInput
     */
    public static void readWithRandomAccessFile() {
    }

}
