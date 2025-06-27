package EngineeringDigest.CollectionFramework.List.Vector;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        Vector<Integer> vector1 = new Vector<Integer>(2 , 2);

        vector1.add(10);
        vector1.add(10);
        System.out.println(vector1.capacity());
        vector1.add(10);
        vector1.add(10);
        System.out.println(vector1.capacity());
        vector1.add(10);


        //We can pass collection to the constructor
        Vector<Integer> vector2 = new Vector<Integer>(Arrays.asList(2 , 4 ,5, 6, 8 , 10)); //passing Array to the vector collection
        System.out.println(vector2);


        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        Vector<Integer> vector3 = new Vector<Integer>(l1);//passing Linked List     to the vector collection
        System.out.println(vector2);







    }
}
