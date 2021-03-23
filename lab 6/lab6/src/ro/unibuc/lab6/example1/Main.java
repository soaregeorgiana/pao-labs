package ro.unibuc.lab6.example1;

public class Main {

    public static void main(String[] args) {

        /**
         * Accessing a variable from an interface is similar
         * to accessing a static variable in a class
         */

        System.out.println(FirstInterface.HELLO);
        FirstInterface.print("Message");

        Example1 example1 = new Example1();
        System.out.println(example1.sayHello());
        System.out.println(example1.sayGoodBye());

        FirstInterface firstInterface = new Example1();
        System.out.println(firstInterface.sayGoodBye());
        //firstInterface.myMethod() -> compilation error
    }
}
