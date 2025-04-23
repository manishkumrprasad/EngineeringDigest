package EngineeringDigest.ExceptionHandling;

public class ThrowsDemo {
    public static void throwOne() throws Exception {
        System.out.println("Inside ThrowOne Method");
        throw new Exception("demo");
    }
    public static void main(String[] args) {
        try{
            throwOne();
        }catch(Exception e){
            System.out.println("Caught Exception Name = " + e);
        }
    }
}
