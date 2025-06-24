package EngineeringDigest.CoreJava.Enumerations;

public enum Days {

    SUNDAY("Sunday"),
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday");


    String lower;

    //this constructor is called one time for each Constant
    Days(String lov){
        this.lower = lov;
    }

    public static void main(String[] args) {
        Days d1 = Days.MONDAY;

        System.out.println(d1.lower);
        System.out.println(d1.ordinal());




    }

}
