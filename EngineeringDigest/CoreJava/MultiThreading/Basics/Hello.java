package EngineeringDigest.CoreJava.MultiThreading.Basics;

public class Hello {
    public static void main(String[] args) {

        //This Is One Thread
        World w1 = new World();
        w1.start();

        //And The VectorDemo Method Is Another Method
        for(; ; ){
            System.out.println(Thread.currentThread().getName());
        }

        //Both this thread are executing concurrently
    }
}

//Notes
//-A new class world is created that extends Thread
//-The run method is overridden to define the code that constitutes the new thread
//-Start method is called to initiate the new thread

//--To create a new thread in java, you can either extend the thread class or implement the runnable interface
//In both the cases, the run method contains the code that will be executed in the new thread