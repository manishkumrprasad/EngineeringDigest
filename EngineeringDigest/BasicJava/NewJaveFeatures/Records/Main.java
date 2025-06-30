package EngineeringDigest.BasicJava.NewJaveFeatures.Records;

public class Main {

    public static void main(String[] args) {
        RecordDemo r1 = new RecordDemo("Manish" , 1);
        RecordDemo r2 = new RecordDemo("Aryan" , 2);
        RecordDemo r3 = new RecordDemo("Shiva" , 3);
        RecordDemo r4 = new RecordDemo("Aditya" , 4);
        RecordDemo r5 = new RecordDemo("Rohan" , 5);

        System.out.println("Employee Name = " + r1.empName() + " Employee Id = " + r1.empId());
    }

}
