package EngineeringDigest.ExceptionHandling.CustomException;

public class Test {
    public static void main(String[] args) throws InsufficientAmount {
        try{
            BankAccount b1 = new BankAccount();
            b1.depositMoney(10000);
            b1.withdrawMoney(11000);
        } catch (InsufficientAmount e) {
            System.out.println(e);
        }
    }
}
