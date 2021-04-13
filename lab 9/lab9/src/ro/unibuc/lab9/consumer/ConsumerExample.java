package ro.unibuc.lab9.consumer;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/**
 * A Consumer accepts a single argument and returns no result .
 * Its abstract method is accept(Object).
 * Java 8 also provides convenient interfaces for the primitive data types:
 * IntConsumer, LongConsumer, DoubleConsumer, BiConsumer, ObjtIntConsumer,
 * ObjLongConsumer, and ObjDoubleConsumer.
 */
public class ConsumerExample {

    public static void printBiConsumer() {
        BiConsumer<String, String> echo = (x, y) -> {
            System.out.println(x);
            System.out.println(y);
        };
        echo.accept("This is the first line", "This is the second one");
    }

    public static void getIntroduction(List<String> names) {
        Consumer<String> sayHello = name -> System.out.println("Hello " + name);
        Consumer<String> sayWelcome = name -> System.out.println("welcome!");
        Consumer<String> presentConsumer = sayHello.andThen(sayWelcome);
        names.forEach(presentConsumer);
    }

    public static void convertText(String text, Integer option) {
        BiConsumer<String, Integer> convertConsumer = (String t, Integer op) -> {
            switch (op) {
                case 1:
                    System.out.println(t.toUpperCase());
                    break;
                case 2:
                    System.out.println(t.toLowerCase());
                    break;
                default:
                    System.out.println(t);
            }
        };
        convertConsumer.accept(text, option);
    }

    public static void printDoubleConsumer() {
        DoubleConsumer echo = System.out::println;
        echo.accept(2.34);
    }

    public static void printIntConsumer() {
        IntConsumer echo = System.out::println;
        echo.accept(2);
    }

    public static void printLongConsumer() {
        LongConsumer echo = System.out::println;
        echo.accept(24);
    }
}
