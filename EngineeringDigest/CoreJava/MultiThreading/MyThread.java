package EngineeringDigest.CoreJava.MultiThreading;

public class MyThread extends Thread{

    @Override
    public void run() {
        //System.out.println("Inside run method");
        System.out.println("Now I Am Running Thread One");
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            //throw new RuntimeException(e);
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //timestamp - 34:00
        MyThread t1 = new MyThread();
        System.out.println("Thread One Status = "+t1.getState()); //NEW

        t1.start();
        System.out.println("Thread One Status = "+t1.getState()); //RUNNABLE
        //System.out.println(Thread.currentThread().getState());
        Thread.sleep(100);
        System.out.println("Thread One Status = " + t1.getState()); //TIME-WAITING

        t1.join();
        System.out.println("Thread One Status = " + t1.getState()); //TERMINATED


    }

}
