package EngineeringDigest.ExceptionHandling.CustomException;

public class MyThrownError extends Exception {
    void fun(){
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        MyThrownError m1 = new MyThrownError();
        //m1.fun();//generates an exception
        //using try-catch block to handle the situation
        try{
            m1.fun();
        }catch (ArithmeticException e){
            System.out.println("An Unexpected Exception Occurred");
            System.out.println("Exception = "+e);
        }catch (ArrayIndexOutOfBoundsException f){
            System.out.println("Exception = " + f);
        }catch (RuntimeException g){
            System.out.println("Exception = "+g);
        }
    }

}
