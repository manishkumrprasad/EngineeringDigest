package EngineeringDigest.CoreJava.MultiThreading.Lock.ExplicitLock.Practice;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AccessingLock extends Thread{
    private final Lock lock = new ReentrantLock();

    public void show() throws InterruptedException {
        //lock.lock(); it tells the thread to Wait here until the lock is available, then acquire it.

        //the thread will wait for 5 seconds to get the lock
        if (lock.tryLock(5 , TimeUnit.SECONDS)){
            try{
                System.out.println(Thread.currentThread().getName() + " Got The Thread");
                Thread.sleep(3000); //the current thread will be halted for 3000 seconds
            } catch (Exception e) {
                throw new RuntimeException(e);
            }finally {
                lock.unlock();
            }
        }else {
            System.out.println(Thread.currentThread().getName() + " Didn't Acquire The Lock");
        }
    }
}

class Main{

    public static void main(String[] args) {
        // Create a shared instance of AccessingLock
        AccessingLock accessingLock = new AccessingLock();

        // Create first thread using Runnable
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    accessingLock.show();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "Thread-1");

        // Create second thread using Runnable
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    accessingLock.show();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "Thread-2");

        // Start both threads
        t1.start();
        t2.start();

    }
}
