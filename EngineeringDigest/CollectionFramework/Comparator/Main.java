package EngineeringDigest.CollectionFramework.Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        if(o1.length() <= o2.length()){
            System.out.println(o1);
        }
        return 0;
    }
}

class IntegerLengthComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        if(o1 == o2){
            System.out.println(o1);
        }
        return 0;
    }
}


public class Main {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>() ;
        list1.add(40);
        list1.add(21);
        list1.add(18);

        List<String> list2 = Arrays.asList("Banana" , "Apple" , "Mango" , "Gave" , "Watermelon" , "Orange");
        list2.sort(new IntegerLengthComparator());

        System.out.println(list2); // returns the unsorted list



    }

}
//Comparator Is A Interface Class Which Is Used To Do Custom Ordering Of The Data