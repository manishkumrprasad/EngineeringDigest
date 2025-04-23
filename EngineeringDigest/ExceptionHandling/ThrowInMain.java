package EngineeringDigest.ExceptionHandling;

public class ThrowInMain {
    public static void main(String[] args) throws ArithmeticException{
        System.out.println("Hello World");
        int a = 10;
        System.out.println(a/0);
    }
}
