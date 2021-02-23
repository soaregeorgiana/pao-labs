package ro.unibuc.lab.references;

import java.util.ArrayList;

/**
 * Wrapper classes are objects encapsulating primitive Java types (Java Collection Framework works with objects exclusively)
 * <p>
 * Primitive Data Type  |  Wrapper Class
 * - byte                   Byte
 * - short                  Short
 * - int                    Integer
 * - long                   Long
 * - float                  Float
 * - double                 Double
 * - boolean                Boolean
 * - char                   Character
 * <p>
 * <p>
 * Autoboxing
 * - refers to converting a primitive value into a corresponding wrapper object (is made automatically by the java compiler)n
 * - eg. Integer val = 2;
 * Unboxing
 * - refers to converting an object of a wrapper type (Integer) to its corresponding primitive (int) value
 * - eg. Integer object = new Integer(1); int val1 = object //unboxing
 */

public class WrapperClasses {

    public static void main(String[] args){
        int i = 10;
        Integer intWrapped = Integer.valueOf(100);
        short shortPrimitive = 100;
        //Short shortWrapped = Short.valueOf(shortPrimitive);
        Short shortWrapped = 100;
        System.out.println(shortWrapped.shortValue());

    }

}
