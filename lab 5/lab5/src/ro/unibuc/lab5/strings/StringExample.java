package ro.unibuc.lab5.strings;

/**
 * Strings are Objects that are backed internally by a char array.
 * Since arrays cannot grow - are immutable, Strings are immutable as well which means
 * whenever a change to a String is made, an entirely new String is created
 */
public class StringExample {

    public static void main(String[] args) {

        String ex1 = "ex1"; //literal
        String ex2 = "ex1";
        String ex3 = new String("ex1");

        System.out.println(ex1 == ex2); // true
        System.out.println(ex1 == ex3); // false

        /*
         * Ex1: Count the words from a phrase
         * Input: "All we have is now"
         * Output: 5
         */
        String input = "All we have is now";
        String[] words = input.split(" ");
        System.out.println(words.length);


        /*
         * Ex2:
         * Replace 'we' with 'you'.
         */
        String replaced = input.replace("we", "you");
        System.out.println(input);
        System.out.println(replaced);

        /*
         * Ex3:
         * Extract the last word
         * Output: now
         */

        String lastWord = input.substring(input.lastIndexOf(" ") + 1);
        System.out.println(lastWord);
    }
}
