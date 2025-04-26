package EngineeringDigest.CoreJava.MultiThreading.Basics;

public class Revision_MyThread extends Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Revision_MyThread my1 = new Revision_MyThread();
        System.out.println(my1.getState());

        my1.start();
        System.out.println("State After Calling Start Method = " + my1.getState());

        //Make Main Method Sleep For Some Seconds
        Thread.sleep(1000);
        System.out.println(my1.getState());

        my1.join(); //whatever code written after this will be executed after the thread-0 terminate
        System.out.println("running after thread-0 terminates");



    }
}
