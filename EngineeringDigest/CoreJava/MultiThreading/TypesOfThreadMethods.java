package EngineeringDigest.CoreJava.MultiThreading;

public class TypesOfThreadMethods extends Thread{
    @Override
    public void run() {
        //System.out.println("Thread One Is Running...");

//        for (int i = 1 ; i < 5 ; i++){
//            try{
//                Thread.sleep(1000);
//            }catch (InterruptedException e){
//                throw new RuntimeException(e);
//            }
//            System.out.println(i);
//        }

        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) throws InterruptedException {
        TypesOfThreadMethods t1 = new TypesOfThreadMethods();
        t1.start();
       // System.out.println("I Will Execute After 5 Seconds"); this is run concurrently it the run method if you want to run this method after run method then use join method

        t1.join();//this line work is to halt the main method until the run method is executed
        System.out.println("Now I Will Be Executed After 5 Seconds");



    }




}
