package EngineeringDigest.CoreJava.Generics;

public class Main {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>();
        Box<String> b2 = new Box<>();

        Box b3 =new Box();
        b3.setValue(100);
        //int ik = b3.getValue(); raises error as because getvalue value is of Box class it should be typecast to the reference variable

        //to store b3.getValue() you have to declare ik of type Object
        Object ob1 = b3.getValue(); // no error
        //that time(line 10) you are trying to store object type value in int data type which is not possible

        int ij = (Integer) b3.getValue(); // this is safe


        b1.setValue(5);
        //b1.setValue("Hello"); generate exception as because the required type is Integer but given String
        b2.setValue("Hello Dude");

        String str = b2.getValue();

        int i =  b1.getValue();
        System.out.println("The Value Of I is = " + i);

        /*
        T : Type
        E : Element(Used In Collections)
        K : Key (Used In Maps)
        V : value(also Used In Maps)
        N : Number
         */


    }

}
