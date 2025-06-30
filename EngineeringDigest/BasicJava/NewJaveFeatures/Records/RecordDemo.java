package EngineeringDigest.BasicJava.NewJaveFeatures.Records;

public record RecordDemo(String empName , int empId) {
    //in record class, we have canonical constructor instead of default constructor, which assign values as passed in the component list

    public String empNameToUpperCase(){
        return empName.toUpperCase();
    }

    public static void printWhatever(){
        System.out.println("Whatever");
    }


}
