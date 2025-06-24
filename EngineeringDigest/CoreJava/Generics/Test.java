package EngineeringDigest.CoreJava.Generics;

import EngineeringDigest.CoreJava.LambdaExpressions.Youtube.Printable;

public class Test {
    public static void main(String[] args) {
        Boxx<MyNumber> b1 = new Boxx<>();

        b1.setValue(100);
    }
}


//Boxx Class Can only be used by object that extends Number Class and implements Printable interface
class Boxx<T extends Number & Printable>{

    public T value ;

    public void setValue(int obj){
        //this.value = obj ;
    }

    public T getValue(){
        return this.value;
    }


}