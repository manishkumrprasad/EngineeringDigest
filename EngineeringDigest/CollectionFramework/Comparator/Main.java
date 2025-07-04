package EngineeringDigest.CollectionFramework.Comparator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//ChatGpt Reference:
//https://chatgpt.com/share/6867f758-2f14-800d-ad86-d35b69d208a9

class IntegerLengthComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        System.out.println("Comparing : " + o1 +" And " + o2);
        return o1 - o2 ;
        // o1 - o2 -> return the list in ascending order
        // o2 - o1 -> return the list in descending order
    }
}
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(23);
        arr.add(1);
        arr.add(9);
        arr.add(2);
        arr.sort(new IntegerLengthComparator());
        System.out.println("Sorted List = " + arr);
    }

}

//🟥During sorting, the sort() method repeatedly passes two elements from your list to compare().


//Comparator Is A Interface Class Which Is Used To Do Custom Ordering Of The Data
//The Comparator interface is used to define custom sorting logic.
//Here, we have to specify how two integers should be compared when sorting.


//After Every Swap, The swaped value is then compared with the value before and if it returns a negative value then it will swaped again this will continue until the swaped value is satisfied

//?Visual Diagram
/* Start:   [3, 23, 1, 9, 2]

Move 1 before 23 → [3, 1, 23, 9, 2]
Move 1 before 3  → [1, 3, 23, 9, 2]
Move 9 before 23 → [1, 3, 9, 23, 2]
Move 2 before 23 → [1, 3, 9, 2, 23]
Move 2 before 9  → [1, 3, 2, 9, 23]
Move 2 before 3  → [1, 2, 3, 9, 23]

Final:   [1, 2, 3, 9, 23] */
