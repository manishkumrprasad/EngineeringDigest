package EngineeringDigest.CoreJava.MultiThreading.Basics;

public class CurrentThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = Thread.currentThread();


        System.out.println("VectorDemo Thread Reference = "+ t1);
        System.out.println("Current Name Of The Thread = "+t1.getName());

        t1.setName("MainThread");
        System.out.println("Name After Changing = "+t1.getName());

        for (int i = 5 ;i > 0 ;i--){
            System.out.println("Time Left = " + i);
            Thread.sleep(1000);
        }
        System.out.println("BoooooooooooM");
    }
}
