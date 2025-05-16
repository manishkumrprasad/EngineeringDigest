package EngineeringDigest.CoreJava.MultiThreading.Synchronization;

public class Counter {
    public int count = 0;
    public synchronized void increment() {
        this.count += 1;

    }

    public int getCount(){
        return count ;
    }
}
