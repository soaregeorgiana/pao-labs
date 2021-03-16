package ro.unibuc.lab5.strings;

/**
 * The StringBuffer class represents a mutable sequence of characters.
 * StringBuffer is safe for use by multiple threads.
 * The methods are synchronized where necessary so that all the operations on any particular instance
 * behave as if they occur in some serial order that is consistent with the order of the method calls
 * made by each of the individual threads involved
 */
public class StringBufferExample {

    public static void main(String[] args) {

        /*
         * Ex1:
         * Input: "I like chocolate"
         * Replace chocolate with sweets
         */
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("I like chocolate");
        stringBuffer.reverse();
        System.out.println(stringBuffer);

    }


}
