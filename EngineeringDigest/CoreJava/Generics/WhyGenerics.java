package EngineeringDigest.CoreJava.Generics;

import java.util.ArrayList;
import java.util.List;

public class WhyGenerics {
    public static void main(String[] args) {
        ArrayList list = new  ArrayList();
        list.add("Mango");
        list.add(20);
        list.add(32.02);

        String str = (String) list.get(0); //we have to do manual casting here
        Integer itr = (Integer) list.get(1);
    }
}
