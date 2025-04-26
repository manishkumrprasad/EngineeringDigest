package EngineeringDigest.CoreJava.MultiThreading;

public class ChangeThreadName extends Thread{

    public ChangeThreadName(String Name){
        super(Name);
    }

    @Override
    public void run() {
        for(int i = 1 ; i <=10 ; i++){
            System.out.println("Thread Name = "+Thread.currentThread().getName() + " Thread Priority = " + Thread.currentThread().getPriority() + " Count = "+ i);
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        ChangeThreadName c1 = new ChangeThreadName("C1");
        ChangeThreadName c2 = new ChangeThreadName("C2");
        ChangeThreadName c3 = new ChangeThreadName("C3");

        //CASE - 1
        //c1.start();
        //c2.start(); //all of these are running simultaneously
        //c3.start();

        //now using superiority we can control the execution of any particular thread

        //CASE - 2
        c1.setPriority(Thread.MAX_PRIORITY);
        c2.setPriority(Thread.MIN_PRIORITY);
        c3.setPriority(Thread.MIN_PRIORITY);

        //This is not the strict rules these are just the normal rules which are given to the JVM

        c1.start();
        c2.start();
        c3.start();

    }
}
