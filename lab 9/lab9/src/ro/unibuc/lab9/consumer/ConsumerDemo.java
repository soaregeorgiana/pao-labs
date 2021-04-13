package ro.unibuc.lab9.consumer;

import java.util.Arrays;
import java.util.List;

public class ConsumerDemo {

    public static void main(String[] args) {
        ConsumerExample.printBiConsumer();
        ConsumerExample.printIntConsumer();
        ConsumerExample.printLongConsumer();
        ConsumerExample.printDoubleConsumer();

        List<String> names = Arrays.asList("Ana", "Blandiana");
        ConsumerExample.getIntroduction(names);

        ConsumerExample.convertText("Some ideas here", 1);
    }
}
