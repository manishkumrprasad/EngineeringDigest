package EngineeringDigest.CoreJava.MultiThreading.Lock.ExplicitLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAcc extends Thread {

    int accountNum;
    int balance = 0;
    String accHolderName = "";

    BankAcc(int balance , int accNum , String accHolderName) {
        this.balance = balance;
        this.accountNum = accNum;
        this.accHolderName = accHolderName;
    }

    private final Lock lock = new ReentrantLock();
    public void Withdraw(int amt)  {

        try {

            if (lock.tryLock()) {

                if (amt < this.balance) {

                    try {

                        System.out.println(Thread.currentThread().getName() + " Processing Your Payment");
                        Thread.sleep(2000);
                        System.out.println("Withdraw Successful");
                        this.balance -= amt;

                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    } finally {
                        lock.unlock();
                    }

                } else {
                    System.out.println("Insufficient Back Balance, Please Enter A Valid Withdraw Amount");
                }
            } else {
                System.out.println("Would Not Acquire The Lock, Try Again Later");
            }
        } finally {
            System.out.println("Program Run Successfully");
        }

    }
}
