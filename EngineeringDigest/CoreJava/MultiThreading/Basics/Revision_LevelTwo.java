package EngineeringDigest.CoreJava.MultiThreading.Basics;

public class Revision_LevelTwo {

    public static void main(String[] args) {
        World_LevelTwo w1 = new World_LevelTwo(); //NEW State
        System.out.println(w1.getState());

        w1.start(); //Runnable State
        System.out.println(w1.getState());
    }


}

class World_LevelTwo extends  Thread{
    @Override
    public void run() {
        //System.out.println("My State Is = " + Thread.currentThread().getState());
    }

    public static void main(String[] args) {




    }
}
