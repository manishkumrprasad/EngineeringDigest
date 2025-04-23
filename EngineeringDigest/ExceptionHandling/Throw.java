package EngineeringDigest.ExceptionHandling;
public class Throw{
    public static void main(String[] args){
        try{
            method();
        }catch(Exception e) {
//            throw new RuntimeException(e);
            System.out.println("error caught");
        }
    }
    //
    private static void method() throws Exception {
        throw new Exception();
    }
}
