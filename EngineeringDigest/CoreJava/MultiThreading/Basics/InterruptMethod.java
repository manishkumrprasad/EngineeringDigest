package EngineeringDigest.CoreJava.MultiThreading.Basics;

public class InterruptMethod extends Thread {

    @Override
    public void run() {
        try{
            Thread.sleep(2000);
            System.out.println("Is I Am Sleeping?"); // This line will not be executed if the thread is interrupted

        } catch (InterruptedException e) {
            System.out.println("Sleeping........"); // This line will be executed if the thread is interrupted

        }

    }

    public static void main(String[] args) {
        InterruptMethod i1 = new InterruptMethod();
        i1.start(); //start the thread
        i1.interrupt();  // Interrupt the thread immediately after starting it

    }
}
