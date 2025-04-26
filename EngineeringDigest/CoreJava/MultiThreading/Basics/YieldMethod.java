package EngineeringDigest.CoreJava.MultiThreading.Basics;

public class YieldMethod extends Thread{

    public YieldMethod(String Name){
        super(Name);
    }

    @Override
    public void run() {
        for (int i = 1 ; i<= 5 ;i++){
            System.out.println(Thread.currentThread().getName() + " Is Running");
            Thread.yield();
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        YieldMethod y1 = new YieldMethod("ThreadOne");
        YieldMethod y2 = new YieldMethod("ThreadTwo");
        y1.start();
        y2.start();
    }
}
