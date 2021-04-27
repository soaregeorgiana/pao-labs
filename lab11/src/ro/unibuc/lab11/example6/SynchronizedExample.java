package ro.unibuc.lab11.example6;

public class SynchronizedExample {

    private  int counter = 0;

    public synchronized  void  increment(){
        counter++;
    }

    public synchronized  void  decrement(){
        counter--;
    }

    public synchronized  int evaluate(){
        return  counter;
    }
}
