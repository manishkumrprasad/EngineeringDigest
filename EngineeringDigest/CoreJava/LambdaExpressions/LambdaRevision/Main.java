package EngineeringDigest.CoreJava.LambdaExpressions.LambdaRevision;

public class Main {

    public static void main(String[] args) {
        Employee e1 = () -> {
            return "1000";
        };

        System.out.println(e1); //this print hashcode
        System.out.println(e1.salary()); //this prints the actual value

        //Using Anonymous Class
        EmployeeTwo e2 = new EmployeeTwo() {
            @Override
            public String getSalary() {
                return "30,000";
            }

            @Override
            public String getDesignation() {
                return "Backend Developer";
            }
        };
        //In Anonymous Class We Can Override More Than One Function


    }


}
