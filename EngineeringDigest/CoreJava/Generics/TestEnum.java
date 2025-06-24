package EngineeringDigest.CoreJava.Generics;

public class TestEnum {

    enum Day{

        SUNAY , MONDAY , TUESDAY , WEDNESDAY ,THURSDAY , FRIDAY , SATURDAY ;

    }

    public static void main(String[] args) {
        Day d1 = Day.MONDAY; //d1 is of enum type, and we assign enum type value

       // Day d2 = "ExtraDay"; error arising because we are assigning string value to a enum reference type variable

    }

}
