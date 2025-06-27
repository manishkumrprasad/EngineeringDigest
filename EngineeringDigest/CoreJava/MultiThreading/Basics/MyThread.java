package EngineeringDigest.CoreJava.MultiThreading.Basics;

public class MyThread extends Thread{

    @Override
    public void run() {
        //System.out.println("Inside run method");
        System.out.println("Now I Am Running Thread One");
        try{
            Thread.sleep(2000);
            System.out.println("Thread-0 Priority = "+Thread.currentThread().getPriority());

        } catch (InterruptedException e) {
            //throw new RuntimeException(e);
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //timestamp - 34:00
        MyThread t1 = new MyThread();
//        Thread.currentThread().setPriority(10);
        System.out.println("Thread One Status = "+t1.getState()); //NEW
        System.out.println("VectorDemo Thread Priority = "+Thread.currentThread().getPriority());

        t1.start();
        System.out.println("Thread One Status = "+t1.getState()); //RUNNABLE
        //System.out.println(Thread.currentThread().getState());
        Thread.sleep(100);
        System.out.println("Thread One Status = " + t1.getState()); //TIME-WAITING

        t1.join();
        System.out.println("Thread One Status = " + t1.getState()); //TERMINATED


    }

}
