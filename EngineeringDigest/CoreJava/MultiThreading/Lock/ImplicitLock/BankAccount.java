package EngineeringDigest.CoreJava.MultiThreading.Lock.ImplicitLock;

public class BankAccount extends Thread {

    private int balance = 100 ;

    public synchronized void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + " Attempting To Withdraw " +amount);

        if(this.balance >= amount){
            System.out.println(Thread.currentThread().getName() + " Processing With The Withdraw");
            try{
                Thread.sleep(5000);
            }catch(InterruptedException e){
            }
            this.balance -= amount;
            System.out.println(Thread.currentThread().getName()+ " Withdraw Completed, Remaining Balance In Account : " + this.balance);
        }else{
            System.out.println(Thread.currentThread().getName() + " Insufficient Balance In Your Account");
        }

    }

}
