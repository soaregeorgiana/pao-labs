package lab7.exceptions.example3;

import java.io.FileNotFoundException;

/**
 * Subclasses can throw fewer checked exceptions than their superclass, but not more - homework
 */
public class SubClass extends SuperClass {

    @Override
    public void myMethod() throws FileNotFoundException {
        throw new FileNotFoundException();
    }
//
//    @Override
//    public void myMethod() throws Exception {
//        throw new Exception();
//    }
}
