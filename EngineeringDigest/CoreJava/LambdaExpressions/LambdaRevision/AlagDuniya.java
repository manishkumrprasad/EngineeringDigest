package EngineeringDigest.CoreJava.LambdaExpressions.LambdaRevision;

public class AlagDuniya {
    public static void main(String[] args) {

        //This Is Class
        Employee e1 = new Employee() {
            int a = 1000 ; //this is class instance
            @Override
            public String salary() {

                return "20,450";
            }
        };

        //And This Is Lambda Expression
        Employee e2 = () -> {
            int b = 10; //this is local variable
            return "20,900";
        };



    }

}
