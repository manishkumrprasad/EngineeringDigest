package EngineeringDigest.CoreJava.Generics;

import java.util.Arrays;

public class GenericsMethod {
}
class MainMethod{

    public static void main(String[] args) {

        Integer[] intArray = {10 , 20 , 30 , 40 , 50};
        String[] strArray = {"A For Apple" , "B For Ball" , "C For Cat" , "D For Dog"  , "E For Elephant"};

        printArray(intArray);
        printArray(strArray);

        display(intArray);
        display(strArray);
    }


    //Array Of String Type Is Prohibited For This Method
    public static <T extends Number> void printArray(T[] array){
        for(T element : array){
            System.out.println(element + " ");
        }
        System.out.println();
    }

    public static void printArray(String[] array){
        for(String element : array){
            System.out.println(element + " ");
        }
        System.out.println();
    }


    //Method Overloading
    public static <T> void display(T[] array){
        System.out.println(Arrays.toString(array));
    }

    public static void display(Integer[] array){
        System.out.println(Arrays.toString(array));
    }





}
