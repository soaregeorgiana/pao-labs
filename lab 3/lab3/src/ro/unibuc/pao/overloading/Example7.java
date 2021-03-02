package ro.unibuc.pao.overloading;

public class Example7 {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(23,27));
        System.out.println(calculator.sum(23.5,27.7));

        System.out.println(calculator.sum(23,27, 45));
        System.out.println(calculator.sum(23.5,27.7, 7.4));

        System.out.println(calculator.sum(23,3.5));
        System.out.println(calculator.sum(23.5,5));

        //type promotion
        System.out.println(calculator.sum(23,3.5f));
    }
}
