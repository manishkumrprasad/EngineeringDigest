package EngineeringDigest.CoreJava.MultiThreading.Basics;

public class Revision_LevelOne{

    public static void main(String[] args) {
        World_Extends w1 = new World_Extends();
        w1.start();

        World_Runnable w2 = new World_Runnable();
        w2.run();

        //All The Run Methods Are Executing Together

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

class World_Extends extends Thread{

    @Override
    public void run() {
        //System.out.println("The Run Method Is Running");
        for( ; ;){
            System.out.println(Thread.currentThread().getName());
        }

    }
}

class World_Runnable implements Runnable{

    @Override
    public void run() {
        for( ;; ){
            System.out.println("Thread Another");
            System.out.println(Thread.currentThread().getName());
        }
    }


}

//Either You Can Use Thread Class Or Implement Runnable Class
//Remember Runnable Is A Interface