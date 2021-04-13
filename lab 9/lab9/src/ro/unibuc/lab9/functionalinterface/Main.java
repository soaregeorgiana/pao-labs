package ro.unibuc.lab9.functionalinterface;

/**
 * A lambda expression is characterized by the following syntax:
 * (A list of parameters separated by commas) -> {expression body which
 * contains one or more statements}
 * A lambda expression can be shortened in two ways because JDK compiler supports type
 * inference.
 * - Can omit the declaration of the parameter’s type. The compiler can infer it from the
 * parameter’s value.
 * - Can omit the return keyword if the expression body has a single expression.
 * A lambda expression can be simplified with the following conditions:
 * - Can omit the parenthesis for a single parameter.
 * - Can omit the curly brackets if the expression body only contains a single statement.
 */
public class Main {

    public static void main(String[] args) {
        //Method1
        Printable story = new Story();
        story.print("Text");

        //Method2:
        Printable printable = text -> System.out.println(text);
        printable.print("Text");

        Printable printableTwo = System.out::println;
        printableTwo.print("Text");

        //--------------------------------------
        //Method1
        //Method2 = Anonymous classes
        Calculator calculator = new Calculator() {
            @Override
            public Double sum(Double a, Double b) {
                return a + b;
            }
        };
        System.out.println(calculator.sum(23.5, 6.5));
        //Method3
        //Calculator calculatorWithLambda = (a, b) -> a + b;
        Calculator calculatorWithLambda = Double::sum;
        calculatorWithLambda.sum(23.5, 6.5);
    }
}
