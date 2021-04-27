package ro.unibuc.lab11.example4;

/**
 * The join method allows one thread to wait for the completion of another. If t is a Thread
 * object whose thread is currently executing, t.join(); causes the current thread to pause
 * execution until t's thread terminates.
 */
public class WorkingWithJoin {

    /**
     * imagine you need to query data from two databases (the order does not matter)
     * -> query DB1 -> 3 seconds
     * -> query DB2 -> 2 seconds
     * 3 + 2 -> in case we query one ofter another then after about 5 seconds can start the processing
     * max(3,2) = 3 seconds in case we run them in parallel
     * <p>
     * -->processing: we need to ensure that the processing start after the query finished -> join()
     */
    public static void main(String[] args) {


    }
}
