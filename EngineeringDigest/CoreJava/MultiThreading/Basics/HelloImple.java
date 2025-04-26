package EngineeringDigest.CoreJava.MultiThreading.Basics;

public class HelloImple {

    public static void main(String[] args) {

        WorldImple w2 = new WorldImple();
        Thread t1 = new Thread(w2);

        t1.start();


        for(; ; ){
            System.out.println(Thread.currentThread().getName());
        }
    }
}

//Notes
//-A new class world is created that implements runnable
//-The run method is overridden to define the code that constitutes the new thread
//-A thread object is created by passing an instance of MyRunnable
//-Start method is called on the Thread object to initiate the new thread
