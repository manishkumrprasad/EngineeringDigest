package EngineeringDigest.CoreJava.Generics;

import java.util.ArrayList;

public class GenericsUse {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add(100);
        list.add("String");
        //in this case we are using arraylist for all type of data types which is not valid



        ArrayList<String> list_str = new ArrayList<>();

        list_str.add("String Value 1");
        list_str.add("String Value 2");
        //list_str.add(10); we can only store String type object


    }

}
