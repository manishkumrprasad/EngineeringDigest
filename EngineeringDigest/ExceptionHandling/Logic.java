package EngineeringDigest.ExceptionHandling;

public class Logic extends Thread{

    public static void main(String[] args) {
        Thread t1 = new Thread();

        try{
            t1.sleep(2000); //sleep method throws Interrupted Exception in its method declaration
            //that's why I have to write the sleep method inside the try-catch block

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
