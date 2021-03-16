package ro.unibuc.lab5.strings;

/**
 * The StringBuilder class represents a mutable sequence of characters.
 * Since the String class in Java creates an immutable sequence of characters,
 * the StringBuilder class provides an alternative to String, as it creates a mutable sequence of characters
 */
public class StringBuilderExample {

    public static void main(String[] args) {

        /*
         * Ex1:
         * Reverse the the following input "I like chocolate"
         */

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("I like chocolate");
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }

}
