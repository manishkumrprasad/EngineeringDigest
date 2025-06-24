package EngineeringDigest.CollectionFramework.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {


    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        System.out.println(list.getClass().getName());


        List<String> list1 = Arrays.asList("Monday", "Tuesday", "Wednesday");
        System.out.println(list1.getClass().getName());
        //list1.add("Apple"); adding a new element to the list is not possible
        //however you can replace the existing element
        list1.set(1,"Watermelon");
        System.out.println(list1);


        String[] array = {"Apple" , "Banana" , "Mango"};
        List<String>  list2 = Arrays.asList(array);
        System.out.println(list2.getClass().getName());

        List<String> list3 = new ArrayList<>(list2);
        list3.add("Almond");
        list3.add("Guave");

        list3.add(1,"Cherry");
        System.out.println(list3);
        //Adding Element To Any Specific Index


        //Adding A list Into An Existing List
        List<Integer> num = List.of(3, 4 , 5);

        List<Integer> list_of_num = new ArrayList<>();
        list_of_num.add(1);
        list_of_num.add(2);

//        num.addAll(list_of_num); generates exception
        list_of_num.addAll(num);
        System.out.println(list_of_num);


    }
}
