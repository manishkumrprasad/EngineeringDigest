package EngineeringDigest.JavaLibrary.StringHandling;

public class StringOne {


    public static void main(String[] args) {

        String str = "Hello";


        String result = str.concat(" World"); //Normal String Class Stores This In A New String Variable
        //To Modify And Store The Same String In The Same Variable Use StringBuffer Class
        StringBuffer b1 = new StringBuffer("Hello");
        b1.append(" World");

        System.out.println("This Is Through StringBuffer = "+b1);

        System.out.println(str);
        System.out.println(result);


    }


}
