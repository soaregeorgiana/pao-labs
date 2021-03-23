package ro.unibuc.lab6.genericinterfaces.example2;

/**
 * Using Java Generics we can type the Producer interface so
 * we can specify what type of object it produces when we use it.
 * <p>
 * Generics add a way to specify concrete types to general purpose classes and methods that operated on Object before
 */
public interface Producer<T> {

    T produce();
}
