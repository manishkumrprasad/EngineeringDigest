package EngineeringDigest.CoreJava.Generics;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {

        //A wildcard is represented by a question mark (?). It is used in generics when you want to relax the restrictions on the type parameter, especially when you don’t know the exact type or you want to allow flexibility.
        //Use Wildcards When You Only Want To Read The Data
        public static void main(String[] args) {
            ArrayList<Integer> array = new ArrayList<>();
            array.add(10);
            array.add(20);
            array.add(15);
            printElement(array);

            System.out.println("The Sum Of The Array Is = "+sumOfArray(array));
        }

        public static void printElement(List<? extends Number> list){
            for (Object o  : list){
                System.out.println(o);
            }
        }

        //Using Wildcards To Read Only Value
        public static double sumOfArray(ArrayList<? extends Number> arr){
            double sum = 0;
            for(Number n : arr){
                sum += n.doubleValue();
            }
            return sum;
        }

}
