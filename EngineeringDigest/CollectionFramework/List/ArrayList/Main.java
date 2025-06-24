package EngineeringDigest.CollectionFramework.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(40);

        list.remove(1); // remove element at index 1
        list.add(2,30); //to add element at any specific index

        System.out.println("The Size Of The List Is = " + list.size());
        System.out.println("The Element At 1 Index Is = " + list.get(1));

        for (int i = 0 ; i < list.size() ; i++){
            System.out.println("Element At Index " + i + " Is = " + list.get(i));
        }

        //Or We Can Extract Elements Like This

        for (Integer x : list){
            System.out.println(x);
        }

        //Check Whether Any Specific Elements Are Present In The ArrayList Or Not We Can Use .contains method which return true or false

        System.out.println("Is 10 Present In The ArrayList = " + list.contains(10));

        List<Integer> list5 = List.of(10 , 20 , 30 , 40 , 50);
        //You can change the values once its declared
        //list5.set(1 , 50);


    }

}
