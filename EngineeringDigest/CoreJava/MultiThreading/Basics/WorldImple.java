package EngineeringDigest.CoreJava.MultiThreading.Basics;

public class WorldImple implements Runnable{
    @Override
    public void run() {
        for(; ;){
            System.out.println("World");
            System.out.println(Thread.currentThread().getName());
        }
    }
}
