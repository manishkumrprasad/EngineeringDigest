package EngineeringDigest.CoreJava.MultiThreading.Basics;

public class SetDaemon extends Thread {
    @Override
    public void run() {
        while (true){
            System.out.println("Hello World!");
        }
    }

    public static void main(String[] args) {
        SetDaemon s1 = new SetDaemon();
        s1.setDaemon(true); //set s1 as a daemon thread

        s1.start();
        System.out.println("Main Thread");

    }
}
