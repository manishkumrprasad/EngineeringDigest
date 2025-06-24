package EngineeringDigest.CoreJava.Generics;
//using generics constructor


public class BoxTwo {


    public <T> BoxTwo(T count) {
        System.out.println("This is " + count + "constructor calling");
    }

    public static void main(String[] args) {
        BoxTwo b1 = new BoxTwo(1);
    }

}
