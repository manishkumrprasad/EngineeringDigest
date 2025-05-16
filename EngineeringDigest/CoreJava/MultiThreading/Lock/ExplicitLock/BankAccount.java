package EngineeringDigest.CoreJava.MultiThreading.Lock.ExplicitLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount extends Thread {

    private int balance = 100 ;


    private final Lock lock = new ReentrantLock();

    public synchronized void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + " Attempting To Withdraw " +amount);

        try{
            if(lock.tryLock(1000 , TimeUnit.MILLISECONDS)){

                if(this.balance >= amount){

                    try{
                        System.out.println(Thread.currentThread().getName() +" Processing Your Payment");
                        Thread.sleep(2000);
                        this.balance -= amount ;
                        System.out.println(Thread.currentThread().getName() + " Money Withdraw Successfully");
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }finally {
                        lock.unlock();
                    }

                   }else{
                    System.out.println(Thread.currentThread().getName() + " Something Went Wrong");
                }
            }else{
                System.out.println(Thread.currentThread().getName() + " could not acquire the lock, will try later on");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
