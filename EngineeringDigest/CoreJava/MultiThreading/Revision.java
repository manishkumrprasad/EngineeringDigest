package EngineeringDigest.CoreJava.MultiThreading;

public class Revision extends Thread{

    public static void main(String[] args) {
        World_Revision w1 = new World_Revision();
        w1.start();


        Boolean run = Boolean.TRUE ;
        while (run){
            System.out.println(Thread.currentThread().getName());
        }
    }

}

//class Test{
//    public static void main(String[] args) {
//        System.out.println(Thread.currentThread().getName());
//    }
//}

class World_Revision extends Thread{

    @Override
    public void run() {
        //System.out.println("The Run Method Is Running");
        for( ; ;){
            System.out.println(Thread.currentThread().getName());
        }

    }
}
