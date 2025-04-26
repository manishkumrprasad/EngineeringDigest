package EngineeringDigest.CoreJava.MultiThreading.Basics;

public class World extends Thread {

    @Override
    public void run() {
        for (; ; ){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
