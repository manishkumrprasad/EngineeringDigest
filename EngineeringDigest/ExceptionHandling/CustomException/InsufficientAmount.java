package EngineeringDigest.ExceptionHandling.CustomException;

public class InsufficientAmount extends  Exception{

    public InsufficientAmount(String msg) {
        super(msg);
//        System.out.println(msg);
    }
    public InsufficientAmount(){
        super();
    }

    @Override
    public String toString() {
        return "Insufficient Amount In Bank Account For Withdraw";
    }
}
