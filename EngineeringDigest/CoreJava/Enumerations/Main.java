package EngineeringDigest.CoreJava.Enumerations;

public class Main extends Thread{
    public static void main(String[] args) throws InterruptedException {
//        System.out.println("SUNDAY");
//        System.out.println("MONDAY");
//        System.out.println("MONDAY");
//        System.out.println("MONDAY");
//        System.out.println("MONDAY");
//        System.out.println("MONDAY");
//        System.out.println("MONDAY");
//        System.out.println("MONDAY");
//        System.out.println("MONDAY");
//        System.out.println("MONDAY");

        //I can write like this
        System.out.println(DayClass.SUNDAY);
        System.out.println(DayClass.MONDAY);
        //But This One Is Also Outdated

        //Most Perfect and reliable technique
        System.out.println(Day.SUNDAY);
        System.out.println(Day.MONDAY);

        Day monday = Day.MONDAY;
        //public static final Day MONDAY = new Day("MONDAY", 1);
        Day tuesday = Day.TUESDAY;
        //public static final Day TUESDAY = new Day("TUESDAY", 2);

        int ordinalOfMonday = monday.ordinal();
        //ordinal function returns the index of that value


        Day enumday = Day.valueOf("MONDAY");
        //the valueof function checks for the value in the list of values and if it matches with any of the value of enum, then it stores the argument into the variable

        System.out.println(enumday);

        Day[] values = Day.values();

        for(Day i : values){
            System.out.println(i);
            //Thread.sleep(1000);
        }


        monday.display();

        Day d1 ;
        d1 = Day.MONDAY; //d1 variable of type Day Class can hold values that are defined inside the enum class and not other values


    }
}
