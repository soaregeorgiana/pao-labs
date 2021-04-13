package ro.unibuc.lab9.functionalinterface;

public class Story implements Printable {

    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
