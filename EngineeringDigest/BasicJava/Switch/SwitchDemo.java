package EngineeringDigest.BasicJava.Switch;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchDemo {

    public static void main(String[] args) {

        String direction;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Direction = ");
        direction = input.nextLine();

        int sw = switch (direction){

            case "Left" , "left" -> {
                System.out.println("Turning Left");
                yield 1 ;
            }
            case "Right" ,"right"-> {
                System.out.println("Turning Right");
                yield 2 ;
            }
            case "Up" , "up"-> {
                System.out.println("Turning Up");
                yield 3;
            }
            case "Down" , "down" -> {
                System.out.println("Turning Up");
                yield 4;
            }
            default -> throw new IllegalStateException("Unexpected value: " + direction);
        };

        System.out.println("Output = " + sw);



    }



}
