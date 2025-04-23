package EngineeringDigest.ExceptionHandling;

public class Divide {

    public static void main(String[] args) {
        try {
            int[] num = {10, 12, 30, 4, 60};
            int[] deno = {2, 4, 3, 0, 4};
            for (int i = 0; i < num.length; i++) {
                System.out.println("The Division of " + num[i] + " With " + deno[i] + " Is " + divide(num[i], deno[i]));
            }
//            System.out.println(5/0);
        }catch (ArithmeticException | NullPointerException d){
            System.out.println("Either Arithmetic Or NullPointer Exception Occurred");
            return;
        }catch (Exception a){
            System.out.println("Unexpected Error Occurred");
        }

    }

    public Divide() {
        super();
    }

    public static int divide(int n , int d){
        try {
            return n/d ;
        } catch (ArithmeticException e) {
            System.out.println(e);
            return -1;
        }
    }
}
