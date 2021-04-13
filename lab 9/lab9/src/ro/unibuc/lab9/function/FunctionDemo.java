package ro.unibuc.lab9.function;

import java.util.Arrays;
import java.util.List;

public class FunctionDemo {
    public static void main(String[] args) {
        String stringsBiFunction = FunctionExample.concatStringsBiFunction("Functional ", "Interface");
        System.out.println(stringsBiFunction);

        int multiplyTwoIntsBiFunction = FunctionExample.multiplyTwoIntsUsingBiFunction(9, 7);
        System.out.println(multiplyTwoIntsBiFunction);

        long toLongFunction = FunctionExample.convertDoubleToLongUsingDoubleToLongFunction(34.88);
        System.out.println(toLongFunction);

        String stringDoubleFunction = FunctionExample.convertDoubleToStringUsingDoubleFunction(456.87);
        System.out.println(stringDoubleFunction);

        double power = FunctionExample.powerTwoIntUsingToDoubleBiFunction(2, 4);
        System.out.println(power);

        List<String> words = Arrays.asList("The", "That", "John", "Thanks");
        FunctionExample.convertStringToIntegerFunction(words);

        System.out.println(FunctionExample.convertIntegerToStringUsingIntFunction(5));
        System.out.println(FunctionExample.convertIntToDoubleUsingIntToDoubleFunction(8));
    }
}
