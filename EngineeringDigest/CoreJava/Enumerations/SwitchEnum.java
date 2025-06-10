package EngineeringDigest.CoreJava.Enumerations;

public class SwitchEnum {
    public static void main(String[] args) {
        Day d1 = Day.MONDAY;


        switch (d1){
            case MONDAY -> System.out.println("Today Is Monday");
            case TUESDAY -> System.out.println("Today Is Tuesday");

            default -> System.out.println("Other Days Of The Weak");
        }
    }
}
