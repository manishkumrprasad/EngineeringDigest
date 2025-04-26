package EngineeringDigest.CoreJava.MultiThreading.Basics;

public class PrintAfterASecond extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 5 ; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i); //after each one second later this statement will be executed
        }
    }

    public static void main(String[] args) {
        PrintAfterASecond p1 = new PrintAfterASecond();
        p1.start();
    }

}
