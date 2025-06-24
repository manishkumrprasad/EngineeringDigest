package EngineeringDigest.CoreJava.Enumerations;

public class Test {


    public enum Months{
        JANUARY , FEBRUARY , MARCH , APRIL;
    }

    public static void main(String[] args) {
        Day monday = Day.MONDAY;
        //public static final Day monday = new Day("MONDAY", 1);

        System.out.println(Months.JANUARY);

        monday.display();

    }

}
