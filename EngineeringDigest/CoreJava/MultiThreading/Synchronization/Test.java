package EngineeringDigest.CoreJava.MultiThreading.Synchronization;

public class Test {

    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);

        t1.start();
        t2.start();
        /*In This Case, Both Thread t1 and t2 are trying to access the same methods that is defined inside Counter class
         this is the problem of thread interfaces, and this problem can be solved using synchronized keyword*/
        try{
            t1.join();
            t2.join();
        }catch (Exception e ){

        }
        System.out.println("Count = " + counter.getCount());
    }
}
//critical part is that part of the code which is being accessed by multiple thread
//in this code the critical part is the increment method inside counter class