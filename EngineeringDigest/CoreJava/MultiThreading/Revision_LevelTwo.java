package EngineeringDigest.CoreJava.MultiThreading;

import java.util.concurrent.ThreadLocalRandom;

public class Revision_LevelTwo {

    public static void main(String[] args) {
        World_Runnable w1 = new World_Runnable(); //NEW State
        System.out.println(Thread.currentThread().getState());

        w1.run(); //Runnable State
        System.out.println(Thread.currentThread().getState());
    }


}

class World_LevelTwo extends  Thread{
    @Override
    public void run() {
        System.out.println("My State Is = " + Thread.currentThread().getState());
    }

    public static void main(String[] args) {




    }
}
