package EngineeringDigest.CoreJava.WrapperClass;

public class Test {

    public static void main(String[] args) {
        //Boxing -> Converting local variable data into wrapper class object
        int a = 10; //primitive data type
        Integer b = 10; //wrapper class //java wraps the int type value into Object
        //Inside Working Integer b = Integer.valueof(10)

        //Data of primitive type are stored in Stack memory and for Wrapper class they are stored in Heap memory
        //Wrapper Class converts primitive type values into objects

        boolean isMale = true;
        Boolean isFemale = false; //wraps boolean data type

        //Unboxing -> Converting back wrapper class object to primitive data type


        //Auto-boxing
        int abc = 10;
        Integer abcd = abc; //Primitive -> Object

        //Auto-Unboxing
        Integer obj = 120;
        int num = obj; //Object -> Primitive

        //Difference
        //Wrapper Class can hold null values
        Integer Storingnull = null;
        int store = 0;

        //Some Important Methods Defined For Wrapper Classes
        System.out.println("The Max  Number Is = " + Integer.max(10,20));
        System.out.println("The Min Number Is = " + Integer.min(10,20));
        System.out.println("Number To Binary = " + Integer.toBinaryString(120));

        //Wrapper type conversion
        Integer Z = 120;
        //String str = Integer.valueOf(120);//This thing is not supported
        //But String to Integer Wrapper Conversion Is Possible

        String str = "20";
        Integer x = Integer.valueOf(str); //String to Integer Type Conversion

        

    }

}
