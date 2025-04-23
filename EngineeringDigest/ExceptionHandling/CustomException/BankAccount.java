package EngineeringDigest.ExceptionHandling.CustomException;

public class BankAccount {
    public int balance = 0 ;

    public void depositMoney(int amount){
        balance += amount;
        System.out.println("Amount Deposited Successfully");
    }

    public void withdrawMoney(int amount) throws InsufficientAmount {
        if(amount > balance){
            throw new InsufficientAmount("Not Enough Money In Bank Account");
        }
        balance -= amount;
    }
}
