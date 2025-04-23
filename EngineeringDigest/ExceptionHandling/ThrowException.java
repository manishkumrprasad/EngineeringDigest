package EngineeringDigest.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.FileHandler;

public class ThrowException {
    public static void main(String[] args)  {
        //System.out.println(divide(10,0));
        //callingFile();
        int a = 10 ;
        System.out.println(a/0);

    }

    public static int divide(int a , int b) throws Exception{
        return a/b;
    }

    public static void callingFile() throws Exception {
        FileReader f1 = new FileReader("a.txt");
    }
}
