package EngineeringDigest.CoreJava.MultiThreading.Basics;

public class PlayingWithSleep extends Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(10000);
            System.out.println("Thread One Executed");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        PlayingWithSleep p1 = new PlayingWithSleep();
        p1.start();
        p1.join(); //Ask Ai -> can I use join method to halt other thread and execute main method
        Thread.sleep(2000);
        System.out.println("Main Thread Executed");

    }

}
