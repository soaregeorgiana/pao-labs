/**
 * This must be the first executable line in the file. It represents the location of the file.
 * It can be missing if the classes are not part of any package. However, this is rarely left out and is considered a bad design if it does.
 */
package ro.unibuc.lab.references;

/**
 * This line imports the Random class, so we can use it without specifying each time the package.
 * If the class does not use any classes from other packages, this section can be missing all together.
 */

/**
 * This is the declaration of the class. Keep in mind that if this class is public, the file must
 * be named exactly the same, with the extension ".java".
 * <p>
 * Classes provide a structure (a template) for describing and creating objects
 * An object represents what we want to work on and hw we work with
 */
public class ClassStructure {

    /**
     * instance field members
     * store object states
     */
    public int myFirstAttribute;

    /**
     * static fields
     */
    public static int myFirstStaticField;

    /**
     * Instance initialisation block
     * A class can have multiple such blocks and they will be executed in the order that they appear in the class.
     */ {
        myFirstAttribute = 10;
        System.out.println(2);
    }

    /**
     * Class initialization block. It is run the first time the class is references somewhere. It can only access
     * static fields and methods in the class.
     */
    static {
        myFirstStaticField = 5;
        System.out.println(1);
    }

    /**
     * Constructors
     * executable code used during object creation to set the initial state
     */

    public ClassStructure() {
        System.out.println(3);
    }

    public ClassStructure(int myFirstAttribute) {
        this.myFirstAttribute = myFirstAttribute;
    }

    /**
     * Class method member.
     * Executable code that manipulates state and performs operations
     * Signature:
     * - the access modifier. Can be "private", "protected", "public" or it can be left out, meaning it's "default" or "package private".
     * - the return type of the method. If the method does not return anything, the return type is "void".
     * - the method name - can be any valid identifier in the java language
     * - parameters - optional (type and name)
     */

    public void sayHello(String name) {
        System.out.print("Hello, " + name);
    }

    /**
     * This is the main entry point in a java class. If a class should be run, this is the signature that the java runtime environment
     * will look for. The args parameter will always have at least one value in it: args[0] will be the name of the class called.
     * If any argument have been supplied when running the class, they will follow in the array.
     */
    public static void main(String[] args) {
//        Random myRandom = new Random();
//        System.out.println(pow(myRandom.nextInt(9), 2));

        ClassStructure cs1 = new ClassStructure();
        ClassStructure cs2 = new ClassStructure();
//        System.out.println(cs1.myFirstAttribute);
    }
}
