package EngineeringDigest.CoreJava.MultiThreading.Basics;

public class Revision_Methods extends Thread {

    Revision_Methods(String Name) {
        super(Name);
    }
    @Override
    public void run() {
       while(true){
           System.out.println(Thread.currentThread().getName() + " I Am Still Running...");
       }
    }

    public static void main(String[] args) {
        Revision_Methods t1 = new Revision_Methods("T1");
        Revision_Methods t2 = new Revision_Methods("T2");
//        t1.setDaemon(true);
        t1.start();
        System.out.println("This Is Written Inside VectorDemo Method");

    }
}
