package EngineeringDigest.CoreJava.Generics;

import java.util.ArrayList;

public class Wildcards {
    
    public static void main(String[] args) {



    }

    void sum(ArrayList<?> arr){
        int sum = 0;
        for(Object n : arr){
            sum += (int) n;
        }
    }


}
