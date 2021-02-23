package ro.unibuc.lab.io;

import java.util.Scanner;

/**
 * When we need to read values form the System console we need to use the  Scanner class, a
 * simple text scanner which can parse primitive types and strings using regular expressions
 *
 * @see java.util.Scanner
 */
public class ReadingInput {

    public static void main(String[] args){

//        String myFirstString = "Something";
//        Scanner scanner = new Scanner(myFirstString);
//        System.out.println(scanner.nextLine());

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please insert your age: ");
        int age = myScanner.nextInt();
        System.out.println("Your age is: " + age);
    }
}
