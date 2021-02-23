package ro.unibuc.lab.basics;

/**
 * Primitive Data Types
 * <p>
 * They're stored directly on the stack
 * The eight primitives defined in Java are byte, short, int, long, float, double, boolean, and char.
 * <p>
 * Type: byte Size(bits): 8 Minimum: -2^7 Maximum: 2^7– 1 Default value: 0
 * Type: short Size(bits): 16 Minimum: -2^15 Maximum: 2^15– 1 Default value: 0
 * Type: int Size(bits): 32 Minimum: -2^31 Maximum: 2^31– 1 Default value: 0
 * Type: long Size(bits): 64 Minimum: -2^63 Maximum: 2^63– 1 Default value: 0L
 * Type: float Size(bits): 32 Minimum: -2^149 Maximum: (2-2^(-23))·2^127 Default value: 0.0F
 * Type: double Size(bits): 64 Minimum: -2^1074 Maximum: (2-2^(-52))·2^1023 Default value: 0.0
 * Type: char Size(bits): 16 Minimum: 0 Maximum: 2^16-1 Default value: '/u0000'
 * Type: boolean Size(bits): 1 Minimum: - Maximum: - Default value: false
 * <p>
 * Obs:
 * - If the variable is defined in a method, we must assign a value before we can use it, we cannot count on the default values.
 * - If a variable is used in a mathematical expression with a larger type, it will be cast up to the largest type in the expression
 * (Eg: int + byte = int).
 * - numeric literals can have underscores inside them, for separating groups. However, a numeric literal cannot start
 * or end with an underscore (Eg: int invalidValue = _52 is an invalid number).
 * - numeric literals can be expressed by these number systems: binary, octal, decimal and hexadecimal
 * - long is the largest numeric non-floating point type in java (can hold 14 digits)
 * - double is the default floating-point number in java
 * <p>
 * The difference between the fourth primitives for the non-fractional numbers is the amount of data which can be stored by any of them.
 */

public class Primitives {

    /**
     * How to create java variables:
     * Declare (specify the type)
     * Initialize:the "=" operator is used for assigning values
     */
    public static void main(String[] args) {
        //----------- non-floating point-------------
        byte b1;
        b1 = 10;
        byte b2 = 100; //[-128,127]
//        byte b3 = (byte)128; //-128
//        System.out.println(b3);

        short s1 = 128;
        System.out.println(s1);

        int i1 = 1200;
        System.out.println(i1);
        int decimalInt = 10, octalInt, binaryInt, hexaInt;
        octalInt = 057;
        hexaInt = 0xFF; //[0;F]
        binaryInt = 0b10;

        System.out.println(decimalInt);
        System.out.println(octalInt);
        System.out.println(binaryInt);
        System.out.println(hexaInt);

        int i2 = 100_000;
//        int invalidOne = _1000;

        long l1 = 100000000000L; //L, l = literal
        System.out.println(l1);

        //----------- floating-point-----------------
        //float
        float f1 = 10.5F;// F, f literal
        f1 = (float) 10.6;

        int myInt = (int) f1;
        System.out.println(myInt);//10
        //double
        double d1 = 5.5;
        System.out.println(d1);
        // double d2 = f1;
        f1 = (float) d1;

        //------------single characters--------------
        char myChar = 'a';
        System.out.println(myChar);
        myChar = '\u0068';
        char mySecondChar = '\n';
        System.out.print(mySecondChar);
        System.out.print(myChar);

        //----------- true or false values----------
        boolean myBoolean = true;
        boolean mySecondBoolean = false;
        System.out.println(b1);
        System.out.println(b2);

        boolean altNume = 5<7;
        System.out.println(altNume);

    }


}
