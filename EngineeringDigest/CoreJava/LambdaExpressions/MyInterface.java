package EngineeringDigest.CoreJava.LambdaExpressions;


@FunctionalInterface //tells compiler that it is a functional interface
//This Annotation restricts the interface to be Functional Interface
public interface MyInterface {

    public void sayHello(); //A functional interface has only one method and that method is of abstract type

   // public void sayBye();//Raise Error


    //A functional interface has exactly one abstract method

    //A functional interface can method of default and static type

    default void sayBye(){

    }

    public static void sayName(){

    }
}
//Lambda Expression Is a way to implement functional interface